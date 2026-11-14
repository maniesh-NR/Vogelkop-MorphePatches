package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public class fq1 extends RadioButton {
    public final np1 a;
    public final hp1 b;
    public final wq1 c;
    public bpd d;

    public fq1(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, 2130970615);
        gll.a(getContext(), this);
        np1 np1Var = new np1(this);
        this.a = np1Var;
        np1Var.b(attributeSet, 2130970615);
        hp1 hp1Var = new hp1(this);
        this.b = hp1Var;
        hp1Var.b(attributeSet, 2130970615);
        wq1 wq1Var = new wq1(this);
        this.c = wq1Var;
        wq1Var.e(attributeSet, 2130970615);
        bpd bpdVar = this.d;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.d = bpdVar;
        }
        bpdVar.K(attributeSet, 2130970615);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.a();
        }
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        bpd bpdVar = this.d;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.d = bpdVar;
        }
        bpdVar.Q(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.b;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(sgb.F(i, getContext()));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        np1 np1Var = this.a;
        if (np1Var != null) {
            if (np1Var.c) {
                np1Var.c = false;
            } else {
                np1Var.c = true;
                np1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.c;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        bpd bpdVar = this.d;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.d = bpdVar;
        }
        super.setFilters(bpdVar.z(inputFilterArr));
    }
}
