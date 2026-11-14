package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h4l extends b23 {
    public final Context b;
    public final tvk c;

    public h4l(Context context, tvk tvkVar) {
        super((byte) 0);
        this.b = context;
        this.c = tvkVar;
    }

    @Override // defpackage.b23
    public final Integer b(Context context) {
        return 2131233234;
    }

    @Override // defpackage.b23
    public final Integer d(Context context) {
        return 2131232688;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        return context.getString(2132021827);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018581);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132021845);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083349;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(2132021828);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            this.c.n(false, false);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.c.n(false, true);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.c.n(true, false);
    }

    @Override // defpackage.b23, defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) throws Resources.NotFoundException {
        super.onShowDialog(bz0Var);
        g4l g4lVar = (g4l) this.c.a;
        g4lVar.l = bz0Var;
        nv6 nv6VarB = ru9.c(g4lVar.c.a.b).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("tab_gallery.tabui2_upgrade_dialog_shown", true);
        nv6VarB.w();
    }

    @Override // defpackage.nz0
    public final Context wrapContext(Context context) {
        return this.b;
    }
}
