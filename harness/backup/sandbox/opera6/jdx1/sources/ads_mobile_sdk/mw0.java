package ads_mobile_sdk;

import defpackage.zfp;

/* loaded from: classes.dex */
public enum mw0 implements zfp {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);

    public final int a;

    mw0(int i) {
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
        sb.append(mw0.class.getName());
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
