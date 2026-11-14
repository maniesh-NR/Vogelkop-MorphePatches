package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class sj6 {
    public final String a;
    public final oj9 b;
    public final oj9 c;
    public final byte d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public sj6(String str, oj9 oj9Var, oj9 oj9Var2, int i, int i2) {
        z4o.w(i == 0 || i2 == 0);
        z4o.w(!TextUtils.isEmpty(str));
        this.a = str;
        oj9Var.getClass();
        this.b = oj9Var;
        oj9Var2.getClass();
        this.c = oj9Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sj6.class != obj.getClass()) {
            return false;
        }
        sj6 sj6Var = (sj6) obj;
        return this.d == sj6Var.d && this.e == sj6Var.e && this.a.equals(sj6Var.a) && this.b.equals(sj6Var.b) && this.c.equals(sj6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + z1m.f((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
