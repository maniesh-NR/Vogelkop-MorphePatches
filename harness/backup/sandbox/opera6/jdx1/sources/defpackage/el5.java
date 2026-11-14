package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class el5 implements idc {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ el5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public el5(mdc mdcVar) {
        this.a = (byte) 3;
        this.b = mdcVar;
        y15 y15Var = y15.c;
        Class<?> cls = mdcVar.getClass();
        w15 w15Var = (w15) y15Var.a.get(cls);
        this.c = w15Var == null ? y15Var.a(cls, null) : w15Var;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                dl5 dl5Var = (dl5) obj;
                tcc lifecycle = dl5Var.a.getLifecycle();
                qcc qccVar = ((qdc) lifecycle).i;
                if (qccVar != qcc.a) {
                    if (qccVar.d(qcc.c)) {
                        lifecycle.b(this);
                        ((iu2) obj2).run(dl5Var);
                        break;
                    }
                } else {
                    lifecycle.b(this);
                    break;
                }
                break;
            case 1:
                as6 as6Var = (as6) obj;
                switch (bs6.a[occVar.ordinal()]) {
                    case 1:
                        as6Var.W(ndcVar);
                        break;
                    case 2:
                        as6Var.onStart(ndcVar);
                        break;
                    case 3:
                        as6Var.onResume(ndcVar);
                        break;
                    case 4:
                        as6Var.onPause(ndcVar);
                        break;
                    case 5:
                        as6Var.onStop(ndcVar);
                        break;
                    case 6:
                        as6Var.onDestroy(ndcVar);
                        break;
                    case 7:
                        qp2.o("ON_ANY must not been send by anybody");
                        break;
                    default:
                        h9o.p();
                        break;
                }
                idc idcVar = (idc) obj2;
                if (idcVar != null) {
                    idcVar.E(ndcVar, occVar);
                    break;
                }
                break;
            case 2:
                if (occVar == occ.ON_START) {
                    ((tcc) obj).b(this);
                    ((pki) obj2).d();
                    break;
                }
                break;
            default:
                mdc mdcVar = (mdc) obj;
                HashMap map = ((w15) obj2).a;
                w15.a((List) map.get(occVar), ndcVar, occVar, mdcVar);
                w15.a((List) map.get(occ.ON_ANY), ndcVar, occVar, mdcVar);
                break;
        }
    }
}
