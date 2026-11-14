package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rqo extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ tqo u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqo(tqo tqoVar, int i, int i2, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = tqoVar;
        this.v = i;
        this.w = i2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new rqo(this.u, this.v, this.w, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            tqo tqoVar = this.u;
            Context context = tqoVar.c;
            File file = tqoVar.a;
            this.t = true;
            objA = elp.a(context, file, this.v, this.w, this);
            if (objA == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
            objA = ((t0i) obj).a;
        }
        return new t0i(objA);
    }
}
