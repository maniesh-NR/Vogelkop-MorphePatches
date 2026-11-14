package defpackage;

import android.telephony.euicc.EuiccManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v78 implements r7n {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ v78(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.r7n
    public final l7n c(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dp6 dp6Var = (dp6) obj;
                u78 u78Var = Intrinsics.a(cls, u78.class) ? new u78((gq6) dp6Var.u.getValue(), new bpd(dp6Var.d(), new i3j(dp6Var.b(), dp6Var.j, dp6Var.l), (byte) 12), dp6Var.a(), new jq6(dp6Var.d()), new qe6((EuiccManager) dp6Var.t.getValue(), (byte) 3), new iq6(dp6Var.d())) : null;
                if (u78Var == null) {
                    u78Var = null;
                }
                if (u78Var == null) {
                    qp2.o("EsimActivityViewModelFactory doesn't know how to create ".concat(cls.getName()));
                    break;
                } else {
                    break;
                }
            default:
                h1b h1bVar = (h1b) obj;
                int size = h1bVar.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = h1bVar.get(i);
                    i++;
                    l7n l7nVarA = ((mkf) obj2).a(cls);
                    if (l7nVarA != null) {
                        break;
                    }
                }
                qp2.o("BrowserActivityViewModelFactory doesn't know how to create ".concat(cls.getName()));
                break;
        }
        return null;
    }
}
