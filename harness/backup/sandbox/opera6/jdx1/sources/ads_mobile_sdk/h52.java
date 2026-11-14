package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class h52 extends ozb implements Function0 {
    public final /* synthetic */ q6 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h52(q6 q6Var, byte b) {
        super(0);
        this.i = b;
        this.a = q6Var;
    }

    public final Object invoke() throws JSONException {
        byte b = this.i;
        q6 q6Var = this.a;
        switch (b) {
            case 0:
                q6Var.a();
                break;
            default:
                q6Var.b();
                break;
        }
        return Unit.a;
    }
}
