package ads_mobile_sdk;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class os2 implements l99 {
    public final /* synthetic */ d3k a;
    public final /* synthetic */ byte b;

    public /* synthetic */ os2(d3k d3kVar, byte b) {
        this.b = b;
        this.a = d3kVar;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.b;
        d3k d3kVar = this.a;
        switch (b) {
            case 0:
                d3kVar.C(new cp2(new CancellationException("Ad request cancelled by publisher action.")));
                break;
            default:
                d3kVar.C(new cp2(new CancellationException("Ad request cancelled by publisher action.")));
                break;
        }
        return Unit.a;
    }
}
