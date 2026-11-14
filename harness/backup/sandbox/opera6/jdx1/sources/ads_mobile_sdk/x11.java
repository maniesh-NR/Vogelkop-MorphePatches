package ads_mobile_sdk;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class x11 extends ozb implements cr9 {
    public final /* synthetic */ v84 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x11(v84 v84Var, byte b) {
        super(3);
        this.i = b;
        this.a = v84Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case 0:
                this.a.cancel();
                break;
            default:
                this.a.cancel();
                break;
        }
        return Unit.a;
    }
}
