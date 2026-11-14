package defpackage;

/* loaded from: classes.dex */
public final class e2d implements iak {
    public final t0g a;
    public final t0g b;
    public final t0g c;
    public final t0g d;
    public final t0g e;
    public final t0g f;
    public final t0g g;
    public final i37 h;
    public final t0g i;
    public final t0g j;
    public final t0g k;
    public final t0g l;
    public final i37 m;
    public final mfe n;

    public e2d() {
        Boolean bool = Boolean.FALSE;
        this.a = hyg.k(bool);
        this.b = hyg.k(1);
        this.c = hyg.k(1);
        this.d = hyg.k(bool);
        this.e = hyg.k((Object) null);
        this.f = hyg.k(Float.valueOf(1.0f));
        this.g = hyg.k(bool);
        this.h = luj.b(new c2d(this, (byte) 1));
        this.i = hyg.k((Object) null);
        Float fValueOf = Float.valueOf(0.0f);
        this.j = hyg.k(fValueOf);
        this.k = hyg.k(fValueOf);
        this.l = hyg.k(Long.MIN_VALUE);
        this.m = luj.b(new c2d(this, (byte) 0));
        luj.b(new c2d(this, (byte) 2));
        this.n = new mfe();
    }

    public final int b() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final boolean c(int i, long j) {
        p2d p2dVar = (p2d) this.i.getValue();
        if (p2dVar == null) {
            return true;
        }
        t0g t0gVar = this.l;
        long jLongValue = ((Number) t0gVar.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) t0gVar.getValue()).longValue();
        t0gVar.setValue(Long.valueOf(j));
        t0g t0gVar2 = this.e;
        if (t0gVar2.getValue() != null) {
            h9o.t();
            return false;
        }
        if (t0gVar2.getValue() != null) {
            h9o.t();
            return false;
        }
        float fB = (jLongValue / 1000000) / p2dVar.b();
        i37 i37Var = this.h;
        float fFloatValue = ((Number) i37Var.getValue()).floatValue() * fB;
        float fFloatValue2 = ((Number) i37Var.getValue()).floatValue();
        t0g t0gVar3 = this.j;
        float fFloatValue3 = fFloatValue2 < 0.0f ? 0.0f - (((Number) t0gVar3.getValue()).floatValue() + fFloatValue) : (((Number) t0gVar3.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue3 < 0.0f) {
            g(djh.b(((Number) t0gVar3.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue3 / 1.0f);
        int i3 = i2 + 1;
        if (b() + i3 > i) {
            g(((Number) this.m.getValue()).floatValue());
            d(i);
            return false;
        }
        d(b() + i3);
        float f = fFloatValue3 - (i2 * 1.0f);
        g(((Number) i37Var.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    public final void d(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void f(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void g(float f) {
        p2d p2dVar;
        this.j.setValue(Float.valueOf(f));
        if (((Boolean) this.g.getValue()).booleanValue() && (p2dVar = (p2d) this.i.getValue()) != null) {
            f -= f % (1.0f / p2dVar.l);
        }
        this.k.setValue(Float.valueOf(f));
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return Float.valueOf(((Number) this.k.getValue()).floatValue());
    }
}
