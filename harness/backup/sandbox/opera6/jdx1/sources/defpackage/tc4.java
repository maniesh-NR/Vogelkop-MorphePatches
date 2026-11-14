package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class tc4 implements rfb {
    public final xc4 a;
    public hf4 c;
    public boolean f;
    public boolean g;
    public final Object b = new Object();
    public l08 d = l08.a;
    public final ArrayList e = new ArrayList();

    public tc4(qe4 qe4Var, xc4 xc4Var) {
        this.a = xc4Var;
    }

    @Override // defpackage.rfb
    public final void a(List list) throws ig4 {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            v08<Set> v08VarC = xc4.c(this.a);
            if (v08VarC == null) {
                v08VarC = v08.a;
            }
            for (Set set : v08VarC) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(k95.o(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sd4) it.next()).a);
                }
                Set setN0 = CollectionsKt.n0(arrayList);
                if (list.containsAll(setN0)) {
                    List listK0 = CollectionsKt.k0(set);
                    if (listK0.size() >= 2) {
                        String str = ((sd4) listK0.get(0)).a;
                        String str2 = ((sd4) listK0.get(1)).a;
                        try {
                            if (wyh.F(this.a, str) && wyh.F(this.a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str)).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str2)).add(str);
                            }
                        } catch (s7b e) {
                            if (gyg.G(5, "CXCP")) {
                                Objects.toString(set);
                                e.getMessage();
                            }
                        }
                    }
                } else if (gyg.G(5, "CXCP")) {
                    Objects.toString(setN0);
                    list.toString();
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new ig4("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    public final void b(hf4 hf4Var) throws ig4 {
        ArrayList arrayList;
        synchronized (this.b) {
            this.c = hf4Var;
        }
        ArrayList arrayListA = xc4.a(this.a);
        if (arrayListA != null) {
            arrayList = new ArrayList(k95.o(arrayListA, 10));
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                arrayList.add(((sd4) obj).a);
            }
        } else {
            arrayList = l08.a;
        }
        a(arrayList);
    }
}
