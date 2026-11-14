package ads_mobile_sdk;

import defpackage.jcp;
import defpackage.prb;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class da1 implements jcp {
    public final d91 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ da1(d91 d91Var, byte b) {
        this.b = b;
        this.a = d91Var;
    }

    @Override // defpackage.jcp
    public final Object a(prb prbVar, mt5 mt5Var) throws Throwable {
        byte b = this.b;
        String strN = "";
        d91 d91Var = this.a;
        switch (b) {
            case 0:
                d91Var.getClass();
                Object objA = d91.a(d91Var, prbVar, (nt5) mt5Var);
                if (objA != px5.a) {
                    break;
                }
                break;
            case 1:
                try {
                    strN = prbVar.u("gesture").n();
                } catch (Exception unused) {
                }
                if (!Intrinsics.a(strN, "shake")) {
                    if (!Intrinsics.a(strN, "flick")) {
                        d91Var.getClass();
                        Object objA2 = d91.a(d91Var, 1, (nt5) mt5Var);
                        if (objA2 != px5.a) {
                            break;
                        }
                    } else {
                        d91Var.getClass();
                        Object objA3 = d91.a(d91Var, 3, (nt5) mt5Var);
                        if (objA3 != px5.a) {
                            break;
                        }
                    }
                } else {
                    d91Var.getClass();
                    Object objA4 = d91.a(d91Var, 2, (nt5) mt5Var);
                    if (objA4 != px5.a) {
                        break;
                    }
                }
                break;
            default:
                try {
                    strN = prbVar.u("test_mode_enabled").n();
                } catch (Exception unused2) {
                }
                if (!StringsKt.N(strN)) {
                    boolean z = Boolean.parseBoolean(strN);
                    d91Var.getClass();
                    Object objB = d91.b(d91Var, z, (nt5) mt5Var);
                    if (objB != px5.a) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
