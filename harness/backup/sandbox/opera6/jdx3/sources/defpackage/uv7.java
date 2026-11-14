package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uv7 {
    public final boolean a;
    public final lbf b;
    public final vv7 c;
    public final yl2 d;
    public final pvb e;

    public uv7(boolean z, lbf lbfVar, vv7 vv7Var, yl2 yl2Var, pvb pvbVar) {
        this.a = z;
        this.b = lbfVar;
        this.c = vv7Var;
        this.d = yl2Var;
        this.e = pvbVar;
    }

    public static uv7 a(uv7 uv7Var, boolean z, lbf lbfVar, vv7 vv7Var, yl2 yl2Var, pvb pvbVar, int i) {
        if ((i & 1) != 0) {
            z = uv7Var.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            lbfVar = uv7Var.b;
        }
        lbf lbfVar2 = lbfVar;
        if ((i & 4) != 0) {
            vv7Var = uv7Var.c;
        }
        vv7 vv7Var2 = vv7Var;
        if ((i & 8) != 0) {
            yl2Var = uv7Var.d;
        }
        yl2 yl2Var2 = yl2Var;
        if ((i & 16) != 0) {
            pvbVar = uv7Var.e;
        }
        uv7Var.getClass();
        return new uv7(z2, lbfVar2, vv7Var2, yl2Var2, pvbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv7)) {
            return false;
        }
        uv7 uv7Var = (uv7) obj;
        return this.a == uv7Var.a && this.b == uv7Var.b && this.c == uv7Var.c && Intrinsics.a(this.d, uv7Var.d) && Intrinsics.a(this.e, uv7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        yl2 yl2Var = this.d;
        int iHashCode2 = (iHashCode + (yl2Var == null ? 0 : yl2Var.hashCode())) * 31;
        pvb pvbVar = this.e;
        return iHashCode2 + (pvbVar != null ? pvbVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
