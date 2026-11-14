package defpackage;

/* loaded from: classes.dex */
public final class unk {
    public static final unk c = new unk(-9223372036854775807L, false);
    public boolean a;
    public long b;

    public unk(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public final long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
