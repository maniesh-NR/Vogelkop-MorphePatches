package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.pp;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class idp extends iu0 {
    public final void b(boolean z) {
        b$1();
        pp ppVar = (pp) this.b;
        ppVar.bitField0_ |= 4;
        ppVar.shouldCollectSignalsOnFullApp_ = z;
    }

    public final void c(boolean z) {
        b$1();
        pp ppVar = (pp) this.b;
        ppVar.bitField0_ |= 2;
        ppVar.shouldGatherSignals_ = z;
    }

    public final Map e() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((pp) this.b).serverParameters_));
    }
}
