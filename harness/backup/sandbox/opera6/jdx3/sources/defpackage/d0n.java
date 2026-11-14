package defpackage;

import android.view.animation.Animation;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final class d0n {
    public static final PathInterpolator j = new PathInterpolator(0.2f, 0.14f, 0.01f, 1.0f);
    public final e0n a;
    public final int b;
    public final String c;
    public final ThemeableLottieAnimationView d;
    public final TextView e;
    public final OperaProgressIndicator f;
    public boolean g;
    public final pde h = new pde(Float.valueOf(0.0f));
    public final nl2 i = new nl2(this, (byte) 18);

    public d0n(e0n e0nVar, int i, String str, ThemeableLottieAnimationView themeableLottieAnimationView, TextView textView, OperaProgressIndicator operaProgressIndicator) {
        this.a = e0nVar;
        this.b = i;
        this.c = str;
        this.d = themeableLottieAnimationView;
        this.e = textView;
        this.f = operaProgressIndicator;
    }

    public final void a(float f) {
        Animation animation;
        pde pdeVar = this.h;
        if (f != ((Number) pdeVar.g()).floatValue()) {
            pdeVar.r(Float.valueOf(f));
            this.f.r(f);
            if ((f == 0.0f || f == 1.0f) && (animation = this.e.getAnimation()) != null) {
                animation.cancel();
            }
        }
    }
}
