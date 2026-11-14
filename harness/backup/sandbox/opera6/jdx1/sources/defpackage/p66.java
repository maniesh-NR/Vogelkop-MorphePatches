package defpackage;

import android.view.Gravity;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class p66 extends eq1 {
    public final l56 a;

    public p66(l56 l56Var, dkf dkfVar, int i) {
        super(dkfVar, null, i, 0);
        this.a = l56Var;
    }

    public final boolean a(View view) {
        WindowManager.LayoutParams layoutParams;
        if (isClippingEnabled()) {
            return false;
        }
        int iL = cs5.L(view);
        l56 l56Var = this.a;
        l56Var.getClass();
        Object objH = mzg.h(l56Var, "mDropDownGravity");
        if ((Gravity.getAbsoluteGravity(((Integer) (objH != null ? objH : 0)).intValue(), iL) & 7) != 5) {
            return false;
        }
        ViewParent parent = getContentView().getParent();
        while (true) {
            if (!(parent instanceof View)) {
                layoutParams = null;
                break;
            }
            View view2 = (View) parent;
            if (view2.getLayoutParams() instanceof WindowManager.LayoutParams) {
                layoutParams = (WindowManager.LayoutParams) view2.getLayoutParams();
                break;
            }
            parent = parent.getParent();
        }
        if (layoutParams == null) {
            return false;
        }
        return (getWidth() + layoutParams.x) - view.getRootView().getWidth() > 0;
    }

    @Override // android.widget.PopupWindow
    public final int getMaxAvailableHeight(View view) {
        return getMaxAvailableHeight(view, 0);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        if (a(view)) {
            super.update(view, view.getWidth() + (i - getWidth()), i2, getWidth(), getHeight());
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        if (a(view)) {
            super.update(view, view.getWidth() + (i - getWidth()), i2, getWidth(), getHeight());
        }
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        if (a(view)) {
            super.update(view, view.getWidth() + (-getWidth()), 0, getWidth(), getHeight());
        }
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        if (a(view)) {
            super.update(view, (i - getWidth()) + view.getWidth(), i2, getWidth(), getHeight());
        }
    }
}
