package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class y5k extends v5k {
    public final RecyclerView d;
    public final o4b e;
    public final agm f;

    /* JADX WARN: Illegal instructions before constructor call */
    public y5k(RecyclerView recyclerView, ijc ijcVar) {
        e6k e6kVar = e6k.u;
        super(w5k.class, ijcVar, e6kVar, 2131559354);
        this.d = recyclerView;
        this.e = new o4b(this, e6kVar, (byte) 6);
        this.f = new agm(new dnj(this, (byte) 8));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.f.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new w5k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.e;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        throw null;
    }
}
