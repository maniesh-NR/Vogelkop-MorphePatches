package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wrn implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vsn b;

    public /* synthetic */ wrn(vsn vsnVar, byte b) {
        this.a = b;
        this.b = vsnVar;
    }

    public final void d0(Object obj) {
        byte b = this.a;
        vsn vsnVar = this.b;
        switch (b) {
            case 0:
                u42 u42Var = (u42) obj;
                boolean z = (u42Var != null ? u42Var.c.e : null) == w42.TYPING;
                boolean z2 = (u42Var != null ? u42Var.b : null) == x42.ENABLED;
                if (z || !z2) {
                    vsnVar.c.f().f();
                }
                xf8.G0(vsnVar.n, Boolean.valueOf(z));
                break;
            default:
                vsnVar.q.u();
                break;
        }
    }
}
