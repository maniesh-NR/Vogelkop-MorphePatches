package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class yq1 extends TextView {
    public final hp1 a;
    public final wq1 b;
    public bpd c;
    public boolean d;
    public esg e;
    public zog f;
    public vq1 g;

    public yq1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public yq1(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.d = false;
        this.e = null;
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
    public void drawableStateChanged() {
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
    public final int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return q().e;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        p();
        return super.getText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return q().c;
    }

    public final void h(boolean z) {
        setSelected(z);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            sfe.B0(editorInfo, getText());
        }
        c09.x(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        p();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    public final void p() {
        zog zogVar = this.f;
        if (zogVar != null) {
            try {
                this.f = null;
                Spannable spannable = ((apg) zogVar.get()).a;
                setText(spannable instanceof PrecomputedText ? (PrecomputedText) spannable : null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public final vq1 q() {
        vq1 vq1Var = this.g;
        if (vq1Var != null) {
            return vq1Var;
        }
        vq1 vq1Var2 = new vq1(this, new ip1(this, (byte) 2));
        this.g = vq1Var2;
        return vq1Var2;
    }

    public final esg r() {
        esg esgVar = this.e;
        if (esgVar != null) {
            return esgVar;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            xq1 xq1Var = new xq1(this);
            this.e = xq1Var;
            return xq1Var;
        }
        esg esgVar2 = new esg(this);
        this.e = esgVar2;
        return esgVar2;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        bpd bpdVar = this.c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            this.c = bpdVar;
        }
        bpdVar.Q(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? sgb.F(i, context) : null, i2 != 0 ? sgb.F(i2, context) : null, i3 != 0 ? sgb.F(i3, context) : null, i4 != 0 ? sgb.F(i4, context) : null);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? sgb.F(i, context) : null, i2 != 0 ? sgb.F(i2, context) : null, i3 != 0 ? sgb.F(i3, context) : null, i4 != 0 ? sgb.F(i4, context) : null);
        wq1 wq1Var = this.b;
        if (wq1Var != null) {
            wq1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return q().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        xih.s(this, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            r().E(i, f);
        } else if (i2 >= 34) {
            tkl.e(this, i, f);
        } else {
            xih.s(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
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
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        vq1 vq1VarQ = q();
        vq1VarQ.c = typeface;
        vq1VarQ.d = typeface;
        vq1VarQ.b.accept(typeface);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.d) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            drj drjVar = ham.a;
            if (context == null) {
                qp2.o("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.d = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.d = false;
        }
    }
}
