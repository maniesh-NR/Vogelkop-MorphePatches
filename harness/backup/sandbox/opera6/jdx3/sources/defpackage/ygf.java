package defpackage;

import J.N;
import com.opera.android.oauth2.OperaAccessSandbox;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class ygf implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaAccessSandbox b;

    public /* synthetic */ ygf(OperaAccessSandbox operaAccessSandbox, byte b) {
        this.a = b;
        this.b = operaAccessSandbox;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        OperaAccessSandbox operaAccessSandbox = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (operaAccessSandbox.e == 2) {
                    operaAccessSandbox.e = (byte) 3;
                    N.MJ$$Z40w(operaAccessSandbox.d, str);
                    break;
                }
                break;
            default:
                q43 q43Var = (q43) obj;
                if (operaAccessSandbox.e == 2) {
                    int i = q43Var.a;
                    if (i > 0 && i / 100 == 4) {
                        operaAccessSandbox.a(2);
                        break;
                    } else {
                        operaAccessSandbox.a(3);
                        break;
                    }
                }
                break;
        }
    }
}
