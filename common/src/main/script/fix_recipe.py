import os
import json

# 需要修改为你的目标文件夹路径
dir_path = r"F:\code\mcmod\project\night-lights\common\src\main\resources\data\nightlights\recipe"

# 所有16色染料的映射（可根据需要补充或调整）
dye_map = {
    "minecraft:white_dye": "#c:dyes/white",
    "minecraft:orange_dye": "#c:dyes/orange",
    "minecraft:magenta_dye": "#c:dyes/magenta",
    "minecraft:light_blue_dye": "#c:dyes/light_blue",
    "minecraft:yellow_dye": "#c:dyes/yellow",
    "minecraft:lime_dye": "#c:dyes/lime",
    "minecraft:pink_dye": "#c:dyes/pink",
    "minecraft:gray_dye": "#c:dyes/gray",
    "minecraft:light_gray_dye": "#c:dyes/light_gray",
    "minecraft:cyan_dye": "#c:dyes/cyan",
    "minecraft:purple_dye": "#c:dyes/purple",
    "minecraft:blue_dye": "#c:dyes/blue",
    "minecraft:brown_dye": "#c:dyes/brown",
    "minecraft:green_dye": "#c:dyes/green",
    "minecraft:red_dye": "#c:dyes/red",
    "minecraft:black_dye": "#c:dyes/black"
}

for filename in os.listdir(dir_path):
    if filename.endswith(".json"):
        file_path = os.path.join(dir_path, filename)
        with open(file_path, "r", encoding="utf-8") as f:
            data = json.load(f)
        if data.get("type") == "minecraft:crafting_shaped":
            new_key = {}
            for k, v in data.get("key", {}).items():
                if "tag" in v:
                    new_key[k] = f"#{v['tag']}"
                elif "item" in v:
                    item_id = v["item"]
                    if item_id in dye_map:
                        new_key[k] = dye_map[item_id]
                    else:
                        new_key[k] = item_id
            data["key"] = new_key
            # 可选：备份原文件
            # os.rename(file_path, file_path+".bak")
            with open(file_path, "w", encoding="utf-8") as f:
                json.dump(data, f, ensure_ascii=False, indent=4)