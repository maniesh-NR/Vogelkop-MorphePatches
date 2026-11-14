package ads_mobile_sdk;

import defpackage.axn;
import defpackage.dxn;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iq3 extends kuk implements Function2 {
    public final /* synthetic */ yq3 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq3(yq3 yq3Var, String str, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = yq3Var;
        this.b = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        String str = this.b;
        yq3 yq3Var = this.a;
        switch (b) {
            case 0:
                return new iq3(yq3Var, str, mt5Var, (byte) 0);
            default:
                return new iq3(yq3Var, str, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        String str = this.b;
        yq3 yq3Var = this.a;
        switch (b) {
            case 0:
                return new iq3(yq3Var, str, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new iq3(yq3Var, str, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        String str = this.b;
        yq3 yq3Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                yq3Var.j.getClass();
                if (!axn.q.a()) {
                    throw axn.a();
                }
                qie qieVar = qie.c;
                if (qieVar == null) {
                    qieVar = new qie(dxn.a.getProfileStore(), (byte) 9);
                    qie.c = qieVar;
                }
                return qieVar.q(str);
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                yq3Var.j.getClass();
                if (!axn.q.a()) {
                    throw axn.a();
                }
                qie qieVar2 = qie.c;
                if (qieVar2 == null) {
                    qieVar2 = new qie(dxn.a.getProfileStore(), (byte) 9);
                    qie.c = qieVar2;
                }
                yq3Var.l = qieVar2.q(str);
                return Unit.a;
        }
    }
}
