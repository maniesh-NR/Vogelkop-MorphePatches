package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g3o {
    public static final g3o b;
    public final d3o a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = b3o.x;
        } else if (i >= 30) {
            b = z2o.w;
        } else {
            b = d3o.b;
        }
    }

    public g3o(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new c3o(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new b3o(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new a3o(this, windowInsets);
        } else if (i >= 30) {
            this.a = new z2o(this, windowInsets);
        } else {
            this.a = new y2o(this, windowInsets);
        }
    }

    public g3o(g3o g3oVar) {
        if (g3oVar == null) {
            this.a = new d3o(this);
            return;
        }
        d3o d3oVar = g3oVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (d3oVar instanceof c3o)) {
            this.a = new c3o(this, (c3o) d3oVar);
        } else if (i >= 34 && (d3oVar instanceof b3o)) {
            this.a = new b3o(this, (b3o) d3oVar);
        } else if (i >= 31 && (d3oVar instanceof a3o)) {
            this.a = new a3o(this, (a3o) d3oVar);
        } else if (i >= 30 && (d3oVar instanceof z2o)) {
            this.a = new z2o(this, (z2o) d3oVar);
        } else if (d3oVar instanceof y2o) {
            this.a = new y2o(this, (y2o) d3oVar);
        } else if (d3oVar instanceof x2o) {
            this.a = new x2o(this, (x2o) d3oVar);
        } else if (d3oVar instanceof w2o) {
            this.a = new w2o(this, (w2o) d3oVar);
        } else if (d3oVar instanceof v2o) {
            this.a = new v2o(this, (v2o) d3oVar);
        } else {
            this.a = new d3o(this);
        }
        d3oVar.e(this);
    }

    public static r9b e(r9b r9bVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, r9bVar.a - i);
        int iMax2 = Math.max(0, r9bVar.b - i2);
        int iMax3 = Math.max(0, r9bVar.c - i3);
        int iMax4 = Math.max(0, r9bVar.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? r9bVar : r9b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static g3o g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        g3o g3oVar = new g3o(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = r5n.a;
            g3o g3oVarA = i5n.a(view);
            d3o d3oVar = g3oVar.a;
            d3oVar.y(g3oVarA);
            View rootView = view.getRootView();
            d3oVar.d(rootView);
            d3oVar.p(rootView);
            d3oVar.q();
            d3oVar.z(view.getWindowSystemUiVisibility());
        }
        return g3oVar;
    }

    public final int a() {
        return this.a.n().d;
    }

    public final int b() {
        return this.a.n().a;
    }

    public final int c() {
        return this.a.n().c;
    }

    public final int d() {
        return this.a.n().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g3o) {
            return Objects.equals(this.a, ((g3o) obj).a);
        }
        return false;
    }

    public final WindowInsets f() {
        d3o d3oVar = this.a;
        if (d3oVar instanceof v2o) {
            return ((v2o) d3oVar).c;
        }
        return null;
    }

    public final int hashCode() {
        d3o d3oVar = this.a;
        if (d3oVar == null) {
            return 0;
        }
        return d3oVar.hashCode();
    }
}
