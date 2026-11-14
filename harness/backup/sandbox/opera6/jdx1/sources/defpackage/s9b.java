package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s9b extends s75 {
    public final View d;
    public int e;
    public int f;
    public final int[] g;

    public s9b(View view) {
        super(0);
        this.g = new int[2];
        this.d = view;
    }

    @Override // defpackage.s75
    public final void h(n2o n2oVar) {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.s75
    public final void i(n2o n2oVar) {
        View view = this.d;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        this.e = iArr[1];
    }

    @Override // defpackage.s75
    public final g3o j(g3o g3oVar, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((n2o) it.next()).a.d() & 8) != 0) {
                this.d.setTranslationY(ze1.c(r0.a.c(), this.f, 0));
                break;
            }
        }
        return g3oVar;
    }

    @Override // defpackage.s75
    public final mgh k(n2o n2oVar, mgh mghVar) {
        View view = this.d;
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        int i = this.e - iArr[1];
        this.f = i;
        view.setTranslationY(i);
        return mghVar;
    }
}
