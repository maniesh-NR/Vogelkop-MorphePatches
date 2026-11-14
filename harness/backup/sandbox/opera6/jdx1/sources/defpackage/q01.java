package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class q01 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q01(byte b, int i, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ q01(Object obj, boolean z, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = c8eVar;
    }

    public /* synthetic */ q01(olj oljVar, yz yzVar, boolean z) {
        this.a = (byte) 4;
        this.d = oljVar;
        this.c = yzVar;
        this.b = z;
    }

    public /* synthetic */ q01(boolean z, ue5 ue5Var, Function2 function2) {
        this.a = (byte) 3;
        this.b = z;
        this.d = ue5Var;
        this.c = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        z = false;
        Object obj3 = this.c;
        Object obj4 = this.d;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                z4o.a((n01) obj4, z2, (c8e) obj3, (ih5) obj, aoh.m(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qs7) obj4).i(z2, (c8e) obj3, (ih5) obj, aoh.m(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                sfe.f(aoh.m(1), (ih5) obj, (c8e) obj3, (Function0) obj4, z2);
                break;
            case 3:
                ue5 ue5Var = (ue5) obj4;
                Function2 function2 = (Function2) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ue5 ue5VarP = null;
                    if (z2) {
                        vt9Var.W(2006167119);
                        ue5 ue5VarP2 = gyg.P(-1339339155, new zhf(function2, (byte) 0), vt9Var);
                        if (ue5Var == null) {
                            vt9Var.W(2006507963);
                            vt9Var.p(false);
                        } else {
                            vt9Var.W(2006507964);
                            ue5VarP = gyg.P(-1423916991, new uhf(ue5Var, z ? (byte) 1 : (byte) 0), vt9Var);
                            vt9Var.p(false);
                        }
                        lcp.g(ue5VarP2, null, ue5VarP, null, vt9Var, 6);
                        vt9Var.p(false);
                    } else {
                        vt9Var.W(2006840036);
                        ue5 ue5VarP3 = gyg.P(1112844127, new zhf(function2, (byte) 1), vt9Var);
                        if (ue5Var == null) {
                            vt9Var.W(2007001607);
                            vt9Var.p(false);
                        } else {
                            vt9Var.W(2007001608);
                            ue5VarP = gyg.P(1647807331, new uhf(ue5Var, (byte) 3), vt9Var);
                            vt9Var.p(false);
                        }
                        lcp.e(ue5VarP3, null, ue5VarP, gkf.e, vt9Var, 6);
                        vt9Var.p(false);
                    }
                } else {
                    vt9Var.Q();
                }
                break;
            case 4:
                olj oljVar = (olj) obj4;
                yz yzVar = (yz) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (!oljVar.e) {
                    oljVar.e = true;
                    if (zBooleanValue) {
                        sn3 sn3Var = oljVar.c;
                        if (z2 && zBooleanValue2) {
                            z = true;
                        }
                        if (!((Boolean) sn3Var.invoke(yzVar, Boolean.valueOf(z))).booleanValue()) {
                            yzVar.b();
                        }
                    } else {
                        yzVar.b();
                        oljVar.d.invoke("failed to prepare ad");
                    }
                    break;
                } else {
                    yzVar.b();
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                dbh.a(z2, (hyh) obj4, (dil) obj3, (ih5) obj, aoh.m(7));
                break;
        }
        return Unit.a;
    }
}
