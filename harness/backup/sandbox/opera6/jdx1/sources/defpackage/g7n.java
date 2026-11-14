package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g7n extends j0i implements Function2 {
    public byte u;
    public /* synthetic */ Object v;
    final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7n(View view, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = view;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        g7n g7nVar = new g7n(this.w, mt5Var);
        g7nVar.v = obj;
        return g7nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        byte b = this.u;
        if (b == 0) {
            ybh.y(obj);
            l1j l1jVar = (l1j) this.v;
            View view = this.w;
            this.v = l1jVar;
            this.u = (byte) 1;
            l1jVar.a(this, view);
            return px5Var;
        }
        if (b == 1) {
            l1j l1jVar2 = (l1j) this.v;
            ybh.y(obj);
            View view2 = this.w;
            if (view2 instanceof ViewGroup) {
                this.v = null;
                this.u = (byte) 2;
                l1jVar2.getClass();
                if (l1jVar2.b(new l2m(new h6n((ViewGroup) view2)), this) == px5Var) {
                    return px5Var;
                }
            }
        } else {
            if (b != 2) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return Unit.a;
    }
}
