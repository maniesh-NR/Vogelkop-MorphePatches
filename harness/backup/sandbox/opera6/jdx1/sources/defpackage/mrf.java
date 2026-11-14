package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class mrf {
    public static final a36 e = new a36();
    public final Object a;
    public final krf b;
    public final String c;
    public volatile byte[] d;

    public mrf(String str, Object obj, krf krfVar) {
        if (TextUtils.isEmpty(str)) {
            qp2.o("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = krfVar;
    }

    public static mrf a(Object obj, String str) {
        return new mrf(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mrf) {
            return this.c.equals(((mrf) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return z1m.l(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
