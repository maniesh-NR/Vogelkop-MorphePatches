package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hpc extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ jpc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpc(jpc jpcVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = jpcVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        jpc jpcVar = this.v;
        switch (b) {
            case 0:
                return new hpc(jpcVar, mt5Var, (byte) 0);
            default:
                return new hpc(jpcVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        jpc jpcVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    f99 f99VarT = qbe.t(new ya9(xf8.t(jpcVar.a.a), xf8.t(jpcVar.b), new vkc(3, jpc.e, fpc.class, "calculateFeatureEnabledState", "calculateFeatureEnabledState(ZZ)Lcom/opera/android/analytics/AggroFeatureEnableState;", 4, (byte) 1), (byte) 0));
                    gpc gpcVar = new gpc(jpcVar.d, (byte) 0);
                    this.u = true;
                    if (f99VarT.collect(gpcVar, this) == px5Var) {
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
                xnc xncVar = jpcVar.a;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    f99 f99VarT2 = qbe.t(nb6.l(xf8.t(xncVar.a), xf8.t(xncVar.b), jpcVar.c, new ipc(4, jpc.e, fpc.class, "calculateIsFollowingAnyTeam", "calculateIsFollowingAnyTeam(ZZLjava/util/List;)Z", 4)));
                    gpc gpcVar2 = new gpc(jpcVar.d, (byte) 1);
                    this.u = true;
                    if (f99VarT2.collect(gpcVar2, this) == px5Var2) {
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
