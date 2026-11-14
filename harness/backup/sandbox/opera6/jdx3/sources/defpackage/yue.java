package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class yue extends d53 implements j92 {
    public final l0n d;
    public final tw2 e;
    public k92 f;
    public final uqe g;

    public yue(uqe uqeVar, qre qreVar, tw2 tw2Var) {
        l0n l0nVar;
        if (qreVar == null) {
            uqeVar.getClass();
            l0nVar = null;
        } else {
            l0nVar = new l0n(uqeVar.m, new g77(uqeVar.g, qreVar, uqeVar.f));
        }
        this.d = l0nVar;
        this.e = tw2Var;
        l0nVar.c = this;
        vz5 vz5Var = l0nVar.d;
        if (vz5Var != null) {
            vz5Var.i = this;
        }
        this.g = uqeVar;
    }

    @Override // defpackage.j92
    public final void a() {
        xqe xqeVar = (xqe) this.e.b;
        xqeVar.getClass();
        xqeVar.b(Collections.EMPTY_LIST, true);
    }

    @Override // defpackage.j92
    public final Collection b() {
        k92 k92Var = this.f;
        if (k92Var == null) {
            return Collections.EMPTY_LIST;
        }
        cdg cdgVar = new cdg();
        if (k92Var.b != null) {
            cdgVar.c.b = true;
        } else {
            cdgVar.a.b = true;
        }
        return Collections.singletonList(cdgVar);
    }

    @Override // defpackage.d53
    public final c53 c(Object obj, oqe oqeVar, v82 v82Var) {
        return new k92(this, obj, oqeVar, v82Var);
    }

    @Override // defpackage.j92
    public final void d(ArrayList arrayList) {
        k92 k92Var = this.f;
        if (k92Var != null) {
            k92Var.d(arrayList, false);
        }
    }

    @Override // defpackage.j92
    public final List f() {
        return ((xqe) this.e.b).a();
    }

    @Override // defpackage.j92
    public final void g(ArrayList arrayList) {
        k92 k92Var = this.f;
        if (k92Var != null) {
            k92Var.d(arrayList, true);
        }
    }

    @Override // defpackage.j92
    public final boolean h() {
        Context context = this.g.c;
        String[] strArr = OperaApplication.K;
        fue fueVarZ = ((OperaApplication) context.getApplicationContext()).z();
        fueVarZ.d();
        return fueVarZ.a == cue.NewsFeed;
    }

    @Override // defpackage.j92
    public final void i(boolean z) {
        k92 k92Var = this.f;
        if (k92Var != null) {
            if (z || k92Var.b()) {
                k92 k92Var2 = this.f;
                k92Var2.c.a(k92Var2);
            } else {
                k92 k92Var3 = this.f;
                if (k92Var3.b != null) {
                    k92Var3.d(Collections.EMPTY_LIST, false);
                    k92 k92Var4 = this.f;
                    k92Var4.c.a(k92Var4);
                } else {
                    k92Var3.getClass();
                    k92Var3.c.d(k92Var3, new Exception());
                }
            }
            this.f = null;
        }
    }

    @Override // defpackage.j92
    public final void j(List list) {
        k92 k92Var = this.f;
        if (k92Var == null) {
            return;
        }
        k92Var.d = (ArrayList) list;
    }

    @Override // defpackage.j92
    public final void onFailure() {
        k92 k92Var = this.f;
        if (k92Var != null) {
            k92Var.c.d(k92Var, new Exception());
            this.f = null;
        }
    }
}
