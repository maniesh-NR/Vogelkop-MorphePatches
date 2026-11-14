package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fte implements q8j {
    public final l0c a;
    public final fqe b;
    public boolean c;
    public final /* synthetic */ gte d;

    public fte(gte gteVar, l0c l0cVar, fqe fqeVar) {
        this.d = gteVar;
        this.a = l0cVar;
        this.b = fqeVar;
        fqeVar.c().g(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        if (this.c) {
            this.c = false;
            this.b.c().g(this);
        }
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        v08 v08Var;
        nre nreVar = (nre) obj;
        if (nreVar != null) {
            List list = nreVar.d;
            l0c l0cVar = this.a;
            if (l0cVar == null || l0cVar.equals(nreVar.c)) {
                gte gteVar = this.d;
                i3j i3jVar = gteVar.d;
                ArrayList arrayList = gteVar.a.c;
                if (arrayList.isEmpty()) {
                    v08Var = v08.a;
                } else {
                    v08 linkedHashSet = new LinkedHashSet();
                    List list2 = list;
                    int iA = qbd.a(k95.o(list2, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj2 : list2) {
                        linkedHashMap.put(((yqe) obj2).a, obj2);
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        String str = (String) obj3;
                        if (Intrinsics.a(str, "<existing>")) {
                            List list3 = nreVar.e;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : list3) {
                                if (!arrayList.contains(((yqe) obj4).a)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            linkedHashSet.addAll(arrayList2);
                        } else {
                            yqe yqeVar = (yqe) linkedHashMap.get(str);
                            if (yqeVar != null) {
                                linkedHashSet.add(yqeVar);
                            }
                        }
                    }
                    v08Var = linkedHashSet;
                }
                if (!((Collection) v08Var).isEmpty()) {
                    c82 c82Var = new c82(new r94((Iterable) v08Var, (byte) 9), (byte) 2);
                    int iA2 = qbd.a(k95.o(c82Var, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    km7 it = c82Var.iterator();
                    while (true) {
                        km7 km7Var = it;
                        if (!km7Var.b.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) km7Var.next();
                        linkedHashMap2.put(((yqe) indexedValue.b).a, Integer.valueOf(indexedValue.a));
                    }
                    this.b.c().l.g(CollectionsKt.c0(new jk(linkedHashMap2, (byte) 5), list), v08Var);
                }
                yqe yqeVar2 = (yqe) CollectionsKt.L((Iterable) v08Var);
                if (yqeVar2 != null) {
                    nv6 nv6VarB = ((ru9) i3jVar.c).b();
                    String str2 = yqeVar2.a;
                    SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                    editor.putString("startpage.feed_category_id", str2);
                    editor.putInt("startpage.feed_category_backend", 2);
                    nv6VarB.w();
                }
                ((LinkedHashSet) i3jVar.d).remove(gteVar);
                gteVar.b.run();
                return;
            }
        }
        this.c = true;
    }
}
