package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class h34 implements qc6, ir6 {
    public final ByteBuffer a;

    public h34(byte b, ByteBuffer byteBuffer) {
        switch (b) {
            case 1:
                this.a = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.a = byteBuffer;
                break;
        }
    }

    @Override // defpackage.ir6
    public final int a() {
        return (k() << 8) | k();
    }

    @Override // defpackage.qc6
    public final void c() {
    }

    @Override // defpackage.qc6
    public final Object h() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.ir6
    public final short k() throws hr6 {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new hr6();
    }

    @Override // defpackage.ir6
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }
}
