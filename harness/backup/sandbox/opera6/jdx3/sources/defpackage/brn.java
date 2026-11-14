package defpackage;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class brn {
    public static final long c;
    public final List a;
    public View b;

    static {
        on7 on7Var = pn7.b;
        c = cs5.x0(100, un7.d);
    }

    public brn(List list) {
        this.a = list;
    }

    public final void a(View view) {
        if (Intrinsics.a(this.b, view)) {
            return;
        }
        this.b = view;
        for (View view2 : this.a) {
            boolean zA = Intrinsics.a(this.b, view2);
            long j = c;
            if (zA) {
                view2.animate().cancel();
                if (view2.getVisibility() != 0 || view2.getAlpha() < 1.0f) {
                    view2.animate().setInterpolator(lf1.d).setStartDelay(pn7.f(j)).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).withStartAction(new ca(view2, (byte) 11)).start();
                }
            } else {
                view2.animate().cancel();
                if (view2.getVisibility() == 0) {
                    view2.animate().setDuration(pn7.f(j)).alpha(0.0f).scaleY(0.0f).scaleX(0.0f).withEndAction(new ca(view2, (byte) 12)).start();
                }
            }
        }
    }
}
