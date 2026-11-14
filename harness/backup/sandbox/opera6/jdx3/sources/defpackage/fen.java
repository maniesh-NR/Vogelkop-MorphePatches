package defpackage;

import com.opera.android.bar.OmniButtonView;

/* loaded from: classes.dex */
public final class fen extends mgn {
    public cen j;

    @Override // defpackage.mgn
    public final boolean a() {
        return !ru9.c(this.a).a.getBoolean("vpn.tooltip_premium.change_location_closed", false);
    }

    @Override // defpackage.mgn
    public final OmniButtonView c() {
        gbf gbfVar = this.d;
        if (gbfVar.b.q()) {
            return (OmniButtonView) gbfVar.r();
        }
        return null;
    }

    @Override // defpackage.mgn
    public final boolean e() {
        return super.e() && h(this.f.o) && this.g.c.isEnabled();
    }

    @Override // defpackage.mgn
    public final void f() {
        this.c.getLifecycle().a(this);
        cen cenVar = new cen(this);
        this.j = cenVar;
        this.g.F(cenVar);
    }

    @Override // defpackage.mgn
    public final void g() {
        this.c.getLifecycle().b(this);
        cen cenVar = this.j;
        if (cenVar != null) {
            f6l f6lVar = cenVar.b;
            if (f6lVar != null) {
                cenVar.c.f.H(f6lVar);
                cenVar.b = null;
            }
            this.g.H(this.j);
            this.j = null;
        }
    }

    public final boolean h(b2l b2lVar) {
        if (b2lVar == null) {
            return false;
        }
        d7l d7lVar = (d7l) b2lVar;
        return (d7lVar.n0() || !d(b2lVar) || this.g.t(d7lVar.i0())) ? false : true;
    }
}
