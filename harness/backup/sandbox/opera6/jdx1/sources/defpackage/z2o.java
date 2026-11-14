package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class z2o extends y2o {
    public static final g3o w = g3o.g(null, sjn.g());

    public z2o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
    }

    public z2o(g3o g3oVar, z2o z2oVar) {
        super(g3oVar, z2oVar);
    }

    @Override // defpackage.v2o, defpackage.d3o
    public final void d(View view) {
    }

    @Override // defpackage.v2o, defpackage.d3o
    public r9b i(int i) {
        return r9b.d(this.c.getInsets(e3o.a(i)));
    }

    @Override // defpackage.v2o, defpackage.d3o
    public r9b j(int i) {
        return r9b.d(this.c.getInsetsIgnoringVisibility(e3o.a(i)));
    }

    @Override // defpackage.v2o, defpackage.d3o
    public boolean u(int i) {
        return this.c.isVisible(e3o.a(i));
    }
}
