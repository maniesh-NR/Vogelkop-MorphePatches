package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class unl implements er {
    public final float a;
    public final int b;
    public final int c;

    public unl(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public unl(Context context, int i, int i2) {
        this.b = i;
        this.c = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        (Build.VERSION.SDK_INT >= 30 ? r9n.n(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay()).getMetrics(displayMetrics);
        float f = displayMetrics.density;
        this.a = (f < 1.0f ? 1.0f : f) * 2.0f;
    }

    public final int a(float f, int i) {
        int iB = zed.b(this.c * this.a * f);
        return i > iB ? iB : i;
    }

    public final int b() {
        return this.b;
    }

    public final int c(float f, int i) {
        int iB = zed.b(this.b * this.a * f);
        return i > iB ? iB : i;
    }

    public final int d() {
        return this.c;
    }
}
