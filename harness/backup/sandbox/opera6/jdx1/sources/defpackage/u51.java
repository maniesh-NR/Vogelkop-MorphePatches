package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u51 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u51(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pmg pmgVar, mt5 mt5Var) {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 2;
        mt5 mt5Var2 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object objN = z4o.n(pmgVar, new t51((byte) 0, mt5Var2, (v51) obj), mt5Var);
                if (objN != px5.a) {
                    break;
                }
                break;
            case 1:
                Object objN2 = z4o.n(pmgVar, new t51(b2, mt5Var2, (zb7) obj), mt5Var);
                if (objN2 != px5.a) {
                    break;
                }
                break;
            case 2:
                Object objQ = sgb.q(new qmb(pmgVar, (gu6) obj, mt5Var2, b3), mt5Var);
                if (objQ != px5.a) {
                    break;
                }
                break;
            case 3:
                Object objD = xbl.d(pmgVar, new p01((Function0) obj, (byte) 8), mt5Var);
                if (objD != px5.a) {
                    break;
                }
                break;
            case 4:
                Object objT0 = ((vuk) pmgVar).T0(new wb3(b2, mt5Var2, (lw5) obj), mt5Var);
                if (objT0 != px5.a) {
                    break;
                }
                break;
            case 5:
                Object objN3 = z4o.n(pmgVar, new tob((byte) 3, mt5Var2, (rjk) obj), mt5Var);
                if (objN3 != px5.a) {
                    break;
                }
                break;
            case 6:
                Object objN4 = z4o.n(pmgVar, new t51(b3, mt5Var2, new lrk(1, (pfl) obj, pfl.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 3)), mt5Var);
                px5 px5Var = px5.a;
                if (objN4 != px5Var) {
                    objN4 = Unit.a;
                }
                if (objN4 != px5Var) {
                    break;
                }
                break;
            case 7:
                dil dilVar = (dil) obj;
                eyi eyiVar = dilVar.z;
                bil bilVar = dilVar.y;
                vuk vukVar = (vuk) pmgVar;
                vukVar.getClass();
                Object objN5 = z4o.n(pmgVar, new tob(new ro9(ui6.e0(vukVar).A), eyiVar, bilVar, null), mt5Var);
                if (objN5 != px5.a) {
                    objN5 = Unit.a;
                }
                if (objN5 != px5.a) {
                    break;
                }
                break;
            default:
                Object objQ2 = sgb.q(new c71((Object) pmgVar, obj, mt5Var2, (byte) 10), mt5Var);
                px5 px5Var2 = px5.a;
                if (objQ2 != px5Var2) {
                    objQ2 = Unit.a;
                }
                if (objQ2 != px5Var2) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
