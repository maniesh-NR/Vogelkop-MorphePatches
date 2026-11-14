package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lkh {
    public final int a;
    public final BigInteger b;
    public final BigInteger c;
    public final wv d;
    public final BigInteger e;
    public final String f;
    public final BigInteger g;
    public final BigInteger h;
    public final wv i;

    public lkh(long j, BigInteger bigInteger, BigInteger bigInteger2, wv wvVar, BigInteger bigInteger3, String str, BigInteger bigInteger4, BigInteger bigInteger5, wv wvVar2) {
        this.a = (int) j;
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = wvVar;
        this.e = bigInteger3;
        this.f = str;
        this.g = bigInteger4;
        this.h = bigInteger5;
        this.i = wvVar2;
        kkh[] kkhVarArr = kkh.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkh)) {
            return false;
        }
        lkh lkhVar = (lkh) obj;
        return ((long) this.a) == ((long) lkhVar.a) && Intrinsics.a(this.b, lkhVar.b) && Intrinsics.a(this.c, lkhVar.c) && Intrinsics.a(this.d, lkhVar.d) && Intrinsics.a(this.e, lkhVar.e) && Intrinsics.a(this.f, lkhVar.f) && Intrinsics.a(this.g, lkhVar.g) && Intrinsics.a(this.h, lkhVar.h) && Intrinsics.a(this.i, lkhVar.i);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        BigInteger bigInteger = this.b;
        int iHashCode2 = (iHashCode + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        BigInteger bigInteger2 = this.c;
        int iHashCode3 = (iHashCode2 + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        wv wvVar = this.d;
        int iF = z1m.f((this.e.hashCode() + ((iHashCode3 + (wvVar == null ? 0 : wvVar.a.hashCode())) * 31)) * 31, 31, this.f);
        BigInteger bigInteger3 = this.g;
        int iHashCode4 = (iF + (bigInteger3 == null ? 0 : bigInteger3.hashCode())) * 31;
        BigInteger bigInteger4 = this.h;
        int iHashCode5 = (iHashCode4 + (bigInteger4 == null ? 0 : bigInteger4.hashCode())) * 31;
        wv wvVar2 = this.i;
        return iHashCode5 + (wvVar2 != null ? wvVar2.a.hashCode() : 0);
    }

    public final String toString() {
        return "RawTransaction(chainId=" + this.a + ", nonce=" + this.b + ", gasLimit=" + this.c + ", to=" + this.d + ", value=" + this.e + ", data=" + this.f + ", maxPriorityFeePerGas=" + this.g + ", maxFeePerGas=" + this.h + ", feeCurrency=" + this.i + ")";
    }
}
