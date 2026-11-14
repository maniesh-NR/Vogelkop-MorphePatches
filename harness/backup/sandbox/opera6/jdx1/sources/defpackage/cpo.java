package defpackage;

import ads_mobile_sdk.c6;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.yb1;

/* loaded from: classes.dex */
public final class cpo extends iu0 {
    public final void b(int i) {
        b$1();
        c6 c6Var = (c6) this.b;
        c6Var.getClass();
        int i2 = 0;
        if (i == 4) {
            byte[] bArr = yb1.a;
            qp2.o("Can't get the number of an unknown enum value.");
        } else if (i != 1) {
            i2 = 2;
            if (i == 2) {
                i2 = 1;
            } else if (i != 3) {
                if (i != 4) {
                    throw null;
                }
                i2 = -1;
            }
        }
        c6Var.status_ = i2;
        c6Var.bitField0_ |= 8;
    }
}
