package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class l92 extends LayerDrawable {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l92(Drawable[] drawableArr, byte b2) {
        super(drawableArr);
        this.a = b2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.onLevelChange(i);
        }
    }
}
