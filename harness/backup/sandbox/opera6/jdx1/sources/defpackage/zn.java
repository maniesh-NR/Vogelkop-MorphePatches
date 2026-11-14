package defpackage;

/* loaded from: classes.dex */
public final class zn implements im {
    public final /* synthetic */ bp a;
    public final /* synthetic */ io b;

    public zn(s6h s6hVar, bp bpVar, io ioVar) {
        this.a = bpVar;
        this.b = ioVar;
    }

    @Override // defpackage.im
    public final void c() {
        vml.e(new sn(this.a, (byte) 7));
    }

    @Override // defpackage.im
    public final void l(qq qqVar) {
        ap apVarP = ao.p(qqVar);
        if (apVarP == null) {
            return;
        }
        vml.e(new k3(this.b, apVarP, this.a, (byte) 4));
    }

    @Override // defpackage.im
    public final void onAdClicked() {
        vml.e(new sn(this.a, (byte) 6));
    }
}
