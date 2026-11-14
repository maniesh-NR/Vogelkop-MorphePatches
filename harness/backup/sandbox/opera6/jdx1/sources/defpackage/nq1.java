package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.ListPopupWindow;

/* loaded from: classes.dex */
public final class nq1 extends ListPopupWindow implements pq1 {
    public CharSequence C;
    public ListAdapter D;
    public final Rect E;
    public int F;
    public final /* synthetic */ qq1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq1(qq1 qq1Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130970808, 0);
        this.G = qq1Var;
        this.E = new Rect();
        this.q = qq1Var;
        q(true);
        this.o = false;
        this.r = new lq1(this, (byte) 0);
    }

    @Override // defpackage.pq1
    public final CharSequence d() {
        return this.C;
    }

    @Override // defpackage.pq1
    public final void f(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // defpackage.pq1
    public final void h(int i) {
        this.F = i;
    }

    @Override // defpackage.pq1
    public final void i(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zIsShowing = this.B.isShowing();
        r();
        byte b = 2;
        this.B.setInputMethodMode(2);
        show();
        im7 im7Var = this.c;
        im7Var.setChoiceMode(1);
        im7Var.setTextDirection(i);
        im7Var.setTextAlignment(i2);
        qq1 qq1Var = this.G;
        int selectedItemPosition = qq1Var.getSelectedItemPosition();
        im7 im7Var2 = this.c;
        if (this.B.isShowing() && im7Var2 != null) {
            im7Var2.h = false;
            im7Var2.setSelection(selectedItemPosition);
            if (im7Var2.getChoiceMode() != 0) {
                im7Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = qq1Var.getViewTreeObserver()) == null) {
            return;
        }
        dh dhVar = new dh(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(dhVar);
        this.B.setOnDismissListener(new mq1(this, dhVar));
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, defpackage.pq1
    public final void k(ListAdapter listAdapter) {
        super.k(listAdapter);
        this.D = listAdapter;
    }

    public final void r() {
        int i;
        Drawable background = this.B.getBackground();
        qq1 qq1Var = this.G;
        Rect rect = qq1Var.h;
        if (background != null) {
            background.getPadding(rect);
            i = qq1Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = qq1Var.getPaddingLeft();
        int paddingRight = qq1Var.getPaddingRight();
        int width = qq1Var.getWidth();
        int i2 = qq1Var.g;
        if (i2 == -2) {
            int iA = qq1Var.a((SpinnerAdapter) this.D, this.B.getBackground());
            int i3 = (qq1Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            o(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            o((width - paddingLeft) - paddingRight);
        } else {
            o(i2);
        }
        this.f = qq1Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
