package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltjk;", "Lh8e;", "Lujk;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class tjk extends h8e {
    public final lh7 b;

    public tjk(lh7 lh7Var) {
        this.b = lh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjk)) {
            return false;
        }
        tjk tjkVar = (tjk) obj;
        o91 o91Var = i41.j;
        return o91Var.equals(o91Var) && Intrinsics.a(this.b, tjkVar.b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ujk(i41.j, this.b);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        ujk ujkVar = (ujk) b8eVar;
        o91 o91Var = i41.j;
        if (!Intrinsics.a(ujkVar.p, o91Var)) {
            ujkVar.p = o91Var;
            if (ujkVar.q) {
                ujkVar.V0();
            }
        }
        ujkVar.o = this.b;
    }

    public final int hashCode() {
        return (((1022 * 31) + 1237) * 31) + (this.b == null ? 0 : 905970895);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + i41.j + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ")";
    }
}
