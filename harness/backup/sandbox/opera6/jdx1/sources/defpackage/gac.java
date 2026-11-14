package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgac;", "Lh8e;", "Lhac;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class gac extends h8e {
    public final t71 b;
    public final gbc c;
    public final dil d;

    public gac(t71 t71Var, gbc gbcVar, dil dilVar) {
        this.b = t71Var;
        this.c = gbcVar;
        this.d = dilVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gac) {
            gac gacVar = (gac) obj;
            return Intrinsics.a(this.b, gacVar.b) && this.c == gacVar.c && this.d == gacVar.d;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new hac(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        hac hacVar = (hac) b8eVar;
        if (hacVar.n) {
            hacVar.o.d();
            hacVar.o.k(hacVar);
        }
        t71 t71Var = this.b;
        hacVar.o = t71Var;
        if (hacVar.n) {
            if (t71Var.a != null) {
                d8b.c("Expected textInputModifierNode to be null");
            }
            t71Var.a = hacVar;
        }
        hacVar.p = this.c;
        hacVar.q = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ")";
    }
}
