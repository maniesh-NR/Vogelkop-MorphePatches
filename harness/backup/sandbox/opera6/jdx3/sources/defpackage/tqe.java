package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tqe extends z85 {
    public long g;
    public final /* synthetic */ uqe h;

    public tqe(uqe uqeVar) {
        Objects.requireNonNull(uqeVar);
        this.h = uqeVar;
    }

    @Override // defpackage.z85, defpackage.a08, defpackage.r82
    public final void a() {
        super.a();
        this.g = System.currentTimeMillis();
    }

    @Override // defpackage.z85, defpackage.a08, defpackage.r82
    public final void d(g82 g82Var, lqm lqmVar, boolean z) {
        super.d(g82Var, lqmVar, z);
        g82 g82Var2 = this.f ? null : this.a;
        if (g82Var2 != null) {
            String str = g82Var2.a;
            uqe uqeVar = this.h;
            msh mshVarE = uqeVar.e(str, true);
            if (mshVarE != null) {
                boolean z2 = g82Var2.h;
                uy8 uy8Var = uqeVar.h;
                if (z2) {
                    uy8Var.h(2, mshVarE);
                } else {
                    uy8Var.h(0, mshVarE);
                }
            }
        }
    }

    @Override // defpackage.z85
    public final void f(g82 g82Var, y85 y85Var) {
        hf0 hf0Var;
        uqe uqeVar = this.h;
        x5f x5fVar = uqeVar.f;
        long j = y85Var.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            uc0 uc0VarA = x56VarF.A(zpaVar);
            List list = (List) uc0VarA.n(2);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                uc0VarA.q(2, -1, arrayList);
                hf0Var = new hf0(uc0VarA, 2, arrayList);
            } else {
                hf0Var = new hf0(uc0VarA, 2, list);
            }
            hf0Var.add(Long.valueOf(j));
            x5fVar.U0(x56VarF);
        }
        msh mshVarE = uqeVar.e(g82Var.a, true);
        if (mshVarE != null) {
            uy8 uy8Var = uqeVar.h;
            long j2 = this.g / 1000;
            long j3 = j / 1000;
            float fS = cs5.s(y85Var.b / 100.0f, 0.0f, 1.0f);
            if (uy8Var.s.add((String) mshVarE.v.b) && uy8Var.L.M()) {
                uy8Var.c(new ry8(mshVarE, j2, j3, fS));
            }
        }
    }
}
