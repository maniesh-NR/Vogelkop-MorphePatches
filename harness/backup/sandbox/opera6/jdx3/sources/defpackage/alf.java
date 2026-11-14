package defpackage;

/* loaded from: classes.dex */
public final class alf extends aqi {
    public final dhb u;
    public final bp v;

    public alf(dhb dhbVar, String str, dl dlVar, int i, bp bpVar, i3j i3jVar, ap apVar) {
        super(yo.OPERA, rm.INTERSTITIAL, str, dlVar, bpVar, i, i3jVar, apVar);
        this.u = dhbVar;
        this.v = bpVar;
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        this.u.P();
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.k;
    }

    @Override // defpackage.aqi
    public final boolean u() {
        return this.u.H().d();
    }
}
