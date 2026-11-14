package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class myf {
    public jxl a;
    public final bf9 b;
    public final myk c;
    public final byte d;
    public j99 e;
    public pi2 f;
    public String g;
    public final rgh h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public myf(BrowserActivity browserActivity, bf9 bf9Var, myk mykVar, int i, rgh rghVar) {
        this.b = bf9Var;
        this.c = mykVar;
        this.d = i;
        this.h = rghVar;
    }

    public final void a() {
        j99 j99Var = this.e;
        if (j99Var != null) {
            this.b.H(j99Var);
            this.e = null;
        }
        d();
        pi2 pi2Var = this.f;
        if (pi2Var != null) {
            pi2Var.b();
            this.f = null;
        }
    }

    public final void b(int i) {
        a();
        jxl jxlVar = this.a;
        if (jxlVar == null) {
            return;
        }
        jxlVar.a(this, false, i);
        this.a = null;
    }

    public final void c(List list) {
        fxl fxlVar;
        bf9 bf9Var = this.b;
        String str = bf9Var.t;
        this.g = str;
        if (str == null) {
            b(0);
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                fxlVar = null;
                break;
            } else {
                fxlVar = (fxl) it.next();
                if (this.g.equals(fxlVar.a.a)) {
                    break;
                }
            }
        }
        if (fxlVar == null) {
            b(0);
            return;
        }
        if (!fxlVar.a.h.contains("sync") && this.d != 1) {
            b(4);
            return;
        }
        PublicKey publicKeyA = bf9Var.a.A();
        if (publicKeyA == null) {
            b(0);
            return;
        }
        d();
        String strSubstring = String.valueOf(N.Mmz54ji0(p36.e(publicKeyA))).substring(0, 6);
        this.i = true;
        rgh rghVar = this.h;
        if (rghVar == null) {
            b(0);
            return;
        }
        ((sa4) rghVar.b).b(new npl((c5o) rghVar.a, strSubstring, (byte) 7));
        ((sa4) rghVar.b).b(new npl((c5o) rghVar.a, new lld((Object) this, (byte) 11), (byte) 8));
    }

    public final void d() {
        if (this.i) {
            rgh rghVar = this.h;
            if (rghVar != null) {
                ((sa4) rghVar.b).b(new cbl((c5o) rghVar.a, (byte) 15));
            }
            this.i = false;
        }
    }
}
