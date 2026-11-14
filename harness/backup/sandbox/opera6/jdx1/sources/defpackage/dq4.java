package defpackage;

/* loaded from: classes.dex */
public final class dq4 extends rnk implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        dq4 dq4Var = (dq4) obj;
        if (d(4) != dq4Var.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.g - dq4Var.g;
        if (j == 0) {
            j = this.k - dq4Var.k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
