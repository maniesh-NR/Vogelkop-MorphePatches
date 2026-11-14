package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vkf extends mq {
    public final gu9 p;

    public vkf(gu9 gu9Var, dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        super(gu9Var, dlVar, kmVar, k8Var, kqVar, list);
        this.p = gu9Var;
    }

    @Override // defpackage.mq
    public final void k() {
        gu9 gu9Var = this.p;
        gu9Var.s.run(gu9Var);
        super.k();
    }
}
