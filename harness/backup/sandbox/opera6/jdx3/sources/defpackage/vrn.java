package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class vrn implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vsn b;

    public /* synthetic */ vrn(vsn vsnVar, byte b) {
        this.a = b;
        this.b = vsnVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        vsn vsnVar = this.b;
        switch (b) {
            case 0:
                hbn hbnVar = (hbn) obj;
                nak nakVar = vsnVar.o;
                vsnVar.u = false;
                y1n y1nVar = vsnVar.r;
                vml.a(y1nVar);
                if (!(hbnVar instanceof gbn)) {
                    if (!(hbnVar instanceof fbn)) {
                        if (!(hbnVar instanceof bbn)) {
                            if (!Intrinsics.a(hbnVar, cbn.a) && !(hbnVar instanceof ebn) && !Intrinsics.a(hbnVar, dbn.a) && hbnVar != null) {
                                h9o.p();
                                break;
                            }
                        } else {
                            ode odeVar = ((bbn) hbnVar).c;
                            ode odeVar2 = vsnVar.c.f().i;
                            wrn wrnVar = new wrn(vsnVar, b2);
                            Object objG = odeVar2.g();
                            odeVar.k(wrnVar);
                            odeVar2.k(new edb(objG, (ekc) odeVar, (f7f) wrnVar, odeVar2));
                        }
                    } else {
                        zan zanVar = ((fbn) hbnVar).a;
                        if (usn.a[zanVar.ordinal()] == 1) {
                            fsn fsnVar = fsn.b;
                            nakVar.getClass();
                            nakVar.k((Object) null, fsnVar);
                        } else {
                            int i = jbn.i;
                            rxh rxhVarN = zch.n(zanVar);
                            if (rxhVarN != null) {
                                gsn gsnVar = new gsn(rxhVarN);
                                nakVar.getClass();
                                nakVar.k((Object) null, gsnVar);
                            }
                        }
                    }
                } else {
                    vml.d(y1nVar, pn7.f(jbn.h));
                }
                break;
            case 1:
                bzj bzjVar = (bzj) obj;
                nak nakVar2 = vsnVar.o;
                if (bzjVar instanceof vyj) {
                    int iOrdinal = ((vyj) bzjVar).a.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        xf8.G0(vsnVar.c.f().k, Boolean.TRUE);
                        fsn fsnVar2 = fsn.a;
                        nakVar2.getClass();
                        nakVar2.k((Object) null, fsnVar2);
                    } else if (iOrdinal == 2) {
                        esn esnVar = new esn(new rxh(2132020523));
                        nakVar2.getClass();
                        nakVar2.k((Object) null, esnVar);
                    } else if (iOrdinal != 3) {
                        h9o.p();
                        break;
                    } else {
                        esn esnVar2 = new esn(new rxh(2132017509));
                        nakVar2.getClass();
                        nakVar2.k((Object) null, esnVar2);
                    }
                }
                break;
            case 2:
                pg pgVar = (pg) obj;
                s62 s62Var = vsnVar.c;
                qdc qdcVar = s62Var.n;
                if (!s62Var.l()) {
                    if (!Intrinsics.a(pgVar, ng.a)) {
                        if (!Intrinsics.a(pgVar, og.a)) {
                            h9o.p();
                            break;
                        } else {
                            s62Var.f().m();
                            qdcVar.g(qcc.c);
                        }
                    } else {
                        qdcVar.g(qcc.e);
                    }
                }
                break;
            case 3:
                atn atnVar = (atn) obj;
                if (atnVar != null) {
                    vsnVar.e.invoke(atnVar.a, atnVar.b);
                }
                break;
            default:
                atn atnVar2 = (atn) obj;
                if (atnVar2 != null) {
                    vsnVar.d.invoke(atnVar2.a, atnVar2.b);
                }
                break;
        }
        return Unit.a;
    }
}
