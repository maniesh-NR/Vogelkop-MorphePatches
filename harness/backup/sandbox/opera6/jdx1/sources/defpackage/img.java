package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Limg;", "Lh8e;", "Ljmg;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class img extends h8e {
    public final o91 b;

    public img(o91 o91Var) {
        this.b = o91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof img) && this.b.equals(((img) obj).b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new jmg(this.b, null);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        jmg jmgVar = (jmg) b8eVar;
        o91 o91Var = jmgVar.p;
        o91 o91Var2 = this.b;
        if (Intrinsics.a(o91Var, o91Var2)) {
            return;
        }
        jmgVar.p = o91Var2;
        if (jmgVar.q) {
            jmgVar.V0();
        }
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
