package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.llp;
import defpackage.u6k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class dm implements dfp {
    public final Object a;
    public final Object b;
    public final /* synthetic */ byte c;

    public dm(llp llpVar) {
        this.c = (byte) 0;
        this.a = llpVar;
        this.b = new AtomicBoolean(false);
    }

    public dm(nx5 nx5Var, cy0 cy0Var) {
        this.c = (byte) 1;
        this.a = cy0Var;
        this.b = nx5Var;
    }

    public final Object c(mt5 mt5Var) {
        byte b = this.c;
        Object obj = this.b;
        Object obj2 = this.a;
        switch (b) {
            case 0:
                if (!((AtomicBoolean) obj).compareAndSet(false, true) || (r4 = ((llp) obj2).a(mt5Var)) != px5.a) {
                }
                break;
            default:
                mt0 mt0Var = ((cy0) obj2).o;
                if (mt0Var != null) {
                    defpackage.na2.B((nx5) obj, h.a, null, new fsg(new u6k((byte) 12, null, mt0Var), null, (byte) 3), 2);
                }
                break;
        }
        return Unit.a;
    }
}
