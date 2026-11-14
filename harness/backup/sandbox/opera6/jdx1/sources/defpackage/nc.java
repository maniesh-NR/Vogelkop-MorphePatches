package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class nc extends View {
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ nc(Context context) {
        super(context);
    }

    public /* synthetic */ nc(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }
}
