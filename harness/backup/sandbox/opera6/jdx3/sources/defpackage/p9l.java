package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class p9l extends a21 {
    public final /* synthetic */ r9l n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9l(eme emeVar, r9l r9lVar, zkk zkkVar, j1k j1kVar, z77 z77Var, k6l k6lVar, i53 i53Var, nr8 nr8Var, u4l u4lVar, s9i s9iVar, ysj ysjVar, mt3 mt3Var) {
        super(zkkVar, j1kVar, z77Var, k6lVar, i53Var, nr8Var, u4lVar, s9iVar, ysjVar, mt3Var, emeVar);
        this.n = r9lVar;
    }

    @Override // defpackage.a21, defpackage.x9l
    public final boolean D(int i) {
        r9l r9lVar = this.n;
        byte b = 0;
        r9lVar.r(false);
        k6l k6lVar = r9lVar.c;
        s3l s3lVar = u3l.a;
        b2l b2lVar = (b2l) CollectionsKt.firstOrNull(exg.p(k6lVar, new r3l(i), x6l.a));
        if (b2lVar == null) {
            return true;
        }
        int i2 = ((eyj) r9lVar.x.g()).D;
        r9lVar.t.g(b2lVar.T());
        z5l z5lVarF = r9lVar.f();
        z5lVarF.getClass();
        z5lVarF.e(new v5l(z5lVarF, b2lVar, b), new gv((Object) z5lVarF, i2, (byte) 6));
        return true;
    }

    @Override // defpackage.a21, defpackage.x9l
    public final b2l E(int i) {
        b2l b2lVarE = super.E(i);
        this.n.j();
        return b2lVarE;
    }

    @Override // defpackage.a21, defpackage.x9l
    public final boolean X(List list) {
        r9l r9lVar = this.n;
        if (!r9lVar.s(true, true)) {
            return false;
        }
        r9lVar.w.d0(list);
        r9lVar.u();
        return true;
    }

    @Override // defpackage.a21, defpackage.x9l
    public final void k0() {
        g4l.e(this.n.D);
    }

    @Override // defpackage.a21, defpackage.x9l
    public final void m(b2l b2lVar) {
        super.m(b2lVar);
        this.n.i(true);
    }

    @Override // defpackage.a21, defpackage.x9l
    public final void o() {
        g4l.a(this.n.D, null, 1);
    }
}
