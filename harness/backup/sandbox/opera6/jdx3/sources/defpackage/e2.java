package defpackage;

import java.math.BigInteger;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class e2 implements l2 {
    public final Integer b;
    public final s15 c;
    public final String d;
    public final boolean e;

    public e2(Integer num) {
        this.b = num;
        if (num != null && num.intValue() > 32) {
            qp2.o("Failed requirement.");
            throw null;
        }
        this.c = uqh.a(byte[].class);
        String str = "bytes";
        if (num != null) {
            str = "bytes" + num;
        }
        this.d = str;
        this.e = num == null;
    }

    public static String g(byte[] bArr) {
        String strG = naa.g(bArr);
        int iH = h(bArr.length);
        if (strG.length() <= iH) {
            return StringsKt.R(strG, iH, '0');
        }
        bxl.d(sko.k("Can't pad '", strG, "' as it's longer than 64 already."));
        return null;
    }

    public static int h(int i) {
        int i2 = i << 1;
        return ((i2 / 64) + (i2 % 64 == 0 ? 0 : 1)) << 6;
    }

    @Override // defpackage.l2
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.l2
    public final z1 b(String str) {
        Integer num = this.b;
        if (num != null) {
            int iMin = Math.min(str.length(), 64);
            byte[] bArrI = y4h.i(str.substring(0, iMin));
            int iIntValue = num.intValue();
            if (bArrI.length > iIntValue) {
                y72.a(iIntValue, bArrI.length);
                bArrI = Arrays.copyOfRange(bArrI, 0, iIntValue);
            }
            return new z1(bArrI, iMin);
        }
        l2.a.getClass();
        z1 z1VarB = f2.b.b(str);
        int i = z1VarB.b;
        String strSubstring = str.substring(i);
        int iIntValue2 = ((BigInteger) z1VarB.a).intValue();
        int iMin2 = Math.min(strSubstring.length(), h(iIntValue2));
        byte[] bArrI2 = y4h.i(strSubstring.substring(0, iMin2));
        if (bArrI2.length > iIntValue2) {
            y72.a(iIntValue2, bArrI2.length);
            bArrI2 = Arrays.copyOfRange(bArrI2, 0, iIntValue2);
        }
        return new z1(bArrI2, iMin2 + i);
    }

    @Override // defpackage.l2
    public final String c(Object obj) {
        return e((byte[]) obj);
    }

    @Override // defpackage.l2
    public final s15 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.a(this.b, ((e2) obj).b);
    }

    @Override // defpackage.l2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String e(byte[] bArr) {
        Integer num = this.b;
        if (num == null) {
            l2.a.getClass();
            return sko.j(f2.b.e(mkh.D(bArr.length)), g(bArr));
        }
        if (bArr.length <= num.intValue()) {
            return g(bArr);
        }
        qp2.o("Failed requirement.");
        return null;
    }

    @Override // defpackage.l2
    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        Integer num = this.b;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Bytes(size=" + this.b + ")";
    }
}
