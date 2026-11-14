package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class d8l implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j8l b;

    public /* synthetic */ d8l(j8l j8lVar, byte b) {
        this.a = b;
        this.b = j8lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j8l j8lVar = this.b;
        switch (b) {
            case 0:
                ava.a.a(new d8l(j8lVar, (byte) 1));
                break;
            default:
                k6l k6lVar = j8lVar.b;
                if (!Collections.unmodifiableList(k6lVar.b).isEmpty()) {
                    c8l c8lVar = j8lVar.a;
                    List listUnmodifiableList = Collections.unmodifiableList(k6lVar.b);
                    ArrayList arrayList = new ArrayList(k95.o(listUnmodifiableList, 10));
                    Iterator it = listUnmodifiableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((d7l) ((b2l) it.next())).j.getId()));
                    }
                    Set setN0 = CollectionsKt.n0(arrayList);
                    c8lVar.getClass();
                    p6l p6lVar = p6l.a;
                    mcj mcjVarC = c8lVar.c(p6lVar);
                    ((o7l) mcjVarC.b).e(setN0, new tmi(c8lVar, mcjVarC, p6lVar, (byte) 10));
                    p6l p6lVar2 = p6l.b;
                    mcj mcjVarC2 = c8lVar.c(p6lVar2);
                    ((o7l) mcjVarC2.b).e(setN0, new tmi(c8lVar, mcjVarC2, p6lVar2, (byte) 10));
                    break;
                }
                break;
        }
    }
}
