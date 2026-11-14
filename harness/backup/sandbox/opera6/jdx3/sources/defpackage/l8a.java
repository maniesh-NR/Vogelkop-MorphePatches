package defpackage;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class l8a extends FilterInputStream {
    public final c5o a;
    public String b;

    public l8a(FileInputStream fileInputStream, c5o c5oVar) {
        super(fileInputStream);
        this.a = c5oVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        c5o c5oVar = this.a;
        c5oVar.getClass();
        f8a f8aVar = f8a.d;
        this.b = w7d.u((MessageDigest) c5oVar.a, ((f8a) c5oVar.b).b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            ((MessageDigest) this.a.a).update((byte) i);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 != -1) {
            ((MessageDigest) this.a.a).update(bArr, i, i3);
        }
        return i3;
    }
}
