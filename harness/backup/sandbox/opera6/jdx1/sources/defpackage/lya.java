package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lya extends ck9 {
    public final pya[] d;
    public final int e;
    public final int f;

    public lya(qya qyaVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(qyaVar);
        this.d = new pya[]{new kya(i, byteBuffer), new kya(byteBuffer2, i), new kya(byteBuffer3, i)};
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final pya[] A0() {
        return this.d;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final int getHeight() {
        return this.f;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final int getWidth() {
        return this.e;
    }
}
