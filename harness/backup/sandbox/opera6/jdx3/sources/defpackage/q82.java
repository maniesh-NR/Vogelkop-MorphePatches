package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.content.browser.GestureListenerManagerImpl;

/* loaded from: classes.dex */
public final class q82 {
    public final h7f a;
    public final BrowserActivity b;
    public boolean c;
    public boolean d;
    public g82 e;
    public boolean f;
    public final p82 g;
    public final c5o h;
    public final lhb i;
    public b2l j;

    public q82(BrowserActivity browserActivity, k6l k6lVar, c5o c5oVar) {
        qz qzVar = new qz(this, (byte) 2);
        o82 o82Var = new o82(this);
        this.a = new h7f();
        this.g = new p82(this);
        this.b = browserActivity;
        this.d = browserActivity.getLifecycle().i.d(qcc.e);
        this.h = c5oVar;
        this.i = browserActivity.x0().v;
        k6lVar.a(qzVar);
        k6lVar.F(o82Var);
    }

    public final void a() {
        this.e = c(((d7l) this.j).f0());
        lqm lqmVar = (((d7l) this.j).j.B() & 134217728) != 0 ? lqm.i : lqm.d;
        h7f h7fVar = this.a;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((r82) g7fVarH.next()).d(this.e, lqmVar, ((d7l) this.j).j.m());
        }
        if (!this.f) {
            this.f = true;
        }
        g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
        while (g7fVarH2.hasNext()) {
            ((r82) g7fVarH2.next()).b(UrlMangler.d(((d7l) this.j).j.getUrl()), true);
        }
        ChromiumContent chromiumContentH = uy3.H(this.j);
        Objects.requireNonNull(chromiumContentH);
        GestureListenerManagerImpl.e(chromiumContentH.e()).b(this.g, 2);
        if (this.d) {
            g7f g7fVar = new g7f(h7fVar);
            while (g7fVar.hasNext()) {
                ((r82) g7fVar.next()).a();
            }
        }
        this.c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q82.b(boolean, boolean):void");
    }

    public final g82 c(String str) {
        msh mshVarE;
        if (str != null) {
            g82 g82Var = (g82) ((HashMap) this.h.a).get(str);
            if (g82Var != null) {
                return g82Var;
            }
            String[] strArr = OperaApplication.K;
            fqe fqeVarY = ((OperaApplication) this.b.getApplication()).y();
            Context context = fqeVarY.a;
            String[] strArr2 = OperaApplication.K;
            fue fueVarZ = ((OperaApplication) context.getApplicationContext()).z();
            fueVarZ.d();
            uqe uqeVarC = fueVarZ.a.ordinal() != 1 ? null : fqeVarY.c();
            if (uqeVarC != null && (mshVarE = uqeVarC.e(str, false)) != null) {
                return uqeVarC.i(mshVarE, false);
            }
        }
        return null;
    }

    public final boolean d() {
        String strF0 = ((d7l) this.j).f0();
        return (TextUtils.isEmpty(strF0) || c(strF0) == null) ? false : true;
    }

    public final void e() {
        this.d = true;
        if (this.c) {
            h7f h7fVar = this.a;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((r82) g7fVarH.next()).a();
            }
        }
    }
}
