package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ncd extends u5k implements zsh, dy {
    public final wy c;
    public final o4b d;
    public final hx e;
    public final plj f;
    public int g;
    public final agm h;

    /* JADX WARN: Illegal instructions before constructor call */
    public ncd(RecyclerView recyclerView, wy wyVar, x5f x5fVar, pde pdeVar, tsd tsdVar, ijc ijcVar) {
        e6k e6kVar = e6k.g;
        super(n43.class, ijcVar, e6kVar);
        this.c = wyVar;
        this.d = new o4b((u5k) this, e6kVar, (byte) 2);
        hx hxVar = new hx((byte) 7);
        hxVar.a(new u10(x5fVar, pdeVar, tsdVar));
        hxVar.a(new da2(no.class, 2131558779, 2131558779, new ox((byte) 0)));
        hxVar.a(new da2(in7.class, 2131558816, 2131558816, new ox((byte) 1)));
        this.e = hxVar;
        plj pljVar = new plj(wyVar, (ocd) wyVar.x.get(), wyVar.b);
        this.f = pljVar;
        this.h = new agm(new gv8(this, recyclerView, (byte) 26));
        vzk vzkVar = wyVar.e;
        vzkVar.h(this);
        s(((cy) vzkVar.a).c());
        pljVar.s = this;
    }

    @Override // defpackage.zsh
    public final void c() {
        plj pljVar = this.f;
        if (pljVar.p.a() && pljVar.q.e()) {
            pljVar.t0(true);
        }
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i != this.g) {
            return null;
        }
        return this.h.r();
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        ((Set) this.c.e.c).remove(this);
        plj pljVar = this.f;
        pljVar.s = null;
        pljVar.r = null;
        pljVar.s0(new in7((byte) 1));
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        int iQ = this.e.q(ja2Var, i, ca2Var);
        if (iQ != 0 && this.g != iQ) {
            this.g = iQ;
            agm agmVar = this.h;
            agmVar.c = null;
            agmVar.d = null;
        }
        return iQ;
    }

    @Override // defpackage.dy
    public final void s(ml mlVar) {
        kl klVar = mlVar.g;
        uo uoVar = klVar != null ? new uo(this.c.q.a(klVar), klVar) : null;
        plj pljVar = this.f;
        if (Intrinsics.a(uoVar, pljVar.r)) {
            return;
        }
        boolean z = pljVar.r == null;
        pljVar.r = uoVar;
        if (uoVar == null) {
            pljVar.s0(new in7((byte) 1));
        } else if (z) {
            pljVar.s0(new no(uoVar, pljVar.o.l, pljVar, l08.a));
        }
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return this.f.q;
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.d;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return !(this.f.q instanceof in7);
    }
}
