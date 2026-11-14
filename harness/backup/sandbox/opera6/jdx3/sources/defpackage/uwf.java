package defpackage;

import android.util.Pair;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class uwf implements cz3 {
    public Pair a;
    public final ViewGroup b;
    public final gbf c;

    public uwf(ViewGroup viewGroup, gbf gbfVar) {
        this.b = viewGroup;
        this.c = gbfVar;
        gbfVar.p.b(this);
    }

    @Override // defpackage.cz3
    public final void a() {
        Pair pair = this.a;
        if (pair == null) {
            return;
        }
        ((q2f) pair.second).f(hjm.b);
    }

    @Override // defpackage.cz3
    public final void b() {
        Pair pair = this.a;
        if (pair != null) {
            ((q2f) pair.second).getClass();
        }
    }
}
