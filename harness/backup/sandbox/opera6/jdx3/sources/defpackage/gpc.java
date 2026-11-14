package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class gpc implements l99, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xoc b;

    public /* synthetic */ gpc(xoc xocVar, byte b) {
        this.a = b;
        this.b = xocVar;
    }

    public final br9 a() {
        switch (this.a) {
            case 0:
                return new kr(2, this.b, xoc.class, "reportFeatureEnableState", "reportFeatureEnableState(Lcom/opera/android/analytics/AggroFeatureEnableState;)V", 4);
            default:
                return new kr(2, this.b, xoc.class, "reportFollowsTeam", "reportFollowsTeam(Z)V", 4);
        }
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.a;
        xoc xocVar = this.b;
        switch (b) {
            case 0:
                vd0 vd0Var = (vd0) obj;
                x5f x5fVar = xocVar.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    b66 b66VarF = x56VarF.F(zpaVar);
                    b66VarF.getClass();
                    b66VarF.q(73, vd0Var == null ? 0 : 1, vd0Var);
                    x5fVar.U0(x56VarF);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x5f x5fVar2 = xocVar.a;
                if (x5fVar2.h) {
                    zpa zpaVar2 = x5fVar2.d;
                    x56 x56VarF2 = zpa.F();
                    am2.g(zpaVar2, x56VarF2).b.r(74, 1, zBooleanValue);
                    x5fVar2.U0(x56VarF2);
                }
                break;
        }
        return Unit.a;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof l99) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof l99) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
