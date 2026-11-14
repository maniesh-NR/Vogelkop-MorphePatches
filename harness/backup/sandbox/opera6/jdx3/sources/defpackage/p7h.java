package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p7h extends gtg implements dz {
    public final dz d;
    public final vo e;

    public p7h(dz dzVar, vo voVar, r9g r9gVar) {
        super(r9gVar);
        this.d = dzVar;
        this.e = voVar;
    }

    @Override // defpackage.bz
    public final boolean a() {
        return this.d.a();
    }

    @Override // defpackage.bz
    public final s50 b() {
        return this.d.b();
    }

    @Override // defpackage.bz
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.bz
    public final yz d(az azVar) {
        yz yzVarD = this.d.d(azVar);
        if (yzVarD == null) {
            return null;
        }
        l(yzVarD);
        return yzVarD;
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        h(zyVar, azVar, 1);
    }

    @Override // defpackage.dz
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.dz
    public final void h(zy zyVar, az azVar, int i) {
        this.d.h(new zxe(this, zyVar, (byte) 1), azVar, i);
    }

    @Override // defpackage.gtg
    public final boolean k(String str) {
        bz bzVar = this.d;
        return (bzVar instanceof gtg) && ((gtg) bzVar).k(str);
    }

    public final void l(yz yzVar) {
        boolean z = yzVar instanceof aqi;
        vo voVar = this.e;
        if (z && yzVar.n == null) {
            ((aqi) yzVar).s = TimeUnit.MINUTES.toMillis(voVar.f);
        }
        yzVar.getClass();
        yzVar.n = new uz(voVar);
    }
}
