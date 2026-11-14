package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class s6k extends v5k {
    public final ne5 d;
    public final e7k e;
    public final agm f;
    public final o4b g;

    /* JADX WARN: Illegal instructions before constructor call */
    public s6k(RecyclerView recyclerView, fwf fwfVar, ijc ijcVar, ne5 ne5Var, e7k e7kVar) {
        e6k e6kVar = e6k.b;
        super(o6k.class, ijcVar, e6kVar, 2131559359);
        this.d = ne5Var;
        this.e = e7kVar;
        this.f = new agm(new uef(fwfVar, recyclerView, this, (byte) 5));
        this.g = new o4b((u5k) this, e6kVar, (byte) 9);
        ((pde) ne5Var.g).j(fwfVar, new t7d(new n6k(ijcVar, this), (byte) 15));
        na2.B(cqp.V(fwfVar.b), (CoroutineContext) null, (rx5) null, new r8h(fwfVar, this, (mt5) null, (byte) 17), 3);
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.f.r();
    }

    @Override // defpackage.fa2, defpackage.rjm
    public final void b(sjm sjmVar) {
        if (sjmVar.a) {
            return;
        }
        xz6 xz6Var = ((pz6) this.d.e).e;
        xz6Var.b = false;
        xz6Var.c = false;
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new o6k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.g;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return ((v6k) ((pde) this.d.g).g()).a;
    }
}
