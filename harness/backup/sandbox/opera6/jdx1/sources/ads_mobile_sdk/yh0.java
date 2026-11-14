package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum yh0 implements zfp {
    PROCESSOR_TIER_UNKNOWN(0),
    PROCESSOR_TIER_INVALID_DATA_SOURCE(1),
    PROCESSOR_TIER_EXTREME_LOW(2),
    PROCESSOR_TIER_LOW(3),
    PROCESSOR_TIER_MID(4),
    PROCESSOR_TIER_MID_PLUS(5),
    PROCESSOR_TIER_HIGH(6),
    PROCESSOR_TIER_EXTREME_HIGH(7),
    /* JADX INFO: Fake field, exist only in values array */
    PROCESSOR_TIER_UNPARSABLE(255),
    UNRECOGNIZED(-1);

    public final int a;

    yh0(int i) {
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
        sb.append(yh0.class.getName());
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
