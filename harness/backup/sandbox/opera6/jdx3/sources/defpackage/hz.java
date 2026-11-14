package defpackage;

import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hz implements Callback, dmk {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ hz() {
        this.a = (byte) 3;
    }

    public /* synthetic */ hz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(n1 n1Var) {
        iyk iykVar = (iyk) this.b;
        if (iykVar == null) {
            return;
        }
        iykVar.run(new ex1(n1Var, (ix1) n1Var.b));
        this.b = null;
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(bmk bmkVar) {
        a(new hx1(new u7k(bmkVar.c)));
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(cmk cmkVar) {
        a(new fx1("Subscription plans are in an unexpected state"));
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(zlk zlkVar) {
        a(new fx1("Failed to fetch subscription plans"));
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        hf0 hf0Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                List<ng0> list = (List) obj;
                x5f x5fVar = ((OperaApplication) this.b).L().c;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    q56 q56VarZ = x56VarF.z(zpaVar);
                    List list2 = (List) q56VarZ.n(9);
                    if (list2 == null || list2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        q56VarZ.q(9, 1, arrayList);
                        hf0Var = new hf0(q56VarZ, 9, arrayList);
                    } else {
                        hf0Var = new hf0(q56VarZ, 9, list2);
                    }
                    for (ng0 ng0Var : list) {
                        mg0 mg0Var = new mg0(2443, -1, 1);
                        mg0Var.q(0, ng0Var == null ? 0 : 1, ng0Var);
                        hf0Var.add(mg0Var);
                    }
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 2:
                isl islVar = (isl) obj;
                bhi bhiVar = (bhi) this.b;
                if (islVar != null) {
                    if (islVar instanceof hsl) {
                        p0i p0iVar = t0i.b;
                        bhiVar.resumeWith(new q0i(new Exception("No token available")));
                        break;
                    } else if (islVar instanceof jsl) {
                        p0i p0iVar2 = t0i.b;
                        bhiVar.resumeWith(((jsl) islVar).a);
                        break;
                    }
                }
                h9o.p();
                break;
            default:
                ((ylk) obj).s0(this);
                break;
        }
    }
}
