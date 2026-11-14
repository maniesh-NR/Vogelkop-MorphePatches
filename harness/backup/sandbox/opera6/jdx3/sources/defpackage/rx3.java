package defpackage;

import android.util.Pair;
import com.opera.android.browser.BrowserFragment;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class rx3 implements j6l {
    public final HashSet a = new HashSet();
    public final /* synthetic */ BrowserFragment b;

    public rx3(BrowserFragment browserFragment) {
        this.b = browserFragment;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        int i2;
        Pair pair;
        Pair pair2;
        BrowserFragment browserFragment = this.b;
        aal aalVar = browserFragment.k;
        aalVar.e = b2lVar2;
        qim qimVar = (qim) aalVar.c;
        qimVar.o = b2lVar2;
        u7k u7kVar = qimVar.n;
        hjm hjmVar = hjm.b;
        if (u7kVar != null) {
            ((z9l) u7kVar.a).finish(hjmVar);
            qimVar.n = null;
        }
        if (b2lVar2 != null) {
            if (((d7l) b2lVar2).l != lqm.i) {
                qimVar.a();
            } else {
                p77 p77Var = qimVar.h;
                b87 b87VarA = p77Var.a();
                if (b87VarA != null) {
                    g7f g7fVar = new g7f(p77Var.b);
                    while (g7fVar.hasNext()) {
                        m9l m9lVar = (m9l) g7fVar.next();
                        if (m9lVar.a.remove(b87VarA)) {
                            m9lVar.a();
                        }
                    }
                }
                qimVar.i.h();
                qimVar.j.I();
                uwf uwfVar = qimVar.l;
                if (uwfVar != null && (pair2 = uwfVar.a) != null) {
                    ((q2f) pair2.second).f(hjmVar);
                }
                z8b z8bVar = qimVar.m;
                if (z8bVar != null && (pair = (Pair) z8bVar.a) != null) {
                    ((lz3) pair.second).b(hjmVar);
                }
            }
        }
        if (!this.a.remove(b2lVar2)) {
            browserFragment.h0(false);
            return;
        }
        browserFragment.r.getClass();
        if (b2lVar2 == null) {
            i2 = 3;
        } else {
            d7l d7lVar = (d7l) b2lVar2;
            i2 = (d7lVar.j.c0() || ((knf) d7lVar.e.d) == null) ? 1 : 2;
        }
        browserFragment.j0(b2lVar2, i2);
    }

    @Override // defpackage.j6l
    public final void L(b2l b2lVar, boolean z) {
        this.b.k.T(b2lVar);
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        this.a.add(b2lVar);
    }
}
