package defpackage;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c1a extends lim {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public c1a(tcc tccVar, ii iiVar, CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, l1a l1aVar, qim qimVar, eq9 eq9Var, k6l k6lVar, xt3 xt3Var, x5f x5fVar, v1a v1aVar) {
        this.b = l1aVar;
        this.c = qimVar;
        this.d = eq9Var;
        this.e = k6lVar;
        this.f = xt3Var;
        ld9 ld9Var = new ld9(this, (byte) 14);
        y0a y0aVar = new y0a(this, (byte) 0);
        ks3 ks3Var = new ks3();
        ks3Var.e = new kze(new fi7(0, 0));
        ks3Var.a = iiVar;
        ks3Var.b = coordinatorLayout;
        ks3Var.c = viewGroup;
        ks3Var.d = qimVar;
        ks3Var.g = new ld9(ks3Var, (byte) 13);
        ks3Var.h = ld9Var;
        ks3Var.i = y0aVar;
        this.g = ks3Var;
        ea6 ea6Var = new ea6(viewGroup.getContext().getApplicationContext(), l1aVar);
        Objects.requireNonNull(k6lVar);
        this.h = new b1a(tccVar, ks3Var, ea6Var, x5fVar, new z0a(k6lVar, (byte) 0), iiVar, v1aVar);
        tccVar.a(this);
    }

    public c1a(tcc tccVar, ydn ydnVar, slk slkVar, z77 z77Var, gjm gjmVar, x5f x5fVar) {
        this.b = tccVar;
        this.c = ydnVar;
        this.d = slkVar;
        this.e = z77Var;
        this.f = gjmVar;
        this.g = x5fVar;
    }

    public final b23 R() {
        x5f x5fVar = (x5f) this.g;
        return ((wvg) ((slk) this.d).i.g()).b() ? new uug((gjm) this.f, x5fVar) : new uug((ydn) this.c, x5fVar);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        switch (this.a) {
            case 0:
                qim qimVar = (qim) this.c;
                b1a b1aVar = (b1a) this.h;
                qimVar.r.b(b1aVar);
                ((eq9) this.d).a(b1aVar);
                ((k6l) this.e).w.a(b1aVar);
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                b1a b1aVar = (b1a) this.h;
                ((qim) obj).r.c(b1aVar);
                ((eq9) this.d).c.c(b1aVar);
                ((k6l) this.e).w.b(b1aVar);
                break;
            default:
                ndcVar.getLifecycle().b(this);
                nlk nlkVar = (nlk) this.h;
                if (nlkVar != null) {
                    ((ydn) obj).H(nlkVar);
                }
                this.h = null;
                break;
        }
    }
}
