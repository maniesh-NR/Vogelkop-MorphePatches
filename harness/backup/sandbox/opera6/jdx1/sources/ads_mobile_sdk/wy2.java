package ads_mobile_sdk;

import defpackage.jjj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wy2 implements zcp {
    public final List a;

    public wy2(List list) {
        this.a = list;
    }

    public final void a(jjj jjjVar) {
        m5a m5aVar = new m5a();
        List list = this.a;
        jjjVar.realTimeBiddingSignals = m5aVar.g(list);
        jjjVar.E0 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy2) && Intrinsics.a(this.a, ((wy2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.m("RtbSignal(rtbAdapterDataList=", ")", this.a);
    }
}
