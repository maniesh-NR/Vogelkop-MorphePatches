package defpackage;

/* loaded from: classes.dex */
public final class x44 extends d54 {
    public final int e;
    public final int f;

    public x44(byte[] bArr, int i, int i2) {
        super(bArr);
        d54.g(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.d54
    public final byte d(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(sko.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(sko.h(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.d54
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // defpackage.d54
    public final int j() {
        return this.e;
    }

    @Override // defpackage.d54
    public final byte m(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.d54
    public final int size() {
        return this.f;
    }
}
