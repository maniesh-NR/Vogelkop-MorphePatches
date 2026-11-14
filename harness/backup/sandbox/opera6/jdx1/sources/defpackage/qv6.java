package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class qv6 implements PointerInputEventHandler {
    public static final qv6 b = new qv6(0);
    public static final qv6 c = new qv6(1);
    public static final qv6 d = new qv6(2);
    public static final qv6 e = new qv6(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ qv6(byte b2) {
        this.a = b2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pmg pmgVar, mt5 mt5Var) {
        switch (this.a) {
            case 2:
                Object objD = xbl.d(pmgVar, new w5f((byte) 9), mt5Var);
                if (objD != px5.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
