package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qxj {
    public final b8h a;
    public final cxh b;
    public final cxh c;
    public final gxh d;
    public final ixh e;
    public final fxh f;
    public final fxh g;
    public final float h;

    public qxj(b8h b8hVar, cxh cxhVar, cxh cxhVar2, gxh gxhVar, ixh ixhVar, fxh fxhVar, fxh fxhVar2, float f) {
        this.a = b8hVar;
        this.b = cxhVar;
        this.c = cxhVar2;
        this.d = gxhVar;
        this.e = ixhVar;
        this.f = fxhVar;
        this.g = fxhVar2;
        this.h = f;
    }

    public qxj(lxh lxhVar, gxh gxhVar, cxh cxhVar, int i) {
        this((i & 1) != 0 ? new lxh(2131232115) : lxhVar, (i & 2) != 0 ? new dxh(2130969236) : gxhVar, (i & 4) != 0 ? new dxh(2130969279) : cxhVar, new gxh(0), new ixh(0.0f), new fxh(2131103890), new fxh(2131099830), 1.0f);
    }

    public static qxj a(qxj qxjVar, float f) {
        b8h b8hVar = qxjVar.a;
        cxh cxhVar = qxjVar.b;
        cxh cxhVar2 = qxjVar.c;
        gxh gxhVar = qxjVar.d;
        ixh ixhVar = qxjVar.e;
        fxh fxhVar = qxjVar.f;
        fxh fxhVar2 = qxjVar.g;
        qxjVar.getClass();
        return new qxj(b8hVar, cxhVar, cxhVar2, gxhVar, ixhVar, fxhVar, fxhVar2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxj)) {
            return false;
        }
        qxj qxjVar = (qxj) obj;
        return Intrinsics.a(this.a, qxjVar.a) && Intrinsics.a(this.b, qxjVar.b) && Intrinsics.a(this.c, qxjVar.c) && Intrinsics.a(this.d, qxjVar.d) && Intrinsics.a(this.e, qxjVar.e) && Intrinsics.a(this.f, qxjVar.f) && Intrinsics.a(this.g, qxjVar.g) && Float.compare(this.h, qxjVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + sko.d(this.e.d, rfp.c(this.d.a, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
