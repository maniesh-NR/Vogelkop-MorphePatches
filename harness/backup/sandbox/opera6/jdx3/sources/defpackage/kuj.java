package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;

/* loaded from: classes.dex */
public final class kuj extends aii {
    public final dx3 A;
    public final umi B;
    public final h7b C;
    public final mni D;
    public final Uri y;
    public final Uri z;

    public kuj(mej mejVar, dx3 dx3Var, umi umiVar, Uri uri, String str, Uri uri2, mni mniVar) {
        super(mejVar, dx3Var, "image/png");
        this.z = uri2;
        this.A = dx3Var;
        this.B = umiVar;
        this.y = uri;
        this.D = mniVar;
        this.C = new h7b(str);
    }

    @Override // defpackage.iji
    public final void R(o93 o93Var) {
    }

    @Override // defpackage.iji, defpackage.dej
    public final View a(Context context) throws Resources.NotFoundException {
        View viewA = super.a(context);
        r(this.C, null);
        a3j a3jVar = new a3j((byte) 8);
        umi umiVar = this.B;
        nml nmlVarE = umiVar.e(a3jVar);
        nmlVarE.b(umiVar.f(new txi(this, (byte) 10)));
        nmlVarE.a(this.z);
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
        roj rojVar = new roj(this, uriA0, (byte) 1);
        umi umiVar = this.B;
        nml nmlVarE = umiVar.e(rojVar);
        nmlVarE.b(umiVar.f(new vdi(this, uriA0, str, (byte) 5)));
        nmlVarE.a(null);
    }
}
