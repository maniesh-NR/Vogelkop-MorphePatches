package defpackage;

/* loaded from: classes.dex */
public final class h1i {
    public static final h1i d = new h1i(0, false, false);
    public static final h1i e = new h1i(500, true, false);
    public static final h1i f;
    public final short a;
    public final boolean b;
    public final boolean c;

    static {
        new h1i(100L, true, false);
        f = new h1i(0L, false, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public h1i(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = (int) j;
        if (z2) {
            jpo.i("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
