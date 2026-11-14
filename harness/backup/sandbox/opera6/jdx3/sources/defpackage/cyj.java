package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cyj {
    public final jsc a;
    public final y7h b;
    public final y7h c;
    public final rxj d;
    public final zxj e;
    public final uxj f;
    public final qxj g;
    public final pxj h;

    public cyj(jsc jscVar, y7h y7hVar, hxh hxhVar, rxj rxjVar, zxj zxjVar, uxj uxjVar, qxj qxjVar, pxj pxjVar, int i) {
        this(jscVar, (i & 2) != 0 ? new hxh(2130970944) : y7hVar, (i & 4) != 0 ? new hxh(2130970944) : hxhVar, rxjVar, (i & 16) != 0 ? new zxj(new ayj(new ixh(64.0f), new ixh(48.0f), new ixh(4.0f), umj.a, false)) : zxjVar, (i & 32) != 0 ? new uxj(null, 127) : uxjVar, (i & 64) != 0 ? new qxj(null, null, null, 255) : qxjVar, (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? new pxj(0, (ixh) null, (kxh) null, 63) : pxjVar);
    }

    public cyj(jsc jscVar, y7h y7hVar, y7h y7hVar2, rxj rxjVar, zxj zxjVar, uxj uxjVar, qxj qxjVar, pxj pxjVar) {
        this.a = jscVar;
        this.b = y7hVar;
        this.c = y7hVar2;
        this.d = rxjVar;
        this.e = zxjVar;
        this.f = uxjVar;
        this.g = qxjVar;
        this.h = pxjVar;
    }

    public static cyj a(cyj cyjVar, jsc jscVar, y7h y7hVar, ixh ixhVar, rxj rxjVar, qxj qxjVar, pxj pxjVar, int i) {
        if ((i & 1) != 0) {
            jscVar = cyjVar.a;
        }
        jsc jscVar2 = jscVar;
        y7h y7hVar2 = ixhVar;
        if ((i & 4) != 0) {
            y7hVar2 = cyjVar.c;
        }
        y7h y7hVar3 = y7hVar2;
        zxj zxjVar = cyjVar.e;
        uxj uxjVar = cyjVar.f;
        pxj pxjVar2 = (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? cyjVar.h : pxjVar;
        cyjVar.getClass();
        return new cyj(jscVar2, y7hVar, y7hVar3, rxjVar, zxjVar, uxjVar, qxjVar, pxjVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyj)) {
            return false;
        }
        cyj cyjVar = (cyj) obj;
        return Intrinsics.a(this.a, cyjVar.a) && Intrinsics.a(this.b, cyjVar.b) && Intrinsics.a(this.c, cyjVar.c) && Intrinsics.a(this.d, cyjVar.d) && Intrinsics.a(this.e, cyjVar.e) && Intrinsics.a(this.f, cyjVar.f) && Intrinsics.a(this.g, cyjVar.g) && Intrinsics.a(this.h, cyjVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
