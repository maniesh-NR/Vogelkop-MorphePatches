package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class yzl {

    @NotNull
    public static final qzl Companion = new qzl();
    public static final l4c[] h;
    public final nle a;
    public final wv b;
    public final wv c;
    public final w8e d;
    public final String e;
    public final rzl f;
    public final BigInteger g;

    static {
        f7c f7cVar = f7c.b;
        h = new l4c[]{z4c.a(f7cVar, new thk((byte) 24)), null, null, null, null, z4c.a(f7cVar, new thk((byte) 25)), null};
    }

    public /* synthetic */ yzl(int i, nle nleVar, wv wvVar, wv wvVar2, w8e w8eVar, String str, rzl rzlVar, BigInteger bigInteger) {
        if (63 != (i & 63)) {
            x7d.I(i, 63, pzl.a.getDescriptor());
            throw null;
        }
        this.a = nleVar;
        this.b = wvVar;
        this.c = wvVar2;
        this.d = w8eVar;
        this.e = str;
        this.f = rzlVar;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bigInteger;
        }
    }

    public yzl(nle nleVar, wv wvVar, wv wvVar2, w8e w8eVar, String str, rzl rzlVar, BigInteger bigInteger) {
        this.a = nleVar;
        this.b = wvVar;
        this.c = wvVar2;
        this.d = w8eVar;
        this.e = str;
        this.f = rzlVar;
        this.g = bigInteger;
    }

    public static yzl a(yzl yzlVar, String str, rzl rzlVar, BigInteger bigInteger, int i) {
        nle nleVar = yzlVar.a;
        wv wvVar = yzlVar.b;
        wv wvVar2 = yzlVar.c;
        w8e w8eVar = yzlVar.d;
        if ((i & 16) != 0) {
            str = yzlVar.e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            rzlVar = yzlVar.f;
        }
        rzl rzlVar2 = rzlVar;
        if ((i & 64) != 0) {
            bigInteger = yzlVar.g;
        }
        yzlVar.getClass();
        return new yzl(nleVar, wvVar, wvVar2, w8eVar, str2, rzlVar2, bigInteger);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzl)) {
            return false;
        }
        yzl yzlVar = (yzl) obj;
        return this.a == yzlVar.a && Intrinsics.a(this.b, yzlVar.b) && Intrinsics.a(this.c, yzlVar.c) && Intrinsics.a(this.d, yzlVar.d) && Intrinsics.a(this.e, yzlVar.e) && Intrinsics.a(this.f, yzlVar.f) && Intrinsics.a(this.g, yzlVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31;
        wv wvVar = this.c;
        int iF = z1m.f((this.d.hashCode() + ((iHashCode + (wvVar == null ? 0 : wvVar.a.hashCode())) * 31)) * 31, 31, this.e);
        rzl rzlVar = this.f;
        int iHashCode2 = (iF + (rzlVar == null ? 0 : rzlVar.hashCode())) * 31;
        BigInteger bigInteger = this.g;
        return iHashCode2 + (bigInteger != null ? bigInteger.hashCode() : 0);
    }

    public final String toString() {
        return "Transaction(net=" + this.a + ", from=" + this.b + ", to=" + this.c + ", money=" + this.d + ", encodedData=" + this.e + ", decodedData=" + this.f + ", nonce=" + this.g + ")";
    }
}
