package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class p7k implements tjn {
    public final /* synthetic */ v7k a;

    public p7k(v7k v7kVar) {
        this.a = v7kVar;
    }

    @Override // defpackage.tjn
    public final int a() {
        return this.a.getResources().getDimensionPixelSize(2131165522);
    }

    @Override // defpackage.tjn
    public final String e() {
        z7k z7kVar = (z7k) this.a.I0().d.n.g();
        String str = z7kVar != null ? z7kVar.a.b : null;
        return str == null ? "" : str;
    }

    @Override // defpackage.tjn
    public final void i(View view) {
        c8k c8kVarI0 = this.a.I0();
        b8h.m(c8kVarI0.f.a, new tu(new n6k(c8kVarI0, (byte) 3), (byte) 11));
    }

    @Override // defpackage.tjn
    public final void k(View view) {
        this.a.I0().f.b.e(new rkn(vln.b, null), false);
    }

    @Override // defpackage.tjn
    public final void n(aln alnVar) {
        c8k c8kVarI0 = this.a.I0();
        String id = alnVar.getId();
        c8kVarI0.f.b.e(new dmn(wln.b, new cmn(id, null, 0, 6, true)), false);
    }
}
