package com.opera.android.graphics;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.bp;
import defpackage.lhh;
import defpackage.o8f;
import defpackage.wkf;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/opera/android/graphics/OperaGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Lwkf;", "mConstantState", "<init>", "(Lwkf;)V", "()V", "graphics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaGradientDrawable extends Drawable {
    public wkf a;
    public final Paint b;
    public o8f c;
    public boolean d;
    public int e;
    public int f;

    public OperaGradientDrawable() {
        this(new wkf());
    }

    private OperaGradientDrawable(wkf wkfVar) {
        this.a = wkfVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(this.a.b);
        paint.setStyle(this.a.b == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
        a();
    }

    public /* synthetic */ OperaGradientDrawable(wkf wkfVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(wkfVar);
    }

    public final boolean a() {
        boolean z;
        boolean z2 = false;
        int colorForState = ((ColorStateList) this.a.d.b).getColorForState(getState(), 0);
        if (colorForState == this.e) {
            z = false;
        } else {
            this.e = colorForState;
            z = true;
        }
        int colorForState2 = ((ColorStateList) this.a.e.b).getColorForState(getState(), 0);
        if (colorForState2 != this.f) {
            this.f = colorForState2;
            z2 = true;
        }
        return z | z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        boolean z;
        super.applyTheme(theme);
        bp bpVar = this.a.d;
        int i = bpVar.a;
        boolean z2 = true;
        if (i == 0) {
            z = false;
        } else {
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
            bpVar.b = typedArrayObtainStyledAttributes.getColorStateList(0);
            typedArrayObtainStyledAttributes.recycle();
            z = true;
        }
        bp bpVar2 = this.a.e;
        int i2 = bpVar2.a;
        if (i2 == 0) {
            z2 = false;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(new int[]{i2});
            bpVar2.b = typedArrayObtainStyledAttributes2.getColorStateList(0);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if ((z || z2) && a() && !getBounds().isEmpty()) {
            b();
        }
    }

    public final void b() {
        Rect bounds = getBounds();
        Rect rectW = zi4.w(bounds.width(), bounds.height(), this.a.c);
        LinearGradient linearGradient = new LinearGradient(rectW.left, rectW.top, rectW.right, rectW.bottom, this.e, this.f, Shader.TileMode.CLAMP);
        this.b.setShader(linearGradient);
        o8f o8fVar = this.c;
        if (o8fVar != null) {
            o8fVar.run(linearGradient);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        if (super.canApplyTheme()) {
            return true;
        }
        wkf wkfVar = this.a;
        return (wkfVar.d.a == 0 && wkfVar.e.a == 0) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = r1.b / 2.0f;
        float f2 = bounds.left + f;
        float f3 = bounds.top + f;
        float f4 = bounds.right - f;
        float f5 = bounds.bottom - f;
        int i = this.a.a;
        canvas.drawRoundRect(f2, f3, f4, f5, i - f, i - f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(getBounds(), this.a.a);
        outline.setAlpha(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = lhh.a;
        if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        wkf wkfVar = this.a;
        wkfVar.c = typedArrayObtainAttributes.getInteger(1, 0);
        wkfVar.a = typedArrayObtainAttributes.getDimensionPixelSize(0, 0);
        wkfVar.b = typedArrayObtainAttributes.getDimensionPixelSize(4, 0);
        bp bpVar = wkfVar.d;
        TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(3);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 2) {
                bpVar.a = typedValuePeekValue.data;
            } else {
                bpVar.b = typedArrayObtainAttributes.getColorStateList(3);
            }
        }
        bp bpVar2 = wkfVar.e;
        TypedValue typedValuePeekValue2 = typedArrayObtainAttributes.peekValue(2);
        if (typedValuePeekValue2 != null) {
            if (typedValuePeekValue2.type == 2) {
                bpVar2.a = typedValuePeekValue2.data;
            } else {
                bpVar2.b = typedArrayObtainAttributes.getColorStateList(2);
            }
        }
        typedArrayObtainAttributes.recycle();
        float f = this.a.b;
        Paint paint = this.b;
        paint.setStrokeWidth(f);
        paint.setStyle(this.a.b == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return ((ColorStateList) this.a.d.b).isStateful() || ((ColorStateList) this.a.e.b).isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.d && super.mutate() == this) {
            this.d = true;
            this.a = new wkf(this.a);
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (!a()) {
            return false;
        }
        b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
