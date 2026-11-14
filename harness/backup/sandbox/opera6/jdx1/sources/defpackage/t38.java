package defpackage;

/* loaded from: classes.dex */
public final class t38 implements kyh {
    public final boolean a;
    public final boolean b;
    public final kyh c;
    public final f38 d;
    public final s38 e;
    public int f;
    public boolean g;

    public t38(kyh kyhVar, boolean z, boolean z2, s38 s38Var, f38 f38Var) {
        qyn.l(kyhVar, "Argument must not be null");
        this.c = kyhVar;
        this.a = z;
        this.b = z2;
        this.e = s38Var;
        qyn.l(f38Var, "Argument must not be null");
        this.d = f38Var;
    }

    public final synchronized void a() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // defpackage.kyh
    public final int b() {
        return this.c.b();
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            int i2 = i - 1;
            this.f = i2;
            z = i2 == 0;
        }
        if (z) {
            this.d.d(this.e, this);
        }
    }

    @Override // defpackage.kyh
    public final synchronized void d() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.d();
        }
    }

    @Override // defpackage.kyh
    public final Class e() {
        return this.c.e();
    }

    @Override // defpackage.kyh
    public final Object get() {
        return this.c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
