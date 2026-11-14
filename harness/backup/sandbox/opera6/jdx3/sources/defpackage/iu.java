package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class iu extends ft {
    public final List h;

    public iu(List list, umi umiVar, fu fuVar) {
        super(umiVar, fuVar, 2);
        this.h = list;
    }

    @Override // defpackage.ns
    public final Object b(Object obj) {
        List<hk6> list = (List) obj;
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        for (hk6 hk6Var : list) {
            arrayList.add(new st(new rxh(hk6Var.a), hk6Var.d, (String) null, (Integer) null, ht.c, (Set) null, (String) null, (String) null, 488));
        }
        return arrayList;
    }

    @Override // defpackage.ft, defpackage.ns
    /* renamed from: f */
    public final List a(List list, Set set, int i) {
        Set<String> set2 = set;
        a36 a36Var = hk6.e;
        ArrayList arrayList = new ArrayList(k95.o(set2, 10));
        for (String str : set2) {
            a36Var.getClass();
            arrayList.add(a36.q(str));
        }
        Set setN0 = CollectionsKt.n0(arrayList);
        if (!set.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                a36 a36Var2 = hk6.e;
                String str2 = ((st) obj).b;
                a36Var2.getClass();
                if (!setN0.contains(a36.q(str2))) {
                    arrayList2.add(obj);
                }
            }
            list = arrayList2;
        }
        return CollectionsKt.e0(list, i);
    }
}
