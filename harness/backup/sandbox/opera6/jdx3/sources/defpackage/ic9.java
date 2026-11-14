package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ic9 extends FilterOutputStream {
    public long a;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.a += i2;
    }
}
