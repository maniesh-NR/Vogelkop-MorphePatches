package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.opera.android.Lazy;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vy3 extends zz1 {
    public final fx0 n;
    public final g9 o;
    public final f23 p;
    public final fx0 q;
    public final Lazy r;
    public final m02 s;

    public vy3(Context context, v22 v22Var, fx0 fx0Var, g9 g9Var, f23 f23Var, fx0 fx0Var2, Lazy lazy, du3 du3Var, mlj mljVar, wx wxVar, whf whfVar, ji jiVar, g7m g7mVar, k42 k42Var, v5n v5nVar, m02 m02Var, gjm gjmVar) {
        super(context, v22Var, du3Var, mljVar, wxVar, whfVar, jiVar, g7mVar, k42Var, v5nVar, gjmVar);
        this.n = fx0Var;
        this.o = g9Var;
        this.p = f23Var;
        this.q = fx0Var2;
        this.r = lazy;
        this.s = m02Var;
    }

    @Override // defpackage.zz1
    public final void a(long j) {
        bo3 bo3Var = new bo3(this, (byte) 11);
        wth wthVar = new wth(this.s, (byte) 10);
        wthVar.y(j, new o02(wthVar, j, bo3Var, (byte) 1));
    }

    @Override // defpackage.zz1
    public final void c(String str, String str2) {
        Uri uriX = w7d.x(new File(new File(snf.c), str));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uriX, str2);
        intent.addFlags(1);
        this.a.startActivity(intent);
    }

    @Override // defpackage.zz1
    public final void d(String str, boolean z) {
        vz1.a.getClass();
        vz1 vz1VarN = psp.n(str);
        if (vz1VarN != null) {
            f(vz1VarN);
            return;
        }
        lsc lscVarF = wqm.f(str, null, lqm.y);
        if (lscVarF != null) {
            String strA = ((sk6) this.r.get()).a(lscVarF.a);
            if (strA != null) {
                lscVarF.a = strA;
            }
            this.p.invoke(lscVarF, Boolean.TRUE, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.zz1
    public final void e(String str, ArrayList arrayList) {
        this.q.invoke(arrayList, str);
    }

    @Override // defpackage.zz1
    public final void g(String str) {
        this.n.invoke(str, 1);
    }
}
