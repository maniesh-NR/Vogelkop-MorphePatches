package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class ld6 extends InputStream {
    public final ed6 a;
    public final nd6 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public ld6(ed6 ed6Var, nd6 nd6Var) {
        this.a = ed6Var;
        this.b = nd6Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.a.close();
        this.e = true;
    }

    public final void h() {
        if (this.d) {
            return;
        }
        this.a.b(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        z4o.H(!this.e);
        h();
        int i3 = this.a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
