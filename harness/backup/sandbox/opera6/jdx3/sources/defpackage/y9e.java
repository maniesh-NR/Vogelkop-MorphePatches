package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y9e implements wkn {
    public static final Set c = e82.E(new String[]{"NETWORK_10", "NETWORK_17", "NETWORK_16", "NETWORK_13", "NETWORK_50", "NETWORK_544", "NETWORK_545", "NETWORK_15"});
    public final z7f a;
    public final h42 b;

    public y9e(z7f z7fVar) {
        this.a = z7fVar;
        ekc po7Var = new po7(z7fVar);
        h42 h42Var = new h42();
        h42Var.s(po7Var, new iwa(new x9e(h42Var, this, (byte) 0), (byte) 11));
        this.b = h42Var;
    }

    public static Set b(y7f y7fVar) {
        boolean z = y7fVar instanceof v7f;
        Set set = c;
        if (z) {
            List list = ((v7f) y7fVar).g;
            if (!list.isEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((u7f) it.next()).b);
                }
                return CollectionsKt.n0(arrayList);
            }
        } else if (!(y7fVar instanceof w7f) && !Intrinsics.a(y7fVar, x7f.a)) {
            h9o.p();
            return null;
        }
        return set;
    }

    @Override // defpackage.wkn
    public final ekc a() {
        return this.b;
    }
}
