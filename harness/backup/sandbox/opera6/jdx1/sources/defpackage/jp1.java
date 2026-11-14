package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class jp1 extends Button {
    public final hp1 a;
    public final wq1 b;
    public bpd c;
    public vq1 d;

    public jp1(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        gll.a(getContext(), this);
        hp1 hp1Var = new hp1(this);
        this.a = hp1Var;
        hp1Var.b(attributeSet, i);
        wq1 wq1Var = new wq1(this);
        this.b = wq1Var;
        wq1Var.e(attributeSet, i);
        wq1Var.b();
        bpd bpdVar = this.c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.c = bpdVar;
        }
        bpdVar.K(attributeSet, i);
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

    public final vq1 e() {
        vq1 vq1Var = this.d;
        if (vq1Var != null) {
            return vq1Var;
        }
        vq1 vq1Var2 = new vq1(this, new ip1(this, (byte) 0));
        this.d = vq1Var2;
        return vq1Var2;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return e().e;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return e().c;
    }

    public final void h(boolean z) {
        setPressed(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
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

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.d(i);
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

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return e().a(str);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.f(i, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        vq1 vq1VarE = e();
        vq1VarE.c = typeface;
        vq1VarE.d = typeface;
        vq1VarE.b.accept(typeface);
    }
}
