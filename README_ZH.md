# 🛡️ DeathDropControl

！[我的世界版本](https://img.shields.io/badge/Minecraft-1.21%2B-亮绿色）
！[许可证](https://img.shields.io/badge/License-MIT-blue)
！[GitHub发布](https://img.shields.io/github/v/release/RainwoodL/DeathDropControl)

适用于Minecraft服务器的高级死亡物品管理解决方案。精确控制玩家在死亡时掉落的物品！

[English document](https://github.com/RainwoodL/DeathDropControl/blob/main/README.md)|[下载](https://github.com/RainwoodL/DeathDropControl/releases)

---

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

###config.yml示例：
```yaml
#启用/禁用插件
启用：true

#启用功能的世界
世界：
-世界
-阴间

#物品不会掉落的插槽（0-40）
受保护插槽：[0,1,2,3]

#死亡消息设置
广播：
启用：true
消息："⚔️ %玩家%在%world%中被杀”

