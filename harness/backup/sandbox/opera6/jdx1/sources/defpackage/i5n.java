package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class i5n {
    public static g3o a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        g3o g3oVarG = g3o.g(null, rootWindowInsets);
        d3o d3oVar = g3oVarG.a;
        d3oVar.y(g3oVarG);
        View rootView = view.getRootView();
        d3oVar.d(rootView);
        d3oVar.p(rootView);
        d3oVar.q();
        return g3oVarG;
    }
}
