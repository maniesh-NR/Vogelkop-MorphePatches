package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import com.opera.android.OperaApplication;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class vwn {
    public final b59 a;
    public final Context b;

    public vwn(Context context) {
        this.b = context.getApplicationContext();
        this.a = w1h.l(context, vml.d, "wv_controller", new bg1[0]);
    }

    public static boolean b(PackageInfo packageInfo, qwn qwnVar) {
        if (packageInfo == null) {
            return false;
        }
        Set set = (packageInfo.packageName.equals("com.google.android.webview") || packageInfo.packageName.equals("com.android.webview")) ? qwnVar.b : (packageInfo.packageName.equals("com.android.chrome") || packageInfo.packageName.startsWith("com.chrome.")) ? qwnVar.a : null;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (packageInfo.versionName.startsWith((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a() {
        return ((SharedPreferences) this.a.get()).getBoolean("wv.disabled", false);
    }

    public final void c(yu0 yu0Var) {
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) this.b.getApplicationContext()).L().d;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        rr0 rr0VarL = x56VarF.L(zpaVar);
        rr0VarL.getClass();
        rr0VarL.q(14, 1, yu0Var);
        x5fVar.U0(x56VarF);
    }
}
