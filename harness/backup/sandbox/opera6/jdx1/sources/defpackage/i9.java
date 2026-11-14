package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i9 implements ub7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public i9(ndc ndcVar, gdc gdcVar, pqh pqhVar) {
        this.a = (byte) 2;
        this.c = ndcVar;
        this.b = gdcVar;
        this.d = pqhVar;
    }

    @Override // defpackage.ub7
    public final void dispose() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Function0) obj3).invoke();
                ((ndc) obj2).getLifecycle().b((h9) obj);
                break;
            case 1:
                ((puj) obj3).remove(obj2);
                ((de1) obj).d.k(obj2);
                break;
            case 2:
                ((ndc) obj2).getLifecycle().b((gdc) obj3);
                qz2 qz2Var = (qz2) ((pqh) obj).a;
                if (qz2Var != null) {
                    qz2Var.a();
                    break;
                }
                break;
            default:
                uji ujiVar = (uji) obj3;
                yji yjiVar = (yji) obj;
                if (ujiVar.b.k(obj2) == yjiVar) {
                    Map map = ujiVar.a;
                    Map mapD = yjiVar.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj2, mapD);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }
}
