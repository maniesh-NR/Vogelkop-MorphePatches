package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fmo extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmo(Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new fmo(this.u, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        boolean z = this.t;
        mt5 mt5Var = null;
        if (z) {
            if (z) {
                ybh.y(obj);
                return obj;
            }
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ybh.y(obj);
        emo emoVar = new emo(this.u);
        this.t = true;
        Object objZ = na2.Z(h.a, new fb9((byte) 5, mt5Var, emoVar), this);
        return objZ == px5Var ? px5Var : objZ;
    }
}
