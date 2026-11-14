package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ubd extends FilterInputStream {
    public int a;

    public ubd(uf8 uf8Var) {
        super(uf8Var);
        this.a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long h(long j) {
        int i = this.a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void k(long j) {
        int i = this.a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.a = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int i = super.read();
        k(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iH = (int) h(i2);
        if (iH == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iH);
        k(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.a = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jH = h(j);
        if (jH == -1) {
            return 0L;
        }
        long jSkip = super.skip(jH);
        k(jSkip);
        return jSkip;
    }
}
