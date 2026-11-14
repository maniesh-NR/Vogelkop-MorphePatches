package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class qj6 extends e04 {
    public oj9 c;
    public final d36 d = new d36();
    public ByteBuffer e;
    public boolean f;
    public long g;
    public ByteBuffer h;
    public final byte i;

    static {
        rjd.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qj6(int i) {
        this.i = i;
    }

    public void i() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer j(int i) {
        byte b = this.i;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.e;
        throw new pj6(fki.o(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    public final void k(int i) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = j(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferJ = j(i2);
        byteBufferJ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferJ.put(byteBuffer);
        }
        this.e = byteBufferJ;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
