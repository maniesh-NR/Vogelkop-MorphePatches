package defpackage;

/* loaded from: classes.dex */
public final class xn implements im, acf {
    public final /* synthetic */ bp a;
    public final /* synthetic */ go b;

    public xn(esg esgVar, bp bpVar, go goVar) {
        this.a = bpVar;
        this.b = goVar;
    }

    @Override // defpackage.im
    public final void c() {
        vml.e(new sn(this.a, (byte) 5));
    }

    @Override // defpackage.im
    public final void l(qq qqVar) {
        ap apVarP = ao.p(qqVar);
        if (apVarP == null) {
            return;
        }
        vml.e(new k3(this.b, apVarP, this.a, (byte) 3));
    }

    @Override // defpackage.im
    public final void onAdClicked() {
        vml.e(new sn(this.a, (byte) 4));
    }
}
