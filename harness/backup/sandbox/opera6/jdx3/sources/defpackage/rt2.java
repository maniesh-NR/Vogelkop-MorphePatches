package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class rt2 implements Callback {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ w3g b;
    public final /* synthetic */ st2 c;

    public /* synthetic */ rt2(st2 st2Var, w3g w3gVar) {
        this.c = st2Var;
        this.b = w3gVar;
    }

    public /* synthetic */ rt2(w3g w3gVar, st2 st2Var) {
        this.b = w3gVar;
        this.c = st2Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        st2 st2Var = this.c;
        w3g w3gVar = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                st2Var.c.a(new rt2(w3gVar, st2Var));
                break;
            default:
                a4g a4gVar = (a4g) obj;
                w3g w3gVarB = a4gVar.b(w3gVar.a);
                if (w3gVarB != null) {
                    st2Var.b.G(w3gVarB, a4gVar.c(w3gVarB));
                    break;
                }
                break;
        }
    }
}
