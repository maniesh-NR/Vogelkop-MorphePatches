package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tw5 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ pmg v;
    public final /* synthetic */ mgl w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw5(pmg pmgVar, mgl mglVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = pmgVar;
        this.w = mglVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new tw5(this.v, this.w, mt5Var, (byte) 0);
            case 1:
                return new tw5(this.v, this.w, mt5Var, (byte) 1);
            default:
                return new tw5(this.v, this.w, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [a1d] */
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        final mgl mglVar = this.w;
        pmg pmgVar = this.v;
        final byte b2 = 1;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    Object objQ = sgb.q(new c71((Object) pmgVar, (Object) mglVar, mt5Var, (byte) 10), this);
                    if (objQ != px5Var) {
                        objQ = Unit.a;
                    }
                    if (objQ == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    this.u = true;
                    Object objN = z4o.n(pmgVar, new bj9(mglVar, null), this);
                    if (objN != px5Var2) {
                        objN = Unit.a;
                    }
                    if (objN == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    final byte b3 = 0;
                    z0d z0dVar = new z0d(mglVar, (byte) 0);
                    Function0 function0 = new Function0() { // from class: a1d
                        public final Object invoke() {
                            byte b4 = b3;
                            mgl mglVar2 = mglVar;
                            switch (b4) {
                                case 0:
                                    mglVar2.onStop();
                                    break;
                                default:
                                    mglVar2.onCancel();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    ?? r10 = new Function0() { // from class: a1d
                        public final Object invoke() {
                            byte b4 = b2;
                            mgl mglVar2 = mglVar;
                            switch (b4) {
                                case 0:
                                    mglVar2.onStop();
                                    break;
                                default:
                                    mglVar2.onCancel();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    a7b a7bVar = new a7b(mglVar, (byte) 7);
                    Object objN2 = z4o.n(pmgVar, new gj7(new ki5((byte) 27), new j04(z0dVar, (byte) 7), a7bVar, r10, new wg5(function0, (byte) 24), null), this);
                    if (objN2 != px5Var3) {
                        objN2 = Unit.a;
                    }
                    if (objN2 != px5Var3) {
                        objN2 = Unit.a;
                    }
                    if (objN2 != px5Var3) {
                        objN2 = Unit.a;
                    }
                    if (objN2 == px5Var3) {
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
