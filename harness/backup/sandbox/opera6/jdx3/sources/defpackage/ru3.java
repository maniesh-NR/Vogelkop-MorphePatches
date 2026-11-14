package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class ru3 extends cx3 {
    public final /* synthetic */ BrowserActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru3(BrowserActivity browserActivity, re7 re7Var) {
        super(browserActivity, re7Var, (byte) 0);
        this.d = browserActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // defpackage.cx3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.re7 r8, boolean r9) {
        /*
            r7 = this;
            com.opera.android.BrowserActivity r0 = r7.d
            k6l r1 = r0.V
            r2 = 0
            if (r1 != 0) goto L8
            r1 = r2
        L8:
            int r3 = r8.b
            b2l r1 = r1.r(r3)
            if (r1 == 0) goto L62
            k6l r3 = r0.V
            if (r3 != 0) goto L15
            r3 = r2
        L15:
            java.util.ArrayList r3 = r3.b
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L62
            r3 = r1
            d7l r3 = (defpackage.d7l) r3
            e7l r4 = r3.j
            boolean r4 = r4.isLoading()
            if (r4 != 0) goto L62
            com.opera.android.browser.NavigationHistory r3 = r3.i()
            iuh r3 = (defpackage.iuh) r3
            java.lang.Object r4 = r3.b
            com.opera.android.browser.NavigationHistory r4 = (com.opera.android.browser.NavigationHistory) r4
            int r5 = r4.d()
            r6 = 1
            if (r5 > r6) goto L62
            int r4 = r4.d()
            if (r4 != r6) goto L5a
            r4 = 0
            com.opera.android.browser.NavigationEntry r3 = r3.i(r4)
            java.lang.String r3 = r3.getUrl()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5a
            java.lang.String r4 = "about:blank"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L62
        L5a:
            k6l r0 = r0.V
            if (r0 == 0) goto L5f
            r2 = r0
        L5f:
            r2.k(r1)
        L62:
            super.c(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru3.c(re7, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3] */
    @Override // defpackage.cx3
    public final ef7 d(re7 re7Var, boolean z, mej mejVar) {
        String[] strArr = OperaApplication.K;
        ?? r2 = this.d;
        return new ef7(mejVar, r2, re7Var, z, ((OperaApplication) r2.getApplication()).m().a, new k5o((BrowserActivity) r2), r2.o0);
    }

    @Override // defpackage.cx3
    public final vwh e(re7 re7Var) {
        pqh pqhVar = new pqh();
        BrowserActivity browserActivity = this.d;
        k6l k6lVar = browserActivity.V;
        if (k6lVar == null) {
            k6lVar = null;
        }
        b2l b2lVarR = k6lVar.r(re7Var.b);
        pqhVar.a = b2lVarR;
        if (b2lVarR == null) {
            k6l k6lVar2 = browserActivity.V;
            b2lVarR = (k6lVar2 != null ? k6lVar2 : null).o;
            pqhVar.a = b2lVarR;
        }
        return b2lVarR != null ? new qu3(pqhVar, (byte) 0) : new va2(this, (byte) 25);
    }
}
