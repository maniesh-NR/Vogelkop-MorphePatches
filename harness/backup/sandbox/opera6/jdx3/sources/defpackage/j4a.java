package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j4a extends tx7 {
    public final GridLayoutManager e;
    public final int f;
    public final d4a g;

    public j4a(GridLayoutManager gridLayoutManager, int i, d4a d4aVar) {
        this.e = gridLayoutManager;
        this.f = i;
        this.g = d4aVar;
    }

    public final int f(int i) {
        e4a item = this.g.getItem(i);
        int i2 = this.e.b;
        a26 a26VarB = item.b();
        if (Intrinsics.a(a26VarB, g4a.p)) {
            return i2 / this.f;
        }
        if (Intrinsics.a(a26VarB, g4a.o)) {
            return i2;
        }
        if (a26VarB instanceof f4a) {
            return i2 / 2;
        }
        h9o.p();
        return 0;
    }
}
