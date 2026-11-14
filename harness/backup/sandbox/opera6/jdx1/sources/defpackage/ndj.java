package defpackage;

/* loaded from: classes.dex */
public final class ndj {
    public final t0g a;
    public final t0g b;
    public final p12 c;
    public final long d;
    public long e;
    public float f;
    public float g;
    public long h;
    public long i;
    public k1n j;

    public ndj() {
        Boolean bool = Boolean.FALSE;
        this.a = hyg.k(bool);
        this.b = hyg.k(bool);
        this.c = new p12((byte) 16);
        tpl.a.getClass();
        f9e.a.getClass();
        this.d = f9e.b();
        this.e = u95.f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = a2m.b;
        this.i = 0L;
    }

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        t0g t0gVar = this.a;
        boolean zBooleanValue = ((Boolean) t0gVar.getValue()).booleanValue();
        t0g t0gVar2 = this.b;
        if (zBooleanValue && !z) {
            t0gVar2.setValue(Boolean.TRUE);
        } else if (z) {
            t0gVar2.setValue(Boolean.FALSE);
        }
        t0gVar.setValue(Boolean.valueOf(z));
    }
}
