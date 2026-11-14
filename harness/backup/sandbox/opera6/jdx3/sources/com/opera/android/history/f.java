package com.opera.android.history;

import com.opera.android.settings.SettingsManager;
import defpackage.aca;
import defpackage.aea;
import defpackage.bw3;
import defpackage.cti;
import defpackage.h42;
import defpackage.j4c;
import defpackage.jz1;
import defpackage.kea;
import defpackage.l42;
import defpackage.l6e;
import defpackage.lqm;
import defpackage.orm;
import defpackage.p6l;
import defpackage.q7j;
import defpackage.s2;
import defpackage.tz1;
import defpackage.ux3;
import defpackage.vx3;
import defpackage.wnm;
import defpackage.yda;
import defpackage.yk6;
import defpackage.zda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends l7n {
    public final SettingsManager b;
    public final yk6 c;
    public final j4c d;
    public final bw3 e;
    public final d f;
    public final wnm g;

    public f(orm ormVar, HistoryManager historyManager, tz1 tz1Var, a64 a64Var, SettingsManager settingsManager, yk6 yk6Var, j4c j4cVar, bw3 bw3Var) {
        this.b = settingsManager;
        this.c = yk6Var;
        this.d = j4cVar;
        this.e = bw3Var;
        d dVar = new d(new e(historyManager, tz1Var, a64Var), ormVar);
        this.f = dVar;
        this.g = xf8.Y(f(), (h42) dVar.f, yk6Var.j, new s2(2, this, f.class, "calculateState", "calculateState(Ljava/util/List;Z)Lcom/opera/android/history/HistoryViewState;", 0, (byte) 12));
    }

    public final kea f() {
        return new kea(false, this.f.l.e, ((Boolean) this.c.j.g()).booleanValue() ? e82.E(new aea[]{aea.a, aea.b}) : Collections.singleton(aea.a), l08.a);
    }

    public final String g(zda zdaVar) {
        if (zdaVar != null) {
            if (zdaVar instanceof yda) {
                jz1 jz1Var = ((yda) zdaVar).a;
                String str = jz1Var.a;
                String str2 = jz1Var.b;
                l6e l6eVarC = this.e.a.c(9223372036854775805L);
                l42 l42Var = l6eVarC instanceof l42 ? (l42) l6eVarC : null;
                if (l42Var != null) {
                    zg zgVarO = zg.o(2, l42Var.d, l42Var.r(str2, str));
                    if (zgVarO != null) {
                        return cti.a(zgVarO, l42Var, cti.a, p6l.a);
                    }
                }
                return null;
            }
            if (zdaVar instanceof c) {
                return ((c) zdaVar).a.getUrl();
            }
        }
        h9o.p();
        return null;
    }

    public final void h(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof aca) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((aca) obj2).a());
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            String strG = g((zda) obj3);
            if (strG == null || strG.length() <= 0) {
                strG = null;
            }
            if (strG != null) {
                arrayList3.add(strG);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        vx3 vx3Var = new vx3(lqm.c);
        arrayList3.forEach(new ux3(vx3Var, true));
        vx3Var.c(true);
        vx3Var.e(z);
        vx3Var.a(this.b.C() == q7j.FOREGROUND);
        vx3Var.d(true);
        vx3Var.f = false;
        am2.v(vx3Var);
    }

    public final void i(aea aeaVar) {
        e eVar = this.f.l;
        if (eVar.e == aeaVar) {
            return;
        }
        eVar.e = aeaVar;
        eVar.a();
        this.g.u();
    }
}
