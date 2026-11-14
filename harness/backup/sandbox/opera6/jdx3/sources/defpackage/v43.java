package defpackage;

/* loaded from: classes.dex */
public final class v43 implements otl {
    public boolean a;
    public final /* synthetic */ z43 b;

    public v43(z43 z43Var) {
        this.b = z43Var;
    }

    @Override // defpackage.otl
    public final void a() {
        this.a = false;
        z43 z43Var = this.b;
        c(((k6l) z43Var.c).o);
        z43Var.x();
    }

    @Override // defpackage.otl
    public final void b() {
        this.a = true;
        z43 z43Var = this.b;
        c(((k6l) z43Var.c).o);
        z43Var.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.b2l r2) {
        /*
            r1 = this;
            boolean r0 = r1.a
            z43 r1 = r1.b
            if (r0 == 0) goto Le
            x43 r2 = new x43
            yul r0 = yul.d
            r2.<init>(r0)
            goto L35
        Le:
            if (r2 == 0) goto L31
            d7l r2 = (defpackage.d7l) r2
            e7l r0 = r2.j
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L26
            e7l r0 = r2.j
            java.lang.String r0 = r0.getUrl()
            boolean r0 = defpackage.wqm.z(r0)
            if (r0 != 0) goto L31
        L26:
            x43 r0 = new x43
            yul r2 = r2.m0()
            r0.<init>(r2)
            r2 = r0
            goto L35
        L31:
            x43 r2 = r1.k()
        L35:
            r1.A(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v43.c(b2l):void");
    }
}
