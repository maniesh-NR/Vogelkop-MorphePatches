package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class w2o extends v2o {
    public r9b s;

    public w2o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
        this.s = null;
    }

    public w2o(g3o g3oVar, w2o w2oVar) {
        super(g3oVar, w2oVar);
        this.s = null;
        this.s = w2oVar.s;
    }

    @Override // defpackage.d3o
    public g3o b() {
        return g3o.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.d3o
    public g3o c() {
        return g3o.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.d3o
    public final r9b l() {
        r9b r9bVar = this.s;
        if (r9bVar != null) {
            return r9bVar;
        }
        WindowInsets windowInsets = this.c;
        r9b r9bVarC = r9b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = r9bVarC;
        return r9bVarC;
    }

    @Override // defpackage.d3o
    public boolean s() {
        return this.c.isConsumed();
    }
}
