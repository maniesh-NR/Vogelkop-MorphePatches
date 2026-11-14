package defpackage;

import com.opera.api.Callback;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class yjg extends cej {
    public final ikg[] a;
    public final ikg b;
    public final Callback c;
    public final int d;
    public final /* synthetic */ akg e;

    public yjg(akg akgVar, int i, ikg[] ikgVarArr, ikg ikgVar, Callback callback) {
        this.e = akgVar;
        this.d = i;
        this.a = ikgVarArr;
        this.b = ikgVar;
        this.c = callback;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        return new jkg(mejVar, this.d, this.a, this.b, this.c);
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        super.onFinished(hjmVar);
        ga6 ga6Var = (ga6) this.e.n;
        if (ga6Var != null) {
            ((HashSet) ga6Var.b).remove(this);
        }
    }
}
