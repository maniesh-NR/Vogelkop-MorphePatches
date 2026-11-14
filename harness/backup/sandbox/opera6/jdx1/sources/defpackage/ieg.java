package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ieg implements jxd {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public ieg(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static ieg d(g1g g1gVar) {
        int iM = g1gVar.m();
        String strP = dzd.p(g1gVar.y(g1gVar.m(), StandardCharsets.US_ASCII));
        String strY = g1gVar.y(g1gVar.m(), StandardCharsets.UTF_8);
        int iM2 = g1gVar.m();
        int iM3 = g1gVar.m();
        int iM4 = g1gVar.m();
        int iM5 = g1gVar.m();
        int iM6 = g1gVar.m();
        byte[] bArr = new byte[iM6];
        g1gVar.k(bArr, 0, iM6);
        return new ieg(iM, strP, strY, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // defpackage.jxd
    public final void b(ujd ujdVar) {
        ujdVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ieg.class != obj.getClass()) {
            return false;
        }
        ieg iegVar = (ieg) obj;
        return this.a == iegVar.a && this.b.equals(iegVar.b) && this.c.equals(iegVar.c) && this.d == iegVar.d && this.e == iegVar.e && this.f == iegVar.f && this.g == iegVar.g && Arrays.equals(this.h, iegVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((z1m.f(z1m.f((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
