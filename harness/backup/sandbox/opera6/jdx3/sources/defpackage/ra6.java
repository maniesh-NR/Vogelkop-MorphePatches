package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ra6 extends kuk implements cr9 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ l99 v;
    public /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra6(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l99 l99Var = (l99) obj;
        Throwable th = (Throwable) obj2;
        mt5 mt5Var = (mt5) obj3;
        switch (this.t) {
            case 0:
                ra6 ra6Var = new ra6(3, mt5Var, (byte) 0);
                ra6Var.v = l99Var;
                ra6Var.w = th;
                return ra6Var.invokeSuspend(Unit.a);
            case 1:
                ra6 ra6Var2 = new ra6(3, mt5Var, (byte) 1);
                ra6Var2.v = l99Var;
                ra6Var2.w = th;
                return ra6Var2.invokeSuspend(Unit.a);
            case 2:
                ra6 ra6Var3 = new ra6(3, mt5Var, (byte) 2);
                ra6Var3.v = l99Var;
                ra6Var3.w = th;
                return ra6Var3.invokeSuspend(Unit.a);
            case 3:
                ra6 ra6Var4 = new ra6(3, mt5Var, (byte) 3);
                ra6Var4.v = l99Var;
                ra6Var4.w = th;
                return ra6Var4.invokeSuspend(Unit.a);
            default:
                ra6 ra6Var5 = new ra6(3, mt5Var, (byte) 4);
                ra6Var5.v = l99Var;
                ra6Var5.w = th;
                return ra6Var5.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.t) {
            case 0:
                l99 l99Var = this.v;
                Throwable th = this.w;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    p0i p0iVar = t0i.b;
                    la6 la6Var = new la6(new oa6(new q0i(th), new q0i(th), (Long) null));
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (l99Var.emit(la6Var, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 1:
                l99 l99Var2 = this.v;
                Throwable th2 = this.w;
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    fdk fdkVar = me6.b;
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (l99Var2.emit(fdkVar, this) == px5Var2) {
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
            case 2:
                l99 l99Var3 = this.v;
                Throwable th3 = this.w;
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    if (!(th3 instanceof IOException)) {
                        throw th3;
                    }
                    iuc iucVarD = iuc.d();
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (l99Var3.emit(iucVarD, this) == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 3:
                l99 l99Var4 = this.v;
                Throwable th4 = this.w;
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    if (!(th4 instanceof IOException)) {
                        throw th4;
                    }
                    fon fonVarG = fon.g();
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (l99Var4.emit(fonVarG, this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                l99 l99Var5 = this.v;
                Throwable th5 = this.w;
                px5 px5Var5 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    if (!(th5 instanceof IOException)) {
                        throw th5;
                    }
                    wch wchVar = new wch("");
                    this.v = null;
                    this.w = null;
                    this.u = true;
                    if (l99Var5.emit(wchVar, this) == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z5) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
