package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ki3 extends b8e implements e3c, i0j {
    public Function1 o;

    public ki3(Function1 function1) {
        this.o = function1;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        paj pajVar;
        boolean z;
        wye wyeVarC0 = ui6.c0(this, 2);
        if (wyeVarC0.N) {
            pajVar = wyeVarC0.J;
            z = wyeVarC0.M;
        } else {
            m1i m1iVar = z5i.c;
            if (m1iVar == null) {
                z5i.c = new m1i();
            } else {
                m1iVar.a();
            }
            m1i m1iVar2 = z5i.c;
            m1iVar2.t = wyeVarC0.u.y;
            m1iVar2.r = fr3.g0(wyeVarC0.c);
            ttj ttjVarT = bwg.t();
            Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttj ttjVarX = bwg.x(ttjVarT);
            try {
                this.o.invoke(m1iVar2);
                bwg.A(ttjVarT, ttjVarX, function1E);
                pajVar = m1iVar2.o;
                z = m1iVar2.p;
            } catch (Throwable th) {
                bwg.A(ttjVarT, ttjVarX, function1E);
                throw th;
            }
        }
        if (z) {
            o0j.i(q0jVar, pajVar);
        }
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(j);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new cv2(ifgVarN, this, (byte) 4));
    }

    @Override // defpackage.i0j
    public final boolean g() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.o + ")";
    }
}
