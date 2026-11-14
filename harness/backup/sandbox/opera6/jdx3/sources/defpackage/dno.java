package defpackage;

import android.app.Application;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class dno extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public huo u;
    public boolean v;
    public final /* synthetic */ Application w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dno(Application application, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = application;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new dno(this.w, mt5Var, (byte) 0);
            default:
                return new dno(this.w, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        huo huoVar;
        huo huoVar2;
        byte b = this.t;
        Application application = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.v;
                if (!z) {
                    ybh.y(obj);
                    StringBuilder sb = new StringBuilder("prepare send data for events, modGeneration: ");
                    mhk mhkVar = jno.b;
                    sb.append(mhkVar.b);
                    nxg.g("scheduleSend", sb.toString());
                    if (((i72) mhkVar.c).isEmpty()) {
                        throw new CancellationException("No events to send");
                    }
                    oxo oxoVar = oxo.a;
                    huo huoVarA = oxo.a(application);
                    this.u = huoVarA;
                    this.v = true;
                    Object objE = oxo.e(application, this);
                    if (objE == px5Var) {
                        return px5Var;
                    }
                    obj = objE;
                    huoVar = huoVarA;
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    huoVar = this.u;
                    ybh.y(obj);
                }
                oxo oxoVar2 = oxo.a;
                return new exo(huoVar, (jzo) obj, oxo.c(application, false), CollectionsKt.k0((i72) jno.b.c));
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.v;
                if (!z2) {
                    ybh.y(obj);
                    oxo oxoVar3 = oxo.a;
                    huo huoVarA2 = oxo.a(application);
                    this.u = huoVarA2;
                    this.v = true;
                    Object objE2 = oxo.e(application, this);
                    if (objE2 == px5Var2) {
                        return px5Var2;
                    }
                    obj = objE2;
                    huoVar2 = huoVarA2;
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    huoVar2 = this.u;
                    ybh.y(obj);
                }
                oxo oxoVar4 = oxo.a;
                return new p5p(huoVar2, (jzo) obj, oxo.c(application, false), oxo.b(null, 3));
        }
    }
}
