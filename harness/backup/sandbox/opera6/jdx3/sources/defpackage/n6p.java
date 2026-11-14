package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class n6p implements n1p {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ o7p b;
    public final /* synthetic */ gqo c;

    public /* synthetic */ n6p(gqo gqoVar, o7p o7pVar) {
        this.c = gqoVar;
        this.b = o7pVar;
    }

    public /* synthetic */ n6p(o7p o7pVar, gqo gqoVar) {
        this.b = o7pVar;
        this.c = gqoVar;
    }

    @Override // defpackage.n1p
    public final void invoke(Object obj) {
        uuj uujVar;
        vjo vjoVar;
        byte b = this.a;
        gqo gqoVar = this.c;
        o7p o7pVar = this.b;
        t0i t0iVar = (t0i) obj;
        switch (b) {
            case 0:
                gqoVar.invoke(t0iVar);
                Object obj2 = t0iVar.a;
                if (!(obj2 instanceof q0i)) {
                    o7pVar.o = new ny3((ylp) obj2, o7pVar.i, new u6p(o7pVar, (byte) 1), o7pVar.t);
                    uuj uujVar2 = o7pVar.c;
                    if (uujVar2 != null) {
                        uujVar2.a();
                    }
                }
                Throwable thD = t0i.d(obj2);
                if (thD != null && (uujVar = o7pVar.c) != null) {
                    uujVar.g(b8h.a(thD));
                    break;
                }
                break;
            default:
                Object obj3 = t0iVar.a;
                y2p y2pVar = (y2p) (obj3 instanceof q0i ? null : obj3);
                if (y2pVar != null) {
                    sro sroVar = (sro) y2pVar.D.getValue();
                    if (sroVar != null) {
                        gqoVar.invoke(t0iVar);
                        na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new y6p(o7pVar, sroVar, (mt5) null), 3);
                        break;
                    } else {
                        vjoVar = new vjo(9006, "Main image is missing after a successful download");
                    }
                } else {
                    vjoVar = null;
                }
                vjo vjoVarD = t0i.d(obj3);
                if (vjoVarD != null) {
                    vjoVar = vjoVarD;
                } else if (vjoVar == null) {
                    vjoVar = new vjo(-1, (String) null);
                }
                gqoVar.invoke(new t0i(new q0i(vjoVar)));
                uuj uujVar3 = o7pVar.c;
                if (uujVar3 != null) {
                    uujVar3.g(b8h.a(vjoVar));
                    break;
                }
                break;
        }
    }
}
