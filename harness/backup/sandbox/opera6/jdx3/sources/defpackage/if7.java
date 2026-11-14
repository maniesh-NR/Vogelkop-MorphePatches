package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class if7 extends aii {
    public final ib9 A;
    public final hf7 B;
    public final BrowserActivity C;
    public final x5f D;
    public a21 E;
    public re7 F;
    public final tcl y;
    public final rc9 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public if7(mej mejVar, dx3 dx3Var, tcl tclVar, rc9 rc9Var, ib9 ib9Var, x5f x5fVar) {
        String str = ib9Var.h;
        super(mejVar, dx3Var, TextUtils.isEmpty(str) ? "application/octet-stream" : str);
        this.y = tclVar;
        this.z = rc9Var;
        this.A = ib9Var;
        this.B = new hf7(ib9Var.e, this.w, ib9Var.j);
        this.C = dx3Var instanceof BrowserActivity ? (BrowserActivity) dx3Var : null;
        this.D = x5fVar;
    }

    @Override // defpackage.iji, defpackage.dej
    public final View a(Context context) throws Resources.NotFoundException {
        View viewA = super.a(context);
        r(this.B, null);
        return viewA;
    }

    @Override // defpackage.iji
    public final void e(boolean z) {
        if (this.E != null) {
            super.e(z);
        } else {
            R(new glj(2132018657, 2500));
            b();
        }
    }

    @Override // defpackage.iji
    public final void h(Uri uri, String str) {
        Uri uriA0 = a0(uri, str);
        if (uriA0 == null) {
            return;
        }
        Context context = this.b.getContext();
        uk6 uk6Var = new uk6(this, (byte) 12);
        ib9 ib9Var = this.A;
        this.E = new a21(context, this.y, this.x, this.C, uk6Var, Uri.parse(ib9Var.f), this.B.b, ib9Var.g, uriA0, str, new hu5(this, uriA0, (byte) 5), this.D);
    }

    @Override // defpackage.iji
    public final void j(wii wiiVar) {
        this.x.c(this.F, wiiVar);
    }

    @Override // defpackage.iji
    public final void k(fji fjiVar, vwh vwhVar) {
        this.x.c(((gf7) fjiVar).a, vwhVar);
    }

    @Override // defpackage.iji
    public final fji o(Uri uri, String str) {
        re7 re7VarE = this.x.e(uri.buildUpon().appendPath(str).build(), 0);
        this.F = re7VarE;
        if (re7VarE != null && re7VarE.q() && this.F.a()) {
            return new gf7(this.F);
        }
        return null;
    }

    @Override // defpackage.iji
    public final fji q(Uri uri) {
        re7 re7VarE = this.x.e(uri, 0);
        if (re7VarE == null) {
            return null;
        }
        return new gf7(re7VarE);
    }

    @Override // defpackage.iji
    public final void w(Context context, wii wiiVar) {
        this.x.p(this.F, context, wiiVar, true);
    }
}
