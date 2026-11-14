package defpackage;

import ads_mobile_sdk.cc2;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.yb1;

/* loaded from: classes.dex */
public final class snp extends iu0 {
    public final void b(int i) {
        b$1();
        cc2 cc2Var = (cc2) this.b;
        cc2Var.getClass();
        int i2 = 0;
        if (i != 6) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
        } else {
            byte[] bArr = yb1.a;
            qp2.o("Can't get the number of an unknown enum value.");
        }
        cc2Var.fillDisabledReason_ = i2;
        cc2Var.bitField0_ |= 4;
    }
}
