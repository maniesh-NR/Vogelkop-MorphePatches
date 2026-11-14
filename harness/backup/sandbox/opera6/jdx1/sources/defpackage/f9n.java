package defpackage;

import android.view.View;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f9n implements r8n {
    public final void a(View view) {
        if (view instanceof ThemeableLottieAnimationView) {
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
            themeableLottieAnimationView.y();
            Iterator it = themeableLottieAnimationView.d.m(new dvb("**")).iterator();
            while (it.hasNext()) {
                evb evbVar = ((dvb) it.next()).b;
                if (evbVar != null) {
                    if (evbVar instanceof GradientStrokeContent) {
                        j1d j1dVar = (j1d) mzg.h(evbVar, "linearGradientCache");
                        if (j1dVar != null) {
                            j1dVar.b();
                        }
                        j1d j1dVar2 = (j1d) mzg.h(evbVar, "radialGradientCache");
                        if (j1dVar2 != null) {
                            j1dVar2.b();
                        }
                    } else if (evbVar instanceof GradientFillContent) {
                        j1d j1dVar3 = (j1d) mzg.h(evbVar, "linearGradientCache");
                        if (j1dVar3 != null) {
                            j1dVar3.b();
                        }
                        j1d j1dVar4 = (j1d) mzg.h(evbVar, "radialGradientCache");
                        if (j1dVar4 != null) {
                            j1dVar4.b();
                        }
                    }
                }
            }
        }
    }
}
