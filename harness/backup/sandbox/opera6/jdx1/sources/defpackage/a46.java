package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class a46 {
    public final h1b a;
    public final long b;
    public final long c;
    public final long d;

    public a46(List list, long j, long j2) {
        this.a = h1b.s(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
