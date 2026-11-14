package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class s4b extends v5k {
    public final /* synthetic */ byte d = 0;
    public final RecyclerView e;
    public final agm f;
    public final Object g;
    public final Object h;
    public final k6k i;

    /* JADX WARN: Illegal instructions before constructor call */
    public s4b(RecyclerView recyclerView, gjm gjmVar, ijc ijcVar, pde pdeVar) {
        e6k e6kVar = e6k.l;
        super(r4b.class, ijcVar, e6kVar, 2131558939);
        this.e = recyclerView;
        this.g = gjmVar;
        this.h = pdeVar;
        this.i = new o4b(this, e6kVar, (byte) 1);
        this.f = new agm(new q4b(this, (byte) 0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s4b(RecyclerView recyclerView, ijc ijcVar, t8k t8kVar, tsd tsdVar, hv3 hv3Var) {
        e6k e6kVar = e6k.d;
        super(l8k.class, ijcVar, e6kVar, 2131559364);
        this.e = recyclerView;
        this.g = t8kVar;
        this.h = hv3Var;
        this.i = new o4b(this, e6kVar, (byte) 12);
        this.f = new agm(new s4f(this, tsdVar, (byte) 28));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        switch (this.d) {
        }
        return this.f.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        switch (this.d) {
            case 0:
                return new r4b((byte) 0);
            default:
                return new l8k((byte) 0);
        }
    }

    @Override // defpackage.u5k
    public final k6k u() {
        switch (this.d) {
        }
        return (o4b) this.i;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        switch (this.d) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }
}
