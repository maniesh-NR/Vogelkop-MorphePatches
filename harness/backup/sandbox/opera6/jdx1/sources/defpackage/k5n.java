package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class k5n {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i) {
        view.setImportantForAutofill(i);
    }
}
