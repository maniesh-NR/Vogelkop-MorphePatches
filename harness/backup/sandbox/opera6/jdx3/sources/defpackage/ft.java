package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ft extends ns {
    public ft(umi umiVar, Function1 function1, int i) {
        super(umiVar, (i & 2) != 0 ? Integer.MAX_VALUE : 5, (i & 4) == 0, function1);
    }

    @Override // defpackage.ns
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public List a(List list, Set set, int i) {
        if (!set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!set.contains(((st) obj).b)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        return CollectionsKt.e0(list, i);
    }
}
