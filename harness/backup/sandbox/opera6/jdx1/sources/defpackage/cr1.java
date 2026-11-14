package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class cr1 extends ToggleButton {
    public final hp1 a;
    public final wq1 b;
    public bpd c;

    public cr1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        gll.a(getContext(), this);
        hp1 hp1Var = new hp1(this);
        this.a = hp1Var;
        hp1Var.b(attributeSet, R.attr.buttonStyleToggle);
        wq1 wq1Var = new wq1(this);
        this.b = wq1Var;
        wq1Var.e(attributeSet, R.attr.buttonStyleToggle);
        bpd bpdVar = this.c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.c = bpdVar;
        }
        bpdVar.K(attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        bpd bpdVar = this.c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.c = bpdVar;
        }
        bpdVar.Q(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        bpd bpdVar = this.c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.c = bpdVar;
        }
        super.setFilters(bpdVar.z(inputFilterArr));
    }
}
