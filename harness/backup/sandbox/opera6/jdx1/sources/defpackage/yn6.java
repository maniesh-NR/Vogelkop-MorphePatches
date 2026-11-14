package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class yn6 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final z c = new z((byte) 1);
    public nv6 d;
    public byte e;
    public int f;
    public long g;

    public final long a(lp6 lp6Var, int i) throws InterruptedIOException {
        lp6Var.readFully(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
