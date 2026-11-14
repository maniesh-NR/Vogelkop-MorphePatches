package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k92 extends c53 {
    public ArrayList d;
    public final /* synthetic */ yue e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k92(yue yueVar, Object obj, oqe oqeVar, v82 v82Var) {
        super(obj, oqeVar, v82Var);
        this.e = yueVar;
    }

    @Override // defpackage.c53
    public final void a() {
        yue yueVar = this.e;
        if (yueVar.f == this) {
            l0n l0nVar = yueVar.d;
            vz5 vz5Var = l0nVar.d;
            if (vz5Var != null) {
                vz5Var.a();
            }
            vz5 vz5Var2 = l0nVar.e;
            if (vz5Var2 != null) {
                vz5Var2.a();
                l0nVar.e = null;
            }
            yueVar.f = null;
        }
        super.a();
    }

    @Override // defpackage.c53
    public final boolean b() {
        ArrayList arrayList = this.d;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // defpackage.c53
    public final void c() {
        vz5 vz5Var;
        this.c.b(this);
        yue yueVar = this.e;
        k92 k92Var = yueVar.f;
        if (k92Var != null) {
            k92Var.a();
        }
        yueVar.f = this;
        l0n l0nVar = yueVar.d;
        za9 za9VarB = l0nVar.b();
        vz5 vz5Var2 = l0nVar.e;
        if (vz5Var2 != null || l0nVar.c == null) {
            return;
        }
        boolean z = za9VarB.a;
        if (z || za9VarB.b) {
            if (!l0nVar.g || l0nVar.h == null) {
                l0nVar.e();
                return;
            }
            if (vz5Var2 == null) {
                if (z || (vz5Var = l0nVar.d) == null) {
                    l0nVar.d(z);
                } else if (za9VarB.b) {
                    vz5Var.c(null);
                }
            }
        }
    }

    public final void d(List list, boolean z) {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            if (!(list instanceof ArrayList)) {
                list = new ArrayList(list);
            }
            this.d = (ArrayList) list;
        } else if (z) {
            arrayList.addAll(list);
        } else {
            arrayList.addAll(0, list);
        }
    }
}
