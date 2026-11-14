package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a45 extends y3 {
    public lmg K;
    public n6b L;

    @Override // defpackage.v6b
    public final void D(ro9 ro9Var, gmg gmgVar) throws pxb {
        ArrayList arrayList = (ArrayList) ro9Var.c;
        e1();
        if (this.v && this.z == null) {
            cw9 cw9Var = new cw9(this);
            T0(cw9Var);
            this.z = cw9Var;
        }
        int i = 0;
        if (gmgVar != gmg.b) {
            if (gmgVar == gmg.c) {
                if (this.L != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        n6b n6bVar = (n6b) arrayList.get(i);
                        if (n6bVar.i && n6bVar != this.L) {
                            k1(true);
                            break;
                        }
                        i++;
                    }
                }
                if (Intrinsics.a(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.L == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (wyh.i((n6b) arrayList.get(i2))) {
                    n6b n6bVar2 = (n6b) arrayList.get(0);
                    n6bVar2.i = true;
                    this.L = n6bVar2;
                    if (this.v) {
                        this.A = "waiting";
                        c1(n6bVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            n6b n6bVar3 = (n6b) arrayList.get(i3);
            if (n6bVar3.i || !n6bVar3.h || n6bVar3.d) {
                float f = ((u5n) z4o.N(this, mi5.t)).f();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    n6b n6bVar4 = (n6b) arrayList.get(i4);
                    boolean z = Math.abs(y8f.c(y8f.d(n6bVar4.c, this.L.c))) > f;
                    if (n6bVar4.i || z) {
                        k1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((n6b) arrayList.get(0)).i = true;
        if (this.v) {
            this.A = "recognized";
            b1(this.L.c, true);
            i1();
        }
        this.L = null;
    }

    @Override // defpackage.omg
    public final void g0() {
        cma cmaVar;
        lde ldeVar = this.q;
        if (ldeVar != null && (cmaVar = this.D) != null) {
            ldeVar.b(new dma(cmaVar));
        }
        this.D = null;
        k1(false);
    }

    public final void k1(boolean z) {
        if (z) {
            this.L = null;
        } else {
            this.K = null;
        }
        a1(z);
        this.A = "idle";
    }

    @Override // defpackage.y3, defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) throws pxb {
        super.n(fmgVar, gmgVar, j);
        if (gmgVar != gmg.b) {
            if (gmgVar == gmg.c) {
                if (this.K != null) {
                    List list = fmgVar.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        lmg lmgVar = (lmg) list.get(i);
                        if (lmgVar.c() && lmgVar != this.K) {
                            k1(false);
                            break;
                        }
                        i++;
                    }
                }
                if (Intrinsics.a(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.K == null) {
            if (xbl.e(fmgVar, true)) {
                lmg lmgVar2 = (lmg) fmgVar.a.get(0);
                lmgVar2.a();
                this.K = lmgVar2;
                if (this.v) {
                    this.A = "waiting";
                    d1(lmgVar2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = fmgVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!wxe.l((lmg) list2.get(i2))) {
                long jZ0 = Z0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    lmg lmgVar3 = (lmg) list2.get(i3);
                    if (lmgVar3.c() || wxe.I(lmgVar3, j, jZ0)) {
                        k1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((lmg) list2.get(0)).a();
        if (this.v) {
            this.A = "recognized";
            b1(this.K.c, false);
            i1();
        }
        this.K = null;
    }

    @Override // defpackage.v6b
    public final void q0() {
        k1(true);
    }
}
