package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum g40 implements zfp {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    g40(int i) {
        this.a = i;
    }

    @Override // defpackage.zfp
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + g40.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + ((int) this.a) + " name=" + name() + '>';
    }
}
