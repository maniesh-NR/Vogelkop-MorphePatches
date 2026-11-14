package defpackage;

/* loaded from: classes.dex */
public final class pkc {
    public final /* synthetic */ qkc a;

    public pkc(qkc qkcVar) {
        this.a = qkcVar;
    }

    public final void a(tmc tmcVar) {
        String str;
        String str2;
        js6 js6Var = this.a.b;
        js6Var.getClass();
        if (!tmcVar.e || (str = tmcVar.d) == null) {
            return;
        }
        js6Var.b = true;
        byte b = 0;
        vx3 vx3VarA = ay3.a(str, lqm.x, false);
        vx3VarA.b = 2;
        o18.t(vx3VarA, true, vx3VarA);
        String str3 = tmcVar.a;
        if (str3 == null || (str2 = tmcVar.b) == null) {
            return;
        }
        x5f x5fVar = ((xoc) js6Var.g).a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).e().a().b("start_page", new e5f(str3, str2, b));
            x5fVar.U0(x56VarF);
        }
    }
}
