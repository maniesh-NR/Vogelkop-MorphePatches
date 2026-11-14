package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.j;
import ads_mobile_sdk.ta;
import java.util.Set;

/* loaded from: classes.dex */
public final class ngp extends iu0 {
    public final void b(Set set) {
        b$1();
        ta taVar = (ta) this.b;
        flp flpVar = taVar.initializedAdapterClasses_;
        if (!((j) flpVar).a) {
            taVar.initializedAdapterClasses_ = y7h.c(flpVar);
        }
        iu0.a(set, taVar.initializedAdapterClasses_);
    }
}
