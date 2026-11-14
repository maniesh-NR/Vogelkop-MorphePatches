package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class x2o extends w2o {
    public x2o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar, windowInsets);
    }

    public x2o(g3o g3oVar, x2o x2oVar) {
        super(g3oVar, x2oVar);
    }

    @Override // defpackage.d3o
    public g3o a() {
        return g3o.g(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.v2o, defpackage.d3o
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2o)) {
            return false;
        }
        x2o x2oVar = (x2o) obj;
        return Objects.equals(this.c, x2oVar.c) && Objects.equals(this.g, x2oVar.g) && v2o.L(this.h, x2oVar.h);
    }

    @Override // defpackage.d3o
    public jb7 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new jb7(displayCutout);
    }

    @Override // defpackage.d3o
    public int hashCode() {
        return this.c.hashCode();
    }
}
