package cn.lovelywhite.yxladywaterhook;

import android.app.AndroidAppHelper;
import android.widget.Toast;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Hook implements IXposedHookLoadPackage {

    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam){
        if(lpparam.packageName.equals("com.yxlady.water")) {
            XposedHelpers.findAndHookMethod("com.yxlady.water.ui.activity.EntryActivity",
                    lpparam.classLoader,
                    "k",
                    new XC_MethodReplacement() {
                        @Override
                        protected Object replaceHookedMethod(MethodHookParam param) {
                            XposedHelpers.callMethod(param.thisObject, "m");
                            Toast.makeText(
                                    AndroidAppHelper.currentApplication().getApplicationContext(),
                                    "去除广告成功",
                                    Toast.LENGTH_LONG
                            ).show();
                            return null;
                        }
                    }
            );
        }
    }
}
