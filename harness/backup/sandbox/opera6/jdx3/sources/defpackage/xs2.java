package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class xs2 extends s75 {
    public boolean d;
    public float e;
    public float f;
    public us2 g;
    public final /* synthetic */ bt2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(bt2 bt2Var) {
        super(0);
        this.h = bt2Var;
    }

    public final void h(n2o n2oVar) {
        if (this.d) {
            us2 us2Var = this.g;
            if (us2Var != null) {
                us2Var.run();
            }
            this.g = null;
        }
        this.d = false;
    }

    public final void i(n2o n2oVar) {
        this.e = this.h.b.getBottom();
    }

    public final g3o j(g3o g3oVar, List list) {
        Object next;
        if (this.d) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((((n2o) next).a.d() & 8) != 0) {
                    break;
                }
            }
            n2o n2oVar = (n2o) next;
            if (n2oVar != null) {
                this.h.b.setTranslationY((1.0f - n2oVar.a.c()) * (this.e - this.f));
                return g3oVar;
            }
        }
        return g3oVar;
    }

    public final mgh k(n2o n2oVar, mgh mghVar) {
        ViewGroup viewGroup = this.h.b;
        float bottom = viewGroup.getBottom();
        this.f = bottom;
        boolean z = this.e > bottom && viewGroup.getChildCount() != 0;
        this.d = z;
        if (!z) {
            us2 us2Var = this.g;
            if (us2Var != null) {
                us2Var.run();
            }
            this.g = null;
        }
        return mghVar;
    }
}
