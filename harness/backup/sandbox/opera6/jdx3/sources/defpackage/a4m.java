package defpackage;

import J.N;
import android.content.Context;
import android.view.View;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class a4m extends y08 {
    public final Context a;
    public final SettingsManager b;
    public final k6l c;
    public final v3m d;
    public final wt3 e;
    public final kwf f;
    public final swf g;
    public final oz3 h;
    public final wt3 i;
    public f6l j;
    public boolean k;
    public boolean l;

    public a4m(Context context, SettingsManager settingsManager, k6l k6lVar, v3m v3mVar, wt3 wt3Var, oz3 oz3Var, kwf kwfVar, swf swfVar, wt3 wt3Var2) {
        this.a = context;
        this.b = settingsManager;
        this.c = k6lVar;
        this.d = v3mVar;
        this.e = wt3Var;
        this.f = kwfVar;
        this.g = swfVar;
        this.h = oz3Var;
        this.i = wt3Var2;
        if (Y()) {
            this.j = k6lVar.a(this);
        }
    }

    public static boolean X(szb szbVar, szb szbVar2) {
        if (szbVar2 == null) {
            return false;
        }
        szb szbVar3 = szb.i;
        boolean zEquals = szbVar3.equals(szbVar);
        szb szbVar4 = szb.j;
        return (zEquals || szbVar4.equals(szbVar)) ? szbVar3.equals(szbVar2) || szbVar4.equals(szbVar2) : szbVar.equals(szbVar2);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (navigationHandle.c || navigationHandle.i || !W(b2lVar, false)) {
            return;
        }
        if (((d7l) b2lVar).j.isLoading()) {
            this.l = true;
            return;
        }
        uy3 uy3VarF = uy3.F(b2lVar);
        ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
        if (chromiumContent != null) {
            this.k = true;
            N.M7l2fkee(chromiumContent.n);
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void O(b2l b2lVar, String str, String str2) {
        if (this.k) {
            this.k = false;
            if (W(b2lVar, false)) {
                int iIndexOf = str.indexOf(45);
                szb szbVarH = iIndexOf == -1 ? szb.h(str, (String) null) : szb.h(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
                int iIndexOf2 = str2.indexOf(45);
                szb szbVarH2 = iIndexOf2 == -1 ? szb.h(str2, (String) null) : szb.h(str2.substring(0, iIndexOf2), str2.substring(iIndexOf2 + 1));
                v3m v3mVar = this.d;
                if (v3mVar.h(szbVarH) || v3mVar.h(szbVarH2)) {
                    szb szbVarH3 = ybh.h(v3mVar.a.getApplicationContext());
                    if (szbVarH3 == null || !(X(szbVarH3, szbVarH) || X(szbVarH3, szbVarH2))) {
                        szb szbVarD = v3mVar.d();
                        if (X(szbVarD, szbVarH) || X(szbVarD, szbVarH2)) {
                            return;
                        }
                        Z();
                    }
                }
            }
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        this.k = false;
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        this.k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(defpackage.b2l r4, boolean r5) {
        /*
            r3 = this;
            wt3 r0 = r3.e
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L64
            v3m r0 = r3.d
            android.content.Context r2 = r0.a
            boolean r2 = defpackage.v3m.f(r2)
            if (r2 == 0) goto L64
            boolean r2 = r3.Y()
            if (r2 == 0) goto L64
            com.opera.android.browser.chromium.ChromiumContent r2 = defpackage.uy3.H(r4)
            if (r2 == 0) goto L64
            int r2 = r2.O
            if (r2 <= 0) goto L2a
            return r1
        L2a:
            r2 = 1
            if (r5 != 0) goto L41
            boolean r5 = r0.g()
            if (r5 != 0) goto L64
            com.opera.android.settings.SettingsManager r5 = r3.b
            boolean r0 = r5.h
            if (r0 == 0) goto L3b
            r5 = r2
            goto L3f
        L3b:
            boolean r5 = r5.J()
        L3f:
            if (r5 != 0) goto L64
        L41:
            d7l r4 = (defpackage.d7l) r4
            e7l r4 = r4.j
            java.lang.String r4 = r4.getUrl()
            boolean r4 = defpackage.wqm.w(r4)
            if (r4 != 0) goto L64
            kwf r4 = r3.f
            qwf r5 = defpackage.qwf.e
            boolean r4 = r4.t(r5)
            if (r4 == 0) goto L64
            swf r3 = r3.g
            java.util.HashSet r3 = r3.f
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L64
            return r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4m.W(b2l, boolean):boolean");
    }

    public final boolean Y() {
        Context context = this.a;
        return (ru9.c(context).a.getBoolean("translate_web_pages.tap_to_access_feature_hint.shown", false) || ru9.c(context).a.getBoolean("translate_web_pages.show_ui_from_page_menu.clicked", false)) ? false : true;
    }

    public final void Z() {
        View view;
        if (!this.b.i("feature_tips_notification") || (view = (View) this.i.get()) == null) {
            return;
        }
        ioc iocVar = new ioc((byte) 3, view, this);
        oz3 oz3Var = this.h;
        oz3Var.getClass();
        oz3Var.b(iocVar, ijm.b);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        if (this.l) {
            this.l = false;
            uy3 uy3VarF = uy3.F(b2lVar);
            ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
            if (chromiumContent != null) {
                this.k = true;
                N.M7l2fkee(chromiumContent.n);
            }
        }
    }
}
