package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class y2o extends x2o {
    public r9b t;
    public r9b u;
    public r9b v;

    public y2o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public y2o(g3o g3oVar, y2o y2oVar) {
        super(g3oVar, y2oVar);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.d3o
    public r9b k() {
        r9b r9bVar = this.u;
        if (r9bVar != null) {
            return r9bVar;
        }
        r9b r9bVarD = r9b.d(this.c.getMandatorySystemGestureInsets());
        this.u = r9bVarD;
        return r9bVarD;
    }

    @Override // defpackage.d3o
    public r9b m() {
        r9b r9bVar = this.t;
        if (r9bVar != null) {
            return r9bVar;
        }
        r9b r9bVarD = r9b.d(this.c.getSystemGestureInsets());
        this.t = r9bVarD;
        return r9bVarD;
    }

    @Override // defpackage.d3o
    public r9b o() {
        r9b r9bVar = this.v;
        if (r9bVar != null) {
            return r9bVar;
        }
        r9b r9bVarD = r9b.d(this.c.getTappableElementInsets());
        this.v = r9bVarD;
        return r9bVarD;
    }

    @Override // defpackage.v2o, defpackage.d3o
    public g3o r(int i, int i2, int i3, int i4) {
        return g3o.g(null, this.c.inset(i, i2, i3, i4));
    }
}
