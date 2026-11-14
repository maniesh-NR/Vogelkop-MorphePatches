package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class br6 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final esk d;
    public final Object e;

    public br6(Context context, jv1 jv1Var) {
        this.a = (byte) 0;
        this.b = jv1Var;
        this.c = context.getApplicationContext();
        this.d = new vx(this, (byte) 17);
        this.e = xne.b;
    }

    public br6(br6 br6Var, pqi pqiVar) {
        this.a = (byte) 1;
        this.a = (byte) 1;
        this.b = br6Var;
        this.c = br6Var.b();
        this.d = br6Var.a();
        this.e = pqiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable d(defpackage.br6 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.hoa
            if (r0 == 0) goto L13
            r0 = r6
            hoa r0 = (defpackage.hoa) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            hoa r0 = new hoa
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            android.net.Uri$Builder r5 = r0.t
            ybh.y(r6)
            goto L4c
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            r5 = 0
            return r5
        L30:
            ybh.y(r6)
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r2 = "https"
            android.net.Uri$Builder r6 = r6.scheme(r2)
            r0.t = r6
            r0.w = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r4 = r6
            r6 = r5
            r5 = r4
        L4c:
            pne r6 = (defpackage.pne) r6
            java.lang.String r6 = r6.a
            android.net.Uri$Builder r5 = r5.authority(r6)
            java.lang.String r6 = "/"
            android.net.Uri$Builder r5 = r5.path(r6)
            android.net.Uri r5 = r5.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br6.d(br6, nt5):java.lang.Comparable");
    }

    public final esk a() {
        switch (this.a) {
            case 0:
                return (ii) this.e;
            default:
                return this.d;
        }
    }

    public final esk b() {
        switch (this.a) {
            case 0:
                return (vx) this.d;
            default:
                return (esk) this.c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r9) {
        /*
            r8 = this;
            byte r0 = r8.a
            java.lang.Object r1 = r8.b
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            switch(r0) {
                case 0: goto L53;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9 instanceof defpackage.qqi
            if (r0 == 0) goto L1e
            r0 = r9
            qqi r0 = (defpackage.qqi) r0
            int r6 = r0.w
            r7 = r6 & r4
            if (r7 == 0) goto L1e
            int r6 = r6 - r4
            r0.w = r6
            goto L23
        L1e:
            qqi r0 = new qqi
            r0.<init>(r8, r9)
        L23:
            java.lang.Object r9 = r0.u
            px5 r4 = px5.a
            int r6 = r0.w
            if (r6 == 0) goto L37
            if (r6 != r5) goto L33
            pqi r8 = r0.t
            ybh.y(r9)
            goto L4c
        L33:
            defpackage.qp2.n(r3)
            goto L52
        L37:
            ybh.y(r9)
            java.lang.Object r8 = r8.e
            pqi r8 = (defpackage.pqi) r8
            r0.t = r8
            r0.w = r5
            br6 r1 = (defpackage.br6) r1
            java.lang.Object r9 = r1.c(r0)
            if (r9 != r4) goto L4c
            r2 = r4
            goto L52
        L4c:
            pne r9 = (defpackage.pne) r9
            pne r2 = r8.a(r9)
        L52:
            return r2
        L53:
            boolean r0 = r9 instanceof defpackage.ar6
            if (r0 == 0) goto L64
            r0 = r9
            ar6 r0 = (defpackage.ar6) r0
            int r6 = r0.v
            r7 = r6 & r4
            if (r7 == 0) goto L64
            int r6 = r6 - r4
            r0.v = r6
            goto L69
        L64:
            ar6 r0 = new ar6
            r0.<init>(r8, r9)
        L69:
            java.lang.Object r9 = r0.t
            px5 r4 = px5.a
            int r6 = r0.v
            if (r6 == 0) goto L7b
            if (r6 != r5) goto L77
            ybh.y(r9)
            goto L90
        L77:
            defpackage.qp2.n(r3)
            goto L98
        L7b:
            ybh.y(r9)
            jv1 r1 = (defpackage.jv1) r1
            java.lang.Object r9 = r1.get()
            no7 r9 = (defpackage.no7) r9
            r0.v = r5
            java.lang.Object r9 = a26.k(r9, r0)
            if (r9 != r4) goto L90
            r2 = r4
            goto L98
        L90:
            java.lang.Object r8 = r8.c
            android.content.Context r8 = (android.content.Context) r8
            pne r2 = cqp.e0(r8)
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br6.c(nt5):java.lang.Object");
    }
}
