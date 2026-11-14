package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rj4 implements ni4 {
    public final ci4 a;
    public final n79 b;
    public final kwl c;
    public final x4n d;
    public final ctm e;
    public final tb5 f;
    public final ftm g;
    public final n7h h;
    public final vsm i;
    public final zyk j;
    public x61 m;
    public final zyk k = z4c.b(new r94(this, 3));
    public int l = 1;
    public final wi4 n = new wi4();

    public rj4(ci4 ci4Var, n79 n79Var, kwl kwlVar, x4n x4nVar, ctm ctmVar, tb5 tb5Var, ftm ftmVar, pe4 pe4Var, n7h n7hVar, vsm vsmVar) {
        this.a = ci4Var;
        this.b = n79Var;
        this.c = kwlVar;
        this.d = x4nVar;
        this.e = ctmVar;
        this.f = tb5Var;
        this.g = ftmVar;
        this.h = n7hVar;
        this.i = vsmVar;
        this.j = z4c.b(new oi4(pe4Var, (byte) 0));
    }

    @Override // defpackage.ni4
    public final Object a(ArrayList arrayList, int i, eb4 eb4Var, int i2, int i3, int i4, nt5 nt5Var) {
        return h(Arrays.asList(qi4.a, qi4.b, qi4.c), i2, i4, i3, new pi4(arrayList, i, eb4Var), nt5Var);
    }

    @Override // defpackage.ni4
    public final aj4 b(int i, int i2) {
        return new aj4(this, i, i2);
    }

    @Override // defpackage.ni4
    public final void c(int i) {
        this.l = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.pi4 r18, long r19, int r21, java.util.List r22, nt5 r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.d(pi4, long, int, java.util.List, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pi4 r9, int r10, int r11, java.util.List r12, nt5 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.ti4
            if (r0 == 0) goto L14
            r0 = r13
            ti4 r0 = (defpackage.ti4) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            ti4 r0 = new ti4
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.w
            px5 r0 = px5.a
            int r1 = r7.y
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L48
            if (r1 == r5) goto L39
            if (r1 == r4) goto L35
            if (r1 == r3) goto L35
            if (r1 == r2) goto L35
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r6
        L35:
            defpackage.ybh.y(r13)
            return r13
        L39:
            int r10 = r7.v
            java.util.List r9 = r7.u
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            pi4 r9 = r7.t
            defpackage.ybh.y(r13)
        L45:
            r2 = r9
            r5 = r10
            goto L6b
        L48:
            defpackage.ybh.y(r13)
            zyk r13 = r8.j
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L9d
            r7.t = r9
            r13 = r12
            java.util.List r13 = (java.util.List) r13
            r7.u = r13
            r7.v = r10
            r7.y = r5
            java.lang.Object r13 = r8.k(r11, r7)
            if (r13 != r0) goto L45
            goto La6
        L6b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r9 = r13.booleanValue()
            if (r9 == 0) goto L79
            r10 = 5000000000(0x12a05f200, double:2.470328229E-314)
            goto L7c
        L79:
            r10 = 1000000000(0x3b9aca00, double:4.94065646E-315)
        L7c:
            if (r9 != 0) goto L8d
            if (r5 == 0) goto L8d
            r7.t = r6
            r7.u = r6
            r7.y = r3
            java.lang.Object r8 = r8.f(r2, r5, r12, r7)
            if (r8 == r0) goto La6
            return r8
        L8d:
            r7.t = r6
            r7.u = r6
            r7.y = r4
            r1 = r8
            r3 = r10
            r6 = r12
            java.lang.Object r8 = r1.d(r2, r3, r5, r6, r7)
            if (r8 == r0) goto La6
            return r8
        L9d:
            r1 = r8
            r7.y = r2
            java.lang.Object r8 = r1.f(r9, r10, r12, r7)
            if (r8 != r0) goto La7
        La6:
            return r0
        La7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.e(pi4, int, int, java.util.List, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.pi4 r9, int r10, java.util.List r11, nt5 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.vi4
            if (r0 == 0) goto L13
            r0 = r12
            vi4 r0 = (defpackage.vi4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vi4 r0 = new vi4
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.x
            px5 r1 = px5.a
            int r2 = r0.z
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 != r5) goto L36
            boolean r9 = r0.t
            pi4 r10 = r0.w
            java.util.List r11 = r0.v
            java.util.List r11 = (java.util.List) r11
            rj4 r0 = r0.u
            defpackage.ybh.y(r12)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L72
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L3c:
            defpackage.ybh.y(r12)
            r12 = 0
            if (r10 != 0) goto L44
            r10 = r5
            goto L45
        L44:
            r10 = r12
        L45:
            java.lang.String r2 = "CXCP"
            boolean r2 = defpackage.gyg.G(r3, r2)
            if (r2 == 0) goto L50
            java.util.Objects.toString(r11)
        L50:
            qi4 r2 = defpackage.qi4.a
            boolean r2 = r11.contains(r2)
            if (r2 == 0) goto L71
            if (r10 == 0) goto L71
            r0.u = r8
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.v = r2
            r0.w = r9
            r0.t = r10
            r0.z = r5
            r5 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.Object r12 = r8.l(r5, r12, r0)
            if (r12 != r1) goto L71
            return r1
        L71:
            r0 = r8
        L72:
            qi4 r12 = defpackage.qi4.b
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L87
            if (r9 == 0) goto L81
            java.util.ArrayList r9 = r0.n(r9)
            goto L8f
        L81:
            java.lang.String r8 = "Required value was null."
            qp2.n(r8)
            return r4
        L87:
            cd5 r9 = defpackage.sfe.d(r4)
            java.util.List r9 = java.util.Collections.singletonList(r9)
        L8f:
            qi4 r12 = defpackage.qi4.c
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto La3
            ctm r11 = r0.e
            a64 r11 = r11.f
            ui4 r12 = new ui4
            r12.<init>(r9, r4, r10, r8)
            defpackage.na2.B(r11, r4, r4, r12, r3)
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.f(pi4, int, java.util.List, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bj4
            if (r0 == 0) goto L13
            r0 = r7
            bj4 r0 = (defpackage.bj4) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            bj4 r0 = new bj4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            rj4 r0 = r0.t
            defpackage.ybh.y(r7)
            goto L4d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L30:
            defpackage.ybh.y(r7)
            x61 r7 = r6.m
            if (r7 != 0) goto L57
            r0.t = r6
            r0.w = r4
            mr3 r7 = new mr3
            r2 = 9
            r7.<init>(r2)
            r4 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            java.lang.Object r7 = r6.r(r4, r7, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r0 = r6
        L4d:
            go9 r7 = (defpackage.go9) r7
            if (r7 == 0) goto L55
            x61 r3 = r7.getMetadata()
        L55:
            r0.m = r3
        L57:
            java.lang.String r7 = "CXCP"
            r0 = 3
            boolean r7 = defpackage.gyg.G(r0, r7)
            if (r7 == 0) goto L65
            x61 r7 = r6.m
            java.util.Objects.toString(r7)
        L65:
            x61 r6 = r6.m
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.g(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r9, int r10, int r11, int r12, defpackage.pi4 r13, nt5 r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.cj4
            if (r0 == 0) goto L13
            r0 = r14
            cj4 r0 = (defpackage.cj4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            cj4 r0 = new cj4
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.x
            px5 r1 = px5.a
            int r2 = r0.z
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L33
            if (r2 == r6) goto L43
            if (r2 == r3) goto L43
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r7
        L33:
            int r11 = r0.w
            int r10 = r0.v
            pi4 r13 = r0.u
            java.util.List r9 = r0.t
            java.util.List r9 = (java.util.List) r9
            defpackage.ybh.y(r14)
        L40:
            r12 = r9
            r9 = r13
            goto L98
        L43:
            defpackage.ybh.y(r14)
            return r14
        L47:
            defpackage.ybh.y(r14)
            java.lang.String r14 = "CXCP"
            boolean r14 = defpackage.gyg.G(r6, r14)
            if (r14 == 0) goto L55
            java.util.Objects.toString(r9)
        L55:
            r8.m = r7
            qi4 r14 = defpackage.qi4.b
            boolean r14 = r9.contains(r14)
            if (r14 == 0) goto L67
            if (r13 != 0) goto L67
            java.lang.String r8 = "Must not be null for PipelineType.MAIN_CAPTURE"
            qp2.n(r8)
            return r7
        L67:
            if (r11 != r6) goto L72
            r0.z = r5
            java.lang.Object r8 = r8.m(r13, r10, r9, r0)
            if (r8 == r1) goto Lbb
            return r8
        L72:
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r0.t = r14
            r0.u = r13
            r0.v = r10
            r0.w = r11
            r0.z = r4
            int r14 = r8.l
            if (r14 == r6) goto L92
            if (r12 == r5) goto L92
            pv r12 = new pv
            r12.<init>(r6, r7, r8)
            ftm r14 = r8.g
            java.lang.Object r12 = r14.c(r12, r0)
        L90:
            r14 = r12
            goto L95
        L92:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto L90
        L95:
            if (r14 != r1) goto L40
            goto Lbb
        L98:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 == 0) goto Lae
            r0.t = r7
            r0.u = r7
            r0.z = r6
            r13 = r0
            java.lang.Object r8 = r8.p(r9, r10, r11, r12, r13)
            if (r8 == r1) goto Lbb
            return r8
        Lae:
            r13 = r0
            r13.t = r7
            r13.u = r7
            r13.z = r3
            java.lang.Object r8 = r8.e(r9, r10, r11, r12, r13)
            if (r8 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.h(java.util.List, int, int, int, pi4, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.dj4
            if (r0 == 0) goto L13
            r0 = r10
            dj4 r0 = (defpackage.dj4) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dj4 r0 = new dj4
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            java.lang.AutoCloseable r8 = r0.u
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L32
            goto L7e
        L32:
            r9 = move-exception
            goto L8a
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r6
        L3a:
            int r8 = r0.t
            defpackage.ybh.y(r10)
            goto L66
        L40:
            int r9 = r0.t
            defpackage.ybh.y(r10)
            goto L55
        L46:
            defpackage.ybh.y(r10)
            r0.t = r9
            r0.x = r5
            n79 r10 = r8.b
            java.lang.Object r10 = r10.f(r0)
            if (r10 == r1) goto L7c
        L55:
            vsm r8 = r8.i
            nd4 r8 = r8.a()
            r0.t = r9
            r0.x = r4
            java.lang.Object r10 = r8.k(r0)
            if (r10 == r1) goto L7c
            r8 = r9
        L66:
            r9 = r10
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9
            r10 = r9
            qd4 r10 = (defpackage.qd4) r10     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L6f
            r5 = 0
        L6f:
            r8 = r9
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8     // Catch: java.lang.Throwable -> L88
            r0.u = r8     // Catch: java.lang.Throwable -> L88
            r0.x = r3     // Catch: java.lang.Throwable -> L88
            cd5 r8 = r10.q(r5)     // Catch: java.lang.Throwable -> L88
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r8 = r9
        L7e:
            defpackage.fr3.t(r8, r6)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L84:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8a
        L88:
            r8 = move-exception
            goto L84
        L8a:
            throw r9     // Catch: java.lang.Throwable -> L8b
        L8b:
            r10 = move-exception
            defpackage.fr3.t(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.i(int, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r13 != r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [rj4] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ej4
            if (r0 == 0) goto L13
            r0 = r13
            ej4 r0 = (defpackage.ej4) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            ej4 r0 = new ej4
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L49
            if (r2 == r4) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L35
            java.lang.AutoCloseable r11 = r0.u
            java.lang.AutoCloseable r11 = (java.lang.AutoCloseable) r11
            defpackage.ybh.y(r13)     // Catch: java.lang.Throwable -> Lae
            goto L9b
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r7
        L3b:
            java.lang.AutoCloseable r11 = r0.u
            java.lang.AutoCloseable r11 = (java.lang.AutoCloseable) r11
            defpackage.ybh.y(r13)     // Catch: java.lang.Throwable -> Lae
            goto L8b
        L43:
            int r11 = r0.t
            defpackage.ybh.y(r13)
            goto L6f
        L49:
            int r12 = r0.t
            defpackage.ybh.y(r13)
            goto L5e
        L4f:
            defpackage.ybh.y(r13)
            r0.t = r12
            r0.x = r6
            n79 r13 = r11.b
            java.lang.Object r13 = r13.e(r0)
            if (r13 == r1) goto L9a
        L5e:
            vsm r11 = r11.i
            nd4 r11 = r11.a()
            r0.t = r12
            r0.x = r4
            java.lang.Object r13 = r11.k(r0)
            if (r13 == r1) goto L9a
            r11 = r12
        L6f:
            r12 = r13
            java.lang.AutoCloseable r12 = (java.lang.AutoCloseable) r12
            r13 = r12
            qd4 r13 = (defpackage.qd4) r13     // Catch: java.lang.Throwable -> Lb4
            if (r11 != 0) goto L79
            r11 = r6
            goto L7a
        L79:
            r11 = 0
        L7a:
            r2 = r12
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2     // Catch: java.lang.Throwable -> Lb4
            r0.u = r2     // Catch: java.lang.Throwable -> Lb4
            r0.x = r5     // Catch: java.lang.Throwable -> Lb4
            r8 = 2000000000(0x77359400, double:9.881312917E-315)
            cd5 r13 = defpackage.qd4.l(r13, r11, r6, r8)     // Catch: java.lang.Throwable -> Lb4
            if (r13 == r1) goto L9a
            r11 = r12
        L8b:
            h07 r13 = (h07) r13     // Catch: java.lang.Throwable -> Lae
            r12 = r11
            java.lang.AutoCloseable r12 = (java.lang.AutoCloseable) r12     // Catch: java.lang.Throwable -> Lae
            r0.u = r12     // Catch: java.lang.Throwable -> Lae
            r0.x = r3     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r13 = r13.X(r0)     // Catch: java.lang.Throwable -> Lae
            if (r13 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r0i r13 = (defpackage.r0i) r13     // Catch: java.lang.Throwable -> Lae
            java.lang.String r12 = "CXCP"
            boolean r12 = defpackage.gyg.G(r5, r12)     // Catch: java.lang.Throwable -> Lae
            if (r12 == 0) goto La8
            java.util.Objects.toString(r13)     // Catch: java.lang.Throwable -> Lae
        La8:
            defpackage.fr3.t(r11, r7)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        Lae:
            r12 = move-exception
            goto Lb6
        Lb0:
            r10 = r12
            r12 = r11
            r11 = r10
            goto Lb6
        Lb4:
            r11 = move-exception
            goto Lb0
        Lb6:
            throw r12     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r13 = move-exception
            defpackage.fr3.t(r11, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.j(int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.fj4
            if (r0 == 0) goto L13
            r0 = r7
            fj4 r0 = (defpackage.fj4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            fj4 r0 = new fj4
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            defpackage.ybh.y(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.ybh.y(r7)
            if (r6 == 0) goto L42
            if (r6 == r4) goto L60
            r5 = 2
            if (r6 == r5) goto L61
            r5 = 3
            if (r6 == r5) goto L61
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r6)
            throw r5
        L42:
            r0.v = r4
            java.lang.Object r7 = r5.g(r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            x61 r7 = (defpackage.x61) r7
            if (r7 == 0) goto L61
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r5 = r7.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L61
            int r5 = r5.intValue()
            r6 = 4
            if (r5 != r6) goto L61
        L60:
            r3 = r4
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.k(int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.AutoCloseable, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r19, boolean r21, nt5 r22) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.l(long, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.pi4 r7, int r8, java.util.List r9, nt5 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ij4
            if (r0 == 0) goto L13
            r0 = r10
            ij4 r0 = (defpackage.ij4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ij4 r0 = new ij4
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.x
            px5 r1 = px5.a
            int r2 = r0.z
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L33
            int r8 = r0.t
            pi4 r7 = r0.w
            java.util.List r9 = r0.v
            java.util.List r9 = (java.util.List) r9
            rj4 r0 = r0.u
            defpackage.ybh.y(r10)
            goto L64
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L39:
            defpackage.ybh.y(r10)
            java.lang.String r10 = "CXCP"
            boolean r10 = defpackage.gyg.G(r3, r10)
            if (r10 == 0) goto L47
            java.util.Objects.toString(r9)
        L47:
            qi4 r10 = defpackage.qi4.a
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L63
            r0.u = r6
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            r0.v = r10
            r0.w = r7
            r0.t = r8
            r0.z = r5
            java.lang.Object r10 = r6.j(r8, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            qi4 r10 = defpackage.qi4.b
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L79
            if (r7 == 0) goto L73
            java.util.ArrayList r7 = r0.n(r7)
            goto L81
        L73:
            java.lang.String r6 = "Required value was null."
            qp2.n(r6)
            return r4
        L79:
            cd5 r7 = defpackage.sfe.d(r4)
            java.util.List r7 = java.util.Collections.singletonList(r7)
        L81:
            qi4 r10 = defpackage.qi4.c
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L95
            ctm r9 = r0.e
            a64 r9 = r9.f
            hj4 r10 = new hj4
            r10.<init>(r7, r4, r6, r8)
            defpackage.na2.B(r9, r4, r4, r10, r3)
        L95:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.m(pi4, int, java.util.List, nt5):java.lang.Object");
    }

    public final ArrayList n(pi4 pi4Var) {
        ArrayList arrayList = pi4Var.a;
        if (gyg.G(3, "CXCP")) {
            Objects.toString(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            lvh lvhVarA = null;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            ai4 ai4Var = (ai4) obj;
            cd5 cd5Var = new cd5();
            arrayList2.add(cd5Var);
            try {
                lvhVarA = this.a.a(ai4Var, pi4Var.b, pi4Var.c, Collections.singletonList(new kj4(cd5Var)));
            } catch (IllegalStateException e) {
                cd5Var.B0(new gwa(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (lvhVarA != null) {
                arrayList3.add(lvhVarA);
            }
        }
        if (arrayList3.isEmpty()) {
            return arrayList2;
        }
        na2.B(this.e.f, null, null, new jj4((mt5) null, this, arrayList2, arrayList3), 3);
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0112, code lost:
    
        if (r2.Z(r3) == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ec, code lost:
    
        if (l(r12, true, r3) == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020d, code lost:
    
        if (r(r12, r9, r3) == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0210, code lost:
    
        r3 = r6;
        r6 = r0;
        r0 = r7;
        r7 = r8;
        r8 = r1;
        r1 = r3;
        r3 = r2;
        r5 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0248  */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.pi4 r20, int r21, long r22, java.util.List r24, boolean r25, nt5 r26) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.o(pi4, int, long, java.util.List, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.pi4 r10, int r11, int r12, java.util.List r13, nt5 r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.oj4
            if (r0 == 0) goto L14
            r0 = r14
            oj4 r0 = (defpackage.oj4) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.y = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            oj4 r0 = new oj4
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.w
            px5 r0 = px5.a
            int r1 = r8.y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L44
            if (r1 == r4) goto L36
            if (r1 == r3) goto L32
            if (r1 == r2) goto L32
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r5
        L32:
            defpackage.ybh.y(r14)
            return r14
        L36:
            int r11 = r8.v
            java.util.List r10 = r8.u
            r13 = r10
            java.util.List r13 = (java.util.List) r13
            pi4 r10 = r8.t
            defpackage.ybh.y(r14)
        L42:
            r6 = r13
            goto L67
        L44:
            defpackage.ybh.y(r14)
            zyk r14 = r9.j
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L99
            r8.t = r10
            r14 = r13
            java.util.List r14 = (java.util.List) r14
            r8.u = r14
            r8.v = r11
            r8.y = r4
            java.lang.Object r14 = r9.k(r12, r8)
            if (r14 != r0) goto L42
            goto La6
        L67:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            if (r12 == 0) goto L98
            ftm r12 = r9.g
            boolean r12 = r12.d()
            if (r12 != 0) goto L81
            x4n r12 = r9.d
            bf2 r12 = r12.a
            int r12 = r12.a
            if (r12 > 0) goto L81
        L7f:
            r7 = r4
            goto L83
        L81:
            r4 = 0
            goto L7f
        L83:
            r8.t = r5
            r8.u = r5
            r8.y = r3
            r4 = 5000000000(0x12a05f200, double:2.470328229E-314)
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r9 = r1.o(r2, r3, r4, r6, r7, r8)
            if (r9 == r0) goto La6
            return r9
        L98:
            r13 = r6
        L99:
            r1 = r9
            r8.t = r5
            r8.u = r5
            r8.y = r2
            java.lang.Object r9 = r1.f(r10, r11, r13, r8)
            if (r9 != r0) goto La7
        La6:
            return r0
        La7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.p(pi4, int, int, java.util.List, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [rj4] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r8, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.pj4
            if (r0 == 0) goto L13
            r0 = r10
            pj4 r0 = (defpackage.pj4) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            pj4 r0 = new pj4
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            defpackage.ybh.y(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L34:
            java.lang.AutoCloseable r7 = r0.u
            java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L7d
            goto L6c
        L3c:
            int r7 = r0.t
            long r8 = (long) r7
            defpackage.ybh.y(r10)
            goto L57
        L43:
            defpackage.ybh.y(r10)
            vsm r7 = r7.i
            nd4 r7 = r7.a()
            int r10 = (int) r8
            r0.t = r10
            r0.x = r5
            java.lang.Object r10 = r7.k(r0)
            if (r10 == r1) goto L7b
        L57:
            r7 = r10
            java.lang.AutoCloseable r7 = (java.lang.AutoCloseable) r7
            r10 = r7
            qd4 r10 = (defpackage.qd4) r10     // Catch: java.lang.Throwable -> L7d
            r2 = r7
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2     // Catch: java.lang.Throwable -> L7d
            r0.u = r2     // Catch: java.lang.Throwable -> L7d
            r0.x = r4     // Catch: java.lang.Throwable -> L7d
            r2 = 29
            cd5 r10 = defpackage.qd4.p(r10, r8, r2)     // Catch: java.lang.Throwable -> L7d
            if (r10 == r1) goto L7b
        L6c:
            h07 r10 = (h07) r10     // Catch: java.lang.Throwable -> L7d
            defpackage.fr3.t(r7, r6)
            r0.u = r6
            r0.x = r3
            java.lang.Object r7 = r10.X(r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r7
        L7d:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L7f
        L7f:
            r9 = move-exception
            defpackage.fr3.t(r7, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.q(long, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(long r10, kotlin.jvm.functions.Function1 r12, nt5 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.qj4
            if (r0 == 0) goto L13
            r0 = r13
            qj4 r0 = (defpackage.qj4) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            qj4 r0 = new qj4
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            tb5 r4 = r9.f
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2c
            u0i r9 = r0.t
            defpackage.ybh.y(r13)
            goto L67
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r3
        L32:
            defpackage.ybh.y(r13)
            u0i r13 = new u0i
            r13.<init>(r10, r12)
            ctm r12 = r9.e
            k31 r2 = r12.e
            r4.a(r13, r2)
            a64 r12 = r12.f
            r3 r2 = new r3
            r6 = 14
            r2.<init>(r13, r9, r3, r6)
            r9 = 3
            defpackage.na2.B(r12, r3, r3, r2, r9)
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 / r6
            yf r9 = new yf
            r12 = 9
            r9.<init>(r12, r3, r13)
            r0.t = r13
            r0.w = r5
            java.lang.Object r9 = uyg.w(r10, r9, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r8 = r13
            r13 = r9
            r9 = r8
        L67:
            r10 = r13
            go9 r10 = (defpackage.go9) r10
            if (r10 != 0) goto L6f
            r4.b(r9)
        L6f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj4.r(long, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }
}
