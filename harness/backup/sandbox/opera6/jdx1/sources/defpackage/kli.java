package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class kli {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final short g;

    /* JADX WARN: Multi-variable type inference failed */
    public kli(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.a = bigIntegerArr[0];
        this.b = bigIntegerArr[1];
        this.c = bigIntegerArr2[0];
        this.d = bigIntegerArr2[1];
        this.e = bigInteger;
        this.f = bigInteger2;
        this.g = i;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            qp2.o(sko.k("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
