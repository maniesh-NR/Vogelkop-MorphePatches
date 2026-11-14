package defpackage;

import ads_mobile_sdk.cy0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.lt1;
import ads_mobile_sdk.ve2;
import ads_mobile_sdk.wt1;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ts3 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(cy0 cy0Var, String str, UUID uuid, String str2, String str3, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = cy0Var;
        this.v = str;
        this.w = uuid;
        this.x = str2;
        this.y = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(cy0 cy0Var, mt5 mt5Var, String str, String str2, String str3, String str4) {
        super(2, mt5Var);
        this.u = cy0Var;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(ve2 ve2Var, it1 it1Var, wt1 wt1Var, prb prbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = wt1Var;
        this.w = it1Var;
        this.x = prbVar;
        this.y = ve2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts3(us3 us3Var, wye wyeVar, gb3 gb3Var, hv hvVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = us3Var;
        this.w = wyeVar;
        this.x = gb3Var;
        this.y = hvVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        switch (b) {
            case 0:
                ts3 ts3Var = new ts3((us3) obj5, (wye) obj4, (gb3) obj3, (hv) obj2, mt5Var);
                ts3Var.u = obj;
                return ts3Var;
            case 1:
                return new ts3((cy0) this.u, (String) obj5, (UUID) obj4, (String) obj3, (String) obj2, mt5Var);
            case 2:
                return new ts3((cy0) this.u, mt5Var, (String) obj5, (String) obj4, (String) obj3, (String) obj2);
            default:
                ve2 ve2Var = (ve2) obj2;
                ts3 ts3Var2 = new ts3(ve2Var, (it1) obj4, (wt1) obj5, (prb) obj3, mt5Var);
                ts3Var2.u = obj;
                return ts3Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        byte b2 = 3;
        Object obj2 = this.y;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                nx5 nx5Var = (nx5) this.u;
                us3 us3Var = (us3) obj4;
                mt5 mt5Var = null;
                na2.B(nx5Var, null, null, new s3(us3Var, (wye) obj3, (gb3) obj5, mt5Var, (byte) 11), 3);
                return na2.B(nx5Var, null, null, new r3(us3Var, (hv) obj2, mt5Var, (byte) 10), 3);
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cy0 cy0Var = (cy0) this.u;
                StringBuilder sb = new StringBuilder();
                sb.append((String) obj4);
                sb.append("({\"id\": \"");
                sb.append((UUID) obj3);
                sb.append("\", \"args\": ");
                sb.append((String) obj5);
                cy0Var.evaluateJavascript(p3p.n(sb, ", \"use_javascript_interface\": \"", (String) obj2, "\"});"), null);
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                ((cy0) this.u).loadDataWithBaseURL((String) obj4, (String) obj3, (String) obj5, (String) obj2, null);
                return Unit.a;
            default:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                nx5 nx5Var2 = (nx5) this.u;
                wt1 wt1Var = (wt1) obj4;
                CoroutineContext coroutineContext = wt1Var.b;
                it1 it1Var = (it1) obj3;
                prb prbVar = (prb) obj5;
                mt5 mt5Var2 = null;
                na2.B(nx5Var2, coroutineContext, null, new lt1(it1Var, wt1Var, prbVar, mt5Var2, (byte) 0), 2);
                na2.B(nx5Var2, coroutineContext, null, new lt1(it1Var, wt1Var, prbVar, mt5Var2, (byte) 1), 2);
                na2.B(nx5Var2, coroutineContext, null, new lt1(it1Var, wt1Var, prbVar, mt5Var2, (byte) 2), 2);
                na2.B(nx5Var2, coroutineContext, null, new lt1(it1Var, wt1Var, prbVar, mt5Var2, (byte) 3), 2);
                na2.B(nx5Var2, coroutineContext, null, new jj4((ve2) obj2, it1Var, wt1Var, (prb) obj5, (mt5) null), 2);
                na2.B(nx5Var2, coroutineContext, null, new cek(it1Var, wt1Var, prbVar, (mt5) null), 2);
                na2.B(nx5Var2, coroutineContext, null, new c71(it1Var, wt1Var, prbVar, (mt5) null), 2);
                return na2.B(nx5Var2, coroutineContext, null, new eno(prbVar, it1Var, mt5Var2, b2), 2);
        }
    }
}
