package defpackage;

import androidx.collection.ArrayMap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f3m extends e3m {
    public final /* synthetic */ ArrayMap a;
    public final /* synthetic */ g3m b;

    public f3m(g3m g3mVar, ArrayMap arrayMap) {
        this.b = g3mVar;
        this.a = arrayMap;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void e(y2m y2mVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(y2mVar);
        y2mVar.C(this);
    }
}
