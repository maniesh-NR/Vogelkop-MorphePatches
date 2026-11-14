package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rz2 implements ub7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rz2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ub7
    public final void dispose() throws Exception {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mz2 mz2Var = (mz2) obj2;
                qf5 qf5Var = (qf5) obj;
                if (mz2Var.a == null) {
                    if (mz2Var.b == null) {
                        qp2.n("Unreachable");
                        break;
                    } else {
                        qf5Var.a.remove();
                        break;
                    }
                } else {
                    qf5Var.b.e();
                    break;
                }
            case 1:
                ((d7b) obj2).a.k((b7b) obj);
                break;
            case 2:
                ((z6c) obj2).c.k(obj);
                break;
            case 3:
                ((ekc) obj2).p((ks6) obj);
                break;
            case 4:
                afe afeVar = (afe) obj2;
                nwg nwgVar = (nwg) afeVar.getValue();
                if (nwgVar != null) {
                    mwg mwgVar = new mwg(nwgVar);
                    lde ldeVar = (lde) obj;
                    if (ldeVar != null) {
                        ldeVar.b(mwgVar);
                    }
                    afeVar.setValue(null);
                    break;
                }
                break;
            case 5:
                ((sjl) obj2).c.remove((Function1) obj);
                break;
            case 6:
                ((b3m) obj2).k.remove((b3m) obj);
                break;
            case 7:
                b3m b3mVar = (b3m) obj2;
                p2m p2mVar = (p2m) ((q2m) obj).b.getValue();
                if (p2mVar != null) {
                    b3mVar.j.remove(p2mVar.a);
                    break;
                }
                break;
            case 8:
                ((b3m) obj2).j.remove((w2m) obj);
                break;
            case 9:
                kxn kxnVar = (kxn) obj;
                ArrayList arrayList = ((bpb) obj2).a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    kxnVar.a.a.remove(((v63) obj3).a);
                }
                break;
            default:
                k3o k3oVar = (k3o) obj2;
                View view = (View) obj;
                int i2 = k3oVar.v - 1;
                k3oVar.v = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = r5n.a;
                    h5n.c(view, null);
                    n2o.a(view, null);
                    view.removeOnAttachStateChangeListener(k3oVar.w);
                    break;
                }
                break;
        }
    }
}
