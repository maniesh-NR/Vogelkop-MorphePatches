package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public abstract class vm9 {
    public static final um9 a = um9.b;

    public static um9 a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(gan ganVar) {
        if (w.N(3)) {
            ganVar.a.getClass();
        }
    }

    public static final void c(Fragment fragment, String str) {
        b(new nm9(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).a.getClass();
    }
}
