package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class gm5 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final Bundle e;
    public final int f;

    static {
        String str = tym.a;
        g = "0";
        h = "1";
        i = "2";
        j = "3";
        k = "4";
        l = "5";
    }

    public gm5(int i2, int i3, String str, int i4, Bundle bundle, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = i4;
        this.e = bundle;
        this.f = i5;
    }

    public static gm5 a(Bundle bundle) {
        int i2 = bundle.getInt(g, 0);
        int i3 = bundle.getInt(k, 0);
        String string = bundle.getString(h);
        string.getClass();
        String str = i;
        z4o.w(bundle.containsKey(str));
        int i4 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(j);
        int i5 = bundle.getInt(l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new gm5(i2, i3, string, i4, bundle2, i5);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.a);
        bundle.putString(h, this.c);
        bundle.putInt(i, this.d);
        bundle.putBundle(j, this.e);
        bundle.putInt(k, this.b);
        bundle.putInt(l, this.f);
        return bundle;
    }
}
