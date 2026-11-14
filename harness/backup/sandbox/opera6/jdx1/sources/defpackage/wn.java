package defpackage;

import ads_mobile_sdk.l31;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wn implements im {
    public final /* synthetic */ bp a;
    public final /* synthetic */ l31 b;
    public final /* synthetic */ l31 c;
    public final /* synthetic */ ap[] d;
    public final /* synthetic */ int e;
    public final /* synthetic */ AtomicReference f;

    public wn(pyl pylVar, bp bpVar, l31 l31Var, l31 l31Var2, ap[] apVarArr, int i, AtomicReference atomicReference) {
        this.a = bpVar;
        this.b = l31Var;
        this.c = l31Var2;
        this.d = apVarArr;
        this.e = i;
        this.f = atomicReference;
    }

    @Override // defpackage.im
    public final void c() {
        if (this.b == this.c) {
            vml.e(new sn(this.a, (byte) 3));
        }
    }

    @Override // defpackage.im
    public final void l(qq qqVar) {
        ap apVarP = ao.p(qqVar);
        if (apVarP == null) {
            return;
        }
        vml.e(new vn(this.d, this.e, apVarP, this.f, this.a));
    }

    @Override // defpackage.im
    public final void onAdClicked() {
        vml.e(new sn(this.a, (byte) 2));
    }
}
