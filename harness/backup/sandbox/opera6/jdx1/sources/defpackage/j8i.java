package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class j8i extends Drawable {
    public static final /* synthetic */ int a = 0;

    public static float a(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        if (!z) {
            return f3;
        }
        return (float) ((0.2928932188134524d * f2) + f3);
    }
}
