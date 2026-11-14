package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class t5l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z5l b;

    public /* synthetic */ t5l(z5l z5lVar, byte b) {
        this.a = b;
        this.b = z5lVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z5l z5lVar = this.b;
        switch (b) {
            case 0:
                ypd.K(z5lVar.u, ((Integer) obj).intValue(), 0, 6);
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                ypd ypdVar = z5lVar.u;
                int i = ((eyj) z5lVar.c.g()).E;
                z5l z5lVar2 = (z5l) ypdVar.c;
                z5lVar2.b();
                exg.z(z5lVar2.f, iIntValue, i);
                break;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                ypd ypdVar2 = z5lVar.u;
                pde pdeVar = z5lVar.c;
                ypdVar2.J(iIntValue2, ((eyj) pdeVar.g()).F, ((eyj) pdeVar.g()).G);
                break;
            case 3:
                z5lVar.f.postOnAnimation((Runnable) obj);
                break;
            case 4:
                z5lVar.f.removeCallbacks((Runnable) obj);
                break;
            default:
                z5lVar.f.postOnAnimation((Runnable) obj);
                break;
        }
        return Unit.a;
    }
}
