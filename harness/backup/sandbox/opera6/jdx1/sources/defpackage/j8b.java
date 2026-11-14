package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j8b extends wye {
    public static final zg d0;
    public final lbl b0;
    public i8b c0;

    static {
        zg zgVarD = na2.d();
        int i = u95.h;
        zgVarD.D(u95.d);
        zgVarD.J(1.0f);
        zgVarD.K(1);
        d0 = zgVarD;
    }

    public j8b(m3c m3cVar) {
        super(m3cVar);
        lbl lblVar = new lbl();
        lblVar.d = 0;
        this.b0 = lblVar;
        lblVar.h = this;
        this.c0 = m3cVar.h != null ? new i8b(this) : null;
    }

    @Override // defpackage.pfd
    public final int E(int i) {
        c37 c37VarT = this.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.c((wye) m3cVar.F.e, m3cVar.m(), i);
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        c37 c37VarT = this.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.a((wye) m3cVar.F.e, m3cVar.m(), i);
    }

    @Override // defpackage.pfd
    public final ifg N(long j) throws pxb {
        g0(j);
        m3c m3cVar = this.u;
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).G.p.l = k3c.c;
        }
        t1(m3cVar.w.b(this, m3cVar.m(), j));
        k1();
        return this;
    }

    @Override // defpackage.wye
    public final void U0() {
        if (this.c0 == null) {
            this.c0 = new i8b(this);
        }
    }

    @Override // defpackage.wye
    public final q1d X0() {
        return this.c0;
    }

    @Override // defpackage.wye
    public final b8e Z0() {
        return this.b0;
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        c37 c37VarT = this.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.d((wye) m3cVar.F.e, m3cVar.m(), i);
    }

    @Override // defpackage.ifg
    public final void d0(long j, float f, Function1 function1) throws Throwable {
        q1(j, f, function1);
        if (this.n) {
            return;
        }
        this.u.G.p.x0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.wye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g1(defpackage.vye r12, long r13, defpackage.oea r15, int r16, boolean r17) {
        /*
            r11 = this;
            m3c r0 = r11.u
            boolean r1 = r12.u(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r11.B1(r13)
            r9 = r16
            if (r1 == 0) goto L16
            r10 = r17
        L14:
            r3 = r2
            goto L32
        L16:
            if (r9 != r2) goto L30
            long r4 = r11.Y0()
            float r11 = r11.R0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L30
            r10 = r3
            goto L14
        L2e:
            r9 = r16
        L30:
            r10 = r17
        L32:
            if (r3 == 0) goto L78
            int r11 = r15.c
            dfe r0 = r0.y()
            java.lang.Object[] r1 = r0.a
            int r0 = r0.c
            int r0 = r0 - r2
        L3f:
            if (r0 < 0) goto L76
            r2 = r1[r0]
            r5 = r2
            m3c r5 = (defpackage.m3c) r5
            boolean r2 = r5.I()
            if (r2 == 0) goto L71
            r4 = r12
            r6 = r13
            r8 = r15
            r4.p(r5, r6, r8, r9, r10)
            long r2 = r15.b()
            float r6 = defpackage.qyn.F(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L71
            boolean r6 = defpackage.qyn.N(r2)
            if (r6 == 0) goto L71
            boolean r2 = defpackage.qyn.M(r2)
            if (r2 != 0) goto L71
            boolean r2 = r12.q(r15, r5)
            if (r2 == 0) goto L76
        L71:
            int r0 = r0 + (-1)
            r9 = r16
            goto L3f
        L76:
            r15.c = r11
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8b.g1(vye, long, oea, int, boolean):void");
    }

    @Override // defpackage.o1d
    public final int q0(sz0 sz0Var) throws Throwable {
        i8b i8bVar = this.c0;
        if (i8bVar != null) {
            return i8bVar.q0(sz0Var);
        }
        sfd sfdVar = this.u.G.p;
        n3c n3cVar = sfdVar.x;
        if (!sfdVar.m) {
            if (sfdVar.f.d == i3c.a) {
                n3cVar.f = true;
                if (n3cVar.b) {
                    sfdVar.v = true;
                    sfdVar.w = true;
                }
            } else {
                n3cVar.g = true;
            }
        }
        j8b j8bVarC = sfdVar.C();
        boolean z = j8bVarC.o;
        j8bVarC.o = true;
        sfdVar.t();
        j8bVarC.o = z;
        Integer num = (Integer) n3cVar.i.get(sz0Var);
        return num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        c37 c37VarT = this.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.e((wye) m3cVar.F.e, m3cVar.m(), i);
    }
}
