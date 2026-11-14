package ads_mobile_sdk;

import defpackage.kyo;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class c02 implements rko {
    public final Object a;
    public final /* synthetic */ byte b;

    public /* synthetic */ c02(Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }

    public final Object a(mt5 mt5Var) {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                a02 a02Var = (a02) obj;
                a02Var.getClass();
                Object objB = a02.b(a02Var, (nt5) mt5Var);
                if (objB != px5.a) {
                    break;
                }
                break;
            default:
                Object objA = ((kyo) obj).a((kuk) mt5Var);
                if (objA != px5.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
