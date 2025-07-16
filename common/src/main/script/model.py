import os
import json

# 输入目录：原始模型路径
source_dir = r"F:\code\mcmod\project\night-lights\common\src\main\resources\assets\nightlights\models\item"
# 输出目录：生成后的模型路径
output_dir = r"/assets/nightlights/items"

# 确保输出目录存在
os.makedirs(output_dir, exist_ok=True)

# 遍历所有 JSON 文件
for file_name in os.listdir(source_dir):
    if not file_name.endswith(".json"):
        continue

    base_name = file_name[:-5]  # 去除 .json 后缀
    output_path = os.path.join(output_dir, f"{base_name}.json")

    content = {
        "model": {
            "type": "minecraft:model",
            "model": f"nightlights:item/{base_name}"
        }
    }

    # 写入新文件
    with open(output_path, "w", encoding="utf-8") as f:
        json.dump(content, f, indent=2)
        print(f"[已生成] {output_path}")
