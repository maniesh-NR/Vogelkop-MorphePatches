package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ncn extends f3d {
    public final int I;
    public final mcn J;

    public ncn(Context context, mcn mcnVar) {
        this.J = mcnVar;
        this.I = fan.a(24.0f, context.getResources());
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

    public final boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2)) {
            return false;
        }
        this.J.run();
        return true;
    }
}
