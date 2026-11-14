package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class csc extends esc {
    public final deg b;
    public final Uri c;
    public final tt2 d;

    public csc(deg degVar, Uri uri, tt2 tt2Var, fnn fnnVar) {
        super(fnnVar);
        this.b = degVar;
        this.c = uri;
        this.d = tt2Var;
        dwh dwhVarG = degVar.g(uri);
        tt2Var.run(dwhVarG);
        dwhVarG.i(3, new int[0]);
        dwhVarG.f(this);
    }

    @Override // defpackage.esc
    public final void a(Exception exc, Drawable drawable) {
        dsc dscVar = new dsc(this.a);
        dwh dwhVarG = this.b.g(this.c);
        this.d.run(dwhVarG);
        dwhVarG.i(1, new int[0]);
        dwhVarG.f(dscVar);
        fsc.a.remove(this);
    }
}
