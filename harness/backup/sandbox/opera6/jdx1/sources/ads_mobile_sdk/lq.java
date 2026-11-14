package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum lq implements zfp {
    UNKNOWN(0),
    COLLECTED_BIDDING_SIGNAL(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    lq(int i) {
        this.a = i;
    }

    @Override // defpackage.zfp
    public final int getNumber() {
        return this.a ? 1 : 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + lq.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + (this.a ? 1 : 0) + " name=" + name() + '>';
    }
}
