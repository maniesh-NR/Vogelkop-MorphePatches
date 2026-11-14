package defpackage;

import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class l56 extends ListPopupWindow {
    public final int C;

    public l56(dkf dkfVar, int i) {
        super(dkfVar, null, i, 0);
        this.C = i;
        p66 p66Var = new p66(this, dkfVar, i);
        this.B = p66Var;
        p66Var.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, defpackage.gij
    public final void show() {
        Object objH = mzg.h(this, "sSetClipToWindowEnabledMethod");
        if (!this.B.isClippingEnabled()) {
            mzg.p(this, (Object) null, "sSetClipToWindowEnabledMethod");
        }
        super.show();
        if (this.B.getBackground() != null) {
            new wq2(this.B, this.C);
        }
        if (this.B.isClippingEnabled()) {
            return;
        }
        mzg.p(this, objH, "sSetClipToWindowEnabledMethod");
    }
}
