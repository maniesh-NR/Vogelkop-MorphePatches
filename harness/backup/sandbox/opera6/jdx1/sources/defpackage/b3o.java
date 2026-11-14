package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class b3o extends a3o {
    public static final g3o x = g3o.g(null, sjn.g());

    public b3o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
    }

    public b3o(g3o g3oVar, b3o b3oVar) {
        super(g3oVar, b3oVar);
    }

    @Override // defpackage.z2o, defpackage.v2o, defpackage.d3o
    public r9b i(int i) {
        return r9b.d(this.c.getInsets(f3o.a(i)));
    }

    @Override // defpackage.z2o, defpackage.v2o, defpackage.d3o
    public r9b j(int i) {
        return r9b.d(this.c.getInsetsIgnoringVisibility(f3o.a(i)));
    }

    @Override // defpackage.v2o, defpackage.d3o
    public void p(View view) {
    }

    @Override // defpackage.z2o, defpackage.v2o, defpackage.d3o
    public boolean u(int i) {
        return this.c.isVisible(f3o.a(i));
    }
}
