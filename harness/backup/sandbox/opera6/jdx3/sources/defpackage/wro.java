package defpackage;

import android.view.View;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wro extends sxo {
    static {
        uqh.a(wro.class).c();
    }

    @Override // defpackage.sxo
    public final void a(View view, String str, mzo mzoVar) {
        uio uioVarB;
        String str2 = (String) qb7.h.f(view.getContext()).c;
        if (str2 != null) {
            w3b w3bVar = w3b.c;
            gvf gvfVar = gvf.b;
            s9i s9iVarE = s9i.E(u06.d, w3bVar, gvfVar, gvfVar);
            gd7 gd7VarA = gd7.a("2.14.0");
            try {
                String str3 = mzoVar.a;
                URL url = new URL(mzoVar.c);
                String str4 = mzoVar.b;
                zch.e(str3, "VendorKey is null or empty");
                zch.e(str4, "VerificationParameters is null or empty");
                uioVarB = uio.b(s9iVarE, ne5.w(gd7VarA, str2, Collections.singletonList(new t1n(str3, url, str4)), str));
            } catch (MalformedURLException unused) {
                String str5 = mzoVar.c;
                uioVarB = null;
            }
            if (uioVarB == null) {
                return;
            }
            uioVarB.d(view);
            this.c = qe6.K(uioVarB);
            uioVarB.e();
            zy9 zy9VarJ = zy9.J(uioVarB);
            uio uioVar = (uio) zy9VarJ.a;
            zch.c(uioVar);
            zch.j(uioVar);
            if (uioVar.j) {
                qp2.n("Loaded event can only be sent once");
                return;
            }
            yp ypVar = uioVar.e;
            qii.p.m(ypVar.g(), "publishLoadedEvent", new Object[]{null, ypVar.a});
            uioVar.j = true;
            this.b = zy9VarJ;
            this.a = uioVarB;
        }
    }
}
