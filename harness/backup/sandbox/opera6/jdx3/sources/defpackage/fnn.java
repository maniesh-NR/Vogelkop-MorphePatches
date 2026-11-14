package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class fnn extends phi {
    public final pjn d;

    public fnn(pjn pjnVar) {
        super(new tu(pjnVar, (byte) 12));
        this.d = pjnVar;
    }

    @Override // defpackage.phi
    public final void a(Exception exc, Drawable drawable) {
        phi.c.remove(this);
        boolean z = exc instanceof ooe;
        byte b = 1;
        pjn pjnVar = this.d;
        if (z && ((ooe) exc).a == 404) {
            qjn qjnVar = (qjn) pjnVar.b;
            qjnVar.g = null;
            qjnVar.h = new zmn(b);
            pjnVar.n();
            return;
        }
        qjn qjnVar2 = (qjn) pjnVar.b;
        qjnVar2.g = null;
        qjnVar2.h = new bnn(qjnVar2);
        pjnVar.n();
        if (!qjnVar2.i || qjnVar2.j) {
            return;
        }
        qjnVar2.j = true;
        vml.d(new y1n((Object) pjnVar, (byte) 21), 5000L);
    }
}
