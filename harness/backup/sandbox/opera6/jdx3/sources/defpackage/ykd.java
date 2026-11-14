package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ykd {
    public final uh0 a;
    public final rh0 b;
    public final sh0 c;
    public final qh0 d;
    public final boolean e;

    public ykd(uh0 uh0Var, rh0 rh0Var, sh0 sh0Var, qh0 qh0Var, boolean z) {
        this.a = uh0Var;
        this.b = rh0Var;
        this.c = sh0Var;
        this.d = qh0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ykd.class != obj.getClass()) {
            return false;
        }
        ykd ykdVar = (ykd) obj;
        return this.e == ykdVar.e && this.a == ykdVar.a && this.b == ykdVar.b && this.c == ykdVar.c && this.d == ykdVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
