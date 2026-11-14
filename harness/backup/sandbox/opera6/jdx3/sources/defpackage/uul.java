package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.TopToolbarContainer;

/* loaded from: classes.dex */
public abstract class uul extends z43 {
    public final TopToolbarContainer j;
    public final mhk k;

    public uul(BrowserActivity browserActivity, pt3 pt3Var, k6l k6lVar, esk eskVar, TopToolbarContainer topToolbarContainer, ysl yslVar, pde pdeVar) {
        super(browserActivity, pt3Var, k6lVar, eskVar, topToolbarContainer, yslVar, pdeVar);
        this.j = topToolbarContainer;
        this.k = new mhk(topToolbarContainer);
    }

    @Override // defpackage.z43
    public final boolean q() {
        return this.j.getTranslationY() == 0.0f;
    }

    @Override // defpackage.z43
    public void s() {
        TopToolbarContainer topToolbarContainer = this.j;
        if (topToolbarContainer.getVisibility() != 0) {
            topToolbarContainer.setVisibility(0);
        }
        super.s();
        this.k.h(4, true);
    }

    @Override // defpackage.z43
    public final void t(boolean z) {
        this.k.h(1, z);
    }

    @Override // defpackage.z43
    public final void u() {
        this.k.h(4, false);
    }

    @Override // defpackage.z43
    public final void x() {
        this.k.h(2, false);
    }

    @Override // defpackage.z43
    public final void y() {
        this.k.h(2, true);
    }

    @Override // defpackage.z43
    public void z(b2l b2lVar) {
        this.k.h(8, ((d7l) b2lVar).o0());
    }
}
