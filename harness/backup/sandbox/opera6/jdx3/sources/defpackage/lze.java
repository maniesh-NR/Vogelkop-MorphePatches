package defpackage;

/* loaded from: classes.dex */
public abstract class lze implements q8j {
    public final t7j a;
    public boolean b;

    public lze(t7j t7jVar) {
        this.a = t7jVar;
    }

    @Override // defpackage.q8j
    public final void a() {
        if (this.b) {
            this.b = false;
            this.a.b(this);
        }
    }

    public abstract void b(Object obj);

    @Override // defpackage.q8j
    public final void c(Object obj) {
        if (obj == null) {
            this.b = true;
        } else {
            b(obj);
        }
    }
}
