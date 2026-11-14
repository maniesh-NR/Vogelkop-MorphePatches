package defpackage;

/* loaded from: classes.dex */
public abstract class oh4 implements q8j {
    public volatile boolean a;

    @Override // defpackage.q8j
    public final void a() {
        if (this.a) {
            return;
        }
        b();
    }

    public void b() {
        e();
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        if (this.a) {
            return;
        }
        d(obj);
    }

    public abstract void d(Object obj);

    public abstract void e();
}
