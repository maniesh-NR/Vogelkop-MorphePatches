package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.szo;
import defpackage.ybh;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vd3 extends kuk implements Function2 {
    public final /* synthetic */ ae3 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd3(ae3 ae3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = ae3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ae3 ae3Var = this.a;
        switch (b) {
            case 0:
                return new vd3(ae3Var, mt5Var, (byte) 0);
            case 1:
                return new vd3(ae3Var, mt5Var, (byte) 1);
            case 2:
                return new vd3(ae3Var, mt5Var, (byte) 2);
            case 3:
                return new vd3(ae3Var, mt5Var, (byte) 3);
            default:
                return new vd3(ae3Var, mt5Var, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        ae3 ae3Var = this.a;
        switch (b) {
            case 0:
                return new vd3(ae3Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new vd3(ae3Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new vd3(ae3Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new vd3(ae3Var, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            default:
                return new vd3(ae3Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        byte b2 = 3;
        mt5 mt5Var = null;
        ae3 ae3Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                szo szoVar = ae3Var.e;
                for (Map.Entry entry : ((Map) ((k8) szoVar).b).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    defpackage.na2.B((nx5) ((k8) szoVar).a, h.a, null, new fsg(new eo6(str, value, (mt5) null, (byte) 5), mt5Var, b2), 2);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ae3Var.e.a(true);
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                szo szoVar2 = ae3Var.e;
                for (Map.Entry entry2 : ((Map) ((k8) szoVar2).b).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value2 = entry2.getValue();
                    defpackage.na2.B((nx5) ((k8) szoVar2).a, h.a, null, new fsg(new eo6(str2, value2, (mt5) null, (byte) 7), mt5Var, b2), 2);
                }
                break;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                szo szoVar3 = ae3Var.e;
                for (Map.Entry entry3 : ((Map) ((k8) szoVar3).b).entrySet()) {
                    String str3 = (String) entry3.getKey();
                    Object value3 = entry3.getValue();
                    defpackage.na2.B((nx5) ((k8) szoVar3).a, h.a, null, new fsg(new eo6(str3, value3, (mt5) null, (byte) 8), mt5Var, b2), 2);
                }
                break;
            default:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                ae3Var.e.a(false);
                break;
        }
        return Unit.a;
    }
}
