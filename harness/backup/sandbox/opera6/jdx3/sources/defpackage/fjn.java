package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class fjn {
    public final Context a;
    public final ru9 b;
    public final dj9 c;
    public final x5f d;
    public final zyk e;
    public final zyk f;

    public fjn(Context context, ru9 ru9Var, dj9 dj9Var, x5f x5fVar) {
        this.a = context;
        this.b = ru9Var;
        this.c = dj9Var;
        this.d = x5fVar;
        final byte b = 0;
        this.e = z4c.b(new Function0(this) { // from class: ejn
            public final /* synthetic */ fjn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                fjn fjnVar = this.b;
                switch (b2) {
                    case 0:
                        return i0l.c(fjnVar.a);
                    default:
                        return i0l.b(fjnVar.a);
                }
            }
        });
        final byte b2 = 1;
        this.f = z4c.b(new Function0(this) { // from class: ejn
            public final /* synthetic */ fjn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                fjn fjnVar = this.b;
                switch (b22) {
                    case 0:
                        return i0l.c(fjnVar.a);
                    default:
                        return i0l.b(fjnVar.a);
                }
            }
        });
    }

    public final boolean a() {
        ru9 ru9Var = this.b;
        if (ru9Var.a.getBoolean("crypto.wallet.wallet_removed", false) || !(ru9Var.a.getBoolean("crypto.wallet.has_new_wallet", false) || ru9Var.a.getBoolean("crypto.wallet.has_wallet", false))) {
            return false;
        }
        cj9 cj9Var = (cj9) this.c.i();
        return !("ru".equals(cj9Var.a) || "ru".equals(cj9Var.b) || "ru".equals((String) this.e.getValue()) || "ru".equals((String) this.f.getValue()));
    }
}
