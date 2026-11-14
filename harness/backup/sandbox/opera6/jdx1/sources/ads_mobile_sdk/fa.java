package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import defpackage.hlo;
import defpackage.j6p;
import defpackage.k3p;
import defpackage.mip;
import defpackage.tso;
import defpackage.yxo;
import java.util.Optional;

/* loaded from: classes.dex */
public final class fa implements hlo {
    public final ob1 a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final tso g;
    public final tso h;
    public final tso i;
    public final tso j;
    public final /* synthetic */ byte k = 2;

    public fa(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, n90 n90Var, tso tsoVar4, tso tsoVar5, ob1 ob1Var2, tso tsoVar6, ob1 ob1Var3) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.j = n90Var;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.e = ob1Var2;
        this.i = tsoVar6;
        this.h = ob1Var3;
    }

    public fa(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var2, tso tsoVar4, tso tsoVar5, ob1 ob1Var3, tso tsoVar6, ob1 ob1Var4) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = ob1Var2;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.h = ob1Var3;
        this.i = tsoVar6;
        this.j = ob1Var4;
    }

    public fa(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, tso tsoVar7, tso tsoVar8, tso tsoVar9) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.f = tsoVar4;
        this.g = tsoVar5;
        this.i = tsoVar6;
        this.e = tsoVar7;
        this.h = tsoVar8;
        this.j = tsoVar9;
    }

    public fa(tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, ob1 ob1Var2, ob1 ob1Var3, b23 b23Var, b23 b23Var2, b23 b23Var3, tso tsoVar4) {
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.a = ob1Var;
        this.e = ob1Var2;
        this.h = ob1Var3;
        this.j = b23Var;
        this.g = b23Var2;
        this.i = b23Var3;
        this.f = tsoVar4;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.k;
        tso tsoVar = this.f;
        tso tsoVar2 = this.i;
        tso tsoVar3 = this.g;
        tso tsoVar4 = this.j;
        tso tsoVar5 = this.h;
        tso tsoVar6 = this.e;
        ob1 ob1Var = this.a;
        tso tsoVar7 = this.d;
        tso tsoVar8 = this.c;
        tso tsoVar9 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) ob1Var.a;
                nx5 nx5Var = (nx5) tsoVar9.get();
                z9 z9Var = (z9) tsoVar8.get();
                kj0 kj0Var = (kj0) tsoVar7.get();
                View view = (View) ((ob1) tsoVar6).a;
                yxo yxoVar = new yxo(context, nx5Var, z9Var, kj0Var, (mip) tsoVar.get(), (qr0) tsoVar3.get(), (av2) ((ob1) tsoVar5).a, (g0) tsoVar2.get(), (a2) ((ob1) tsoVar4).a);
                yxoVar.i = view;
                yxoVar.a(view);
                return yxoVar;
            case 1:
                return new ah3((Context) ob1Var.a, (qr0) tsoVar9.get(), (mip) tsoVar8.get(), (mh3) tsoVar7.get(), (kl0) tsoVar.get(), (i41) tsoVar3.get(), (String) tsoVar2.get(), (String) tsoVar6.get(), nj0.a(tsoVar5), (mi0) tsoVar4.get());
            case 2:
                Context context2 = (Context) ob1Var.a;
                nx5 nx5Var2 = (nx5) tsoVar9.get();
                fr3 fr3Var = (fr3) tsoVar8.get();
                kj0 kj0Var2 = (kj0) tsoVar7.get();
                Optional optional = (Optional) ((n90) tsoVar4).get();
                j6p j6pVar = new j6p(context2, nx5Var2, fr3Var, kj0Var2, (mip) tsoVar.get(), (qr0) tsoVar3.get(), (av2) ((ob1) tsoVar6).a, (g0) tsoVar2.get(), (a2) ((ob1) tsoVar5).a);
                cy0 cy0Var = (cy0) optional.orElse(null);
                j6pVar.i = cy0Var;
                if (cy0Var != null) {
                    j6pVar.a(cy0Var);
                }
                return j6pVar;
            default:
                return new j63((jjc) tsoVar9.get(), (a) tsoVar8.get(), (rp1) tsoVar7.get(), (ga3) ob1Var.a, (String) ((ob1) tsoVar6).a, (k3p) ((ob1) tsoVar5).a, (b23) tsoVar4, (b23) tsoVar3, (b23) tsoVar2, (th3) tsoVar.get());
        }
    }
}
