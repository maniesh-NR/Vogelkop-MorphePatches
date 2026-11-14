package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class c24 implements l99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ puj b;

    public /* synthetic */ c24(puj pujVar, byte b) {
        this.a = b;
        this.b = pujVar;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.a;
        puj pujVar = this.b;
        switch (b) {
            case 0:
                ndb ndbVar = (ndb) obj;
                if (ndbVar instanceof cma) {
                    pujVar.add(ndbVar);
                } else if (ndbVar instanceof dma) {
                    pujVar.remove(((dma) ndbVar).a);
                } else if (ndbVar instanceof wf9) {
                    pujVar.add(ndbVar);
                } else if (ndbVar instanceof xf9) {
                    pujVar.remove(((xf9) ndbVar).a);
                } else if (ndbVar instanceof nwg) {
                    pujVar.add(ndbVar);
                } else if (ndbVar instanceof owg) {
                    pujVar.remove(((owg) ndbVar).a);
                } else if (ndbVar instanceof mwg) {
                    pujVar.remove(((mwg) ndbVar).a);
                }
                break;
            default:
                ndb ndbVar2 = (ndb) obj;
                if (ndbVar2 instanceof cma) {
                    pujVar.add(ndbVar2);
                } else if (ndbVar2 instanceof dma) {
                    pujVar.remove(((dma) ndbVar2).a);
                } else if (ndbVar2 instanceof wf9) {
                    pujVar.add(ndbVar2);
                } else if (ndbVar2 instanceof xf9) {
                    pujVar.remove(((xf9) ndbVar2).a);
                } else if (ndbVar2 instanceof nwg) {
                    pujVar.add(ndbVar2);
                } else if (ndbVar2 instanceof owg) {
                    pujVar.remove(((owg) ndbVar2).a);
                } else if (ndbVar2 instanceof mwg) {
                    pujVar.remove(((mwg) ndbVar2).a);
                } else if (ndbVar2 instanceof qj7) {
                    pujVar.add(ndbVar2);
                } else if (ndbVar2 instanceof rj7) {
                    pujVar.remove(((rj7) ndbVar2).a);
                } else if (ndbVar2 instanceof pj7) {
                    pujVar.remove(((pj7) ndbVar2).a);
                }
                break;
        }
        return Unit.a;
    }
}
