package defpackage;

/* loaded from: classes.dex */
public abstract class hob {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            h9o.q(this.b, p3p.o(i, "Given job ID ", " is different than previous "));
        }
    }
}
