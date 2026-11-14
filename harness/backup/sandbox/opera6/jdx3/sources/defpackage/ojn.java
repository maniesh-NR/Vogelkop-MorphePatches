package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ojn {
    public final fp1 a;
    public final umi b;
    public final fjn c;
    public final zyk d;
    public final zyk e;

    public ojn(fp1 fp1Var, umi umiVar, fjn fjnVar) {
        this.a = fp1Var;
        this.b = umiVar;
        this.c = fjnVar;
        final byte b = 0;
        this.d = z4c.b(new Function0(this) { // from class: ijn
            public final /* synthetic */ ojn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ojn ojnVar = this.b;
                switch (b2) {
                    case 0:
                        return new vj2(ojnVar.a, ojnVar.b, new jjn(ojnVar, (byte) 0), new jjn(ojnVar, (byte) 1));
                    default:
                        return new ra3(ojnVar.a);
                }
            }
        });
        final byte b2 = 1;
        this.e = z4c.b(new Function0(this) { // from class: ijn
            public final /* synthetic */ ojn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ojn ojnVar = this.b;
                switch (b22) {
                    case 0:
                        return new vj2(ojnVar.a, ojnVar.b, new jjn(ojnVar, (byte) 0), new jjn(ojnVar, (byte) 1));
                    default:
                        return new ra3(ojnVar.a);
                }
            }
        });
    }

    public final void a() {
        fjn fjnVar = this.c;
        x5f x5fVar = fjnVar.d;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        ((fu0) ((au0) new ck0(zpaVar, x56VarF).r.getValue()).c.getValue()).a.r(13, 1, true);
        x5fVar.U0(x56VarF);
        nv6 nv6VarB = fjnVar.b.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("crypto.wallet.wallet_removed", true);
        nv6VarB.w();
    }
}
