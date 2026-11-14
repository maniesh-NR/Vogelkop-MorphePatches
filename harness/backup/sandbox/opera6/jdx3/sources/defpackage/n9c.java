package defpackage;

import android.content.Context;
import com.leanplum.LeanplumFirebaseServiceHandler;
import com.opera.android.account.push.AccountPushManager;

/* loaded from: classes.dex */
public final class n9c extends c59 {
    public final /* synthetic */ byte n = 1;
    public final Object o;
    public Object p;

    public n9c(Context context, umi umiVar, AccountPushManager accountPushManager) {
        super(context, umiVar, x1p.h(context, 2132021664, 2132021662, 2132021663, 2132021680));
        this.o = accountPushManager;
    }

    public n9c(Context context, umi umiVar, qq6 qq6Var) {
        super(context, umiVar, x1p.h(context, 2132019502, 2132019500, 2132019501, 2132019503));
        this.o = new LeanplumFirebaseServiceHandler();
        this.p = (h42) qq6Var.b;
    }

    @Override // defpackage.c59
    public final ekc d() {
        switch (this.n) {
            case 0:
                return (h42) this.p;
            default:
                return super.d();
        }
    }

    @Override // defpackage.c59
    public final void e(String str, String str2, boolean z) {
        byte b = this.n;
        Object obj = this.o;
        switch (b) {
            case 0:
                super.e(str, str2, z);
                LeanplumFirebaseServiceHandler leanplumFirebaseServiceHandler = (LeanplumFirebaseServiceHandler) obj;
                if (str2 == null) {
                    str2 = "INVALID";
                }
                leanplumFirebaseServiceHandler.onNewToken(str2, this.a);
                break;
            default:
                super.e(str, str2, z);
                r62 r62Var = (nsc) this.p;
                if (r62Var != null) {
                    r62Var.cancel();
                }
                this.p = new nsc(((AccountPushManager) obj).a, new eof(this, str2, (byte) 21), (byte) 1);
                break;
        }
    }
}
