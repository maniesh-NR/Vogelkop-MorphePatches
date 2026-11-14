package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vo8 extends aqi implements nq {
    public final qo8 u;

    public vo8(yo yoVar, String str, dl dlVar, bp bpVar, i3j i3jVar, ap apVar, qo8 qo8Var) {
        super("Banner Ad", "Summary Text", null, null, "", "ID String", str, dlVar, "Call to action text", yoVar, bpVar, i3jVar, apVar);
        this.u = qo8Var;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new po8(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.n;
    }

    @Override // defpackage.yz
    public final String n() {
        return this.a;
    }
}
