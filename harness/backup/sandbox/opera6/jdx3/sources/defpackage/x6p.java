package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x6p extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ sro v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6p(sro sroVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = sroVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        sro sroVar = this.v;
        switch (b) {
            case 0:
                return new x6p(sroVar, mt5Var, (byte) 0);
            default:
                return new x6p(sroVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objB2;
        byte b = this.t;
        sro sroVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    File fileA = sroVar.a();
                    this.u = true;
                    objB = elp.b(fileA, this);
                    if (objB == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objB = ((t0i) obj).a;
                }
                return new t0i(objB);
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    File fileA2 = sroVar.a();
                    this.u = true;
                    objB2 = elp.b(fileA2, this);
                    if (objB2 == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objB2 = ((t0i) obj).a;
                }
                return new t0i(objB2);
        }
    }
}
