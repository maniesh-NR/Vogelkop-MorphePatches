package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class kt implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqh b;
    public final /* synthetic */ pqh c;
    public final /* synthetic */ nt d;

    public /* synthetic */ kt(pqh pqhVar, pqh pqhVar2, nt ntVar, byte b) {
        this.a = b;
        this.b = pqhVar;
        this.c = pqhVar2;
        this.d = ntVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nt ntVar = this.d;
        pqh pqhVar = this.c;
        pqh pqhVar2 = this.b;
        List list = (List) obj;
        switch (b) {
            case 0:
                pqhVar2.a = list;
                List list2 = (List) pqhVar.a;
                if (list2 != null) {
                    ntVar.f.r(CollectionsKt.V(list, list2));
                }
                break;
            default:
                pqhVar2.a = list;
                List list3 = (List) pqhVar.a;
                if (list3 != null) {
                    ntVar.f.r(CollectionsKt.V(list3, list));
                }
                break;
        }
        return Unit.a;
    }
}
