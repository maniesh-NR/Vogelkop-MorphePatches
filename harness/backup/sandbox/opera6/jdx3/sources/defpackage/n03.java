package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class n03 {
    public final Context a;
    public final pde b;
    public final tsd c;

    public n03(Context context, ndc ndcVar, kze kzeVar, ikc ikcVar, pde pdeVar) {
        this.a = context;
        xkn xknVar = ((qjn) kzeVar.g()).a;
        this.b = new pde(new b03(xknVar.d, xknVar.e, xknVar.f));
        tsd tsdVarY = xf8.y(kzeVar, ikcVar, pdeVar, m03.a);
        this.c = tsdVarY;
        tsdVarY.j(ndcVar, new pb(new t02(this, (byte) 18), (byte) 21));
    }
}
