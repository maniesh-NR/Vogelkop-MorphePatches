package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkaj;", "Lh8e;", "Lki3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class kaj extends h8e {
    public final float b;
    public final paj c;
    public final boolean d;
    public final long e;
    public final long f;

    public kaj(float f, paj pajVar, boolean z, long j, long j2) {
        this.b = f;
        this.c = pajVar;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaj)) {
            return false;
        }
        kaj kajVar = (kaj) obj;
        if (!gh7.b(this.b, kajVar.b) || !Intrinsics.a(this.c, kajVar.c) || this.d != kajVar.d) {
            return false;
        }
        long j = kajVar.e;
        int i = u95.h;
        return jgm.a(this.e, j) && jgm.a(this.f, kajVar.f);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ki3(new tji(this, (byte) 15));
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        wye wyeVar;
        ki3 ki3Var = (ki3) b8eVar;
        Function1 tjiVar = new tji(this, (byte) 15);
        ki3Var.o = tjiVar;
        if (!ki3Var.a.n || (wyeVar = ui6.c0(ki3Var, 2).v) == null) {
            return;
        }
        wyeVar.z1(true, tjiVar);
    }

    public final int hashCode() {
        int iK = fki.k((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.f) + z1m.e(iK, 31, this.e);
    }

    public final String toString() {
        String strC = gh7.c(this.b);
        String strH = u95.h(this.e);
        String strH2 = u95.h(this.f);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strC);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        z1m.u(sb, this.d, ", ambientColor=", strH, ", spotColor=");
        return z1m.l(sb, strH2, ")");
    }
}
