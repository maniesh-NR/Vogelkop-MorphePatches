package defpackage;

/* loaded from: classes.dex */
public final class sr3 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final g1g f;
    public final g1g g;
    public int h;
    public int i;

    public sr3(g1g g1gVar, g1g g1gVar2, boolean z) throws s1g {
        this.g = g1gVar;
        this.f = g1gVar2;
        this.e = z;
        g1gVar2.N(12);
        this.a = g1gVar2.E();
        g1gVar.N(12);
        this.i = g1gVar.E();
        p37.s("first_chunk must be 1", g1gVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        g1g g1gVar = this.f;
        this.d = z ? g1gVar.G() : g1gVar.C();
        if (this.b == this.h) {
            g1g g1gVar2 = this.g;
            this.c = g1gVar2.E();
            g1gVar2.O(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? g1gVar2.E() - 1 : -1;
        }
        return true;
    }
}
