package defpackage;

import ads_mobile_sdk.h21;
import ads_mobile_sdk.p30;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final class p76 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p76(p30 p30Var, h21 h21Var, CronetEngine cronetEngine, boolean z, boolean z2, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = p30Var;
        this.y = h21Var;
        this.z = cronetEngine;
        this.v = z;
        this.w = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p76(CoroutineContext coroutineContext, y5i y5iVar, boolean z, boolean z2, Function1 function1, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = coroutineContext;
        this.y = y5iVar;
        this.v = z;
        this.w = z2;
        this.z = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                return new p76((CoroutineContext) obj4, (y5i) obj3, this.v, this.w, (Function1) obj2, mt5Var);
            default:
                return new p76((p30) obj4, (h21) obj3, (CronetEngine) obj2, this.v, this.w, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                o76 o76Var = new o76((y5i) obj3, this.v, this.w, (Function1) obj2, (mt5) null);
                this.u = true;
                Object objZ = na2.Z((CoroutineContext) obj4, o76Var, this);
                return objZ == px5Var ? px5Var : objZ;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    Object objA = ((p30) obj4).a((h21) obj3, (CronetEngine) obj2, this.v, this.w, this);
                    return objA == px5Var2 ? px5Var2 : objA;
                }
                if (z2) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
