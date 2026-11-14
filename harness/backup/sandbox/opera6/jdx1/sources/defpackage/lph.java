package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public class lph extends ViewGroup.MarginLayoutParams {
    public i a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public lph(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public lph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public lph(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public lph(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public lph(lph lphVar) {
        super((ViewGroup.LayoutParams) lphVar);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
