package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h6o extends z5k {
    public final Function0 f;
    public Object g;
    public sjm h;
    public final /* synthetic */ byte i;
    public final w6o j;
    public final RecyclerView k;
    public final tsd l;
    public final agm m;

    public h6o(Class cls, ijc ijcVar, int i, f99 f99Var, ddc ddcVar, Function0 function0) {
        super(cls, ijcVar, e6k.n, i, (byte) 1);
        this.f = function0;
        this.h = sjm.b;
        na2.B(ddcVar, (CoroutineContext) null, (rx5) null, new hkm(f99Var, this, (mt5) null, (byte) 6), 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h6o(w6o w6oVar, ijc ijcVar, RecyclerView recyclerView, tsd tsdVar, tsd tsdVar2, ddc ddcVar, byte b) {
        this(i6o.class, ijcVar, 2131559574, qbe.t(new c78(w6oVar.j, (byte) 4)), ddcVar, new cfn(0, w6oVar, w6o.class, "onAspectIncludedOnStartPage", "onAspectIncludedOnStartPage$app()V", 0, (byte) 15));
        this.i = b;
        switch (b) {
            case 1:
                this(o6o.class, ijcVar, 2131559577, qbe.t(new c78(w6oVar.j, (byte) 5)), ddcVar, new cfn(0, w6oVar, w6o.class, "onAspectIncludedOnStartPage", "onAspectIncludedOnStartPage$app()V", 0, (byte) 16));
                this.j = w6oVar;
                this.k = recyclerView;
                this.l = tsdVar;
                this.m = new agm(new eek(this, tsdVar2, (byte) 29));
                break;
            case 2:
                this(k7o.class, ijcVar, 2131559579, qbe.t(new c78(w6oVar.j, (byte) 7)), ddcVar, new cfn(0, w6oVar, w6o.class, "onAspectIncludedOnStartPage", "onAspectIncludedOnStartPage$app()V", 0, (byte) 17));
                this.j = w6oVar;
                this.k = recyclerView;
                this.l = tsdVar;
                this.m = new agm(new j6o(this, tsdVar2, (byte) 1));
                break;
            default:
                this.j = w6oVar;
                this.k = recyclerView;
                this.l = tsdVar;
                this.m = new agm(new eek(this, tsdVar2, (byte) 27));
                break;
        }
    }

    @Override // defpackage.z5k
    public final agm C() {
        switch (this.i) {
        }
        return this.m;
    }

    @Override // defpackage.fa2, defpackage.rjm
    public final void b(sjm sjmVar) {
        boolean zA = this.h.a();
        this.h = sjmVar;
        if (zA || !sjmVar.a()) {
            return;
        }
        this.f.invoke();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        Object obj = this.g;
        if (obj == null) {
            qp2.n("Required value was null.");
            return null;
        }
        switch (this.i) {
            case 0:
                pk4 pk4Var = (pk4) obj;
                return new i6o(new oyj(this, pk4Var, (byte) 7), new eek(this, pk4Var, (byte) 28));
            case 1:
                qk4 qk4Var = (qk4) obj;
                return new o6o(qk4Var.a, new gil(this, qk4Var, (byte) 25), new j6o(this, qk4Var, (byte) 0));
            default:
                rk4 rk4Var = (rk4) obj;
                return new k7o(rk4Var.a, new oyj(this, rk4Var, (byte) 8), new j6o(this, rk4Var, (byte) 2));
        }
    }

    @Override // defpackage.u5k
    public final boolean y(ja2 ja2Var) {
        Object obj = this.g;
        if (obj == null) {
            return false;
        }
        switch (this.i) {
            case 1:
                return ((o6o) ja2Var).g != ((qk4) obj).a;
            case 2:
                return !((k7o) ja2Var).g.equals(((rk4) obj).a);
            default:
                return false;
        }
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return this.g != null;
    }
}
