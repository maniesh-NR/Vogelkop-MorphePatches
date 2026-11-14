package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class r00 extends q00 {
    public final /* synthetic */ s00 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(s00 s00Var, Activity activity, zy zyVar, dl dlVar) {
        super(s00Var, activity, zyVar, dlVar, (byte) 1);
        this.m = s00Var;
    }

    @Override // defpackage.q00, defpackage.k43
    public final void a() {
        if (s00.v) {
            b(false, bqi.n("ads provider not available", this.m.g), false, null, null);
        } else {
            i();
        }
    }

    @Override // defpackage.q00
    public final void g(cie cieVar) {
        gxo.a(new fmn(cieVar.g, new kqd(cieVar, (byte) 6), (byte) 19));
    }

    @Override // defpackage.q00
    public final void h(cie cieVar, String str, p00 p00Var) {
        j(cieVar, str, p00Var);
    }
}
