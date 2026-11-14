package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum xh0 implements zfp {
    AVAILABLE_MEMORY_TIER_UNKNOWN(0),
    AVAILABLE_MEMORY_TIER_INVALID_DATA_SOURCE(1),
    AVAILABLE_MEMORY_TIER_EXTREME_LOW(2),
    AVAILABLE_MEMORY_TIER_VERY_LOW(3),
    AVAILABLE_MEMORY_TIER_LOW(4),
    AVAILABLE_MEMORY_TIER_MID(5),
    AVAILABLE_MEMORY_TIER_MID_PLUS(6),
    AVAILABLE_MEMORY_TIER_HIGH(7),
    AVAILABLE_MEMORY_TIER_VERY_HIGH(8),
    AVAILABLE_MEMORY_TIER_EXTREME_HIGH(9),
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE_MEMORY_TIER_UNPARSABLE(255),
    UNRECOGNIZED(-1);

    public final int a;

    xh0(int i) {
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
        sb.append(xh0.class.getName());
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
