package defpackage;

/* loaded from: classes.dex */
public final class b7b implements iak {
    public Float a;
    public Float b;
    public final t0g c;
    public ecl d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ d7b h;

    public b7b(d7b d7bVar, Float f, Float f2, y6b y6bVar) {
        this.h = d7bVar;
        this.a = f;
        this.b = f2;
        this.c = hyg.k(f);
        this.d = new ecl(y6bVar, a26.e, this.a, this.b, null);
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return this.c.getValue();
    }
}
