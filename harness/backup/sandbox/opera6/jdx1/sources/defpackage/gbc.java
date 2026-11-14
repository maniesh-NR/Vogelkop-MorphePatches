package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gbc {
    public final t0g A;
    public final t0g B;
    public cy a;
    public final znh b;
    public final r17 c;
    public final c37 d;
    public djl e;
    public final t0g f;
    public final t0g g;
    public b2c h;
    public final t0g i;
    public sf1 j;
    public final t0g k;
    public final t0g l;
    public final t0g m;
    public final t0g n;
    public final t0g o;
    public boolean p;
    public final t0g q;
    public final nvb r;
    public final t0g s;
    public final t0g t;
    public Function1 u;
    public final lw5 v;
    public final lw5 w;
    public final lw5 x;
    public final zg y;
    public long z;

    public gbc(cy cyVar, znh znhVar, r17 r17Var) {
        this.a = cyVar;
        this.b = znhVar;
        this.c = r17Var;
        c37 c37Var = new c37();
        sf1 sf1Var = tf1.a;
        long j = xjl.b;
        mil milVar = new mil(sf1Var, j, (xjl) null);
        c37Var.a = milVar;
        c37Var.b = new pw7(sf1Var, milVar.b);
        this.d = c37Var;
        Boolean bool = Boolean.FALSE;
        this.f = hyg.k(bool);
        this.g = hyg.k(new gh7(0.0f));
        this.i = hyg.k((Object) null);
        this.k = hyg.k(b7a.a);
        this.l = hyg.k(bool);
        this.m = hyg.k(bool);
        this.n = hyg.k(bool);
        this.o = hyg.k(bool);
        this.p = true;
        this.q = hyg.k(Boolean.TRUE);
        this.r = new nvb(r17Var);
        this.s = hyg.k(bool);
        this.t = hyg.k(bool);
        this.u = new g8c((byte) 3);
        this.v = new lw5(this, (byte) 1);
        this.w = new lw5(this, (byte) 2);
        this.x = new lw5(this, (byte) 3);
        this.y = na2.d();
        this.z = u95.g;
        this.A = hyg.k(new xjl(j));
        this.B = hyg.k(new xjl(j));
    }

    public final b7a a() {
        return (b7a) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final b2c c() {
        b2c b2cVar = this.h;
        if (b2cVar == null || !b2cVar.f()) {
            return null;
        }
        return b2cVar;
    }

    public final ojl d() {
        return (ojl) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new xjl(j));
    }

    public final void f(long j) {
        this.A.setValue(new xjl(j));
    }
}
