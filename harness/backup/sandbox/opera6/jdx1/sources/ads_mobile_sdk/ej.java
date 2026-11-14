package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.akp;
import defpackage.bto;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.hlp;
import defpackage.jdp;
import defpackage.kyo;
import defpackage.mip;
import defpackage.sgb;
import defpackage.tso;
import defpackage.w7p;
import defpackage.zch;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ej implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ ej(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        byte b2 = 0;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new aj(nj0.a(tsoVar));
            case 1:
                return new c02((a02) tsoVar.get(), (byte) 0);
            case 2:
                sw1 sw1Var = (sw1) tsoVar.get();
                bwg.o(sw1Var);
                return sw1Var;
            case 3:
                return new ez1((zq1) tsoVar.get(), (byte) 6);
            case 4:
                return new c23((ha2) tsoVar.get());
            case 5:
                return new l61(tsoVar, false);
            case 6:
                ((mip) tsoVar.get()).getClass();
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 7:
                return new ez1((m80) tsoVar.get(), (byte) 7);
            case 8:
                yp1 yp1Var = (yp1) tsoVar.get();
                bwg.o(yp1Var);
                return yp1Var;
            case 9:
                return new cv2((ha2) tsoVar.get());
            case 10:
                return new bto((w7p) tsoVar.get());
            case 11:
                rr2 rr2Var = (rr2) tsoVar.get();
                bwg.o(rr2Var);
                return rr2Var;
            case 12:
                return new d13((kyo) tsoVar.get());
            case 13:
                return new l61(tsoVar, false);
            case 14:
                CoroutineContext coroutineContextA = kotlin.coroutines.e.a(new jg8(((qw) tsoVar.get()).c), new rh3());
                bwg.o(coroutineContextA);
                return coroutineContextA;
            case 15:
                by2 by2Var = (by2) tsoVar.get();
                bwg.o(by2Var);
                return by2Var;
            case 16:
                return new ez1((cv2) tsoVar.get(), (byte) 6);
            case 17:
                return new l61(tsoVar, false);
            case 18:
                return new e23((a33) tsoVar.get(), b2);
            case 19:
                return new e41((ek) tsoVar.get());
            case 20:
                return new akp(tsoVar, false);
            case 21:
                return Integer.valueOf(((defpackage.bu1) tsoVar.get()).priorRequestCount);
            case 22:
                return new ez1((hlp) tsoVar.get(), (byte) 7);
            case 23:
                return new es1((jdp) tsoVar.get());
            case 24:
                cd3 cd3Var = (cd3) tsoVar.get();
                bwg.o(cd3Var);
                return cd3Var;
            case 25:
                return new ez1((kv2) tsoVar.get(), (byte) 6);
            case 26:
                return new akp(tsoVar, false);
            case 27:
                jjc jjcVar = (ExecutorService) tsoVar.get();
                if (jjcVar instanceof jjc) {
                    return jjcVar;
                }
                return jjcVar instanceof ScheduledExecutorService ? new v9e((ScheduledExecutorService) jjcVar) : new s9e(jjcVar);
            case 28:
                return new File(new File((File) tsoVar.get(), "ocs"), "pmtd");
            default:
                return sgb.b(((CoroutineContext) tsoVar.get()).plus(zch.a()));
        }
    }
}
