package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sb7 extends b8e implements lk7 {
    public p12 o;

    @Override // defpackage.b8e
    public final void L0() {
        this.o.getClass();
    }

    @Override // defpackage.b8e
    public final void M0() {
        p12 p12Var = this.o;
        p12Var.t();
        p12Var.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb7) && Intrinsics.a(this.o, ((sb7) obj).o);
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.o + ")";
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        ArrayList arrayList = (ArrayList) this.o.h;
        if (arrayList.size() > 0) {
            throw fki.n(0, arrayList);
        }
        o3cVar.a();
    }
}
