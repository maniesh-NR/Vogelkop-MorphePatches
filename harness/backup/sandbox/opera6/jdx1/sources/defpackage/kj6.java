package defpackage;

/* loaded from: classes.dex */
public final class kj6 {
    public int a;
    public long b;
    public long c = 0;
    public final long d;
    public final long e;

    public kj6(long j, int i) {
        this.d = j;
        this.e = i;
    }

    public final void a(long j, long j2) throws m37 {
        if (j % 8 != 0) {
            kp5.c(z1m.j(j, "Incorrect starting alignment: ", "."));
            return;
        }
        if (j < this.b) {
            kp5.c("Trying to access memory out of order.");
            return;
        }
        if (j2 < j) {
            kp5.c("Incorrect memory range.");
        } else if (j2 <= this.d) {
            this.b = (j2 + 7) & (-8);
        } else {
            kp5.c("Trying to access out of range memory.");
        }
    }
}
