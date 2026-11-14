package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class zb3 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ztl b;

    public /* synthetic */ zb3(ztl ztlVar, byte b) {
        this.a = b;
        this.b = ztlVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pmg pmgVar, mt5 mt5Var) {
        byte b = this.a;
        ztl ztlVar = this.b;
        switch (b) {
            case 0:
                Object objQ = sgb.q(new yb3(pmgVar, ztlVar, null, (byte) 0), mt5Var);
                if (objQ != px5.a) {
                    break;
                }
                break;
            default:
                Object objQ2 = sgb.q(new yb3(pmgVar, ztlVar, null, (byte) 1), mt5Var);
                if (objQ2 != px5.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
