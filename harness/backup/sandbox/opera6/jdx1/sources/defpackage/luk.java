package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lluk;", "Lh8e;", "Lvuk;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class luk extends h8e {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public luk(Object obj, mgl mglVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        mglVar = (i & 2) != 0 ? null : mglVar;
        this.b = obj;
        this.c = mglVar;
        this.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luk)) {
            return false;
        }
        luk lukVar = (luk) obj;
        return Intrinsics.a(this.b, lukVar.b) && Intrinsics.a(this.c, lukVar.c) && this.d == lukVar.d;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new vuk(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        vuk vukVar = (vuk) b8eVar;
        Object obj = vukVar.o;
        Object obj2 = this.b;
        boolean z = !Intrinsics.a(obj, obj2);
        vukVar.o = obj2;
        Object obj3 = vukVar.p;
        Object obj4 = this.c;
        if (!Intrinsics.a(obj3, obj4)) {
            z = true;
        }
        vukVar.p = obj4;
        Class<?> cls = vukVar.q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            vukVar.V0();
        }
        vukVar.q = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
