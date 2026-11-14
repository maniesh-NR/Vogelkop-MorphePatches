package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvco;", "Lh8e;", "Lwco;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class vco extends h8e {
    public final float b;
    public final Object c;

    public vco(Object obj, float f) {
        this.b = f;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vco)) {
            return false;
        }
        vco vcoVar = (vco) obj;
        return vcoVar.b == this.b && Intrinsics.a(vcoVar.c, this.c);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        wco wcoVar = new wco();
        wcoVar.o = this.b;
        wcoVar.p = this.c;
        return wcoVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        wco wcoVar = (wco) b8eVar;
        wcoVar.o = this.b;
        wcoVar.p = this.c;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.b) * 31;
        Object obj = this.c;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
