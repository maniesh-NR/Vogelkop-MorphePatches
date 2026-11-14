package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.tv0;
import ads_mobile_sdk.wm1;
import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ffp extends iu0 {
    public final void b(ArrayList arrayList) {
        b$1();
        tv0 tv0Var = (tv0) this.b;
        RandomAccess randomAccess = tv0Var.experimentId_;
        if (!((j) randomAccess).a) {
            wm1 wm1Var = (wm1) randomAccess;
            tv0Var.experimentId_ = wm1Var.a(wm1Var.c << 1);
        }
        iu0.a(arrayList, tv0Var.experimentId_);
    }
}
