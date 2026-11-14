package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class rlc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ apc c;

    public /* synthetic */ rlc(long j, apc apcVar, byte b) {
        this.a = b;
        this.b = j;
        this.c = apcVar;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        apc apcVar = this.c;
        long j = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                wsk wskVarH = oskVar.h("DELETE FROM notifications WHERE oscoreId = ? AND sport = ?");
                try {
                    wskVarH.T0(1, j);
                    wskVarH.T0(2, apcVar.a ? 1L : 0L);
                    wskVarH.n();
                    return Unit.a;
                } finally {
                }
            case 1:
                wsk wskVarH2 = oskVar.h("UPDATE notifications SET subscribed = 1 WHERE oscoreId = ? AND sport = ?");
                try {
                    wskVarH2.T0(1, j);
                    wskVarH2.T0(2, apcVar.a ? 1L : 0L);
                    wskVarH2.n();
                    return Unit.a;
                } finally {
                }
            default:
                wsk wskVarH3 = oskVar.h("SELECT * FROM notifications where oscoreId = ? AND sport = ? LIMIT 1");
                try {
                    wskVarH3.T0(1, j);
                    wskVarH3.T0(2, apcVar.a ? 1L : 0L);
                    int iF = hyg.f(wskVarH3, "oscoreId");
                    int iF2 = hyg.f(wskVarH3, "sport");
                    int iF3 = hyg.f(wskVarH3, "ttlEndTimestamp");
                    int iF4 = hyg.f(wskVarH3, "subscribed");
                    Object r0fVar = null;
                    if (wskVarH3.n()) {
                        long j2 = wskVarH3.getLong(iF);
                        int i = (int) wskVarH3.getLong(iF2);
                        apc.b.getClass();
                        Iterator it = apc.f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((apc) next).a == i) {
                                    r0fVar = next;
                                }
                            }
                        }
                        apc apcVar2 = (apc) r0fVar;
                        if (apcVar2 == null) {
                            throw new IllegalArgumentException("Unknown sport id: " + i);
                        }
                        r0fVar = new r0f(j2, apcVar2, wskVarH3.getLong(iF3), ((int) wskVarH3.getLong(iF4)) != 0);
                    }
                    return r0fVar;
                } finally {
                }
        }
    }
}
