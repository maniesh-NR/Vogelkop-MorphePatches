package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class wjg implements dkj, dcj {
    public final /* synthetic */ akg a;

    public /* synthetic */ wjg(akg akgVar) {
        this.a = akgVar;
    }

    @Override // defpackage.dkj
    public final void a() {
        akg akgVar = this.a;
        tjg tjgVar = (tjg) ((xbf) akgVar.l).b;
        re7 re7Var = (re7) ((svb) akgVar.o).c;
        okg okgVar = tjgVar.k;
        okgVar.c.h(new mgf(okgVar, re7Var, (byte) 6), false);
        Context context = (Context) akgVar.q;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).m().a.c((re7) ((svb) akgVar.o).c, null);
    }

    @Override // defpackage.dcj
    public final void b(jjm jjmVar, String str) {
        ga6 ga6Var = (ga6) this.a.n;
        if (ga6Var != null) {
            ((HashSet) ga6Var.b).remove(jjmVar);
        }
    }
}
