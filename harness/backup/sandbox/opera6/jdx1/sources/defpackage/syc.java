package defpackage;

/* loaded from: classes.dex */
public final class syc implements kyh, xn8 {
    public static final ua7 e = zn8.a(20, new r16());
    public final abk a = new abk();
    public kyh b;
    public boolean c;
    public boolean d;

    public final synchronized void a() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            d();
        }
    }

    @Override // defpackage.kyh
    public final int b() {
        return this.b.b();
    }

    public final abk c() {
        return this.a;
    }

    @Override // defpackage.kyh
    public final synchronized void d() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.d();
            this.b = null;
            e.K(this);
        }
    }

    @Override // defpackage.kyh
    public final Class e() {
        return this.b.e();
    }

    @Override // defpackage.kyh
    public final Object get() {
        return this.b.get();
    }
}
