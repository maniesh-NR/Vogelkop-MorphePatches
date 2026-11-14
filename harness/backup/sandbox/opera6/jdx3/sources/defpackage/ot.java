package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class ot extends oy {
    public final nt k;
    public final tw2 l;

    public ot(nt ntVar, tw2 tw2Var) {
        super(ntVar, new shf(), Locale.getDefault());
        this.k = ntVar;
        this.l = tw2Var;
    }

    @Override // defpackage.oy
    public final void h() {
        orm ormVar = (orm) this.l.b;
        String strT = tw2.t(gt.f);
        x5f x5fVar = (x5f) ormVar;
        if (x5fVar.h) {
            x5fVar.j(0, strT, false);
        }
    }
}
