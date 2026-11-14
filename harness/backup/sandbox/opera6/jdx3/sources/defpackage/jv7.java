package defpackage;

import com.opera.android.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class jv7 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ igi b;

    public /* synthetic */ jv7(igi igiVar, byte b) {
        this.a = b;
        this.b = igiVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        igi igiVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    igiVar.y0();
                }
                break;
            case 1:
                hbn hbnVar = (hbn) obj;
                ode odeVar = (ode) igiVar.f;
                if (!(hbnVar instanceof gbn)) {
                    if (!(hbnVar instanceof ebn)) {
                        if (!Intrinsics.a(hbnVar, cbn.a)) {
                            if (!(hbnVar instanceof fbn)) {
                                if (!(hbnVar instanceof bbn) && !Intrinsics.a(hbnVar, dbn.a)) {
                                    h9o.p();
                                    break;
                                }
                            } else {
                                igiVar.g = null;
                                if (kv7.a[((fbn) hbnVar).a.ordinal()] == 1) {
                                    xf8.E0(odeVar, (Object) null);
                                    ((jbn) ((Lazy) igiVar.b).get()).f(ibn.b, new jv7(igiVar, (byte) 2));
                                }
                                break;
                            }
                        } else {
                            igiVar.g = null;
                        }
                    } else {
                        igiVar.g = null;
                        ((zqk) igiVar.e).invoke(((ebn) hbnVar).a);
                    }
                } else {
                    igiVar.g = ((gbn) hbnVar).a;
                }
                xf8.E0(odeVar, hbnVar);
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    ((zqk) igiVar.e).invoke(str);
                }
                break;
        }
        return Unit.a;
    }
}
