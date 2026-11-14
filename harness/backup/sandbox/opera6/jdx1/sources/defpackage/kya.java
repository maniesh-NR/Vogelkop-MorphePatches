package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kya implements pya {
    public final /* synthetic */ byte a = 0;
    public final ByteBuffer b;
    public final int c;

    public kya(int i, ByteBuffer byteBuffer) {
        this.c = i;
        this.b = byteBuffer;
    }

    public kya(ByteBuffer byteBuffer, int i) {
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // defpackage.pya
    public final int R() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.pya
    public final int i0() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // defpackage.pya
    public final ByteBuffer u() {
        switch (this.a) {
        }
        return this.b;
    }
}
