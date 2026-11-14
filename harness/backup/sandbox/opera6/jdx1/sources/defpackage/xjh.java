package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class xjh {
    public static final String a;

    static {
        String str = tym.a;
        a = "0";
    }

    public static xjh a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = s9a.d;
            z4o.w(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(s9a.d, false) ? new s9a(bundle.getBoolean(s9a.e, false)) : new s9a();
        }
        if (i == 1) {
            String str3 = i9g.c;
            z4o.w(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(i9g.c, -1.0f);
            return f == -1.0f ? new i9g() : new i9g(f);
        }
        if (i == 2) {
            String str4 = q3k.d;
            z4o.w(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(q3k.d, 5);
            float f2 = bundle.getFloat(q3k.e, -1.0f);
            return f2 == -1.0f ? new q3k(i2) : new q3k(i2, f2);
        }
        if (i != 3) {
            qp2.o(sko.i(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = nnl.d;
        z4o.w(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(nnl.d, false) ? new nnl(bundle.getBoolean(nnl.e, false)) : new nnl();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
