package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class sgd {
    public final String a;
    public final boolean b;
    public final boolean c;

    public sgd(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != sgd.class) {
            return false;
        }
        sgd sgdVar = (sgd) obj;
        return TextUtils.equals(this.a, sgdVar.a) && this.b == sgdVar.b && this.c == sgdVar.c;
    }

    public final int hashCode() {
        return ((z1m.f(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
