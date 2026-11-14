package defpackage;

import com.opera.android.startup.WelcomeActivity;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class s65 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x65 b;

    public /* synthetic */ s65(x65 x65Var, byte b) {
        this.a = b;
        this.b = x65Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        x65 x65Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = x65Var.C;
                if (!z) {
                    if (!zBooleanValue) {
                        x65Var.y = true;
                        if (!z && x65Var.getHost() != null && !x65Var.isStateSaved()) {
                            x65Var.n0(yim.c);
                            break;
                        }
                    } else {
                        x65Var.x = true;
                        x65Var.m0();
                        break;
                    }
                }
                break;
            default:
                int i = WelcomeActivity.w;
                x65Var.A = (Runnable) obj;
                x65Var.l0();
                break;
        }
    }
}
