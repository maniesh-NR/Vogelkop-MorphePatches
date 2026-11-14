package defpackage;

/* loaded from: classes.dex */
public final class phb {
    public final int a;
    public final int b;
    public final g5c c;

    public phb(int i, int i2, g5c g5cVar) {
        this.a = i;
        this.b = i2;
        this.c = g5cVar;
        if (i < 0) {
            d8b.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        d8b.a("size should be > 0");
    }
}
