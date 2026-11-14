package defpackage;

import java.util.Objects;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n79 implements trm {
    public final pe4 a;
    public final hak b;
    public final ctm c;
    public final kwl d;
    public final etm e;
    public zrm f;
    public volatile int g = 2;
    public volatile cwa h;
    public cd5 i;

    public n79(pe4 pe4Var, hak hakVar, ctm ctmVar, kwl kwlVar, etm etmVar) {
        this.a = pe4Var;
        this.b = hakVar;
        this.c = ctmVar;
        this.d = kwlVar;
        this.e = etmVar;
        sfe.d(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, nt5 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.i79
            if (r0 == 0) goto L13
            r0 = r14
            i79 r0 = (defpackage.i79) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            i79 r0 = new i79
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            short r12 = r0.t
            long r12 = (long) r12
            cd5 r0 = r0.u
            defpackage.ybh.y(r14)
            r8 = r11
            goto L5f
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r3
        L34:
            defpackage.ybh.y(r14)
            cd5 r14 = new cd5
            r14.<init>()
            bm8 r9 = new bm8
            r2 = 8
            r9.<init>(r14, r2)
            cv6 r2 = bb7.a
            d7a r2 = s6d.a
            j79 r5 = new j79
            r10 = 0
            r8 = r11
            r6 = r12
            r5.<init>(r6, r8, r9, r10)
            r0.u = r14
            int r11 = (int) r6
            r0.t = r11
            r0.x = r4
            java.lang.Object r11 = defpackage.na2.Z(r2, r5, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r0 = r14
            r12 = r6
        L5f:
            ctm r11 = r8.c
            a64 r11 = r11.a
            ea4 r14 = new ea4
            r14.<init>(r0, r12, r3)
            r12 = 3
            i07 r11 = defpackage.na2.g(r11, r3, r3, r14, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.a(long, nt5):java.lang.Object");
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.f = zrmVar;
        d(this.g, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.k79
            if (r0 == 0) goto L13
            r0 = r5
            k79 r0 = (defpackage.k79) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            k79 r0 = new k79
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            int r4 = r0.t
            defpackage.ybh.y(r5)
            goto L4b
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            int r5 = r4.g
            cd5 r4 = r4.i
            if (r4 != 0) goto L3f
            kotlin.Unit r4 = kotlin.Unit.a
            cd5 r4 = defpackage.sfe.d(r4)
        L3f:
            r0.t = r5
            r0.w = r3
            java.lang.Object r4 = r4.Z(r0)
            if (r4 != r1) goto L4a
            return r1
        L4a:
            r4 = r5
        L4b:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.c(nt5):java.lang.Object");
    }

    public final cd5 d(int i, boolean z) {
        if (gyg.G(3, "CXCP")) {
            Objects.toString(this.f);
        }
        cd5 cd5Var = new cd5();
        if (this.f == null) {
            am2.z("Camera is not active.", cd5Var);
            return cd5Var;
        }
        this.g = i;
        cd5 cd5Var2 = this.i;
        if (z) {
            if (cd5Var2 != null) {
                am2.z("There is a new flash mode being set or camera was closed", cd5Var2);
            }
            this.i = null;
        } else if (cd5Var2 != null) {
            p37.f0(cd5Var, cd5Var2);
        }
        this.i = cd5Var;
        hak hakVar = this.b;
        synchronized (hakVar.d) {
            hakVar.h = i;
        }
        p37.f0(hakVar.f(), cd5Var);
        return cd5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (defpackage.cs5.n(r6, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.l79
            if (r0 == 0) goto L13
            r0 = r9
            l79 r0 = (defpackage.l79) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            l79 r0 = new l79
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2c
            defpackage.ybh.y(r9)
            goto Lab
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L32:
            java.util.ArrayList r2 = r0.u
            java.util.ArrayList r6 = r0.t
            defpackage.ybh.y(r9)
            goto L51
        L3a:
            defpackage.ybh.y(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.t = r2
            r0.u = r2
            r0.x = r4
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = r8.a(r6, r0)
            if (r9 == r1) goto Laa
            r6 = r2
        L51:
            r2.add(r9)
            pe4 r9 = r8.a
            ge4 r9 = r9.b
            r2 = 5
            int r9 = defpackage.z4o.W(r9, r2)
            if (r9 != r2) goto L79
            hak r9 = r8.b
            java.lang.Object r2 = r9.d
            monitor-enter(r2)
            r9.j = r4     // Catch: java.lang.Throwable -> L76
            monitor-exit(r2)
            cd5 r9 = r9.f()
            d58 r2 = new d58
            r4 = 17
            r2.<init>(r4)
            r9.s(r2)
            goto L7a
        L76:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L79:
            r9 = r5
        L7a:
            if (r9 == 0) goto L7f
            r6.add(r9)
        L7f:
            etm r9 = r8.e
            boolean r9 = r9.v()
            if (r9 != 0) goto L89
            r8 = r5
            goto L99
        L89:
            kwl r8 = r8.d
            cd5 r8 = defpackage.kwl.d(r8, r3, r3)
            d58 r9 = new d58
            r2 = 16
            r9.<init>(r2)
            r8.s(r9)
        L99:
            if (r8 == 0) goto L9e
            r6.add(r8)
        L9e:
            r0.t = r5
            r0.u = r5
            r0.x = r3
            java.lang.Object r8 = defpackage.cs5.n(r6, r0)
            if (r8 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.e(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.m79
            if (r0 == 0) goto L13
            r0 = r7
            m79 r0 = (defpackage.m79) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            m79 r0 = new m79
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)
            goto L45
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2e:
            defpackage.ybh.y(r7)
            cv6 r7 = bb7.a
            d7a r7 = s6d.a
            bz1 r2 = new bz1
            r5 = 13
            r2.<init>(r5, r3, r6)
            r0.v = r4
            java.lang.Object r7 = defpackage.na2.Z(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            pe4 r7 = r6.a
            ge4 r7 = r7.b
            r0 = 5
            int r7 = defpackage.z4o.W(r7, r0)
            r1 = 0
            if (r7 != r0) goto L60
            hak r7 = r6.b
            java.lang.Object r0 = r7.d
            monitor-enter(r0)
            r7.j = r1     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r0)
            r7.f()
            goto L60
        L5d:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L60:
            etm r7 = r6.e
            boolean r7 = r7.v()
            if (r7 == 0) goto L6e
            kwl r6 = r6.d
            r7 = 2
            defpackage.kwl.d(r6, r1, r7)
        L6e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.f(nt5):java.lang.Object");
    }

    @Override // defpackage.trm
    public final void reset() {
        this.g = 2;
        this.h = null;
        cd5 cd5Var = this.i;
        if (cd5Var != null) {
            am2.z("There is a new flash mode being set or camera was closed", cd5Var);
        }
        this.i = null;
        d(2, true);
    }
}
