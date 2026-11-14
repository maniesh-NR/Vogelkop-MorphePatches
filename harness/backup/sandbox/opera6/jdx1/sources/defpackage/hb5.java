package defpackage;

import ads_mobile_sdk.ou1;
import ads_mobile_sdk.su1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hb5 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb5(int i, su1 su1Var, wpb wpbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = wpbVar;
        this.v = i;
        this.y = su1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb5(f99[] f99VarArr, int i, AtomicInteger atomicInteger, p04 p04Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = f99VarArr;
        this.v = i;
        this.x = atomicInteger;
        this.y = p04Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                return new hb5((f99[]) this.w, this.v, (AtomicInteger) obj3, (p04) obj2, mt5Var);
            default:
                hb5 hb5Var = new hb5(this.v, (su1) obj2, (wpb) obj3, mt5Var);
                hb5Var.w = obj;
                return hb5Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        int i = this.v;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                p04 p04Var = (p04) obj2;
                px5 px5Var = px5.a;
                boolean z = this.u;
                try {
                    if (!z) {
                        ybh.y(obj);
                        f99 f99Var = ((f99[]) this.w)[i];
                        gb5 gb5Var = new gb5(p04Var, i);
                        this.u = true;
                        if (f99Var.collect(gb5Var, this) == px5Var) {
                            return px5Var;
                        }
                    } else {
                        if (!z) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        p04Var.e((Throwable) null);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() != 0) {
                        throw th;
                    }
                    p04Var.e((Throwable) null);
                    throw th;
                }
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    z1h z1hVar = (z1h) this.w;
                    int size = ((wpb) obj3).a.size();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < i; i2++) {
                        su1 su1Var = (su1) obj2;
                        arrayList.add(na2.B(su1Var.t, null, null, new ou1(su1Var, i2, size, (wpb) obj3, z1hVar, null), 3));
                    }
                    this.u = true;
                    if (cs5.b0(arrayList, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
