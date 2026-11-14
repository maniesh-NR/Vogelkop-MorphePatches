package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class i2c extends RelativeLayout.LayoutParams implements m2c {
    public final n2c a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public i2c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new n2c(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mhh.d);
        this.b = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.c = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.f = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.g = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.m2c
    public final void a(View view, k2c k2cVar) {
        this.a.a(view, k2cVar);
        k2cVar.b().c();
        int i = this.c;
        int i2 = this.b;
        if (i2 != 0 || i != 0) {
            addRule(18, i2);
            addRule(19, i);
        }
        boolean z = this.e;
        boolean z2 = this.d;
        if (z2 || z) {
            addRule(20, z2 ? -1 : 0);
            addRule(21, z ? -1 : 0);
        }
        int i3 = this.g;
        int i4 = this.f;
        if (i4 != 0 || i3 != 0) {
            addRule(16, i4);
            addRule(17, i3);
        }
        view.setLayoutParams(this);
    }
}
