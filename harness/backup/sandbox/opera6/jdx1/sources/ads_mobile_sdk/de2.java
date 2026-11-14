package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum de2 implements zfp {
    /* JADX INFO: Fake field, exist only in values array */
    MISS_REASON_UNKNOWN(0),
    MISS_REASON_EMPTY(1),
    MISS_REASON_EXPIRED(2),
    MISS_REASON_CORRUPTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    de2(int i) {
        this.a = i;
    }

    @Override // defpackage.zfp
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        byte[] bArr = yb1.a;
        qp2.o("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(de2.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
