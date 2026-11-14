package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c2 implements l2 {
    public final String b;
    public final s15 c;

    public c2(Integer num, String str) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (8 > iIntValue || iIntValue >= 257 || num.intValue() % 8 != 0) {
                qp2.o("Failed requirement.");
                throw null;
            }
            str = str + num;
        }
        this.b = str;
        this.c = uqh.a(BigInteger.class);
    }

    @Override // defpackage.l2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        int iMin = Math.min(str.length(), 64);
        byte[] bArrI = y4h.i(str.substring(0, iMin));
        return new z1(this instanceof k2 ? new BigInteger(1, bArrI) : new BigInteger(bArrI), iMin);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return e((BigInteger) obj);
    }

    @Override // defpackage.l2
    public final s15 d() {
        return this.c;
    }

    @Override // defpackage.l2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String e(BigInteger bigInteger) {
        if (!(this instanceof g2) && bigInteger.signum() < 0) {
            j9h.t(bigInteger, " as unsigned int", "Cannot encode negative number ");
            return null;
        }
        int i = 0;
        byte b = bigInteger.signum() < 0 ? (byte) -1 : (byte) 0;
        boolean z = this instanceof k2;
        byte[] byteArray = bigInteger.toByteArray();
        int length = 32 - byteArray.length;
        if (!z && length < 0) {
            qp2.o("Failed requirement.");
            return null;
        }
        if (length != 0) {
            if (length < 0) {
                while (i < byteArray.length - 32 && byteArray[i] == b) {
                    i++;
                }
                if (i != 0) {
                    int length2 = byteArray.length;
                    y72.a(length2, byteArray.length);
                    byteArray = Arrays.copyOfRange(byteArray, i, length2);
                }
                if (byteArray.length != 32) {
                    qp2.o("Failed requirement.");
                    return null;
                }
            } else {
                byte[] bArr = new byte[length];
                while (i < length) {
                    bArr[i] = b;
                    i++;
                }
                byteArray = b82.k(bArr, byteArray);
            }
        }
        return naa.g(byteArray);
    }

    @Override // defpackage.l2
    public final String getName() {
        return this.b;
    }
}
