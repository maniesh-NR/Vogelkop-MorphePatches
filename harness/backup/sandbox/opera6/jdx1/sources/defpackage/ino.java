package defpackage;

import android.app.Application;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ino extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Application w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ino(Application application, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = application;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                ino inoVar = new ino(this.w, mt5Var, (byte) 0);
                inoVar.v = obj;
                return inoVar;
            default:
                ino inoVar2 = new ino(this.w, mt5Var, (byte) 1);
                inoVar2.v = obj;
                return inoVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Unit q0iVar;
        byte b = this.t;
        Application application = this.w;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                try {
                    if (!z) {
                        ybh.y(obj);
                        p0i p0iVar = t0i.b;
                        jno jnoVar = jno.a;
                        mhk mhkVar = jno.b;
                        List listK0 = CollectionsKt.k0((i72) mhkVar.c);
                        int i = mhkVar.b;
                        this.u = true;
                        Object objZ = na2.Z((CoroutineContext) jno.c.getValue(), new ri4(listK0, i, application, (mt5) null), this);
                        if (objZ != px5Var) {
                            objZ = Unit.a;
                        }
                        if (objZ == px5Var) {
                            break;
                        }
                    } else if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        ybh.y(obj);
                    }
                    q0iVar = Unit.a;
                    p0i p0iVar2 = t0i.b;
                } catch (Throwable th) {
                    p0i p0iVar3 = t0i.b;
                    q0iVar = new q0i(th);
                }
                uyg.h(q0iVar);
                Throwable thD = t0i.d(q0iVar);
                if (thD != null) {
                    Thread.currentThread().getName();
                    thD.getMessage();
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    nx5 nx5Var = (nx5) this.v;
                    unb[] unbVarArr = {na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 4), 3), na2.B(nx5Var, null, null, new eno((byte) 12, mt5Var, (Object) application), 3), na2.B(nx5Var, null, null, new tap(2, (mt5) null, (byte) 0), 3), na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 5), 3), na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 6), 3), na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 7), 3), na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 8), 3), na2.B(nx5Var, null, null, new rz1(2, (mt5) null, (byte) 8), 3), na2.B(nx5Var, null, null, new fno(application, (mt5) null, (byte) 9), 3)};
                    this.u = true;
                    if (cs5.c0(unbVarArr, this) == px5Var2) {
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
