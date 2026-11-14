package defpackage;

import J.N;
import com.leanplum.internal.Constants;
import com.opera.android.webcore.WebcoreRpcBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class rrc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urc b;

    public /* synthetic */ rrc(urc urcVar, byte b) {
        this.a = b;
        this.b = urcVar;
    }

    public final Object invoke(Object obj) throws JSONException {
        byte b = this.a;
        byte b2 = 1;
        urc urcVar = this.b;
        switch (b) {
            case 0:
                nv6 nv6Var = (nv6) urcVar.h.e;
                nv6Var.getClass();
                yzb yzbVar = new yzb((Object) nv6Var, (byte) 8);
                vpb vpbVar = new vpb();
                orb orbVar = new orb();
                vpbVar.a(orbVar);
                orbVar.p(((cla) obj).a(), Constants.Params.STATE);
                qq8 qq8Var = (qq8) nv6Var.a;
                String strH = qq8Var.h();
                orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "views.v1.notifyHostStateChanged");
                orbVarJ.p(vpbVar, Constants.Params.PARAMS);
                orbVarJ.p(strH, "id");
                qq8Var.l(orbVarJ, new rkc(yzbVar, b2));
                break;
            case 1:
                ((WebcoreRpcBridge) urcVar.h.d).a((String) obj);
                break;
            case 2:
                if (((bp7) obj) == bp7.c) {
                    urcVar.a();
                }
                break;
            case 3:
                xoc xocVar = urcVar.d;
                HashMap map = xocVar.d;
                HashMap map2 = xocVar.c;
                x5f x5fVar = xocVar.a;
                zpa zpaVar = x5fVar.d;
                HashMap map3 = xocVar.b;
                for (Map.Entry entry : map3.entrySet()) {
                    String str = (String) entry.getKey();
                    List listK0 = CollectionsKt.k0((Set) entry.getValue());
                    if (x5fVar.h) {
                        x56 x56VarF = zpa.F();
                        new ck0(zpaVar, x56VarF).e().a().a(str, new fy5(listK0, (byte) 2));
                        x5fVar.U0(x56VarF);
                    }
                }
                map3.clear();
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List listK02 = CollectionsKt.k0((Set) entry2.getValue());
                    if (x5fVar.h) {
                        x56 x56VarF2 = zpa.F();
                        new ck0(zpaVar, x56VarF2).e().a().a(str2, new fy5(listK02, (byte) 3));
                        x5fVar.U0(x56VarF2);
                    }
                }
                map2.clear();
                for (Map.Entry entry3 : map.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    List listK03 = CollectionsKt.k0((Set) entry3.getValue());
                    if (x5fVar.h) {
                        x56 x56VarF3 = zpa.F();
                        new ck0(zpaVar, x56VarF3).e().a().a(str3, new fy5(listK03, (byte) 1));
                        x5fVar.U0(x56VarF3);
                    }
                }
                map.clear();
                if (xocVar.e) {
                    if (x5fVar.h) {
                        x56 x56VarF4 = zpa.F();
                        new ck0(zpaVar, x56VarF4).b(new rkc((Object) xg0.f, (byte) 25));
                        x5fVar.U0(x56VarF4);
                    }
                    xocVar.e = false;
                }
                WebcoreRpcBridge webcoreRpcBridge = (WebcoreRpcBridge) urcVar.h.d;
                N.MVisE3We(webcoreRpcBridge.a);
                webcoreRpcBridge.a = 0L;
                urcVar.a.b();
                break;
            default:
                urcVar.j.r(((Boolean) obj).booleanValue() ? trc.b : trc.c);
                urcVar.l = false;
                break;
        }
        return Unit.a;
    }
}
