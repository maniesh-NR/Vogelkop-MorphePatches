package defpackage;

import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class fxo extends FilterInputStream {
    public long a;

    public fxo(DataInputStream dataInputStream, long j) {
        super(dataInputStream);
        if (j < 0) {
            s49.m("length < 0");
            throw null;
        }
        if (j <= Long.MAX_VALUE) {
            this.a = j;
        } else {
            s49.m("offset + length > Long.MAX_VALUE");
            throw null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(super.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.a;
        if (j <= 0) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            this.a -= i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long jMin = Math.min(j, this.a);
        if (jMin <= 0) {
            return 0L;
        }
        return super.skip(jMin);
    }
}
