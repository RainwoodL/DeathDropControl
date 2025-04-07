# 🛡️ DeathDropControl 

![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21%2B-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)
![GitHub Release](https://img.shields.io/github/v/release/RainwoodL/DeathDropControl)

Advanced death item management solution for Minecraft servers. Control exactly what items players drop on death!
Reproduction without permission is prohibited!
[中文文档](https://github.com/RainwoodL/DeathDropControl/blob/main/README_ZH.md) | [Download](https://github.com/RainwoodL/DeathDropControl/releases)

---

## ✨ Features

- **Smart Slot Protection** - Keep items in specific inventory slots
- **Multi-World Support** - Different rules for different worlds
- **Death Broadcasts** - Customizable death messages
- **Real-time Reload** - Modify config without restart

---

## 🚀 Installation

1. Download latest `.jar` from [Releases](https://github.com/RainwoodL/DeathDropControl/releases)
2. Place the jar file in your server's `plugins/` folder
3. Restart/Run your server
4. Edit `plugins/DeathDropControl/config.yml` as needed

---

## ⚙️ Configuration

### config.yml Example:
```yaml
# Enable/Disable plugin
enable: true

# Worlds to enable features
worlds:
  - world
  - nether_world

# Slots where items won't drop (0-40)
protected-slots: [0,1,2,3]

# Death message settings  
broadcast:
  enable: true
  message: "⚔️ %player% was slain in %world%"


