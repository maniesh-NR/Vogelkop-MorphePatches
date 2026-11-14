package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class le extends fud {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ ne n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ne neVar, Context context, akk akkVar, View view) {
        super(2130968612, 0, akkVar, context, view, false);
        this.n = neVar;
        if ((akkVar.B.x & 32) != 32) {
            View view2 = neVar.g;
            this.f = view2 == null ? (View) neVar.f : view2;
        }
        kud kudVar = neVar.s;
        this.i = kudVar;
        eud eudVar = this.j;
        if (eudVar != null) {
            eudVar.d(kudVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ne neVar, Context context, itd itdVar, View view) {
        super(2130968612, 0, itdVar, context, view, true);
        this.n = neVar;
        this.g = 8388613;
        kud kudVar = neVar.s;
        this.i = kudVar;
        eud eudVar = this.j;
        if (eudVar != null) {
            eudVar.d(kudVar);
        }
    }

    @Override // defpackage.fud
    public final void c() {
        byte b = this.m;
        ne neVar = this.n;
        switch (b) {
            case 0:
                neVar.p = null;
                super.c();
                break;
            default:
                itd itdVar = neVar.c;
                if (itdVar != null) {
                    itdVar.c(true);
                }
                neVar.o = null;
                super.c();
                break;
        }
    }
}
