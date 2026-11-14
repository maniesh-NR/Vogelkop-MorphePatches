package defpackage;

import android.content.Context;
import android.net.Uri;
import com.opera.android.Lazy;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pgf {
    public final b59 a;
    public final k6l b;
    public final Lazy c;
    public final umi d;
    public final mu6 e;
    public final du3 f;
    public String g;
    public final ode h = new ode();
    public oml i;

    public pgf(k6l k6lVar, Lazy lazy, umi umiVar, Context context, mu6 mu6Var, du3 du3Var) {
        this.a = w1h.l(context, umiVar, "open_in_app_count", new bg1[0]);
        this.b = k6lVar;
        this.c = lazy;
        this.d = umiVar;
        this.e = mu6Var;
        this.f = du3Var;
        k6lVar.F(new ngf(this));
        k6lVar.a(new qz(this, (byte) 16));
    }

    public final ogf a() {
        b2l b2lVar;
        ogf ogfVar = (ogf) this.h.g();
        if (ogfVar == null || (b2lVar = this.b.o) == null) {
            return null;
        }
        if (ogfVar.a.equals(((d7l) b2lVar).k0())) {
            return ogfVar;
        }
        return null;
    }

    public final void b(b2l b2lVar) {
        String strK0 = ((d7l) b2lVar).k0();
        String str = this.g;
        byte b = 0;
        if (str != null) {
            if (str.equals(strK0)) {
                return;
            }
            oml omlVar = this.i;
            if (omlVar != null) {
                omlVar.cancel(false);
                this.i = null;
            }
            this.h.r((Object) null);
        }
        this.g = strK0;
        ArrayList arrayList = vqm.a;
        if (vqm.c(Uri.parse(strK0).getScheme())) {
            odf odfVar = new odf((byte) 1);
            umi umiVar = this.d;
            nml nmlVarE = umiVar.e(odfVar);
            nmlVarE.b(umiVar.f(new mgf(this, strK0, b)));
            this.i = nmlVarE.a(strK0);
        }
    }

    public final void c(nl0 nl0Var) {
        x5f x5fVar = (x5f) ((orm) this.f.get());
        if (x5fVar.h) {
            x5fVar.T0(new o5f((Object) nl0Var, (byte) 0));
        }
    }

    public final void d(String str, Callback callback) {
        ArrayList arrayList = vqm.a;
        if (!vqm.c(Uri.parse(str).getScheme())) {
            callback.run(null);
            return;
        }
        ogf ogfVar = (ogf) this.h.g();
        if (ogfVar != null && ogfVar.a.equals(str)) {
            callback.run(ogfVar);
            return;
        }
        odf odfVar = new odf((byte) 1);
        umi umiVar = this.d;
        nml nmlVarE = umiVar.e(odfVar);
        nmlVarE.b(umiVar.f(new a32((Object) str, (Object) callback, (Object) ogfVar, (byte) 21)));
        nmlVarE.a(str);
    }
}
