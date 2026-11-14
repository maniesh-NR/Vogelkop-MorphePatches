package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.browser.BrowserFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jl9 extends x1p {
    public final ArrayList p = new ArrayList();
    public final /* synthetic */ ll9 q;

    public jl9(ll9 ll9Var) {
        this.q = ll9Var;
    }

    public final void J(Fragment fragment) {
        if (fragment instanceof ryl) {
            il9 il9Var = this.q.e;
            if (il9Var.a) {
                return;
            }
            il9Var.a = true;
            vml.c(il9Var);
        }
    }

    public final void K(Fragment fragment) {
        ll9 ll9Var = this.q;
        il9 il9Var = ll9Var.d;
        if (!ll9Var.g.remove(fragment)) {
            if (!this.p.remove(fragment) || (fragment instanceof BrowserFragment)) {
                return;
            }
            int i = ll9Var.h - 1;
            ll9Var.h = i;
            if (i > 0 || il9Var.a) {
                return;
            }
            il9Var.a = true;
            vml.c(il9Var);
            return;
        }
        if (!(fragment instanceof ucl)) {
            il9 il9Var2 = ll9Var.f;
            if (il9Var2.a) {
                return;
            }
            il9Var2.a = true;
            vml.c(il9Var2);
            return;
        }
        int i2 = ll9Var.i - 1;
        ll9Var.i = i2;
        if (i2 <= 0 && !il9Var.a) {
            il9Var.a = true;
            vml.c(il9Var);
        }
    }

    public final void N(Fragment fragment) {
        if (fragment instanceof ryl) {
            this.q.g.add((ryl) fragment);
        }
    }

    public final void P(Fragment fragment) {
        ll9 ll9Var = this.q;
        if (ll9Var.g.contains(fragment)) {
            return;
        }
        ArrayList arrayList = this.p;
        if (arrayList.contains(fragment)) {
            return;
        }
        arrayList.add(fragment);
        if (fragment instanceof BrowserFragment) {
            return;
        }
        ll9Var.h++;
    }
}
