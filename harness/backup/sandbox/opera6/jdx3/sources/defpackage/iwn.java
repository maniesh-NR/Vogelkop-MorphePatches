package defpackage;

/* loaded from: classes.dex */
public final class iwn {
    public static final tmj d = new tmj(10);
    public static final jf2 e;
    public final o28 a;
    public final wub b;
    public final ovn c;

    static {
        cam camVarD;
        s15 s15VarA = uqh.a(iwn.class);
        try {
            camVarD = uqh.d(iwn.class);
        } catch (Throwable unused) {
            camVarD = null;
        }
        e = new jf2("Websocket", new x9m(s15VarA, camVarD));
    }

    public iwn(o28 o28Var, wub wubVar, ovn ovnVar) {
        this.a = o28Var;
        this.b = wubVar;
        this.c = ovnVar;
    }
}
