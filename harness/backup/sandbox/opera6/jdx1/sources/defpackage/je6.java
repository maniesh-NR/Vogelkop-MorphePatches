package defpackage;

/* loaded from: classes.dex */
public final class je6 {
    public final nak a;

    public je6() {
        this.a = z4o.f(vjm.b);
    }

    public je6(int i) {
        this.a = z4o.f(new int[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(as4 r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.e7f
            if (r0 == 0) goto L13
            r0 = r6
            e7f r0 = (defpackage.e7f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            e7f r0 = new e7f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L29
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return
        L29:
            defpackage.ybh.y(r6)
            defpackage.t3p.v()
            return
        L30:
            defpackage.ybh.y(r6)
            r0.v = r2
            nak r4 = r4.a
            r4.collect(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je6.a(as4, nt5):void");
    }

    public final fak b() {
        return (fak) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.fak r6) {
        /*
            r5 = this;
        L0:
            nak r0 = r5.a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            fak r2 = (defpackage.fak) r2
            boolean r3 = r2 instanceof defpackage.okh
            if (r3 != 0) goto L35
            vjm r3 = defpackage.vjm.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r2, r3)
            if (r3 != 0) goto L35
            boolean r3 = r2 instanceof defpackage.jb6
            if (r3 == 0) goto L23
            int r3 = r6.a
            r4 = r2
            jb6 r4 = (defpackage.jb6) r4
            int r4 = r4.a
            if (r3 <= r4) goto L36
            goto L35
        L23:
            boolean r3 = r2 instanceof w39
            if (r3 != 0) goto L36
            boolean r5 = r2 instanceof defpackage.lye
            if (r5 == 0) goto L31
            java.lang.String r5 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            qp2.n(r5)
            return
        L31:
            h9o.p()
            return
        L35:
            r2 = r6
        L36:
            boolean r0 = r0.h(r1, r2)
            if (r0 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je6.c(fak):void");
    }
}
