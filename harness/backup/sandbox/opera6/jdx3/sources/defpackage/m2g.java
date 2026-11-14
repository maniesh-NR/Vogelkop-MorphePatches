package defpackage;

import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m2g implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ode b;

    public /* synthetic */ m2g(ode odeVar, byte b) {
        this.a = b;
        this.b = odeVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        Object obj2;
        byte b = this.a;
        ode odeVar = this.b;
        switch (b) {
            case 0:
            case 1:
                obj2 = (c3g) obj;
                break;
            case 2:
            default:
                obj2 = (List) obj;
                break;
        }
        odeVar.r(obj2);
    }
}
