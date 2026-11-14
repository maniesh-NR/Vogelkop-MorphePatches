package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qq1 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final hp1 a;
    public final Context b;
    public final iq1 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final pq1 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qq1(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130970808(0x7f0408b8, float:1.7550337E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            defpackage.gll.a(r1, r12)
            r1 = 0
            int[] r2 = defpackage.zhh.w
            ghf r3 = ghf.H(r0, r1, r13, r14, r2)
            java.lang.Object r4 = r3.c
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            hp1 r5 = new hp1
            r5.<init>(r12)
            r12.a = r5
            r5 = 5
            int r5 = r4.getResourceId(r5, r1)
            if (r5 == 0) goto L35
            ft5 r6 = new ft5
            r6.<init>(r13, r5)
            r12.b = r6
            goto L37
        L35:
            r12.b = r13
        L37:
            r5 = -1
            r6 = 0
            int[] r7 = defpackage.qq1.i     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L54
            boolean r8 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L55
            if (r8 == 0) goto L57
            int r5 = r7.getInt(r1, r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L55
            goto L57
        L4a:
            r12 = move-exception
            r6 = r7
            goto L4e
        L4d:
            r12 = move-exception
        L4e:
            if (r6 == 0) goto L53
            r6.recycle()
        L53:
            throw r12
        L54:
            r7 = r6
        L55:
            if (r7 == 0) goto L5a
        L57:
            r7.recycle()
        L5a:
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L93
            if (r5 != r8) goto La0
            nq1 r5 = new nq1
            android.content.Context r9 = r12.b
            r5.<init>(r12, r9, r14)
            android.content.Context r9 = r12.b
            ghf r2 = ghf.H(r0, r1, r9, r14, r2)
            java.lang.Object r9 = r2.c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.g = r9
            android.graphics.drawable.Drawable r9 = r2.t(r8)
            r5.m(r9)
            java.lang.String r7 = r4.getString(r7)
            r5.C = r7
            r2.J()
            r12.f = r5
            iq1 r2 = new iq1
            r2.<init>(r12, r12, r5)
            r12.c = r2
            goto La0
        L93:
            jq1 r2 = new jq1
            r2.<init>(r12)
            r12.f = r2
            java.lang.String r5 = r4.getString(r7)
            r2.c = r5
        La0:
            java.lang.CharSequence[] r1 = r4.getTextArray(r1)
            if (r1 == 0) goto Lb7
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r13, r4, r1)
            r13 = 2131559396(0x7f0d03e4, float:1.8744135E38)
            r2.setDropDownViewResource(r13)
            r12.setAdapter(r2)
        Lb7:
            r3.J()
            r12.e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto Lc5
            r12.setAdapter(r13)
            r12.d = r6
        Lc5:
            hp1 r12 = r12.a
            r12.b(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq1.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        pq1 pq1Var = this.f;
        return pq1Var != null ? pq1Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        pq1 pq1Var = this.f;
        return pq1Var != null ? pq1Var.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        pq1 pq1Var = this.f;
        return pq1Var != null ? pq1Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        pq1 pq1Var = this.f;
        return pq1Var != null ? pq1Var.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pq1 pq1Var = this.f;
        if (pq1Var == null || !pq1Var.a()) {
            return;
        }
        pq1Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        oq1 oq1Var = (oq1) parcelable;
        super.onRestoreInstanceState(oq1Var.getSuperState());
        if (!oq1Var.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new dh(this, (byte) 1));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        oq1 oq1Var = new oq1(super.onSaveInstanceState());
        pq1 pq1Var = this.f;
        oq1Var.a = pq1Var != null && pq1Var.a();
        return oq1Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iq1 iq1Var = this.c;
        if (iq1Var == null || !iq1Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        pq1 pq1Var = this.f;
        if (pq1Var == null) {
            return super.performClick();
        }
        if (pq1Var.a()) {
            return true;
        }
        pq1Var.i(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        pq1 pq1Var = this.f;
        if (pq1Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            kq1 kq1Var = new kq1();
            kq1Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                kq1Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            pq1Var.k(kq1Var);
        }
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
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i2) {
        pq1 pq1Var = this.f;
        if (pq1Var == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            pq1Var.h(i2);
            pq1Var.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i2) {
        pq1 pq1Var = this.f;
        if (pq1Var != null) {
            pq1Var.g(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        pq1 pq1Var = this.f;
        if (pq1Var != null) {
            pq1Var.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(sgb.F(i2, this.b));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        pq1 pq1Var = this.f;
        if (pq1Var != null) {
            pq1Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
