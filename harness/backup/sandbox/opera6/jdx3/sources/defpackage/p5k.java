package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p5k extends v5k {
    public static final List g = Arrays.asList(e6k.h, e6k.i);
    public final RecyclerView d;
    public final o4b e;
    public final agm f;

    /* JADX WARN: Illegal instructions before constructor call */
    public p5k(RecyclerView recyclerView, ijc ijcVar) {
        e6k e6kVar = e6k.j;
        super(n5k.class, ijcVar, e6kVar, 2131558821);
        this.d = recyclerView;
        this.e = new o4b(this, e6kVar, (byte) 4);
        this.f = new agm(new dnj(this, (byte) 6));
    }

    @Override // defpackage.v5k
    public final ab2 B(ViewGroup viewGroup) {
        return this.f.r();
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new n5k((byte) 0);
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
