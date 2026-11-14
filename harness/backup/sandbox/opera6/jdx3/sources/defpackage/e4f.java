package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e4f extends OutputStream {
    public boolean a;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a = true;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (this.a) {
            qp2.n("Check failed.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        if (this.a) {
            qp2.n("Check failed.");
        }
    }
}
