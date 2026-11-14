package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class ueh extends aii {
    public final nqi A;
    public final j3i B;
    public final String C;
    public final String D;
    public final Uri E;
    public final long F;
    public final jvg G;
    public final umi y;
    public final ag7 z;

    public ueh(mej mejVar, umi umiVar, dx3 dx3Var, ag7 ag7Var, nqi nqiVar, j3i j3iVar, Uri uri, String str, long j) {
        super(mejVar, dx3Var, "image/png");
        this.y = umiVar;
        this.z = ag7Var;
        this.A = nqiVar;
        this.B = j3iVar;
        this.C = "png";
        this.D = "image/png";
        this.E = uri;
        this.F = j;
        this.G = new jvg((byte) 1, str, this, false);
    }

    @Override // defpackage.iji
    public final void R(o93 o93Var) {
    }

    @Override // defpackage.iji, defpackage.dej
    public final View a(Context context) throws Resources.NotFoundException {
        View viewA = super.a(context);
        r(this.G, null);
        return viewA;
    }

    @Override // defpackage.iji
    public final void g() {
    }

    @Override // defpackage.iji
    public final void h(Uri uri, String str) {
        Uri uriA0 = a0(uri, str);
        if (uriA0 == null) {
            return;
        }
        this.y.e(new mgf(this, uriA0, (byte) 10)).c(new a32((Object) this, (Object) uriA0, (Object) str, (byte) 28)).a(null, null);
    }
}
