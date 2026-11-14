package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dsm extends kuk implements Function1 {
    public byte t;
    public boolean u;
    public final /* synthetic */ ism v;
    public final /* synthetic */ byte w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dsm(ism ismVar, int i, mt5 mt5Var) {
        super(1, mt5Var);
        this.v = ismVar;
        this.w = i;
    }

    public final mt5 create(mt5 mt5Var) {
        return new dsm(this.v, this.w, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b;
        cd5 cd5VarB;
        px5 px5Var = px5.a;
        boolean z = this.u;
        try {
            if (!z) {
                ybh.y(obj);
                ism ismVar = this.v;
                byte b2 = this.w;
                nd4 nd4VarA = ismVar.c.a();
                this.t = b2;
                this.u = true;
                obj = nd4VarA.k(this);
                if (obj == px5Var) {
                    return px5Var;
                }
                b = b2;
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b = this.t;
                ybh.y(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                qd4 qd4Var = (qd4) autoCloseable;
                y10 y10Var = new y10(b);
                if (qd4Var.a.a()) {
                    kp5.b(qd4Var, " after close.", "Cannot call setTorchOff on ");
                    cd5VarB = null;
                } else {
                    qu5 qu5Var = qd4Var.c;
                    qu5Var.getClass();
                    cd5VarB = qu5.b(qu5Var, y10Var, null, null, new o79(0), null, null, null, 118);
                }
                fr3.t(autoCloseable, null);
                return cd5VarB;
            } finally {
            }
        } catch (CancellationException unused) {
            return ism.l;
        }
    }
}
