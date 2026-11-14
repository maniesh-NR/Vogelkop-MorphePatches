package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yro {
    public static String a;
    public static String b;
    public static volatile String c;
    public static final List d = Arrays.asList(48, 32, 20);

    public static String a(Context context) {
        String q0iVar;
        String str = a;
        if (str == null) {
            try {
                p0i p0iVar = t0i.b;
                q0iVar = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            if (t0i.d(q0iVar) != null) {
                try {
                    q0iVar = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
                } catch (Throwable th2) {
                    p0i p0iVar3 = t0i.b;
                    q0iVar = new q0i(th2);
                }
            }
            if (q0iVar instanceof q0i) {
                q0iVar = null;
            }
            str = q0iVar;
            if (str == null) {
                str = "";
            }
            a = str;
        }
        return str;
    }

    public static String b(Context context) {
        String q0iVar;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        return q0iVar;
    }

    public static String c(Context context) {
        String q0iVar;
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            p0i p0iVar = t0i.b;
            q0iVar = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        String str2 = q0iVar;
        if (str2 == null) {
            str2 = "";
        }
        b = str2;
        return str2;
    }
}
