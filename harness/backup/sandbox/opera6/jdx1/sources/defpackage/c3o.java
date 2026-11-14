package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* loaded from: classes.dex */
public final class c3o extends b3o {
    public c3o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
    }

    public c3o(g3o g3oVar, c3o c3oVar) {
        super(g3oVar, c3oVar);
    }

    @Override // defpackage.v2o, defpackage.d3o
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(f3o.a(i));
    }

    @Override // defpackage.v2o, defpackage.d3o
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(f3o.a(i));
    }

    @Override // defpackage.v2o, defpackage.d3o
    public void q() {
    }
}
