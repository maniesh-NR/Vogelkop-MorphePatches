package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vi5 {
    public long a;
    public long b;
    public long c;
    public final Object d;
    public final Object e;

    public /* synthetic */ vi5(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
        this.d = byteBuffer;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.e = byteBuffer2;
    }

    public vi5(kw3 kw3Var, tw2 tw2Var, String str) {
        this.a = Long.MIN_VALUE;
        this.b = Long.MAX_VALUE;
        this.c = Long.MAX_VALUE;
        this.d = tw2Var;
        this.e = str;
    }

    public vi5(xi5 xi5Var) {
        this.e = xi5Var;
        this.d = new Object();
    }
}
