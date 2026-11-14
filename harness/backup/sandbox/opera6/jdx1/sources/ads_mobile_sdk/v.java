package ads_mobile_sdk;

import defpackage.qlo;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ qlo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(qlo qloVar, long j, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = qloVar;
        this.c = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new v(this.b, this.c, mt5Var, (byte) 0);
            default:
                return new v(this.b, this.c, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                long j = this.c;
                return new v(this.b, j, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                long j2 = this.c;
                return new v(this.b, j2, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        long j = this.c;
        qlo qloVar = this.b;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    this.a = true;
                    if (qloVar.b(j, this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    this.a = true;
                    if (qloVar.d(j, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
