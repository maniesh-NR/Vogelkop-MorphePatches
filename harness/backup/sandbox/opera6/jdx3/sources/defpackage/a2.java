package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class a2 implements l2 {
    public static final a2 b = new a2();
    public static final s15 c = uqh.a(wv.class);
    public static final String d = "address";

    public static String f(wv wvVar) {
        String str = wvVar.b;
        if (str.length() <= 64) {
            return StringsKt.S(64, str);
        }
        bxl.d(sko.k("Can't pad '", str, "' as it's longer than 64 already."));
        return null;
    }

    @Override // defpackage.l2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        int iMin = Math.min(str.length(), 64);
        String strSubstring = str.substring(0, iMin);
        wv.Companion.getClass();
        return new z1(uv.b(strSubstring), iMin);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return f((wv) obj);
    }

    @Override // defpackage.l2
    public final s15 d() {
        return c;
    }

    @Override // defpackage.l2
    public final /* bridge */ /* synthetic */ String e(Object obj) {
        return f((wv) obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a2);
    }

    @Override // defpackage.l2
    public final String getName() {
        return d;
    }

    public final int hashCode() {
        return 1146320499;
    }

    public final String toString() {
        return "Addr";
    }
}
