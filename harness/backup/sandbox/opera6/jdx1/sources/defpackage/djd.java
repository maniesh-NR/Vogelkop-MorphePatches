package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class djd {
    public static final String b;
    public final Uri a;

    static {
        String str = tym.a;
        b = "0";
    }

    public djd(un8 un8Var) {
        this.a = un8Var.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof djd) && this.a.equals(((djd) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
