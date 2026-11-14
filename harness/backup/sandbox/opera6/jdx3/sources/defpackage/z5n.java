package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.collection.ArrayMap;

/* loaded from: classes.dex */
public final class z5n {
    public static final LinearGradient A;
    public static final LinearGradient B;
    public static final LinearGradient C;
    public static final int[] t = {2130969707};
    public static final int[] u = {2130969704};
    public static final int[] v = {2130969706};
    public static final int[] w = {2130969705};
    public static final int[] x = {2130969703};
    public static final int[] y = {2130969711};
    public static final int[] z = {2130969710};
    public final View a;
    public ColorStateList b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Matrix j = new Matrix();
    public final Paint k;
    public final ArrayMap l;
    public final boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ColorStateList q;
    public ColorStateList r;
    public final boolean s;

    static {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        B = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -1, 16777215, tileMode);
        C = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{1224736768, 452984832, 0}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
    }

    public z5n(View view, Context context, AttributeSet attributeSet) {
        Paint paint = new Paint(1);
        this.k = paint;
        this.l = new ArrayMap(0);
        this.a = view;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.T);
        try {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, ViewConfiguration.get(context).getScaledFadingEdgeLength());
            this.q = typedArrayObtainStyledAttributes.getColorStateList(10);
            this.s = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.r = typedArrayObtainStyledAttributes.getColorStateList(9);
            this.m = typedArrayObtainStyledAttributes.getBoolean(8, false);
            this.n = typedArrayObtainStyledAttributes.getBoolean(7, false);
            view.setVerticalFadingEdgeEnabled(false);
            view.setHorizontalFadingEdgeEnabled(false);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.h = z2;
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.i = z3;
            if (z2 || z3) {
                this.f = fan.a(4.0f, context.getResources());
                this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, fan.a(0.0f, context.getResources()));
            } else if (typedArrayObtainStyledAttributes.hasValue(6)) {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
                this.e = colorStateList;
                this.d = colorStateList;
                this.c = colorStateList;
                this.b = colorStateList;
                this.g = 0;
            } else {
                this.b = typedArrayObtainStyledAttributes.getColorStateList(3);
                this.c = typedArrayObtainStyledAttributes.getColorStateList(5);
                this.d = typedArrayObtainStyledAttributes.getColorStateList(4);
                this.e = typedArrayObtainStyledAttributes.getColorStateList(2);
                this.g = 0;
            }
            typedArrayObtainStyledAttributes.recycle();
            paint.setColor(-1);
            zg zgVar = new zg(view, attributeSet, 0);
            final ff2 ff2VarA = ff2.a(zgVar, y);
            final ff2 ff2VarA2 = ff2.a(zgVar, z);
            final ff2 ff2VarA3 = ff2.a(zgVar, t);
            final ff2 ff2VarA4 = ff2.a(zgVar, u);
            final ff2 ff2VarA5 = ff2.a(zgVar, v);
            final ff2 ff2VarA6 = ff2.a(zgVar, w);
            final ff2 ff2VarA7 = ff2.a(zgVar, x);
            r8n r8nVar = new r8n() { // from class: y5n
                @Override // defpackage.r8n
                public final void a(View view2) throws NumberFormatException {
                    z5n z5nVar = this.a;
                    ff2 ff2Var = ff2VarA;
                    if (ff2Var != null) {
                        z5nVar.q = ff2.f(view2.getContext(), ff2Var.c(view2.getContext()));
                    }
                    ff2 ff2Var2 = ff2VarA2;
                    if (ff2Var2 != null) {
                        z5nVar.r = ff2.f(view2.getContext(), ff2Var2.c(view2.getContext()));
                    }
                    ff2 ff2Var3 = ff2VarA3;
                    if (ff2Var3 != null) {
                        ColorStateList colorStateListF = ff2.f(view2.getContext(), ff2Var3.c(view2.getContext()));
                        z5nVar.e = colorStateListF;
                        z5nVar.d = colorStateListF;
                        z5nVar.c = colorStateListF;
                        z5nVar.b = colorStateListF;
                    }
                    ff2 ff2Var4 = ff2VarA4;
                    if (ff2Var4 != null) {
                        z5nVar.b = ff2.f(view2.getContext(), ff2Var4.c(view2.getContext()));
                    }
                    ff2 ff2Var5 = ff2VarA5;
                    if (ff2Var5 != null) {
                        z5nVar.c = ff2.f(view2.getContext(), ff2Var5.c(view2.getContext()));
                    }
                    ff2 ff2Var6 = ff2VarA6;
                    if (ff2Var6 != null) {
                        z5nVar.d = ff2.f(view2.getContext(), ff2Var6.c(view2.getContext()));
                    }
                    ff2 ff2Var7 = ff2VarA7;
                    if (ff2Var7 != null) {
                        z5nVar.e = ff2.f(view2.getContext(), ff2Var7.c(view2.getContext()));
                    }
                    view2.invalidate();
                }
            };
            dll dllVarS = q9n.s(view);
            if (dllVarS == null) {
                return;
            }
            u8n.b(dllVarS, view, r8nVar);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static int d(ColorStateList colorStateList, int[] iArr) {
        if (colorStateList == null) {
            return 0;
        }
        return colorStateList.getColorForState(iArr, 0);
    }

    public final void a(Canvas canvas, View view, float f, float f2, float f3, float f4) {
        Paint paint;
        LinearGradient linearGradient;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        LinearGradient linearGradient2;
        int i6;
        int i7;
        int[] drawableState = this.a.getDrawableState();
        int iD = d(this.b, drawableState);
        int iD2 = d(this.c, drawableState);
        int iD3 = d(this.d, drawableState);
        int iD4 = d(this.e, drawableState);
        int iD5 = d(this.q, drawableState);
        int iD6 = d(this.r, drawableState);
        int width = view.getWidth();
        int height = view.getHeight();
        int scrollY = view.getScrollY();
        int scrollX = view.getScrollX();
        float fMax = Math.max(0.0f, Math.min(1.0f, this.o ? 1.0f : f2));
        float f5 = this.f;
        int i8 = this.g;
        int iMax = Math.max((int) (fMax * f5), i8);
        int iMax2 = Math.max((int) (Math.max(0.0f, Math.min(1.0f, f4)) * f5), i8);
        int iMax3 = (int) (Math.max(0.0f, Math.min(1.0f, f2)) * f5);
        int iMax4 = (int) (Math.max(0.0f, Math.min(1.0f, this.p ? 1.0f : f4)) * f5);
        int iMax5 = (int) (Math.max(0.0f, Math.min(1.0f, f)) * f5);
        int iMax6 = (int) (Math.max(0.0f, Math.min(1.0f, f3)) * f5);
        boolean z2 = iMax3 > 1 || iMax4 > 1;
        boolean z3 = (this.m && view.canScrollVertically(1) && !view.canScrollVertically(-1)) ? false : true;
        boolean z4 = this.s;
        boolean z5 = ((z2 && z3) || z4) && iD5 != 0 && (f2 == 0.0f || iMax <= 1);
        boolean z6 = z2 && iD6 != 0 && (f4 == 0.0f || iMax2 <= 1);
        boolean z7 = this.h;
        LinearGradient linearGradient3 = B;
        LinearGradient linearGradient4 = C;
        Paint paint2 = this.k;
        if ((!z7 || iMax <= 1 || z5) && !this.o) {
            paint = paint2;
            linearGradient = linearGradient4;
            i = iD;
            i2 = height;
            i3 = scrollX;
            i4 = 1;
            i5 = iMax6;
            linearGradient2 = linearGradient3;
            if (iD2 != 0 && iMax3 > 1) {
                paint.setShader(linearGradient2);
                paint.setColorFilter(c(iD2));
                int iSave = canvas.save();
                canvas.translate(0.0f, scrollY);
                float f6 = iMax3;
                canvas.scale(1.0f, f6);
                canvas.drawRect(0.0f, 0.0f, width, f6, paint);
                canvas.restoreToCount(iSave);
            }
        } else {
            paint2.setShader(linearGradient4);
            paint2.setColorFilter(null);
            int iSave2 = canvas.save();
            canvas.translate(0.0f, scrollY);
            float f7 = iMax;
            canvas.scale(1.0f, f7);
            linearGradient = linearGradient4;
            i = iD;
            i2 = height;
            paint = paint2;
            i4 = 1;
            i3 = scrollX;
            i5 = iMax6;
            linearGradient2 = linearGradient3;
            canvas.drawRect(0.0f, 0.0f, width, f7, paint);
            canvas.restoreToCount(iSave2);
        }
        boolean z8 = this.i;
        Matrix matrix = this.j;
        if (z8 && iMax2 > i4 && !z6) {
            paint.setShader(linearGradient);
            paint.setColorFilter(null);
            int iSave3 = canvas.save();
            canvas.translate(0.0f, scrollY + i2);
            matrix.setScale(1.0f, -iMax2);
            canvas.concat(matrix);
            canvas.drawRect(0.0f, 0.0f, width, iMax2, paint);
            canvas.restoreToCount(iSave3);
        } else if (iD4 != 0 && iMax4 > i4) {
            paint.setShader(linearGradient2);
            paint.setColorFilter(c(iD4));
            int iSave4 = canvas.save();
            canvas.translate(0.0f, scrollY + i2);
            matrix.setScale(1.0f, -iMax4);
            canvas.concat(matrix);
            canvas.drawRect(0.0f, 0.0f, width, iMax4, paint);
            canvas.restoreToCount(iSave4);
        }
        LinearGradient linearGradient5 = A;
        if (i == 0 || iMax5 <= 0) {
            i6 = i2;
            i7 = i3;
        } else {
            paint.setShader(linearGradient5);
            paint.setColorFilter(c(i));
            int iSave5 = canvas.save();
            i7 = i3;
            canvas.translate(i7, 0.0f);
            float f8 = iMax5;
            canvas.scale(f8, 1.0f);
            i6 = i2;
            canvas.drawRect(0.0f, 0.0f, f8, i6, paint);
            canvas.restoreToCount(iSave5);
        }
        if (iD3 != 0 && i5 > 0) {
            paint.setShader(linearGradient5);
            paint.setColorFilter(c(iD3));
            int iSave6 = canvas.save();
            canvas.translate(i7 + width, 0.0f);
            matrix.setScale(-r2, 1.0f);
            canvas.concat(matrix);
            canvas.drawRect(0.0f, 0.0f, i5, i6, paint);
            canvas.restoreToCount(iSave6);
        }
        int iA = fan.a(1.0f, view.getResources());
        if ((z2 && z3) || z4) {
            vj6.a(i7, scrollY, i7 + width, scrollY + iA, canvas, iD5);
        }
        if (z2) {
            if (this.p || !this.n || !view.canScrollVertically(-1) || view.canScrollVertically(i4)) {
                vj6.a(i7, r15 - iA, i7 + width, scrollY + i6, canvas, iD6);
            }
        }
    }

    public final float b(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() == 0) {
            return 0.0f;
        }
        int bottom = (frameLayout.getChildAt(0).getBottom() - frameLayout.getScrollY()) - (frameLayout.getHeight() - frameLayout.getPaddingBottom());
        int i = this.f;
        if (bottom < i) {
            return bottom / i;
        }
        return 1.0f;
    }

    public final PorterDuffColorFilter c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayMap arrayMap = this.l;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) arrayMap.get(numValueOf);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
        arrayMap.put(Integer.valueOf(i), porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    public final void e(boolean z2) {
        if (z2 == this.p) {
            return;
        }
        this.p = z2;
        this.a.invalidate();
    }

    public final void f(boolean z2) {
        if (z2 == this.o) {
            return;
        }
        this.o = z2;
        this.a.invalidate();
    }
}
