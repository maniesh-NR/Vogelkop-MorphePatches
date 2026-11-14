package defpackage;

/* loaded from: classes.dex */
public abstract class xte implements q8j {
    public boolean a;

    @Override // defpackage.q8j
    public final void a() {
        if (this.a) {
            this.a = false;
            d();
        }
    }

    public abstract void b(Object obj);

    @Override // defpackage.q8j
    public final void c(Object obj) {
        if (obj == null) {
            this.a = true;
        } else {
            b(obj);
        }
    }

    public abstract void d();
}
