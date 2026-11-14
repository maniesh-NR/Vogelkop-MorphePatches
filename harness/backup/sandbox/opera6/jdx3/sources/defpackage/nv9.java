package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class nv9 extends ba2 {
    public final r16 b;
    public final ow8 c;
    public final tcc d;
    public final ob e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public yv8 j;
    public final nrl k;
    public final Object l;
    public final Object m;
    public final Object n;

    public nv9(Class cls, r16 r16Var, ow8 ow8Var, tcc tccVar, qp5 qp5Var, Object obj, Object obj2, Object obj3) {
        super(cls);
        ob obVar = new ob((Object) this, (byte) 6);
        this.e = obVar;
        this.b = r16Var;
        this.c = ow8Var;
        this.d = tccVar;
        tccVar.a(obVar);
        this.k = new nrl(qp5Var);
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    public abstract void A();

    public final void B() {
        A();
        if (this.i) {
            return;
        }
        this.i = true;
        if (this.f) {
            ow8 ow8Var = this.c;
            h1b h1bVarS = h1b.s(ow8Var.a);
            this.b.getClass();
            int iM = r16.m(this.a, 0, h1bVarS);
            if (iM < 0) {
                return;
            }
            yv8 yv8VarT = this.j;
            if (yv8VarT == null) {
                yv8VarT = t();
                this.j = yv8VarT;
            }
            ow8Var.H(iM, yv8VarT);
        }
    }

    @Override // defpackage.fa2, defpackage.rjm
    public void b(sjm sjmVar) {
        if (!sjmVar.a() || this.h) {
            return;
        }
        this.h = true;
        if (y()) {
            B();
        }
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        this.f = true;
        this.b.getClass();
        int iM = r16.m(this.a, i, arrayList);
        if (iM < 0 || !this.i) {
            return;
        }
        yv8 yv8VarT = this.j;
        if (yv8VarT == null) {
            yv8VarT = t();
            this.j = yv8VarT;
        }
        arrayList.add(iM, yv8VarT);
    }

    @Override // defpackage.ba2, defpackage.fa2
    public void onDestroy() {
        this.d.b(this.e);
    }

    public yv8 t() {
        return new aw8((byte) 0);
    }

    public abstract boolean u();

    public final void w() {
        if (this.i) {
            this.i = false;
            yv8 yv8VarT = this.j;
            if (yv8VarT == null) {
                return;
            }
            if (yv8VarT == null) {
                yv8VarT = t();
                this.j = yv8VarT;
            }
            this.c.V(yv8VarT);
        }
    }

    public boolean y() {
        return !this.c.K(yv8.class) && this.g && this.h;
    }

    public abstract void z();
}
