package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class yf9 implements l99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ afe c;

    public /* synthetic */ yf9(ArrayList arrayList, afe afeVar, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = afeVar;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.a;
        afe afeVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                ndb ndbVar = (ndb) obj;
                if (ndbVar instanceof wf9) {
                    arrayList.add(ndbVar);
                } else if (ndbVar instanceof xf9) {
                    arrayList.remove(((xf9) ndbVar).a);
                }
                afeVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                ndb ndbVar2 = (ndb) obj;
                if (ndbVar2 instanceof nwg) {
                    arrayList.add(ndbVar2);
                } else if (ndbVar2 instanceof owg) {
                    arrayList.remove(((owg) ndbVar2).a);
                } else if (ndbVar2 instanceof mwg) {
                    arrayList.remove(((mwg) ndbVar2).a);
                }
                afeVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return Unit.a;
    }
}
