package defpackage;

import android.view.View;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class atj {
    public final View a;
    public final pde b = new pde(v08.a);
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();

    public atj(View view) {
        this.a = view;
    }

    public static final void a(View view) {
        z61 z61Var = new z61();
        if (view.isAttachedToWindow()) {
            z61Var.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(z61Var);
    }

    public final void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (View view : this.c) {
            View view2 = view;
            while (true) {
                if (this.d.contains(view2)) {
                    view = null;
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
                if (view2 == null) {
                    break;
                }
            }
            if (view != null) {
                linkedHashSet.add(view);
            }
        }
        xf8.F0(this.b, linkedHashSet);
    }
}
