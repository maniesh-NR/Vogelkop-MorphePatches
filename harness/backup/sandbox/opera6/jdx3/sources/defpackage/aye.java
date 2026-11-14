package defpackage;

/* loaded from: classes.dex */
public final class aye implements bz {
    public final yxe a;
    public boolean b;

    public aye(yxe yxeVar) {
        this.a = yxeVar;
    }

    @Override // defpackage.bz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bz
    public final s50 b() {
        return this.b ? s50.g : this.a.a.b();
    }

    @Override // defpackage.bz
    public final int c() {
        return this.a.a.c();
    }

    @Override // defpackage.bz
    public final yz d(az azVar) {
        yz yzVarD = this.a.d(azVar);
        if (yzVarD == null) {
            return null;
        }
        if (yzVarD.q()) {
            this.b = true;
            return null;
        }
        this.b = false;
        return yzVarD;
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        this.a.e(new zxe(this, zyVar, (byte) 0), azVar);
    }

    @Override // defpackage.bz
    public final void g(dl dlVar) {
        this.a.g(dlVar);
    }

    @Override // defpackage.bz
    public final int i() {
        yxe yxeVar = this.a;
        int i = yxeVar.c;
        yxeVar.c = 0;
        return i;
    }
}
