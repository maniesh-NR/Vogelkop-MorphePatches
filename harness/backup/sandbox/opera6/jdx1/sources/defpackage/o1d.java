package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class o1d extends ifg implements hae, ivf, vfd {
    public static final uvc s = new uvc(1);
    public static final uvc t = new uvc(2);
    public m1d f;
    public Function1 g;
    public Function2 h;
    public Function1 i;
    public kfg j;
    public see k;
    public boolean l;
    public see m;
    public boolean n;
    public boolean o;
    public final p1d p = new p1d(this, (byte) 0);
    public pr q;
    public see r;

    public static void K0(wye wyeVar) {
        n3c n3cVar;
        wye wyeVar2 = wyeVar.v;
        m3c m3cVar = wyeVar.u;
        if (!Intrinsics.a(wyeVar2 != null ? wyeVar2.u : null, m3cVar)) {
            m3cVar.G.p.x.f();
            return;
        }
        xz0 xz0VarD = m3cVar.G.p.d();
        if (xz0VarD == null || (n3cVar = ((sfd) xz0VarD).x) == null) {
            return;
        }
        n3cVar.f();
    }

    @Override // defpackage.vfd
    public final ufd A(int i, int i2, Map map, z3 z3Var, Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            a8b.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new n1d(i, i2, map, z3Var, function1, this);
    }

    public abstract b2c A0();

    public abstract boolean B0();

    public abstract m3c D0();

    @Override // defpackage.shb
    public boolean F() {
        return false;
    }

    public abstract ufd G0();

    public abstract o1d H0();

    public abstract long I0();

    public final m1d J0() {
        m1d m1dVar = this.f;
        if (m1dVar != null) {
            return m1dVar;
        }
        m1d m1dVar2 = new m1d(this);
        this.f = m1dVar2;
        return m1dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(tee teeVar) {
        m3c m3cVar;
        Object[] objArr = teeVar.b;
        long[] jArr = teeVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (m3cVar = (m3c) ((ynn) objArr[(i << 3) + i3]).get()) != null) {
                        if (F()) {
                            m3cVar.S(false);
                        } else {
                            m3cVar.U(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void M0();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0() {
        /*
            r15 = this;
            pr r0 = r15.q
            r1 = 0
            if (r0 == 0) goto L24
            int r2 = r0.a
            r3 = r1
        L8:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.b
            pga[] r4 = (defpackage.pga[]) r4
            r5 = 0
            r4[r3] = r5
            java.lang.Object r4 = r0.c
            float[] r4 = (float[]) r4
            r5 = 2143289344(0x7fc00000, float:NaN)
            r4[r3] = r5
            java.lang.Object r4 = r0.d
            byte[] r4 = (byte[]) r4
            r4[r3] = r1
            int r3 = r3 + 1
            goto L8
        L22:
            r0.a = r1
        L24:
            see r0 = r15.r
            if (r0 != 0) goto L29
            return
        L29:
            java.lang.Object[] r2 = r0.c
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6d
            r5 = r1
        L33:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L4d:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            tee r11 = (defpackage.tee) r11
            r15.L0(r11)
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4d
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r4) goto L6d
            int r5 = r5 + 1
            goto L33
        L6d:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1d.N0():void");
    }

    @Override // defpackage.ifg
    public final int W(sz0 sz0Var) {
        int iQ0;
        if (!B0() || (iQ0 = q0(sz0Var)) == Integer.MIN_VALUE) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        boolean z = sz0Var instanceof h2n;
        long j = this.e;
        return iQ0 + ((int) (z ? j >> 32 : j & 4294967295L));
    }

    public boolean Z() {
        return D0().H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0(defpackage.m3c r32, defpackage.pga r33) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1d.i0(m3c, pga):void");
    }

    public abstract int q0(sz0 sz0Var);

    @Override // defpackage.hae
    public final void r(boolean z) {
        o1d o1dVarH0 = H0();
        m3c m3cVarD0 = o1dVarH0 != null ? o1dVarH0.D0() : null;
        if (Intrinsics.a(m3cVarD0, D0())) {
            this.l = z;
            return;
        }
        if ((m3cVarD0 != null ? m3cVarD0.G.d : null) != i3c.c) {
            if ((m3cVarD0 != null ? m3cVarD0.G.d : null) != i3c.d) {
                return;
            }
        }
        this.l = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(final defpackage.kfg r23, final long r24, final long r26) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1d.r0(kfg, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(defpackage.ufd r28) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1d.v0(ufd):void");
    }

    public abstract o1d x0();
}
