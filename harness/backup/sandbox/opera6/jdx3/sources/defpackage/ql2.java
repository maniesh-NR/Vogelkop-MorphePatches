package defpackage;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.opera.android.widget.UrlFieldEditText;

/* loaded from: classes.dex */
public final class ql2 implements TextWatcher {
    public static final long i;
    public static final DecelerateInterpolator j;
    public final UrlFieldEditText a;
    public final pl2 b;
    public boolean c;
    public ValueAnimator e;
    public int f;
    public final int h;
    public final ml2 d = new ml2(this, (byte) 0);
    public boolean g = true;

    static {
        on7 on7Var = pn7.b;
        i = cs5.x0(120, un7.d);
        j = lf1.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ql2(UrlFieldEditText urlFieldEditText, pl2 pl2Var) {
        this.a = urlFieldEditText;
        this.b = pl2Var;
        ViewGroup.LayoutParams layoutParams = urlFieldEditText.getLayoutParams();
        int i2 = layoutParams != null ? layoutParams.height : 0;
        ViewGroup.LayoutParams layoutParams2 = urlFieldEditText.getLayoutParams();
        urlFieldEditText.measure(View.MeasureSpec.makeMeasureSpec(layoutParams2 != null ? layoutParams2.width : 0, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        int measuredHeight = urlFieldEditText.getMeasuredHeight();
        Layout layout = urlFieldEditText.getLayout();
        this.h = measuredHeight - (layout != null ? layout.getHeight() : 0);
        a();
        urlFieldEditText.addTextChangedListener(this);
        urlFieldEditText.addOnLayoutChangeListener(new z22(this, (byte) 1));
        urlFieldEditText.addOnAttachStateChangeListener(new z61(this, (byte) 1));
    }

    public final void a() {
        if (this.c) {
            return;
        }
        bq1 bq1Var = this.a;
        if (bq1Var.isLaidOut()) {
            b();
        } else {
            this.c = true;
            p37.C(bq1Var, this, new ll2(this, (byte) 0), this.d);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
    public final void b() {
        ?? r0 = this.a;
        if (r0.isLaidOut()) {
            Layout layout = r0.getLayout();
            int height = (layout != null ? layout.getHeight() : 0) + this.h;
            pl2 pl2Var = this.b;
            int iC = djh.c(height, pl2Var.a, pl2Var.b);
            if (!r0.isAttachedToWindow() || this.g) {
                ValueAnimator valueAnimator = this.e;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
                if (layoutParams == null || layoutParams.height == iC) {
                    return;
                }
                layoutParams.height = iC;
                r0.setLayoutParams(layoutParams);
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && iC == this.f) {
                return;
            }
            ValueAnimator valueAnimator3 = this.e;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ViewGroup.LayoutParams layoutParams2 = r0.getLayoutParams();
            if (iC != (layoutParams2 != null ? layoutParams2.height : 0)) {
                r0.y(true);
                this.f = iC;
                ViewGroup.LayoutParams layoutParams3 = r0.getLayoutParams();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams3 != null ? layoutParams3.height : 0, iC);
                valueAnimatorOfInt.setDuration(pn7.f(i));
                valueAnimatorOfInt.setInterpolator(j);
                valueAnimatorOfInt.addUpdateListener(new nl2(this, (byte) 0));
                valueAnimatorOfInt.addListener(new df1(this, (byte) 1));
                valueAnimatorOfInt.start();
                this.e = valueAnimatorOfInt;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
