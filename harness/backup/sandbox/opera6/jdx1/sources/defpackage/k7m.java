package defpackage;

/* loaded from: classes.dex */
public final class k7m {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(hyl hylVar, gyl gylVar) {
        if (this.c > 0) {
            hylVar.a(this.d, this.e, this.f, this.g, gylVar);
            this.c = 0;
        }
    }

    public final void b(hyl hylVar, long j, int i, int i2, int i3, gyl gylVar) {
        z4o.G("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(hylVar, gylVar);
            }
        }
    }

    public final void c(dn8 dn8Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        dn8Var.peekFully(bArr, 0, 10);
        dn8Var.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
