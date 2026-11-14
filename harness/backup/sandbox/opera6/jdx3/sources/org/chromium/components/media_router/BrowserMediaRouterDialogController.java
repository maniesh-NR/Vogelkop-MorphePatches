package org.chromium.components.media_router;

import J.N;
import androidx.fragment.app.i;
import defpackage.and;
import defpackage.k73;
import defpackage.qmd;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class BrowserMediaRouterDialogController {
    public final long a;
    public k73 b;
    public final WebContents c;

    public BrowserMediaRouterDialogController(long j, WebContents webContents) {
        this.a = j;
        this.c = webContents;
    }

    public static BrowserMediaRouterDialogController create(long j, WebContents webContents) {
        return new BrowserMediaRouterDialogController(j, webContents);
    }

    public final void a() {
        if (this.b == null) {
            return;
        }
        this.b = null;
        N.MsJMWxq0(this.a);
    }

    public final void closeDialog() {
        k73 k73Var = this.b;
        if (k73Var == null) {
            return;
        }
        i iVar = (i) k73Var.f;
        if (iVar != null) {
            iVar.dismiss();
            k73Var.f = null;
        }
        this.b = null;
    }

    public final boolean isShowingDialog() {
        i iVar;
        k73 k73Var = this.b;
        return (k73Var == null || (iVar = (i) k73Var.f) == null || !iVar.isVisible()) ? false : true;
    }

    public final void openRouteChooserDialog(String[] strArr) {
        if (isShowingDialog()) {
            return;
        }
        auh auhVarD = null;
        for (String str : strArr) {
            auh auhVarE = fo4.e(str);
            auhVarD = auhVarE == null ? auh.d(str) : auhVarE;
            if (auhVarD != null) {
                break;
            }
        }
        vnd vndVarA = auhVarD != null ? auhVarD.a() : null;
        if (vndVarA == null) {
            N.MY1J7b0i(this.a);
            return;
        }
        qmd qmdVar = new qmd(auhVarD.b(), vndVarA, this);
        this.b = qmdVar;
        qmdVar.p();
    }

    public final void openRouteControllerDialog(String str, String str2) {
        if (isShowingDialog()) {
            return;
        }
        auh auhVarE = fo4.e(str);
        if (auhVarE == null) {
            auhVarE = auh.d(str);
        }
        vnd vndVarA = auhVarE == null ? null : auhVarE.a();
        if (vndVarA == null) {
            N.MY1J7b0i(this.a);
            return;
        }
        and andVar = new and(auhVarE.b(), vndVarA, str2, this);
        this.b = andVar;
        andVar.p();
    }
}
