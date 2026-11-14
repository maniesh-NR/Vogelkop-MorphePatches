package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tt5 extends z5k implements ju5 {
    public final RecyclerView f;
    public final ft3 g;
    public final yu8 h;
    public final s6h i;
    public final ku5 j;
    public final tsd k;
    public final kze l;
    public final qt5 m;
    public final agm n;
    public boolean o;

    public tt5(x5f x5fVar, ijc ijcVar, RecyclerView recyclerView, ft3 ft3Var, yu8 yu8Var, s6h s6hVar, ku5 ku5Var, tsd tsdVar, kze kzeVar, tsd tsdVar2) {
        super(st5.class, ijcVar, e6k.r, 2131558618, (byte) 0);
        this.f = recyclerView;
        this.g = ft3Var;
        this.h = yu8Var;
        this.i = s6hVar;
        this.j = ku5Var;
        this.k = tsdVar;
        this.l = kzeVar;
        this.m = new qt5(new rt5(this, (byte) 0), new rt5(this, (byte) 1), new s2(2, this, tt5.class, "showOfferMenu", "showOfferMenu(Landroid/view/View;Lcom/opera/android/continue_on_booking/Offer;)V", 0, (byte) 7));
        this.n = new agm(new hv((Object) this, (Object) tsdVar2, (Object) x5fVar, (byte) 11));
        ku5Var.e.b(this);
        e(ku5Var.g);
    }

    @Override // defpackage.z5k
    public final agm C() {
        return this.n;
    }

    @Override // defpackage.ju5
    public final void e(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        if (z) {
            ku5 ku5Var = this.j;
            this.m.H(ku5Var.f == null ? new ArrayList() : new ArrayList(ku5Var.f));
        }
        A();
    }

    @Override // defpackage.ju5
    public final void onDataChanged() {
        if (this.o) {
            ku5 ku5Var = this.j;
            this.m.H(ku5Var.f == null ? new ArrayList() : new ArrayList(ku5Var.f));
        }
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.j.e.c(this);
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new st5((byte) 0);
    }

    @Override // defpackage.u5k
    public final boolean w() {
        return this.o;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return this.o;
    }
}
