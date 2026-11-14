package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zj7 extends b8e implements e3c {
    public a21 o;
    public Function2 p;
    public fsf q;
    public boolean r;

    @Override // defpackage.b8e
    public final void M0() {
        this.r = false;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(j);
        if (!vfdVar.F() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new gcb((ifgVarN.a << 32) | (ifgVarN.b & 4294967295L)), new yo5(j));
            a21 a21Var = this.o;
            x9d x9dVar = (x9d) pair.a;
            Object obj = pair.b;
            if (!Intrinsics.a(a21Var.h(), x9dVar)) {
                ((t0g) a21Var.i).setValue(x9dVar);
                pfe pfeVar = ((pgb) a21Var.e).b;
                if (pfeVar.j()) {
                    try {
                        w11 w11Var = (w11) a21Var.m;
                        float fD = a21Var.h().d(obj);
                        if (!Float.isNaN(fD)) {
                            w11.a(w11Var, fD);
                            a21Var.p((Object) null);
                        }
                        a21Var.n(obj);
                    } finally {
                        pfeVar.l((Object) null);
                    }
                } else {
                    a21Var.p(obj);
                }
            }
        }
        this.r = vfdVar.F() || this.r;
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f9(vfdVar, this, ifgVarN, (byte) 29));
    }
}
