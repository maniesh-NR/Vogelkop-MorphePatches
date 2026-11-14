package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zf9 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ lde v;
    public final /* synthetic */ afe w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf9(lde ldeVar, afe afeVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ldeVar;
        this.w = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new zf9(this.v, this.w, mt5Var, (byte) 0);
            default:
                return new zf9(this.v, this.w, mt5Var, (byte) 1);
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
        afe afeVar = this.w;
        lde ldeVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ArrayList arrayList = new ArrayList();
                jdj jdjVar = ldeVar.a;
                yf9 yf9Var = new yf9(arrayList, afeVar, (byte) 0);
                this.u = true;
                jdjVar.collect(yf9Var, this);
                return px5Var;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ArrayList arrayList2 = new ArrayList();
                jdj jdjVar2 = ldeVar.a;
                yf9 yf9Var2 = new yf9(arrayList2, afeVar, (byte) 1);
                this.u = true;
                jdjVar2.collect(yf9Var2, this);
                return px5Var2;
        }
    }
}
