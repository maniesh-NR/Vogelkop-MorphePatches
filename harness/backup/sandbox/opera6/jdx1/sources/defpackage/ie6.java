package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ie6 implements qd6 {
    public final gdk a;
    public final xx5 b;
    public final nx5 c;
    public int f;
    public d3k g;
    public final s9i i;
    public final zyk j;
    public final zyk k;
    public final wjj l;
    public final xd6 d = new xd6(new hz1((byte) 5, (mt5) null, this), (byte) 11);
    public final pfe e = new pfe();
    public final je6 h = new je6();

    public ie6(gdk gdkVar, List list, xx5 xx5Var, nx5 nx5Var) {
        this.a = gdkVar;
        this.b = xx5Var;
        this.c = nx5Var;
        this.i = new s9i(this, list);
        final byte b = 0;
        this.j = z4c.b(new Function0(this) { // from class: rd6
            public final /* synthetic */ ie6 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ie6 ie6Var = this.b;
                switch (b2) {
                    case 0:
                        return ie6Var.a.a();
                    default:
                        return ((hdk) ie6Var.j.getValue()).e();
                }
            }
        });
        final byte b2 = 1;
        this.k = z4c.b(new Function0(this) { // from class: rd6
            public final /* synthetic */ ie6 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ie6 ie6Var = this.b;
                switch (b22) {
                    case 0:
                        return ie6Var.a.a();
                    default:
                        return ((hdk) ie6Var.j.getValue()).e();
                }
            }
        });
        this.l = new wjj(nx5Var, new wg5(this, (byte) 10), new ah5((byte) 26), new r3((byte) 27, (mt5) null, (Object) this));
    }

    @Override // defpackage.qd6
    public final Object a(Function2 function2, mt5 mt5Var) {
        oom oomVar = (oom) mt5Var.getContext().get(ydp.m);
        if (oomVar != null) {
            oomVar.a(this);
        }
        return na2.Z(new oom(oomVar, this), new s3((Object) this, (Object) function2, (mt5) null, (byte) 17), mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yd6
            if (r0 == 0) goto L13
            r0 = r6
            yd6 r0 = (defpackage.yd6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            yd6 r0 = new yd6
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            pfe r0 = r0.t
            defpackage.ybh.y(r6)
            goto L41
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L30:
            defpackage.ybh.y(r6)
            pfe r6 = r5.e
            r0.t = r6
            r0.w = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r6
        L41:
            int r6 = r5.f     // Catch: java.lang.Throwable -> L58
            int r6 = r6 + (-1)
            r5.f = r6     // Catch: java.lang.Throwable -> L58
            if (r6 != 0) goto L52
            d3k r6 = r5.g     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L50
            r6.k(r4)     // Catch: java.lang.Throwable -> L58
        L50:
            r5.g = r4     // Catch: java.lang.Throwable -> L58
        L52:
            r0.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L58:
            r5 = move-exception
            r0.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.b(nt5):java.lang.Object");
    }

    public final ylj c() {
        return (ylj) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dvd r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zd6
            if (r0 == 0) goto L13
            r0 = r10
            zd6 r0 = (defpackage.zd6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            zd6 r0 = new zd6
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            cd5 r8 = r0.t
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L58
            goto L55
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L30:
            defpackage.ybh.y(r10)
            cd5 r10 = r9.b
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L5a
            kotlin.coroutines.CoroutineContext r2 = r9.d     // Catch: java.lang.Throwable -> L5a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()     // Catch: java.lang.Throwable -> L5a
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r5)     // Catch: java.lang.Throwable -> L5a
            p71 r5 = new p71     // Catch: java.lang.Throwable -> L5a
            r6 = 5
            r5.<init>(r8, r9, r3, r6)     // Catch: java.lang.Throwable -> L5a
            r0.t = r10     // Catch: java.lang.Throwable -> L5a
            r0.w = r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r8 = defpackage.na2.Z(r2, r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r8 != r1) goto L52
            return r1
        L52:
            r7 = r10
            r10 = r8
            r8 = r7
        L55:
            p0i r9 = t0i.b     // Catch: java.lang.Throwable -> L58
            goto L63
        L58:
            r9 = move-exception
            goto L5c
        L5a:
            r9 = move-exception
            r8 = r10
        L5c:
            p0i r10 = t0i.b
            q0i r10 = new q0i
            r10.<init>(r9)
        L63:
            java.lang.Throwable r9 = t0i.d(r10)
            if (r9 != 0) goto L6d
            r8.j0(r10)
            goto L70
        L6d:
            r8.B0(r9)
        L70:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.d(dvd, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ae6
            if (r0 == 0) goto L13
            r0 = r6
            ae6 r0 = (defpackage.ae6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ae6 r0 = new ae6
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            pfe r0 = r0.t
            defpackage.ybh.y(r6)
            goto L41
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L30:
            defpackage.ybh.y(r6)
            pfe r6 = r5.e
            r0.t = r6
            r0.w = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r6
        L41:
            int r6 = r5.f     // Catch: java.lang.Throwable -> L5d
            int r6 = r6 + r3
            r5.f = r6     // Catch: java.lang.Throwable -> L5d
            if (r6 != r3) goto L57
            nx5 r6 = r5.c     // Catch: java.lang.Throwable -> L5d
            be6 r1 = new be6     // Catch: java.lang.Throwable -> L5d
            r2 = 0
            r1.<init>(r5, r4, r2)     // Catch: java.lang.Throwable -> L5d
            r2 = 3
            d3k r6 = defpackage.na2.B(r6, r4, r4, r1, r2)     // Catch: java.lang.Throwable -> L5d
            r5.g = r6     // Catch: java.lang.Throwable -> L5d
        L57:
            r0.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5d:
            r5 = move-exception
            r0.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.e(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r2.c0(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nt5 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ce6
            if (r0 == 0) goto L13
            r0 = r7
            ce6 r0 = (defpackage.ce6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ce6 r0 = new ce6
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            int r0 = r0.t
            defpackage.ybh.y(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5b
        L2c:
            r7 = move-exception
            goto L62
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L35:
            defpackage.ybh.y(r7)
            goto L48
        L39:
            defpackage.ybh.y(r7)
            ylj r7 = r6.c()
            r0.w = r4
            java.lang.Integer r7 = r7.a()
            if (r7 == r1) goto L5a
        L48:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            s9i r2 = r6.i     // Catch: java.lang.Throwable -> L5e
            r0.t = r7     // Catch: java.lang.Throwable -> L5e
            r0.w = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r2.c0(r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L5e:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L62:
            okh r1 = new okh
            r1.<init>(r0, r7)
            je6 r6 = r6.h
            r6.c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.f(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r10, mt5 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.de6
            if (r0 == 0) goto L13
            r0 = r11
            de6 r0 = (defpackage.de6) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            de6 r0 = new de6
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            je6 r3 = r9.h
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            defpackage.ybh.y(r11)
            goto La1
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r7
        L37:
            defpackage.ybh.y(r11)
            goto L89
        L3b:
            boolean r10 = r0.t
            fak r2 = r0.u
            defpackage.ybh.y(r11)
            goto L5e
        L43:
            defpackage.ybh.y(r11)
            fak r2 = r3.b()
            boolean r11 = r2 instanceof defpackage.vjm
            if (r11 != 0) goto Lb5
            ylj r11 = r9.c()
            r0.u = r2
            r0.t = r10
            r0.x = r6
            java.lang.Integer r11 = r11.a()
            if (r11 == r1) goto La0
        L5e:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r6 = r2 instanceof defpackage.jb6
            if (r6 == 0) goto L6e
            r8 = r2
            jb6 r8 = (defpackage.jb6) r8
            int r8 = r8.a
            goto L6f
        L6e:
            r8 = -1
        L6f:
            if (r6 == 0) goto L74
            if (r11 != r8) goto L74
            return r2
        L74:
            if (r10 == 0) goto L8c
            ylj r10 = r9.c()
            s23 r11 = new s23
            r11.<init>(r4, r7, r9)
            r0.u = r7
            r0.x = r5
            java.lang.Object r11 = r10.b(r11, r0)
            if (r11 == r1) goto La0
        L89:
            kotlin.Pair r11 = (kotlin.Pair) r11
            goto La3
        L8c:
            ylj r10 = r9.c()
            ee6 r11 = new ee6
            r2 = 0
            r11.<init>(r9, r8, r7, r2)
            r0.u = r7
            r0.x = r4
            java.lang.Object r11 = r10.c(r11, r0)
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Pair r11 = (kotlin.Pair) r11
        La3:
            java.lang.Object r9 = r11.a
            fak r9 = (defpackage.fak) r9
            java.lang.Object r10 = r11.b
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb4
            r3.c(r9)
        Lb4:
            return r9
        Lb5:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            qp2.n(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.g(boolean, mt5):java.lang.Object");
    }

    @Override // defpackage.qd6
    public final f99 getData() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r0 == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: wx5 -> 0x00ec, TryCatch #2 {wx5 -> 0x00ec, blocks: (B:20:0x0057, B:49:0x00e9, B:23:0x005e, B:47:0x00cf, B:29:0x006f, B:36:0x0093, B:38:0x0099, B:33:0x0079, B:45:0x00c1), top: B:76:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[Catch: all -> 0x014a, TryCatch #0 {all -> 0x014a, blocks: (B:56:0x010f, B:58:0x0121, B:59:0x0126), top: B:73:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #0 {all -> 0x014a, blocks: (B:56:0x010f, B:58:0x0121, B:59:0x0126), top: B:73:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r14, nt5 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.h(boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r11, boolean r12, nt5 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ge6
            if (r0 == 0) goto L13
            r0 = r13
            ge6 r0 = (defpackage.ge6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ge6 r0 = new ge6
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            nqh r10 = r0.t
            defpackage.ybh.y(r13)
            goto L55
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L30:
            defpackage.ybh.y(r13)
            nqh r5 = new nqh
            r5.<init>()
            zyk r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            hdk r13 = (defpackage.hdk) r13
            he6 r4 = new he6
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.t = r5
            r0.w = r3
            java.lang.Object r10 = r13.c(r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            int r10 = r10.a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie6.i(java.lang.Object, boolean, nt5):java.lang.Object");
    }
}
