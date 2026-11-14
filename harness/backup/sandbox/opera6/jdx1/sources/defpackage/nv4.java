package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nv4 extends pv4 {
    public final Object a;
    public final Object b;
    public final String c;

    public nv4(Object obj, Object obj2, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = str;
    }

    @Override // defpackage.pv4
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv4)) {
            return false;
        }
        nv4 nv4Var = (nv4) obj;
        return Intrinsics.a(this.a, nv4Var.a) && this.b.equals(nv4Var.b) && Intrinsics.a(this.c, nv4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(configuration=");
        sb.append(this.a);
        sb.append(", instance=");
        sb.append(this.b);
        sb.append(", key=");
        return o18.p(sb, this.c, ')');
    }
}
