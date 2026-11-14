package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class lf1 {
    public static final AccelerateDecelerateInterpolator a = new AccelerateDecelerateInterpolator();
    public static final AccelerateInterpolator b = new AccelerateInterpolator();
    public static final DecelerateInterpolator c = new DecelerateInterpolator();
    public static final DecelerateInterpolator d = new DecelerateInterpolator(1.5f);
    public static final DecelerateInterpolator e = new DecelerateInterpolator(2.5f);
    public static final LinearInterpolator f = new LinearInterpolator();
    public static final PathInterpolator g = new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f);
    public static final PathInterpolator h = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public static final PathInterpolator i = new PathInterpolator(0.65f, 0.0f, 1.0f, 1.0f);
    public static final PathInterpolator j = new PathInterpolator(0.33f, 0.0f, 1.0f, 1.0f);
    public static final PathInterpolator k = new PathInterpolator(0.0f, 0.0f, 0.67f, 1.0f);
    public static final PathInterpolator l = new PathInterpolator(0.0f, 0.0f, 0.35f, 1.0f);
    public static final PathInterpolator m = new PathInterpolator(0.33f, 0.0f, 0.35f, 1.0f);
    public static final fci n;

    static {
        fci fciVar = new fci();
        fciVar.a = 0.7f;
        n = fciVar;
    }
}
