package defpackage;

/* loaded from: classes.dex */
public final class yxe implements bz {
    public final xd3 a;
    public final nn7 b;
    public int c;

    public yxe(xd3 xd3Var, nn7 nn7Var) {
        this.a = xd3Var;
        this.b = nn7Var;
    }

    @Override // defpackage.bz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bz
    public final s50 b() {
        return this.a.a.b();
    }

    @Override // defpackage.bz
    public final int c() {
        return this.a.a.c();
    }

    @Override // defpackage.bz
    public final yz d(az azVar) {
        yz yzVarD = this.a.a.d(azVar);
        if (yzVarD == null) {
            return null;
        }
        if (!azVar.e()) {
            if (!this.b.k(yzVarD, new ow3(this, azVar, (byte) 4))) {
                this.c++;
                return null;
            }
        }
        return yzVarD;
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        boolean zE = azVar.e();
        xd3 xd3Var = this.a;
        if (zE) {
            xd3Var.e(zyVar, azVar);
        } else {
            xd3Var.e(new mhb(this, zyVar, azVar), azVar);
        }
    }

    @Override // defpackage.bz
    public final void g(dl dlVar) {
        this.a.g(dlVar);
    }

    @Override // defpackage.bz
    public final int i() {
        int i = this.c;
        this.c = 0;
        return i;
    }
}
