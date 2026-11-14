package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class opd implements zpd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqd b;

    public /* synthetic */ opd(aqd aqdVar, byte b) {
        this.a = b;
        this.b = aqdVar;
    }

    public /* synthetic */ opd(aqd aqdVar, n3j n3jVar, Bundle bundle) {
        this.a = (byte) 1;
        this.b = aqdVar;
    }

    public /* synthetic */ opd(aqd aqdVar, xjh xjhVar) {
        this.a = (byte) 2;
        this.b = aqdVar;
    }

    @Override // defpackage.zpd
    public final void b(nod nodVar) {
        byte b = this.a;
        aqd aqdVar = this.b;
        switch (b) {
            case 0:
                aqdVar.f.t.o0();
                break;
            case 1:
                aqdVar.f.m(nodVar);
                break;
            case 2:
                npd npdVar = aqdVar.f;
                if (npdVar.t.w0() != null) {
                    kod kodVar = npdVar.e;
                    npdVar.r(nodVar);
                    kodVar.getClass();
                    yr9.c(new e4j(-6));
                    break;
                }
                break;
            case 3:
                aqdVar.f.t.r();
                break;
            case 4:
                aqdVar.f.t.h();
                break;
            case 5:
                aqdVar.f.t.p0();
                break;
            case 6:
                aqdVar.f.f(nodVar, true);
                break;
            case 7:
                aqdVar.f.t.a();
                break;
            case 8:
                aqdVar.f.t.stop();
                break;
            case 9:
                npd npdVar2 = aqdVar.f;
                xkg xkgVar = npdVar2.t;
                if (!tym.Y(xkgVar, npdVar2.p)) {
                    tym.E(xkgVar);
                    break;
                } else {
                    tym.F(xkgVar);
                    break;
                }
            case 10:
                aqdVar.f.t.M();
                break;
            case 11:
                aqdVar.f.t.u();
                break;
            default:
                tym.E(aqdVar.f.t);
                break;
        }
    }
}
