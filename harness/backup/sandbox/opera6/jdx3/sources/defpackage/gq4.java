package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class gq4 extends f26 {
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new hq4(this.a, this.b);
    }
}
