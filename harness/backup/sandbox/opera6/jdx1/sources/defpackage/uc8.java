package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uc8 implements jxd {
    public static final oj9 g;
    public static final oj9 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("application/id3");
        g = new oj9(nj9Var);
        nj9 nj9Var2 = new nj9();
        nj9Var2.m = dzd.p("application/x-scte35");
        h = new oj9(nj9Var2);
    }

    public uc8(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.jxd
    public final oj9 a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.jxd
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc8.class != obj.getClass()) {
            return false;
        }
        uc8 uc8Var = (uc8) obj;
        return this.c == uc8Var.c && this.d == uc8Var.d && Objects.equals(this.a, uc8Var.a) && this.b.equals(uc8Var.b) && Arrays.equals(this.e, uc8Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iF = z1m.f((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
        long j = this.c;
        int i2 = (iF + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
