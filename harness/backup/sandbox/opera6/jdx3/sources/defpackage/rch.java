package defpackage;

import android.content.Context;
import com.opera.android.favorites.PushedSpeedDialFavorite;

/* loaded from: classes.dex */
public final class rch extends er8 {
    public final skm B;
    public final int C;

    public rch(Context context, skm skmVar, tta ttaVar, vr8 vr8Var) {
        super(context, ttaVar, vr8Var, null);
        this.B = skmVar;
        this.C = nr8.e(getContext());
    }

    @Override // defpackage.fr8
    public final int k() {
        return this.C;
    }

    @Override // defpackage.er8
    public final vmj u(String str) {
        int i = vmj.g;
        Context context = getContext();
        na5 na5Var = na5.d;
        umj umjVar = umj.b;
        int i2 = this.c;
        return tmj.l(context, str, umjVar, i2, i2, na5Var, true);
    }

    @Override // defpackage.er8
    public final String w() {
        hq8 hq8Var = this.s;
        String strH = hq8Var != null ? hq8Var.h() : null;
        return (strH == null || strH.length() == 0) ? super.w() : strH.substring(0, 1);
    }

    @Override // defpackage.er8
    public final void y() {
        hq8 hq8Var = this.s;
        if (hq8Var instanceof PushedSpeedDialFavorite) {
            PushedSpeedDialFavorite pushedSpeedDialFavorite = (PushedSpeedDialFavorite) hq8Var;
            sfe.u0(this.B, pushedSpeedDialFavorite.e, sfe.W(pushedSpeedDialFavorite), 0L, 6);
        }
    }
}
