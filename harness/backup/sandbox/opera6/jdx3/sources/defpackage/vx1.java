package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class vx1 implements jx1 {
    public final String a;
    public final wxe b;
    public final ux1 c;

    public vx1(String str, wxe wxeVar, ux1 ux1Var) {
        this.a = str;
        this.b = wxeVar;
        this.c = ux1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx1)) {
            return false;
        }
        vx1 vx1Var = (vx1) obj;
        return Intrinsics.a(this.a, vx1Var.a) && Intrinsics.a(this.b, vx1Var.b) && this.c == vx1Var.c;
    }

    @Override // defpackage.jx1
    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
