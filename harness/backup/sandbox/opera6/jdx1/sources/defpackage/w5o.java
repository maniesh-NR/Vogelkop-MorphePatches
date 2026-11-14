package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w5o extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ z5o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5o(z5o z5oVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = z5oVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        z5o z5oVar = this.v;
        switch (b) {
            case 0:
                return new w5o(z5oVar, mt5Var, (byte) 0);
            default:
                return new w5o(z5oVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        Object s5oVar;
        byte b = this.t;
        z5o z5oVar = this.v;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    Object objC = z5oVar.c(this);
                    return objC == px5Var ? px5Var : objC;
                }
                if (z) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                try {
                    if (!z2) {
                        ybh.y(obj);
                        ynb ynbVar = z5oVar.l;
                        w5o w5oVar = new w5o(z5oVar, mt5Var, (byte) 0);
                        this.u = true;
                        obj = na2.Z(ynbVar, w5oVar, this);
                        if (obj == px5Var2) {
                            return px5Var2;
                        }
                    } else {
                        if (!z2) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    s5oVar = (v5o) obj;
                } catch (q5o e) {
                    s5oVar = new u5o(e.a);
                } catch (CancellationException unused) {
                    s5oVar = new s5o();
                } catch (Throwable unused2) {
                    int i = a6o.a;
                    qs7.x().getClass();
                    s5oVar = new s5o();
                }
                return z5oVar.g.t(new d9(s5oVar, z5oVar, (byte) 7));
        }
    }
}
