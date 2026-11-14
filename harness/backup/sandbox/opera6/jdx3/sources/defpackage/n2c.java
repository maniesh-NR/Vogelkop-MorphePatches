package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class n2c implements m2c {
    public final o2c a;

    public n2c() {
        this.a = null;
    }

    public n2c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mhh.c);
        o2c o2cVar = null;
        if (typedArrayObtainStyledAttributes.getIndexCount() == 0) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(8, -5000);
            int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(7, -5000);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            typedArrayObtainStyledAttributes.recycle();
            if (layoutDimension != -5000 || layoutDimension2 != -5000 || z || z2) {
                o2cVar = new o2c();
                o2cVar.a = layoutDimension;
                o2cVar.b = layoutDimension2;
                o2cVar.c = z;
                o2cVar.d = z2;
            }
        }
        this.a = o2cVar;
    }

    public n2c(n2c n2cVar) {
        o2c o2cVar;
        o2c o2cVar2 = n2cVar.a;
        if (o2cVar2 != null) {
            o2cVar = new o2c();
            o2cVar.a = -5000;
            o2cVar.b = -5000;
            o2cVar.a = o2cVar2.a;
            o2cVar.b = o2cVar2.b;
            o2cVar.c = o2cVar2.c;
            o2cVar.d = o2cVar2.d;
        } else {
            o2cVar = null;
        }
        this.a = o2cVar;
    }

    @Override // defpackage.m2c
    public final void a(View view, k2c k2cVar) {
        o2c o2cVar = this.a;
        if (o2cVar == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iA = o2cVar.a(layoutParams2.gravity);
            if (o2cVar.b(layoutParams2) || iA != layoutParams2.gravity) {
                layoutParams2.gravity = iA;
                view.setLayoutParams(layoutParams2);
            }
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            int iA2 = o2cVar.a(layoutParams3.gravity);
            if (o2cVar.b(layoutParams3) || iA2 != layoutParams3.gravity) {
                layoutParams3.gravity = iA2;
                view.setLayoutParams(layoutParams3);
            }
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (o2cVar.b(marginLayoutParams)) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
        o2cVar.a = -5000;
        o2cVar.b = -5000;
    }
}
