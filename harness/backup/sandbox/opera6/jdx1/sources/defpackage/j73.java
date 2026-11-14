package defpackage;

/* loaded from: classes.dex */
public abstract class j73 implements ggd {
    public final long a;
    public final long b;
    public long c;

    public j73(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            t3p.y();
        }
    }

    @Override // defpackage.ggd
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
