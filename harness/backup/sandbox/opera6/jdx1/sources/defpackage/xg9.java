package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class xg9 extends b8e implements jg9 {
    @Override // defpackage.jg9
    public final void p(hg9 hg9Var) {
        View viewY = qbe.y(this);
        hg9Var.a(this.a.n && qbe.y(this).hasFocusable());
        View viewFindFocus = viewY.findFocus();
        if (viewFindFocus != null) {
            hg9Var.b(ag9.a(viewFindFocus, viewY));
        }
    }
}
