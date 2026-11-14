package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class tq5 extends FilterInputStream {
    public final long a;
    public int b;

    public tq5(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.a - this.b, ((FilterInputStream) this).in.available());
    }

    public final void h(int i) throws IOException {
        int i2 = this.b;
        if (i >= 0) {
            this.b = i2 + i;
            return;
        }
        long j = this.a;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder sbQ = p3p.q(j, "Failed to read all expected data, expected: ", ", but read: ");
        sbQ.append(this.b);
        throw new IOException(sbQ.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        h(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        h(i3);
        return i3;
    }
}
