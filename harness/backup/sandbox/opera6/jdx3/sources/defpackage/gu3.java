package defpackage;

import J.N;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.OperaBrowserContext;
import java.util.ArrayList;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class gu3 {
    public final /* synthetic */ BrowserActivity a;

    public gu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @vkk
    public final void a(q35 q35Var) {
        j4c j4cVar = OperaBrowserContext.b;
        N.MNGS_Lnv();
    }

    @vkk
    public final void b(x55 x55Var) {
        b2l b2lVar;
        k6l k6lVar = this.a.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        int i = k6lVar.n;
        ArrayList arrayList = k6lVar.b;
        if (i == 0 || (b2lVar = k6lVar.o) == null) {
            return;
        }
        if (((d7l) b2lVar).j.m()) {
            b2l b2lVarN = k6lVar.v.n(k6lVar.o, u3l.a);
            Objects.requireNonNull(b2lVarN);
            k6lVar.C(b2lVarN, 1);
        }
        while (k6lVar.n > 0) {
            b2l b2lVar2 = (b2l) vep.r(1, arrayList);
            k6lVar.c.remove(Integer.valueOf(((d7l) b2lVar2).j.getId()));
            k6lVar.y(b2lVar2, true);
        }
        h7f h7fVar = k6lVar.q;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            j6l j6lVar = (j6l) g7fVarH.next();
            try {
                arrayList.size();
                j6lVar.d(k6lVar.n);
            } catch (RuntimeException e) {
                ks3.D(e);
            }
        }
    }

    @vkk
    public final void c(@NotNull m35 m35Var) {
        boolean z = m35Var.a;
        Runnable runnable = m35Var.b;
        int i = BrowserActivity.E1;
        this.a.l0(z, runnable);
    }
}
