package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class u69 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final bpd k;
    public final lxd l;

    public u69(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, bpd bpdVar, lxd lxdVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = bpdVar;
        this.l = lxdVar;
    }

    public u69(byte[] bArr, int i) {
        bq4 bq4Var = new bq4(bArr, bArr.length);
        bq4Var.q(i << 3);
        this.a = bq4Var.i(16);
        this.b = bq4Var.i(16);
        this.c = bq4Var.i(24);
        this.d = bq4Var.i(24);
        int i2 = bq4Var.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = bq4Var.i(3) + 1;
        int i3 = bq4Var.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        this.j = bq4Var.k(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final oj9 c(byte[] bArr, lxd lxdVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        lxd lxdVar2 = this.l;
        if (lxdVar2 != null) {
            lxdVar = lxdVar2.b(lxdVar);
        }
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("audio/flac");
        nj9Var.n = i;
        nj9Var.E = this.g;
        nj9Var.F = this.e;
        String str = tym.a;
        nj9Var.G = tym.A(this.h, ByteOrder.LITTLE_ENDIAN);
        nj9Var.p = Collections.singletonList(bArr);
        nj9Var.k = lxdVar;
        return new oj9(nj9Var);
    }
}
