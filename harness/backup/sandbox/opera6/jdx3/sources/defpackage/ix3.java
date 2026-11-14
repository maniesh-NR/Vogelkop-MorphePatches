package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class ix3 extends f2c {
    public final int b;

    public ix3() {
        this.b = 0;
    }

    public ix3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.P);
        this.b = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ix3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public ix3(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
    }

    public ix3(FrameLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public ix3(f2c f2cVar) {
        super(f2cVar);
        this.b = 0;
    }

    public ix3(ix3 ix3Var) {
        super((f2c) ix3Var);
        this.b = ix3Var.b;
    }
}
