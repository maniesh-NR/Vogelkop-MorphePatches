package ads_mobile_sdk;

import defpackage.akp;
import defpackage.aqo;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.hlp;
import defpackage.sbp;
import defpackage.sgb;
import defpackage.tso;
import defpackage.wzo;
import defpackage.zch;
import java.io.File;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class hf implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ hf(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new ef(nj0.a(tsoVar));
            case 1:
                return new ez1((hlp) tsoVar.get(), (byte) 0);
            case 2:
                return sko.j("afma-sdk-a-v", (String) tsoVar.get());
            case 3:
                return new ez1((c23) tsoVar.get(), (byte) 6);
            case 4:
                return new akp(tsoVar, false);
            case 5:
                return new File(new File((File) tsoVar.get(), "ocs"), "pcbc");
            case 6:
                aq3 aq3Var = (aq3) tsoVar.get();
                bwg.o(aq3Var);
                return aq3Var;
            case 7:
                return new ez1((m21) tsoVar.get(), (byte) 7);
            case 8:
                return new gu2((String) tsoVar.get());
            case 9:
                return new ez1((cn3) tsoVar.get(), (byte) 6);
            case 10:
                return new l61(tsoVar, false);
            case 11:
                return new ek((xq0) tsoVar.get());
            case 12:
                return sgb.b(((CoroutineContext) tsoVar.get()).plus(zch.a()));
            case 13:
                return new ez1((wzo) tsoVar.get(), (byte) 0);
            case 14:
                return new ez1((en3) tsoVar.get(), (byte) 6);
            case 15:
                return new ez1((aqo) tsoVar.get(), (byte) 1);
            case 16:
                return new File(new File((File) tsoVar.get(), "ocs"), "pcam.jar");
            case 17:
                return new ez1((ql3) tsoVar.get(), (byte) 3);
            case 18:
                return new ez1((kv2) tsoVar.get(), (byte) 7);
            case 19:
                return new e7((ek) tsoVar.get(), (byte) 10);
            case 20:
                return new iv1(nj0.a(tsoVar));
            case 21:
                return new ez1((cn3) tsoVar.get(), (byte) 0);
            case 22:
                return new ez1((im1) tsoVar.get(), (byte) 6);
            case 23:
                return new l61(tsoVar, true);
            case 24:
                return new ez1((m80) tsoVar.get(), (byte) 1);
            case 25:
                return new ez1((cn3) tsoVar.get(), (byte) 7);
            case 26:
                return new ez1((aqo) tsoVar.get(), (byte) 6);
            case 27:
                return sgb.b(((CoroutineContext) tsoVar.get()).plus(zch.a()));
            case 28:
                sbp sbpVar = (sbp) tsoVar.get();
                bwg.o(sbpVar);
                return sbpVar;
            default:
                return new ez1((en3) tsoVar.get(), (byte) 0);
        }
    }
}
