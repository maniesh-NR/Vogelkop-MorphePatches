package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import com.opera.api.Callback;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class al2 extends ol7 {
    public boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Drawable drawable, Callback callback) {
        if (drawable != 0) {
            if (drawable instanceof Animatable) {
                callback.run((Animatable) drawable);
                return;
            }
            if (drawable != drawable.getCurrent()) {
                b(drawable.getCurrent(), callback);
            }
            if (drawable instanceof DrawableWrapper) {
                b(((DrawableWrapper) drawable).getDrawable(), callback);
                return;
            }
            if (drawable instanceof ol7) {
                b(((ol7) drawable).a, callback);
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    b(layerDrawable.getDrawable(i), callback);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [al2, android.graphics.drawable.Drawable, ol7] */
    public static Drawable c(x05 x05Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        b(x05Var, new ab(atomicBoolean, (byte) 24));
        if (!atomicBoolean.get()) {
            return x05Var;
        }
        ?? al2Var = new al2(new ColorDrawable());
        al2Var.setVisible(false, false);
        al2Var.a(x05Var);
        b(al2Var, new vk2((byte) 2));
        return al2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            b(this, new vk2((byte) 1));
        } else if (visible || z2 || !this.b) {
            b(this, new vk2((byte) 0));
        }
        this.b = true;
        return visible;
    }
}
