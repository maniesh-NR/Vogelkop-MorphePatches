package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kpd implements mpd, vqd, op5, uqd {
    public final /* synthetic */ byte a;

    public /* synthetic */ kpd(byte b) {
        this.a = b;
    }

    public /* synthetic */ kpd(String str, xjh xjhVar) {
        this.a = (byte) 16;
    }

    public /* synthetic */ kpd(boolean z, n3j n3jVar, Bundle bundle) {
        this.a = (byte) 8;
    }

    public final void a(xkg xkgVar, nod nodVar, List list) {
        switch (this.a) {
            case 18:
                xkgVar.j0(list);
                break;
            default:
                xkgVar.j0(list);
                break;
        }
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        xkg xkgVar = (xkg) obj;
        switch (this.a) {
            case 5:
                xkgVar.J();
                break;
            case 6:
                xkgVar.pause();
                break;
            case 7:
                xkgVar.u();
                break;
            case 8:
            case 13:
            case 16:
            case 18:
            case 19:
            case 20:
            case 24:
            default:
                xkgVar.f();
                break;
            case 9:
                xkgVar.K();
                break;
            case 10:
                xkgVar.p0();
                break;
            case 11:
                xkgVar.r();
                break;
            case 12:
                xkgVar.h();
                break;
            case 14:
                xkgVar.o0();
                break;
            case 15:
                xkgVar.M();
                break;
            case 17:
                xkgVar.j();
                break;
            case 21:
                xkgVar.stop();
                break;
            case 22:
                xkgVar.t();
                break;
            case 23:
                xkgVar.seekToDefaultPosition();
                break;
            case 25:
                xkgVar.a();
                break;
        }
    }

    @Override // defpackage.mpd
    public final void c(mod modVar, int i) {
        switch (this.a) {
            case 0:
                modVar.getClass();
                break;
            case 1:
                modVar.b(i);
                break;
            default:
                modVar.getClass();
                break;
        }
    }

    @Override // defpackage.vqd
    public final Object l(npd npdVar, nod nodVar, int i) {
        switch (this.a) {
            case 3:
                npdVar.getClass();
                throw new ClassCastException();
            case 4:
                npdVar.getClass();
                throw new ClassCastException();
            case 8:
                return npdVar.m(nodVar);
            case 13:
                npdVar.getClass();
                throw new ClassCastException();
            case 16:
                kod kodVar = npdVar.e;
                npdVar.r(nodVar);
                kodVar.getClass();
                return yr9.c(new e4j(-6));
            case 20:
                npdVar.getClass();
                throw new ClassCastException();
            case 24:
                npdVar.getClass();
                throw new ClassCastException();
            case 26:
                npdVar.getClass();
                throw new ClassCastException();
            default:
                npdVar.getClass();
                throw new ClassCastException();
        }
    }
}
