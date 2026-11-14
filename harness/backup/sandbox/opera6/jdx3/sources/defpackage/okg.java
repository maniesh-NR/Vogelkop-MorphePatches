package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class okg {
    public final Context a;
    public final kjg b;
    public final lkg c;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ag f;
    public final nkg g;

    public okg(Context context, kjg kjgVar, jr9 jr9Var) {
        ag agVar = new ag(this, (byte) 7);
        this.f = agVar;
        this.a = context;
        this.b = kjgVar;
        this.c = (lkg) jr9Var.apply(this);
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).m().a.b(agVar);
        this.g = new nkg(this, ((m6l) ((OperaApplication) context.getApplicationContext()).r.e1.get()).a);
    }

    public final void a(int i, mkg[] mkgVarArr) {
        if (mkgVarArr.length == 0) {
            return;
        }
        this.c.g(i, mkgVarArr);
        this.b.b();
    }

    public final void b() {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) this.a.getApplicationContext()).m().a.u(this.f);
        nkg nkgVar = this.g;
        nkgVar.a.p(nkgVar);
        k6l k6lVar = nkgVar.b;
        if (k6lVar != null) {
            k6lVar.H(nkgVar);
        }
        this.c.destroy();
    }

    public final egd c(qjd qjdVar) {
        return (egd) this.e.get(qjdVar.a);
    }

    public final void d(mkg[] mkgVarArr, int i, long j) {
        this.d.clear();
        this.e.clear();
        this.c.d(mkgVarArr, i, j);
        this.b.b();
    }
}
