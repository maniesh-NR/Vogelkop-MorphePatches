package defpackage;

import ads_mobile_sdk.de2;
import ads_mobile_sdk.ee2;
import ads_mobile_sdk.iu0;

/* loaded from: classes.dex */
public final class hso extends iu0 {
    public final void b(de2 de2Var) {
        b$1();
        ee2 ee2Var = (ee2) this.b;
        ee2Var.getClass();
        ee2Var.cacheMissReason_ = de2Var.getNumber();
        ee2Var.bitField0_ |= 4;
    }

    public final void c(boolean z) {
        b$1();
        ee2 ee2Var = (ee2) this.b;
        ee2Var.bitField0_ |= 1;
        ee2Var.cacheHit_ = z;
    }

    public final void e(int i) {
        b$1();
        ee2 ee2Var = (ee2) this.b;
        ee2Var.bitField0_ |= 8;
        ee2Var.numRequestedAds_ = i;
    }
}
