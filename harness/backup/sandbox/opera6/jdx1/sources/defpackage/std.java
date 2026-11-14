package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.View;

/* loaded from: classes.dex */
public final class std extends ff implements ActionProvider.VisibilityListener {
    public wub d;
    public final ActionProvider e;

    public std(vtd vtdVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.e = actionProvider;
    }

    @Override // defpackage.ff
    public final boolean a() {
        return this.e.hasSubMenu();
    }

    @Override // defpackage.ff
    public final boolean b() {
        return this.e.isVisible();
    }

    @Override // defpackage.ff
    public final View c() {
        return this.e.onCreateActionView();
    }

    @Override // defpackage.ff
    public final View d(ptd ptdVar) {
        return this.e.onCreateActionView(ptdVar);
    }

    @Override // defpackage.ff
    public final boolean e() {
        return this.e.onPerformDefaultAction();
    }

    @Override // defpackage.ff
    public final void f(akk akkVar) {
        this.e.onPrepareSubMenu(akkVar);
    }

    @Override // defpackage.ff
    public final boolean g() {
        return this.e.overridesItemVisibility();
    }

    @Override // defpackage.ff
    public final void i(wub wubVar) {
        this.d = wubVar;
        this.e.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        wub wubVar = this.d;
        if (wubVar != null) {
            itd itdVar = ((ptd) wubVar.a).n;
            itdVar.h = true;
            itdVar.p(true);
        }
    }
}
