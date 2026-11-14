package defpackage;

/* loaded from: classes.dex */
public final class ylk extends k8 {
    public final void s0(dmk dmkVar) {
        Object obj = this.a;
        int iOrdinal = ((emk) this.b).ordinal();
        if (iOrdinal == 0) {
            dmkVar.handleSubscriptionPlans((cmk) obj);
        } else if (iOrdinal == 1) {
            dmkVar.handleSubscriptionPlans((bmk) obj);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dmkVar.handleSubscriptionPlans((zlk) obj);
        }
    }
}
