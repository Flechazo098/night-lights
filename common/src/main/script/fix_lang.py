import os
import json

# 修改为你本地的 lang 文件夹路径
target_dir = r"F:\code\mcmod\project\night-lights\common\src\main\resources\assets\nightlights\lang"  # 示例："./src/main/resources/assets/nightlights/lang"

# 是否递归遍历子文件夹
recursive = False

# 遍历所有 json 文件
for root, dirs, files in os.walk(target_dir):
    for filename in files:
        if filename.endswith(".json"):
            file_path = os.path.join(root, filename)
            print(f"处理文件: {file_path}")

            with open(file_path, "r", encoding="utf-8") as f:
                try:
                    data = json.load(f)
                except json.JSONDecodeError as e:
                    print(f"❌ JSON 解析错误，跳过文件: {file_path}\n{e}")
                    continue

            # 复制 block. 为 item.
            new_entries = {}
            for key, value in data.items():
                if key.startswith("block."):
                    item_key = key.replace("block.", "item.", 1)
                    if item_key not in data:
                        new_entries[item_key] = value

            if new_entries:
                data.update(new_entries)
                with open(file_path, "w", encoding="utf-8") as f:
                    json.dump(data, f, ensure_ascii=False, indent=2)
                print(f"✅ 添加 {len(new_entries)} 条 item.* 翻译")
            else:
                print("⚠️ 无需更改")

    if not recursive:
        break  # 如果不递归，只处理当前目录
