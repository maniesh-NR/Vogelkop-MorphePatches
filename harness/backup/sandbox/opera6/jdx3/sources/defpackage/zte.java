package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zte extends xte {
    public final fqe b;
    public final /* synthetic */ bue c;

    public zte(bue bueVar, fqe fqeVar) {
        this.c = bueVar;
        this.b = fqeVar;
        d();
    }

    @Override // defpackage.xte
    public final void b(Object obj) {
        Object obj2;
        l1c l1cVar = (l1c) obj;
        bue bueVar = this.c;
        vzk vzkVar = bueVar.f;
        ((LinkedHashSet) vzkVar.d).remove(bueVar);
        s5j s5jVar = bueVar.b;
        List list = s5jVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0c l0cVarA = l0c.a((String) it.next());
            if (l0cVarA != null) {
                arrayList.add(l0cVarA);
            }
        }
        if (arrayList.contains(l1cVar.c)) {
            bueVar.a();
            return;
        }
        String lowerCase = ((Locale) ((esk) vzkVar.c).get()).getLanguage().toLowerCase(Locale.ROOT);
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
            if (Intrinsics.a(((l0c) obj2).b, lowerCase)) {
                break;
            }
        }
        l0c l0cVar = (l0c) obj2;
        if (l0cVar == null) {
            l0cVar = (l0c) CollectionsKt.K(arrayList);
        }
        List list2 = s5jVar.c;
        if (list2.isEmpty() || (list2.size() == 1 && Intrinsics.a(CollectionsKt.K(list2), "<existing>"))) {
            bueVar.c(l0cVar, l08.a);
        } else {
            bueVar.b(l0cVar, true);
        }
    }

    @Override // defpackage.xte
    public final void d() {
        this.b.a(this);
    }
}
