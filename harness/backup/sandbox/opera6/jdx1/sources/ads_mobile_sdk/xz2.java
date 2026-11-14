package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class xz2 implements Comparable {
    public final Runnable a;
    public final long b;

    public xz2(Runnable runnable, long j) {
        this.a = runnable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((xz2) obj).b);
    }
}
