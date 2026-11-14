package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes.dex */
public final class xk2 extends Animatable2Compat.AnimationCallback {
    public final Handler a = new Handler(Looper.getMainLooper());

    public final void onAnimationEnd(Drawable drawable) {
        if (drawable instanceof Animatable) {
            this.a.post(new q02(drawable, (byte) 18));
        }
    }
}
