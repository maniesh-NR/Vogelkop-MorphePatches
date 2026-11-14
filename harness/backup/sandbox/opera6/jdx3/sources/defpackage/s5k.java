package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class s5k extends v5k implements q8k {
    public static final jxh h = new jxh(2131167599);
    public final RecyclerView d;
    public final u8k e;
    public final o4b f;
    public final agm g;

    /* JADX WARN: Illegal instructions before constructor call */
    public s5k(RecyclerView recyclerView, ijc ijcVar, u8k u8kVar) {
        e6k e6kVar = e6k.p;
        super(q5k.class, ijcVar, e6kVar, 2131559353);
        this.d = recyclerView;
        this.e = u8kVar;
        this.f = new o4b(this, e6kVar, (byte) 5);
        this.g = new agm(new dnj(this, (byte) 7));
        u8kVar.g.b(this);
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.g.r();
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.e.g.c(this);
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new q5k((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.f;
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return this.e.b().a;
    }
}
