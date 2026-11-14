package defpackage;

import com.opera.android.favorites.PushedSpeedDialFavorite;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mdh {
    public final vqi a;
    public final pdh b;
    public final cul c;
    public final ghf d;
    public final x5f e;
    public final cq5 f;
    public final nv1 g;
    public final h42 h;
    public w6j i;

    public mdh(vqi vqiVar, SettingsManager settingsManager, pdh pdhVar, cul culVar, ghf ghfVar, x5f x5fVar, cq5 cq5Var, nv1 nv1Var, v1 v1Var) {
        this.a = vqiVar;
        this.b = pdhVar;
        this.c = culVar;
        this.d = ghfVar;
        this.e = x5fVar;
        this.f = cq5Var;
        this.g = nv1Var;
        g6e g6eVar = new g6e(this, (byte) 1);
        h42 h42Var = new h42();
        this.h = h42Var;
        h42Var.s(vqiVar.f, new iwa(new rmg(this, (byte) 9), (byte) 18));
        if (culVar.a.add(g6eVar)) {
            culVar.e();
        }
        c();
        lqh lqhVar = new lqh();
        lqhVar.a = settingsManager.J();
        v1Var.F(new ty(this, lqhVar, (byte) 5));
    }

    public static void b(mdh mdhVar, boolean z, iqi iqiVar, Function1 function1, int i) {
        iqi iqiVar2 = (i & 2) != 0 ? null : iqiVar;
        if ((i & 4) != 0) {
            function1 = null;
        }
        if (!mdhVar.b.b.e()) {
            vqi vqiVar = mdhVar.a;
            new r62(vqiVar.f, new ve9(vqiVar, z, iqiVar2, new s4f(function1, mdhVar, (byte) 12), (byte) 3), (byte) 1);
        } else if (function1 != null) {
            function1.invoke(mdhVar.a());
        }
    }

    public final List a() {
        pdh pdhVar = this.b;
        if (pdhVar.b.e()) {
            return l08.a;
        }
        Set setA = pdhVar.a();
        l08 l08Var = (List) this.a.f.g();
        if (l08Var == null) {
            l08Var = l08.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) l08Var) {
            if (!setA.contains(Integer.valueOf(((tqi) obj).a))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new PushedSpeedDialFavorite((tqi) obj2, this.d));
        }
        return arrayList2;
    }

    public final void c() {
        vd0 vd0Var = this.b.b.e() ? vd0.c : vd0.b;
        x5f x5fVar = this.e;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        e66 e66VarO = x56VarF.O(zpaVar);
        e66VarO.getClass();
        e66VarO.q(21, 1, vd0Var);
        x5fVar.U0(x56VarF);
    }
}
