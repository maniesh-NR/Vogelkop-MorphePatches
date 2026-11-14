package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import defpackage.akp;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.sgb;
import defpackage.tso;
import defpackage.uie;
import defpackage.vkp;
import defpackage.wzo;
import defpackage.yxo;
import defpackage.zch;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mw implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ mw(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return sgb.b(((CoroutineContext) tsoVar.get()).plus(zch.a()));
            case 1:
                return new l61(tsoVar, false);
            case 2:
                return new ez1((f93) tsoVar.get(), (byte) 1);
            case 3:
                return new ka1(nj0.a(tsoVar));
            case 4:
                return new ke2((xq0) tsoVar.get());
            case 5:
                return new ez1((wzo) tsoVar.get(), (byte) 3);
            case 6:
                return new ez1((en3) tsoVar.get(), (byte) 7);
            case 7:
                return new ez1((m80) tsoVar.get(), (byte) 6);
            case 8:
                Optional optional = (Optional) tsoVar.get();
                Set setSingleton = (!optional.isPresent() || ((uie) optional.get()).l() == null) ? v08.a : Collections.singleton(av2.f);
                bwg.o(setSingleton);
                return setSingleton;
            case 9:
                return new kw1((zt1) tsoVar.get());
            case 10:
                ur2 ur2Var = (ur2) tsoVar.get();
                bwg.o(ur2Var);
                return ur2Var;
            case 11:
                return new ez1((in3) tsoVar.get(), (byte) 0);
            case 12:
                return new a10((yxo) tsoVar.get(), (byte) 2);
            case 13:
                qr0 qr0Var = (qr0) tsoVar.get();
                qr0Var.getClass();
                return Integer.valueOf(((Number) qr0Var.a("gads:offline_database_version_decagon", (Object) 1, (Function1) fo.a$11)).intValue());
            case 14:
                return new l61(tsoVar, false);
            case 15:
                DisplayMetrics displayMetrics = ((Context) tsoVar.get()).getResources().getDisplayMetrics();
                bwg.o(displayMetrics);
                return displayMetrics;
            case 16:
                return new ez1((fa1) tsoVar.get(), (byte) 1);
            case 17:
                return new lg0((ek) tsoVar.get());
            case 18:
                return new ez1((kv2) tsoVar.get(), (byte) 3);
            case 19:
                return new ez1((a1) tsoVar.get(), (byte) 7);
            case 20:
                return new lx1((zt1) tsoVar.get());
            case 21:
                sx2 sx2Var = (sx2) tsoVar.get();
                bwg.o(sx2Var);
                return sx2Var;
            case 22:
                return new k1(nj0.a(tsoVar));
            case 23:
                return new a10((hr1) tsoVar.get(), (byte) 3);
            case 24:
                return new m21((vkp) tsoVar.get());
            case 25:
                qr0 qr0Var2 = (qr0) tsoVar.get();
                qr0Var2.getClass();
                return Long.valueOf(pn7.f(((pn7) qr0Var2.a("gads:http_url_connection_factory:timeout_millis", new pn7(qr0.z), fo.a$18)).a));
            case 26:
                return new akp(tsoVar, false);
            case 27:
                return new m80((nx5) tsoVar.get());
            case 28:
                return new ez1((n23) tsoVar.get(), (byte) 1);
            default:
                return new ez1((ke2) tsoVar.get(), (byte) 3);
        }
    }
}
