package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g5n implements View.OnApplyWindowInsetsListener {
    public g3o a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ bcf c;

    public g5n(View view, bcf bcfVar) {
        this.b = view;
        this.c = bcfVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        g3o g3oVarG = g3o.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        bcf bcfVar = this.c;
        if (i < 30) {
            h5n.a(windowInsets, this.b);
            if (g3oVarG.equals(this.a)) {
                return bcfVar.l0(view, g3oVarG).f();
            }
        }
        this.a = g3oVarG;
        g3o g3oVarL0 = bcfVar.l0(view, g3oVarG);
        if (i >= 30) {
            return g3oVarL0.f();
        }
        WeakHashMap weakHashMap = r5n.a;
        view.requestApplyInsets();
        return g3oVarL0.f();
    }
}
