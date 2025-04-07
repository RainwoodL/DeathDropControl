# 🛡️ DeathDropControl

！[我的世界版本](https://img.shields.io/badge/Minecraft-1.21%2B-亮绿色）
！[许可证](https://img.shields.io/badge/License-MIT-blue)
！[GitHub发布](https://img.shields.io/github/v/release/RainwoodL/DeathDropControl)

适用于Minecraft服务器的高级死亡物品管理解决方案。精确控制玩家在死亡时掉落的物品！

[English document](https://github.com/RainwoodL/DeathDropControl/blob/main/README.md)|[下载](https://github.com/RainwoodL/DeathDropControl/releases)

---
## 禁止未经授权的转发！如果您坚持转发，请附上源地址！
## ✨ 特征

-**智能插槽保护**-将物品保存在特定的库存插槽中
-**多世界支持**-针对不同世界的不同规则
-**死亡广播**-可定制的死亡信息
-**实时重新加载**-无需重新启动即可修改配置

---

## 🚀 安装

1.从[发布]下载最新的.jar(https://github.com/RainwoodL/DeathDropControl/releases)
2.将jar文件放在服务器的“plugins/”文件夹中
3.重新启动/运行服务器
4.根据需要编辑`plugins/DeathDropControl/config.yml`

---

## ⚙️ 配置

# 插件总开关
enable: true

# 生效的世界
worlds:
  - world
  - nether_world

# 防止掉落的物品槽(1-40)
protected-slots: [0,1,2,3]

# 死亡消息  
broadcast:
  # 死亡消息开关
  enable: true
  # 消息
  message: "⚔️ %player% 壮烈牺牲在 %world%"
