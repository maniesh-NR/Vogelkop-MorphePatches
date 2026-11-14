package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class f5k implements kq {
    public final /* synthetic */ k5k a;

    public /* synthetic */ f5k(k5k k5kVar) {
        this.a = k5kVar;
    }

    @Override // defpackage.kq
    public final void r(mq mqVar) {
        if (mqVar.d != null) {
            for (j5k j5kVar : this.a.c.values()) {
                k5k k5kVar = j5kVar.e;
                Set set = j5kVar.a;
                if (set.remove(mqVar)) {
                    j5kVar.b.remove(mqVar);
                    uo uoVar = new uo(j5kVar.d, j5kVar.c);
                    wy wyVar = k5kVar.d;
                    ArrayList arrayList = k5kVar.a;
                    no noVar = new no(uoVar, wyVar.l, k5kVar.e, mqVar.f);
                    if (noVar.n) {
                        noVar.q = true;
                    }
                    set.add(noVar);
                    int iIndexOf = arrayList.indexOf(mqVar);
                    if (iIndexOf >= 0) {
                        arrayList.set(iIndexOf, noVar);
                        eu8 eu8Var = k5kVar.g;
                        if (eu8Var != null) {
                            eu8Var.e(mqVar, noVar);
                        }
                    }
                    yz yzVar = mqVar.d;
                    if (yzVar != null) {
                        yzVar.q = null;
                        yzVar.c();
                        return;
                    }
                    return;
                }
            }
        }
    }
}
