package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class dq1 extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final hp1 a;
    public final wq1 b;
    public final pad c;

    public dq1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 2130968708);
        gll.a(getContext(), this);
        ghf ghfVarH = ghf.H(2130968708, 0, getContext(), attributeSet, d);
        if (((TypedArray) ghfVarH.c).hasValue(0)) {
            setDropDownBackgroundDrawable(ghfVarH.t(0));
        }
        ghfVarH.J();
        hp1 hp1Var = new hp1(this);
        this.a = hp1Var;
        hp1Var.b(attributeSet, 2130968708);
        wq1 wq1Var = new wq1(this);
        this.b = wq1Var;
        wq1Var.e(attributeSet, 2130968708);
        wq1Var.b();
        pad padVar = new pad(this);
        this.c = padVar;
        padVar.o(attributeSet, 2130968708);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerI = padVar.i(keyListener);
        if (keyListenerI != keyListener) {
            super.setKeyListener(keyListenerI);
            setRawInputType(inputType);
            setFocusable(zIsFocusable);
            setClickable(zIsClickable);
            setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.a();
        }
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c09.x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.q(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(sgb.F(i, getContext()));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.i(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.f(i, context);
        }
    }
}
