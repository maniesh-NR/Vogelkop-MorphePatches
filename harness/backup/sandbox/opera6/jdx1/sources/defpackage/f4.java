package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ifg b;

    public /* synthetic */ f4(ifg ifgVar, byte b) {
        this.a = b;
        this.b = ifgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ifg ifgVar = this.b;
        p1d p1dVar = (p1d) obj;
        switch (b) {
            case 0:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 1:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 2:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 3:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 4:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 5:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 6:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 7:
                if (p1dVar.a() == d2c.a || p1dVar.c() == 0) {
                    p1dVar.d(ifgVar);
                    ifgVar.d0(ybb.c(0L, ifgVar.e), 0.0f, null);
                } else {
                    p1dVar.d(ifgVar);
                    ifgVar.d0(ybb.c((p1dVar.c() - ifgVar.a) << 32, ifgVar.e), 0.0f, null);
                }
                break;
            case 8:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 9:
                p1d.p(p1dVar, ifgVar, null, 12);
                break;
            case 10:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 11:
                p1d.l(p1dVar, ifgVar, 0, 0);
                break;
            case 12:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 13:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 14:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 15:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            case 16:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
            case 17:
                p1d.f(p1dVar, ifgVar, 0, 0);
                break;
            default:
                p1d.h(p1dVar, ifgVar, 0, 0);
                break;
        }
        return Unit.a;
    }
}
