package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mil {
    public final sf1 a;
    public final long b;
    public final xjl c;

    public mil(int i, long j, String str) {
        this(new sf1((i & 1) != 0 ? "" : str), (i & 2) != 0 ? xjl.b : j, (xjl) null);
    }

    public mil(sf1 sf1Var, long j, xjl xjlVar) {
        xjl xjlVar2;
        this.a = sf1Var;
        this.b = upj.k(sf1Var.b.length(), j);
        if (xjlVar != null) {
            xjlVar2 = new xjl(upj.k(sf1Var.b.length(), xjlVar.a));
        } else {
            xjlVar2 = null;
        }
        this.c = xjlVar2;
    }

    public static mil a(mil milVar, sf1 sf1Var, long j, int i) {
        if ((i & 1) != 0) {
            sf1Var = milVar.a;
        }
        if ((i & 2) != 0) {
            j = milVar.b;
        }
        xjl xjlVar = (i & 4) != 0 ? milVar.c : null;
        milVar.getClass();
        return new mil(sf1Var, j, xjlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mil)) {
            return false;
        }
        mil milVar = (mil) obj;
        return xjl.b(this.b, milVar.b) && Intrinsics.a(this.c, milVar.c) && Intrinsics.a(this.a, milVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = xjl.c;
        int iE = z1m.e(iHashCode, 31, this.b);
        xjl xjlVar = this.c;
        return iE + (xjlVar != null ? Long.hashCode(xjlVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + xjl.h(this.b) + ", composition=" + this.c + ")";
    }
}
