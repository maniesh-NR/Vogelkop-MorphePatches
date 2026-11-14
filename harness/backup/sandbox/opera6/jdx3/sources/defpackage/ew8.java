package defpackage;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ew8 extends nv9 implements iue {
    public final jue o;
    public final lvc p;
    public final bw8 q;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ew8(BrowserActivity browserActivity, r16 r16Var, ow8 ow8Var, jue jueVar, x5f x5fVar, fqe fqeVar) {
        tcc lifecycle = browserActivity.getLifecycle();
        Objects.requireNonNull(x5fVar);
        super(aw8.class, r16Var, ow8Var, lifecycle, new zv8(x5fVar, (byte) 0), vb0.b, vb0.c, vb0.d);
        this.o = jueVar;
        jueVar.b.b(this);
        String[] strArr = OperaApplication.K;
        this.p = new lvc(fqeVar, ((OperaApplication) browserActivity.getApplication()).z());
        this.q = new bw8(browserActivity, "news_local_news_card_handler", "news_local_news_suggestion_card_shown", "news_local_news_suggestion_card_clicked", "news_local_news_suggestion_card_sp_visits");
    }

    @Override // defpackage.nv9
    public final void A() {
        bw8 bw8Var = this.q;
        ((SharedPreferences) ((b59) bw8Var.b).get()).edit().putBoolean((String) bw8Var.a, false).apply();
    }

    @Override // defpackage.iue
    public final void O(boolean z) {
        boolean z2 = z && y();
        boolean z3 = this.i;
        if (z2) {
            if (z3) {
                return;
            }
            B();
        } else if (z3) {
            w();
        }
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i == 2131558825) {
            return new dw8(this, ha2.M(viewGroup, i, 0));
        }
        return null;
    }

    @Override // defpackage.nv9, defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        super.onDestroy();
        lvc lvcVar = this.p;
        lvcVar.b.e(lvcVar.d);
        lvcVar.g = null;
        this.o.b.c(this);
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return 2131558825;
    }

    @Override // defpackage.nv9
    public final boolean u() {
        return this.q.X();
    }

    @Override // defpackage.nv9
    public final boolean y() {
        jue jueVar;
        bwf bwfVar;
        int iU0;
        xw8 xw8Var;
        if (super.y() && (bwfVar = (jueVar = this.o).c) != null) {
            ArrayList arrayList = ((c5k) jueVar.d.g.b).A.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    bw8 bw8Var = this.q;
                    if (((SharedPreferences) ((b59) bw8Var.b).get()).getBoolean(bw8Var.o, false) || !((iU0 = bw8Var.u0()) == 1 || iU0 == 3 || iU0 == 5)) {
                        break;
                    }
                    return true;
                }
                Object obj = arrayList.get(i);
                i++;
                zw8 zw8Var = (zw8) obj;
                if (bwfVar.equals(zw8Var.a) && (xw8Var = zw8Var.b) != null && xw8Var.E) {
                    break;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nv9
    public final void z() {
        this.k.a = true;
        bw8 bw8Var = this.q;
        ((SharedPreferences) ((b59) bw8Var.b).get()).edit().putBoolean((String) bw8Var.a, true).apply();
    }
}
