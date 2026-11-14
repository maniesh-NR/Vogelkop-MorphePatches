package defpackage;

/* loaded from: classes.dex */
public final class s8h {
    public final /* synthetic */ byte a;
    public final pql b;
    public final g1g c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public s8h(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new pql(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new g1g();
                break;
            default:
                this.b = new pql(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new g1g();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static long c(g1g g1gVar) {
        int i = g1gVar.b;
        if (g1gVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        g1gVar.k(bArr, 0, 9);
        g1gVar.N(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return (((56 & j) >> 3) << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public final void a(lp6 lp6Var) {
        byte b = this.a;
        g1g g1gVar = this.c;
        switch (b) {
            case 0:
                byte[] bArr = tym.b;
                g1gVar.L(bArr, bArr.length);
                this.d = true;
                lp6Var.f = 0;
                break;
            default:
                byte[] bArr2 = tym.b;
                g1gVar.L(bArr2, bArr2.length);
                this.d = true;
                lp6Var.f = 0;
                break;
        }
    }
}
