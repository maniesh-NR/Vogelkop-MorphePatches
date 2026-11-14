package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.print.PageRange;
import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class iii extends aii {
    public final PageRange[] A;
    public final qie B;
    public final BrowserActivity C;
    public final x5f D;
    public qji E;
    public gii F;
    public hii G;
    public re7 H;
    public final umi y;
    public final h7b z;

    public iii(mej mejVar, dx3 dx3Var, umi umiVar, qji qjiVar, PageRange[] pageRangeArr, r9g r9gVar, wjh wjhVar, x5f x5fVar) {
        super(mejVar, dx3Var, "application/pdf");
        this.y = umiVar;
        PageRange[] pageRangeArr2 = qjiVar.p;
        long j = 0;
        if (pageRangeArr2 == null) {
            hii hiiVar = new hii(this, r9gVar, (byte) 0);
            this.G = hiiVar;
            qjiVar.c.b(hiiVar);
        } else if (r9gVar.test(pageRangeArr2)) {
            j = qjiVar.o;
        }
        this.z = new h7b(qjiVar.m, j, (byte) 1);
        this.B = wjhVar != null ? new qie(wjhVar, (byte) 16) : null;
        this.C = dx3Var instanceof BrowserActivity ? (BrowserActivity) dx3Var : null;
        this.A = pageRangeArr;
        this.E = qjiVar;
        this.D = x5fVar;
    }

    @Override // defpackage.iji, defpackage.dej
    public final View a(Context context) throws Resources.NotFoundException {
        View viewA = super.a(context);
        qie qieVar = this.B;
        r(this.z, qieVar == null ? null : (wjh) qieVar.b);
        return viewA;
    }

    @Override // defpackage.iji
    public final void e(boolean z) {
        if (this.F != null) {
            super.e(z);
        } else {
            R(new glj(2132018657, 2500));
            b();
        }
    }

    @Override // defpackage.iji
    public final void g() {
        qji qjiVar = this.E;
        if (qjiVar != null) {
            qjiVar.b();
            this.E = null;
        }
    }

    @Override // defpackage.iji
    public final void h(Uri uri, String str) {
        Uri uriA0;
        if (this.E == null || (uriA0 = a0(uri, str)) == null) {
            return;
        }
        zzh zzhVar = this.B != null ? new zzh(this, (byte) 3) : null;
        hii hiiVar = this.G;
        if (hiiVar != null) {
            this.E.e(hiiVar);
            this.G = null;
        }
        this.F = new gii(this.b.getContext(), this.y, this.x, this.E, this.A, this.C, new r9g(this, (byte) 24), uriA0, str, zzhVar, this.D);
        this.E = null;
    }

    @Override // defpackage.iji
    public final void j(wii wiiVar) {
        this.x.c(this.H, wiiVar);
    }

    @Override // defpackage.iji
    public final void k(fji fjiVar, vwh vwhVar) {
        this.x.c(((eii) fjiVar).a, vwhVar);
    }

    @Override // defpackage.iji
    public final fji o(Uri uri, String str) {
        re7 re7VarE = this.x.e(uri.buildUpon().appendPath(str).build(), 0);
        this.H = re7VarE;
        if (re7VarE != null && re7VarE.q() && this.H.a()) {
            return new eii(this.H);
        }
        return null;
    }

    @Override // defpackage.iji
    public final fji q(Uri uri) {
        re7 re7VarE = this.x.e(uri, 0);
        if (re7VarE == null) {
            return null;
        }
        return new eii(re7VarE);
    }

    @Override // defpackage.iji
    public final void w(Context context, wii wiiVar) {
        this.x.p(this.H, context, wiiVar, true);
    }
}
