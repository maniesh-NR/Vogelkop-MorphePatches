package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1a extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ v1a v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1a(v1a v1aVar, boolean z, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = v1aVar;
        this.w = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        boolean z = this.w;
        v1a v1aVar = this.v;
        switch (b) {
            case 0:
                return new u1a(v1aVar, z, mt5Var, (byte) 0);
            default:
                return new u1a(v1aVar, z, mt5Var, (byte) 1);
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
        v1a v1aVar = this.v;
        boolean z = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    if (!Intrinsics.a(v1aVar.i, Boolean.valueOf(z))) {
                        v1aVar.i = Boolean.valueOf(z);
                        jdj jdjVar = v1aVar.e;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        this.u = true;
                        if (jdjVar.emit(boolValueOf, this) == px5Var) {
                            break;
                        }
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    v1aVar.i = Boolean.valueOf(z);
                    jdj jdjVar2 = v1aVar.e;
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    this.u = true;
                    if (jdjVar2.emit(boolValueOf2, this) == px5Var2) {
                        break;
                    }
                } else if (!z3) {
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
