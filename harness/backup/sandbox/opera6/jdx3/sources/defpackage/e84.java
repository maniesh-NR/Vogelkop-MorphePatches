package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class e84 {
    public final b59 a;

    public e84(Context context, umi umiVar) {
        this.a = w1h.l(context, umiVar, "fav_data_fetch", new bg1[0]);
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.a.get()).contains("lpAttr." + str);
    }

    public final void b(String str) {
        if (str.length() != 0) {
            b59 b59Var = this.a;
            HashSet hashSetM = w1h.m((SharedPreferences) b59Var.get(), "guids");
            if (hashSetM.remove(str)) {
                ((SharedPreferences) b59Var.get()).edit().putStringSet("guids", hashSetM).apply();
            }
        }
    }

    public final boolean c(String str, String str2) {
        String strJ = sko.j("lpAttr.", str);
        b59 b59Var = this.a;
        if (str2.equals(((SharedPreferences) b59Var.get()).getString(strJ, null))) {
            return false;
        }
        j.c((SharedPreferences) b59Var.get(), strJ, str2);
        return true;
    }
}
