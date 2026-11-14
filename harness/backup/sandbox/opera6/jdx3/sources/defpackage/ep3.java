package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;

/* loaded from: classes.dex */
public final class ep3 extends r22 {
    public final pp3 e;

    public ep3(BrowserActivity browserActivity, BottomBar bottomBar, pp3 pp3Var, w6j w6jVar) {
        super(browserActivity, bottomBar, w6jVar);
        this.e = pp3Var;
    }

    @Override // defpackage.r22
    public final void M(int i) {
        super.M(i);
        pp3 pp3Var = this.e;
        i7f i7fVar = ((gbf) pp3Var.i).p;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((cz3) g7fVarC.next()).a();
        }
        float f = i;
        i7f i7fVar2 = (i7f) pp3Var.h;
        g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
        while (g7fVarC2.hasNext()) {
            ((y43) g7fVarC2.next()).p(f);
        }
    }
}
