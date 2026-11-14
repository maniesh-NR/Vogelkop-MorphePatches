package defpackage;

import androidx.fragment.app.r;

/* loaded from: classes.dex */
public final class fld implements eig {
    public final /* synthetic */ gld a;

    public fld(gld gldVar) {
        this.a = gldVar;
    }

    public final void G(fzl fzlVar) {
        this.a.J0();
    }

    public final void K(gql gqlVar, int i) {
        xbf xbfVar;
        gld gldVar = this.a;
        gldVar.J0();
        if (!gqlVar.p() || (xbfVar = gldVar.v) == null || !((tjg) xbfVar.b).k.c.isEmpty() || gldVar.a) {
            return;
        }
        r rVarRequireActivity = gldVar.requireActivity();
        gldVar.x = false;
        gldVar.g0();
        if (rVarRequireActivity.isInPictureInPictureMode()) {
            rVarRequireActivity.moveTaskToBack(true);
        }
    }
}
