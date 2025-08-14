package com.fuckep.xposedlicensebypass;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class XposedInit implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        // 替换为你想 hook 的包名
        if (!lpparam.packageName.equals("com.gorillasoftware.everyproxy")) return;

        // 示例：hook 目标 app 的 LicenseActivity.onStart()
        XposedHelpers.findAndHookMethod(
            "com.pairip.licensecheck.LicenseActivity",
            lpparam.classLoader,
            "onStart",
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // 阻止原始方法执行
                    param.setResult(null);
                }
            }
        );
    }
}