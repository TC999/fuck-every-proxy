# XposedLicenseBypass

一个最简 Xposed 模块模板，适合 Android Studio 快速开发。  
## 用法
1. 修改 `XposedInit.java` 中的包名和 hook 逻辑。
2. 用 Android Studio 编译为 APK。
3. 安装到手机，Xposed/LSPosed 激活并重启生效。

## 主要文件结构
- `AndroidManifest.xml`：包含 xposed 的 meta-data 声明。
- `assets/xposed_init`：包含主入口类名。
- `XposedInit.java`：主模块入口，实现 hook 逻辑。