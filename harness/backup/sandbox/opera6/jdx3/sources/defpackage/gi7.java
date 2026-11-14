package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class gi7 extends nv5 {
    public boolean a;
    public final /* synthetic */ hi7 b;

    public gi7(hi7 hi7Var) {
        this.b = hi7Var;
    }

    public static boolean x(View view) {
        if (!(view instanceof di7)) {
            qv5 layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int i = ((FrameLayout.LayoutParams) layoutParams).gravity;
                if ((i & 80) != 80 || (i & 48) == 48) {
                    return false;
                }
            } else if (layoutParams instanceof qv5) {
                int i2 = layoutParams.c;
                if ((i2 & 80) == 80 && (i2 & 48) != 48) {
                }
            }
            if (view.getLayoutParams().height != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(View view, View view2) {
        return x(view2);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.a) {
            return false;
        }
        this.a = true;
        ((View) this.b.e.e).postOnAnimation(new bl6(this, (byte) 27));
        return false;
    }

    public final void i(CoordinatorLayout coordinatorLayout, View view) {
        if (this.a) {
            return;
        }
        this.a = true;
        ((View) this.b.e.e).postOnAnimation(new bl6(this, (byte) 27));
    }
}
