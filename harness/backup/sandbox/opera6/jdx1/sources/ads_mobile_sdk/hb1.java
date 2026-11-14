package ads_mobile_sdk;

import defpackage.ybh;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hb1 extends kuk implements Function2 {
    public final /* synthetic */ mb1 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb1(mb1 mb1Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = mb1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        mb1 mb1Var = this.a;
        switch (b) {
            case 0:
                return new hb1(mb1Var, mt5Var, (byte) 0);
            default:
                return new hb1(mb1Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        mb1 mb1Var = this.a;
        switch (b) {
            case 0:
                return new hb1(mb1Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new hb1(mb1Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                xa1 xa1Var = this.a.h.b;
                if (xa1Var != null) {
                    xa1Var.a = (byte) 3;
                    wa1 wa1Var = xa1Var.e;
                    if (wa1Var != null) {
                        xa1Var.b.unbindService(wa1Var);
                        xa1Var.e = null;
                    }
                    xa1Var.d = null;
                }
                return Unit.a;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                mb1 mb1Var = this.a;
                ux2 ux2Var = mb1Var.g;
                fw0 fw0Var = fw0.CUI_NAME_INSTALL_REFERRER_TASK;
                l08 l08Var = l08.a;
                kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                byte b = 12;
                if (hh3.b().a == null) {
                    wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                    try {
                        mb1Var.h.a(new e7(mb1Var, b));
                        unit = Unit.a;
                        wk2VarA.close();
                    } catch (Throwable th) {
                        try {
                            wk2VarA.b(th);
                            if (th instanceof iyo) {
                                throw th;
                            }
                            wk2VarA.a(th);
                            if (th instanceof kql) {
                                throw new uw0((kql) th);
                            }
                            if (th instanceof CancellationException) {
                                throw new ou0(th);
                            }
                            if (th instanceof mv0) {
                                throw th;
                            }
                            throw new tu0(th);
                        } finally {
                        }
                    }
                } else {
                    rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                    try {
                        mb1Var.h.a(new e7(mb1Var, b));
                        unit = Unit.a;
                        rg3VarA.close();
                    } catch (Throwable th2) {
                        try {
                            rg3VarA.b(th2);
                            if (th2 instanceof iyo) {
                                throw th2;
                            }
                            rg3VarA.a(th2);
                            if (th2 instanceof kql) {
                                throw new uw0((kql) th2);
                            }
                            if (th2 instanceof CancellationException) {
                                throw new ou0(th2);
                            }
                            if (th2 instanceof mv0) {
                                throw th2;
                            }
                            throw new tu0(th2);
                        } finally {
                        }
                    }
                }
                return unit;
        }
    }
}
