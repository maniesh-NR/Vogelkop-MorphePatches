package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class d7k implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d7k(crk crkVar, ne5 ne5Var, int i) {
        this.a = (byte) 24;
        this.b = crkVar;
        this.c = ne5Var;
    }

    public /* synthetic */ d7k(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ d7k(mcj mcjVar, LinkedHashSet linkedHashSet, p6l p6lVar) {
        this.a = (byte) 23;
        this.b = mcjVar;
        this.c = linkedHashSet;
    }

    public /* synthetic */ d7k(mhl mhlVar, w2m w2mVar, afe afeVar) {
        this.a = (byte) 27;
        this.b = w2mVar;
        this.c = afeVar;
    }

    private final Object a(Object obj) {
        List list;
        n7l n7lVar = (n7l) this.b;
        Set set = (Set) this.c;
        synchronized (n7lVar.a()) {
            f58 f58VarA = n7lVar.a();
            List list2 = (List) kfo.Y(f58VarA.a, true, false, new d58(f58VarA));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!set.contains(Integer.valueOf(((m7l) obj2).a))) {
                    arrayList.add(obj2);
                }
            }
            f58 f58VarA2 = n7lVar.a();
            kfo.Y(f58VarA2.a, false, true, new ry7(f58VarA2, arrayList, (byte) 3));
            f58 f58VarA3 = n7lVar.a();
            list = (List) kfo.Y(f58VarA3.a, true, false, new d58(f58VarA3));
        }
        return list;
    }

    private final Object b(Object obj) {
        n7l n7lVar = (n7l) this.b;
        m7l m7lVar = (m7l) this.c;
        synchronized (n7lVar.a()) {
            f58 f58VarA = n7lVar.a();
            kfo.Y(f58VarA.a, false, true, new c58(f58VarA, m7lVar, (byte) 1));
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7k.invoke(java.lang.Object):java.lang.Object");
    }
}
