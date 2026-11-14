package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class nyj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qyj b;

    public /* synthetic */ nyj(qyj qyjVar, byte b) {
        this.a = b;
        this.b = qyjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qyj qyjVar = this.b;
        switch (b) {
            case 0:
                hbn hbnVar = (hbn) obj;
                ode odeVar = qyjVar.i;
                if (!(hbnVar instanceof gbn)) {
                    if (!(hbnVar instanceof ebn) && !Intrinsics.a(hbnVar, cbn.a)) {
                        if (!(hbnVar instanceof fbn)) {
                            if (!(hbnVar instanceof bbn) && !Intrinsics.a(hbnVar, dbn.a)) {
                                h9o.p();
                                break;
                            }
                        } else {
                            qyjVar.l = null;
                            if (pyj.a[((fbn) hbnVar).a.ordinal()] == 1) {
                                xf8.E0(odeVar, (Object) null);
                                ((jbn) qyjVar.e.get()).f(ibn.b, new nyj(qyjVar, (byte) 3));
                            }
                            break;
                        }
                    } else {
                        qyjVar.l = null;
                    }
                } else {
                    qyjVar.l = ((gbn) hbnVar).a;
                }
                xf8.E0(odeVar, hbnVar);
                break;
            case 1:
                qyjVar.f();
                qyjVar.m();
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    qyjVar.f();
                    qyjVar.m();
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    qyjVar.g.invoke(str);
                }
                break;
        }
        return Unit.a;
    }
}
