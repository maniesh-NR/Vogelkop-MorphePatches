package defpackage;

import android.util.Base64;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class tj2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vj2 b;
    public final /* synthetic */ Callback c;
    public final /* synthetic */ Callback d;

    public /* synthetic */ tj2(vj2 vj2Var, Callback callback, Callback callback2, byte b) {
        this.a = b;
        this.b = vj2Var;
        this.c = callback;
        this.d = callback2;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                vj2 vj2Var = this.b;
                Callback callback = this.d;
                String str = (String) obj;
                Callback callback2 = this.c;
                if (str == null) {
                    callback2.run(null);
                    break;
                } else {
                    try {
                        vj2Var.c(new uj2(vj2Var, callback2, Base64.decode(str, 0), callback, (byte) 0), new n32(callback, (byte) 2));
                        break;
                    } catch (IllegalArgumentException unused) {
                        ((djn) vj2Var.c.get()).a(new j12(callback2, (byte) 2), callback);
                        return;
                    }
                }
            default:
                vj2 vj2Var2 = this.b;
                Callback callback3 = this.d;
                String str2 = (String) obj;
                Callback callback4 = this.c;
                if (str2 == null) {
                    callback4.run(Boolean.TRUE);
                    break;
                } else {
                    try {
                        vj2Var2.a.c(new uj2(vj2Var2, Base64.decode(str2, 0), callback4, callback3)).a(null);
                        break;
                    } catch (IllegalArgumentException unused2) {
                        ((djn) vj2Var2.c.get()).a(callback4, callback3);
                    }
                }
        }
    }
}
