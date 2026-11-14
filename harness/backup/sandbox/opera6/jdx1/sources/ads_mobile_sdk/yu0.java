package ads_mobile_sdk;

import defpackage.jbp;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class yu0 extends PhantomReference {
    public final jbp a;

    public yu0(jbp jbpVar, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = jbpVar;
    }
}
