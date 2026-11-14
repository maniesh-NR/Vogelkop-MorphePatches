package defpackage;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class ild implements ceb, ogh {
    public final /* synthetic */ nld a;

    public /* synthetic */ ild(nld nldVar) {
        this.a = nldVar;
    }

    @Override // defpackage.ogh
    public final void a(long j) {
        nld nldVar = this.a;
        if (nldVar.l) {
            nrl nrlVar = nldVar.a;
            hld hldVar = (hld) nrlVar.b;
            nrlVar.e(0, hldVar.i);
            nrlVar.e(0, hldVar.h);
            if (nrlVar.a) {
                nrlVar.e(0, hldVar.d);
            }
            nldVar.b.M(0);
        } else {
            nldVar.l = true;
        }
        nldVar.d.P();
        nldVar.c.p0();
        mld mldVar = nldVar.k;
        vml.a(mldVar);
        if (!nldVar.m || nldVar.n) {
            return;
        }
        vml.d(mldVar, j);
    }

    @Override // defpackage.ceb
    public final void c(MotionEvent motionEvent) {
        this.a.c();
    }
}
