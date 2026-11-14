package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class lvk extends f3d {
    public final int I;

    public lvk(Context context) {
        this.I = fan.a(48.0f, context.getResources());
    }

    public final int getIntrinsicHeight() {
        return this.I;
    }

    public final int getIntrinsicWidth() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(p2d p2dVar) {
        if (!super.o(p2dVar)) {
            return false;
        }
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return true;
        }
        callback.invalidateDrawable(this);
        return true;
    }
}
