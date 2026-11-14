package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.i8i;
import defpackage.j8i;
import defpackage.pad;
import defpackage.rhh;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public final boolean a;
    public final boolean b;
    public final Rect c;
    public final Rect d;
    public final pad e;

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 2130968933);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        pad padVar = new pad((Object) this, (byte) 8);
        this.e = padVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhh.a, i, 2132083106);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(2131099872) : getResources().getColor(2131099871));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.a = z;
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.b = z2;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        i8i i8iVar = new i8i(colorStateListValueOf, dimension);
        padVar.b = i8iVar;
        setBackgroundDrawable(i8iVar);
        setClipToOutline(true);
        setElevation(dimension2);
        i8i i8iVar2 = (i8i) padVar.b;
        if (dimension3 != i8iVar2.e || i8iVar2.f != z || i8iVar2.g != z2) {
            i8iVar2.e = dimension3;
            i8iVar2.f = z;
            i8iVar2.g = z2;
            i8iVar2.b(null);
            i8iVar2.invalidateSelf();
        }
        if (!z) {
            padVar.w(0, 0, 0, 0);
            return;
        }
        i8i i8iVar3 = (i8i) padVar.b;
        float f2 = i8iVar3.e;
        float f3 = i8iVar3.a;
        int i2 = j8i.a;
        int iCeil = (int) Math.ceil(z2 ? (float) ((0.2928932188134524d * f3) + f2) : f2);
        int iCeil2 = (int) Math.ceil(j8i.a(f2, f3, z2));
        padVar.w(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void b(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        i8i i8iVar = (i8i) this.e.b;
        if (colorStateListValueOf == null) {
            i8iVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        i8iVar.h = colorStateListValueOf;
        i8iVar.b.setColor(colorStateListValueOf.getColorForState(i8iVar.getState(), i8iVar.h.getDefaultColor()));
        i8iVar.invalidateSelf();
    }

    public void c(ColorStateList colorStateList) {
        i8i i8iVar = (i8i) this.e.b;
        i8iVar.h = colorStateList;
        i8iVar.b.setColor(colorStateList.getColorForState(i8iVar.getState(), i8iVar.h.getDefaultColor()));
        i8iVar.invalidateSelf();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
