package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class o92 extends LayerDrawable {
    public final /* synthetic */ byte a = 1;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o92(int i, Drawable[] drawableArr) {
        super(drawableArr);
        this.b = i;
    }

    public o92(Drawable[] drawableArr, int i) {
        super(drawableArr);
        this.b = i;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }
}
