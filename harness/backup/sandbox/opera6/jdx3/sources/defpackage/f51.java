package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class f51 {
    public static final Set a = e82.E(new String[]{"/dev/socket/qemud", "/dev/qemu_pipe", "/dev/socket/genyd", "/dev/socket/baseband_genyd", "/dev/com.genymotion.superuser.daemon"});
    public static final Set b = e82.E(new String[]{"magisk", "su"});
    public static final Set c = e82.E(new String[]{"/cache", "/data", "/data/local", "/data/local/bin", "/data/local/xbin", "/dev", "/sbin", "/su/bin", "/system/bin", "/system/bin/.ext", "/system/bin/failsafe", "/system/sd/xbin", "/system/usr/we-need-root", "/system/xbin"});
    public static final Set d = e82.E(new String[]{"/etc", "/sbin", "/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin"});
    public static final Set e = e82.E(new String[]{"com.alephzain.framaroot", "com.kingo.root", "com.kingroot.kinguser", "com.koushikdutta.superuser", "com.noshufou.android.su", "com.noshufou.android.su.elite", "com.smedialink.oneclickroot", "com.thirdparty.superuser", "com.topjohnwu.magisk", "com.yellowes.su", "com.zhiqupk.root.global", "eu.chainfire.supersu"});
    public static final Regex f = new Regex("\\[([^]]+)]: \\[([^]]*)]");

    public static final boolean a(String str, Function1 function1) throws IOException {
        String line;
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            if (processExec != null) {
                try {
                    InputStream inputStream = processExec.getInputStream();
                    if (inputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                        do {
                            try {
                                line = bufferedReader.readLine();
                                if (line == null) {
                                    bufferedReader.close();
                                }
                            } finally {
                            }
                        } while (!((Boolean) function1.invoke(line)).booleanValue());
                        bufferedReader.close();
                        return true;
                    }
                    return false;
                } finally {
                    processExec.destroy();
                }
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public static final String b(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }
}
