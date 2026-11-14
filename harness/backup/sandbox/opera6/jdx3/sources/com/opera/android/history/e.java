package com.opera.android.history;

import J.N;
import com.opera.android.history.HistoryManager;
import defpackage.aea;
import defpackage.ati;
import defpackage.bea;
import defpackage.eb;
import defpackage.esi;
import defpackage.fg6;
import defpackage.jz1;
import defpackage.n12;
import defpackage.qde;
import defpackage.tz1;
import defpackage.wa;
import defpackage.wnm;
import defpackage.y0a;
import defpackage.yda;
import defpackage.zda;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements ati {
    public final HistoryManager a;
    public final tz1 b;
    public final a64 c;
    public boolean d;
    public aea e = aea.a;
    public final ode f;
    public final qde g;
    public final ode h;
    public final wnm i;
    public esi j;

    public e(HistoryManager historyManager, tz1 tz1Var, a64 a64Var) {
        this.a = historyManager;
        this.b = tz1Var;
        this.c = a64Var;
        a aVar = historyManager.b;
        ekc odeVar = new ode((Object) null);
        this.f = odeVar;
        l08 l08Var = l08.a;
        qde qdeVar = new qde(l08Var);
        this.g = qdeVar;
        ekc odeVar2 = new ode((Object) null);
        this.h = odeVar2;
        this.i = new wnm(l08Var, Arrays.asList(aVar, odeVar, qdeVar, odeVar2), new i51(aVar, odeVar, qdeVar, odeVar2, (byte) 10), new n12(new bea(4, this, e.class, "calculateItems", "calculateItems([Lcom/opera/android/history/HistoryManager$NativeHistoryEntry;[Lcom/opera/android/history/HistoryManager$NativeHistoryEntry;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", 0), aVar, odeVar, qdeVar, odeVar2, (byte) 1));
        new r62(tz1Var.h, new y0a(this, (byte) 3), (byte) 1);
    }

    public final void a() {
        esi esiVar = this.j;
        ode odeVar = this.h;
        if (esiVar == null) {
            this.f.r((Object) null);
            odeVar.r((Object) null);
            return;
        }
        String str = esiVar.a;
        Iterable iterable = (Iterable) this.g.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (esiVar.a(((jz1) obj).c) != -1) {
                arrayList.add(obj);
            }
        }
        int iOrdinal = this.e.ordinal();
        HistoryManager historyManager = this.a;
        if (iOrdinal == 0) {
            N.MoY3FDNp(historyManager.a, str, new eb((Object) this, (Object) arrayList, (byte) 4));
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            N.MoY3FDNp(historyManager.a, str, new wa(this, (byte) 13));
            odeVar.r(arrayList);
        }
    }

    @Override // defpackage.ysi
    public final void g(esi esiVar) {
        if (Intrinsics.a(esiVar, this.j)) {
            return;
        }
        this.d = true;
        this.j = esiVar;
        a();
    }

    @Override // defpackage.ysi
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ysi
    public final void l() {
        N.MEeZXtXn(this.a.a);
        a();
    }

    @Override // defpackage.ysi
    public final ekc m() {
        return this.i;
    }

    @Override // defpackage.ati
    public final void remove(Object obj) {
        zda zdaVar = (zda) obj;
        if (zdaVar != null) {
            if (zdaVar instanceof c) {
                HistoryManager.NativeHistoryEntry nativeHistoryEntry = ((c) zdaVar).a;
                N.MSzl$lMj(this.a.a, nativeHistoryEntry.getUrl(), nativeHistoryEntry.b());
                return;
            } else if (zdaVar instanceof yda) {
                na2.B(this.c, (CoroutineContext) null, (rx5) null, new fg6(this, zdaVar, null, (byte) 23), 3);
                qde qdeVar = this.g;
                ArrayList arrayList = qdeVar.l;
                arrayList.remove(((yda) zdaVar).a);
                qdeVar.r(CollectionsKt.k0(arrayList));
                return;
            }
        }
        h9o.p();
    }
}
