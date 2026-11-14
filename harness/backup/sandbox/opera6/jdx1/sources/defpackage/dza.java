package defpackage;

/* loaded from: classes.dex */
public abstract class dza {
    public static final xm5 a = new xm5(l08.a);
    public static final xm5 b;
    public static final xm5 c;
    public static final xm5 d;

    static {
        e97.a(4096);
        e97 e97Var = new e97(4096);
        e97.a(4096);
        b = new xm5(new apj(e97Var, new e97(4096)));
        c = new xm5(Boolean.FALSE);
        d = new xm5(Boolean.TRUE);
    }

    public static final void a(yya yyaVar) {
        gn8 gn8Var;
        xm5 xm5Var = eza.a;
        v26 v26Var = new v26(200);
        Object obj = yyaVar.l;
        if (obj instanceof gn8) {
            gn8Var = (gn8) obj;
        } else if (!(obj instanceof hn8)) {
            t40.h();
            return;
        } else {
            gn8 gn8Var2 = new gn8((hn8) obj);
            yyaVar.l = gn8Var2;
            gn8Var = gn8Var2;
        }
        gn8Var.a.put(eza.a, v26Var);
    }
}
