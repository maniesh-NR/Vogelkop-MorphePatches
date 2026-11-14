package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v1 extends no7 {
    public static final y55 l = new y55();
    public final u1 k;

    public v1(Context context) {
        super(context, 17, "AbTesting");
        this.k = new u1(this.a, this);
    }

    public static v1 u(Context context) {
        return (v1) no7.n(context, io7.e, l);
    }

    public static q1 z(izd izdVar) throws IOException {
        boolean z = (izdVar.readByte() & 1) != 0;
        String strH = izdVar.h();
        String[] strArr = aik.a;
        String str = strH == null ? "" : strH;
        int i = izdVar.readByte() & 255;
        String[] strArr2 = new String[i];
        String[] strArr3 = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            String strH2 = izdVar.h();
            if (strH2 == null) {
                strH2 = "";
            }
            strArr2[i2] = strH2;
            String strH3 = izdVar.h();
            if (strH3 == null) {
                strH3 = "";
            }
            strArr3[i2] = strH3;
        }
        return new q1(z, str, strArr2, strArr3, false);
    }

    @Override // defpackage.no7
    public final void l(Object obj) {
        q1 q1Var = (q1) obj;
        String[] strArr = OperaApplication.K;
        boolean zJ = ((OperaApplication) this.a.getApplicationContext()).J().J();
        u1 u1Var = this.k;
        u1Var.getClass();
        if (q1Var.e) {
            u1Var.b.set(zJ ? u1.h : u1.g);
        } else {
            u1Var.c(q1Var, false);
        }
        super.l(q1Var);
    }

    @Override // defpackage.no7
    public final void m(Object obj) {
        ks3.I(18, ((q1) obj).b);
        t();
    }

    @Override // defpackage.no7
    public final void r(Object obj) {
        q1 q1Var = (q1) obj;
        this.k.c(q1Var, true);
        ks3.I(18, q1Var.b);
        t();
    }

    public final void t() {
        if (y()) {
            String[] strArr = OperaApplication.K;
            m9c m9cVarU = ((OperaApplication) this.a.getApplicationContext()).u();
            j.c((SharedPreferences) m9cVarU.b.get(), "ab_group", x());
        }
    }

    public final r1 v() {
        HashMap map;
        i();
        s1 s1Var = u1.g;
        u1 u1Var = this.k;
        s1 s1Var2 = (s1) u1Var.b.get();
        if (s1Var2 == null || !s1Var2.b || !"cc_new_start_page_test".equals(u1Var.a(s1Var2))) {
            s1Var2 = null;
        }
        if (s1Var2 == null || (map = s1Var2.c) == null) {
            return null;
        }
        return new r1((String) map.get("default_wallpaper"), "1".equals((String) map.get("focus_mode")), "1".equals((String) map.get("large_omnibar")), "1".equals((String) map.get("show_omnibar_button_strip")), "1".equals((String) map.get("hide_opera_logo_by_default")), "1".equals((String) map.get("enable_weather_widget")));
    }

    public final String x() {
        i();
        u1 u1Var = this.k;
        String str = (String) u1Var.d.get();
        if (!str.isEmpty()) {
            return str;
        }
        s1 s1Var = (s1) u1Var.b.get();
        String str2 = s1Var != null ? s1Var.a : "";
        String[] strArr = aik.a;
        return str2 == null ? "" : str2;
    }

    public final boolean y() {
        i();
        u1 u1Var = this.k;
        String str = (String) u1Var.d.get();
        if (str.isEmpty()) {
            if (((q1) u1Var.c.i()).e) {
                str = null;
            } else {
                s1 s1Var = (s1) u1Var.b.get();
                str = "";
                String str2 = s1Var != null ? s1Var.a : "";
                String[] strArr = aik.a;
                if (str2 != null) {
                    str = str2;
                }
            }
        }
        return str != null;
    }
}
