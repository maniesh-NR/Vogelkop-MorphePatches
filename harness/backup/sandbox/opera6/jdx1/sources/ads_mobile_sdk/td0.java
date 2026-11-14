package ads_mobile_sdk;

import defpackage.jso;
import defpackage.klp;
import defpackage.mkh;
import defpackage.tso;

/* loaded from: classes.dex */
public final class td0 implements klp {
    public final tso b;
    public final ob1 c;
    public final tso d;
    public final tso e;
    public final ob1 f;
    public final ob1 g;
    public final n90 h;
    public final tso i;
    public final tso j;
    public final tso k;

    public td0(sb0 sb0Var, defpackage.w13 w13Var, av2 av2Var, Boolean bool, Boolean bool2, defpackage.w13 w13Var2) {
        this.b = new nj0(new o5(sb0Var.u, sb0Var.h, sb0Var.t, (byte) 7));
        this.c = ob1.a(w13Var2);
        ob1 ob1Var = jso.a;
        this.d = new nj0(new a3(ob1Var, ob1Var, ob1Var));
        this.e = new nj0(new b(sb0Var.v0, (byte) 28));
        this.f = ob1.a(av2Var);
        this.g = ob1.a(bool2);
        this.h = new n90(ob1.a(w13Var));
        ob1 ob1VarA = ob1.a(bool);
        ah0 ah0Var = sb0Var.g1;
        ob1 ob1Var2 = this.f;
        n90 n90Var = this.h;
        tso tsoVar = this.e;
        nj0 nj0Var = new nj0(new np(ah0Var, ob1Var2, n90Var, tsoVar, ob1VarA, sb0Var.h));
        this.i = nj0Var;
        nj0 nj0Var2 = new nj0(mkh.j);
        this.j = nj0Var2;
        ah0 ah0Var2 = sb0Var.u;
        this.k = new nj0(new mi3(sb0Var.f, sb0Var.w, sb0Var.Z2, sb0Var.a3, ah0Var2, sb0Var.c3, this.b, sb0Var.V1, this.c, this.d, sb0Var.t, sb0Var.G, tsoVar, ob1Var2, sb0Var.d, this.g, nj0Var, new nj0(new dw(ah0Var2, (tso) nj0Var2, (byte) 1))));
    }

    @Override // defpackage.klp
    public final j71 a() {
        return (j71) this.i.get();
    }

    @Override // defpackage.klp
    public final on2 b() {
        return (uo2) this.k.get();
    }
}
