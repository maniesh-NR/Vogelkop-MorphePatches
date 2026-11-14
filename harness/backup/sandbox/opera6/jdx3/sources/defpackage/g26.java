package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g26 extends f26 {
    public final float e;

    public g26(Bitmap bitmap, int i, float f, float f2, float f3) {
        super(bitmap, i, f, f2);
        this.e = f3;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new hq4(this.a, this.b, this.c, this.d, this.e);
    }
}
