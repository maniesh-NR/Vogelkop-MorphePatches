package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p4b extends v5k {
    public static final List i = Arrays.asList(e6k.h, e6k.i, e6k.c);
    public final RecyclerView d;
    public final gjm e;
    public final pde f;
    public final o4b g;
    public final agm h;

    /* JADX WARN: Illegal instructions before constructor call */
    public p4b(RecyclerView recyclerView, gjm gjmVar, ijc ijcVar, pde pdeVar) {
        e6k e6kVar = e6k.k;
        super(n4b.class, ijcVar, e6kVar, 2131558938);
        this.d = recyclerView;
        this.e = gjmVar;
        this.f = pdeVar;
        this.g = new o4b(this, e6kVar, (byte) 0);
        this.h = new agm(new al7(this, (byte) 29));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.h.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new n4b((byte) 0);
    }

    @Override // defpackage.u5k
    public final k6k u() {
        return this.g;
    }
}
