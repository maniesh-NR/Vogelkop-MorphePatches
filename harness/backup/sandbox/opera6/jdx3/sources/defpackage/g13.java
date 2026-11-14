package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g13 extends w3a {
    public final int d;
    public final int e;

    public g13(Drawable drawable, int i, int i2) {
        super(drawable, 8388661, false);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.w3a, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e;
    }

    @Override // defpackage.w3a, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d;
    }
}
