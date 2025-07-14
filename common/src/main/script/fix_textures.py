import os
import json

def update_textures_path(obj):
    """递归处理 JSON 对象中的 textures 字段"""
    if isinstance(obj, dict):
        for key in obj:
            if key == "textures" and isinstance(obj[key], dict):
                for tex_key in obj[key]:
                    val = obj[key][tex_key]
                    if isinstance(val, str) and "blocks/" in val:
                        obj[key][tex_key] = val.replace("blocks/", "block/")
            else:
                update_textures_path(obj[key])
    elif isinstance(obj, list):
        for item in obj:
            update_textures_path(item)

def process_json_file(filepath):
    with open(filepath, "r", encoding="utf-8") as f:
        try:
            data = json.load(f)
        except json.JSONDecodeError as e:
            print(f"JSON 解码错误: {filepath}，错误信息: {e}")
            return

    original = json.dumps(data, indent=2, ensure_ascii=False)
    update_textures_path(data)
    updated = json.dumps(data, indent=2, ensure_ascii=False)

    if original != updated:
        with open(filepath, "w", encoding="utf-8") as f:
            f.write(updated)
        print(f"已更新: {filepath}")
    else:
        print(f"未变动: {filepath}")

def traverse_folder_and_fix_textures(base_folder):
    for root, _, files in os.walk(base_folder):
        for filename in files:
            if filename.endswith(".json"):
                full_path = os.path.join(root, filename)
                process_json_file(full_path)

# 修改为你的模型文件夹路径（如：'assets/nightlights/models/block'）
folder_path = r"F:\code\mcmod\project\night-lights\common\src\main\resources\assets\nightlights\models"
traverse_folder_and_fix_textures(folder_path)
