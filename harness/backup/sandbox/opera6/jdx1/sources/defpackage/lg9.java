package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llg9;", "Lh8e;", "Lng9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class lg9 extends h8e {
    public final kg9 b;

    public lg9(kg9 kg9Var) {
        this.b = kg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg9) && Intrinsics.a(this.b, ((lg9) obj).b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        ng9 ng9Var = new ng9();
        ng9Var.o = this.b;
        return ng9Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ng9 ng9Var = (ng9) b8eVar;
        ng9Var.o.a.k(ng9Var);
        kg9 kg9Var = this.b;
        ng9Var.o = kg9Var;
        kg9Var.a.c(ng9Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ")";
    }
}
