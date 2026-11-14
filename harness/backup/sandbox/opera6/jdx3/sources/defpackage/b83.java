package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class b83 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y73 b;

    public /* synthetic */ b83(y73 y73Var, byte b) {
        this.a = b;
        this.b = y73Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        y73 y73Var = this.b;
        a4g a4gVar = (a4g) obj;
        switch (b) {
            case 0:
                yqa yqaVar = (yqa) y73Var.c;
                if (!y73Var.b) {
                    a4g a4gVar2 = (a4g) yqaVar.c;
                    if (a4gVar2 != null) {
                        a4gVar2.a();
                    }
                    yqaVar.q(a4gVar);
                    break;
                } else if (a4gVar != null) {
                    a4gVar.a();
                    break;
                }
                break;
            default:
                yqa yqaVar2 = (yqa) y73Var.c;
                if (!y73Var.b) {
                    a4g a4gVar3 = (a4g) yqaVar2.c;
                    if (a4gVar3 != null) {
                        a4gVar3.a();
                    }
                    yqaVar2.q(a4gVar);
                    break;
                } else if (a4gVar != null) {
                    a4gVar.a();
                    break;
                }
                break;
        }
    }
}
