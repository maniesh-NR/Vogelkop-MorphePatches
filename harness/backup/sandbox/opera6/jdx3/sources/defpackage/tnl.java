package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class tnl extends w3a {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnl(Drawable drawable, int i) {
        super(drawable, 119, false);
        this.d = i;
    }

    @Override // defpackage.w3a, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // defpackage.w3a, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d;
    }
}
