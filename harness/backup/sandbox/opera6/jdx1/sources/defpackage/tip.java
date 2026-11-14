package defpackage;

import ads_mobile_sdk.iu0;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.yb1;

/* loaded from: classes.dex */
public final class tip extends iu0 {
    public final void b(int i) {
        b$1();
        w01 w01Var = (w01) this.b;
        w01Var.getClass();
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
        w01Var.action_ = i2;
    }
}
