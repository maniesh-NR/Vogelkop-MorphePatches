package defpackage;

import android.content.SharedPreferences;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class u1f extends p1f {
    public final /* synthetic */ byte e = 1;
    public final Object f;
    public final Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public u1f(BrowserActivity browserActivity, umi umiVar, yqd yqdVar) {
        super(yqdVar);
        this.f = browserActivity;
        this.g = w1h.l(browserActivity, umiVar, "update_notifier", new bg1[]{new b94(umiVar, new y0a(this, (byte) 29), (byte) 0)});
    }

    public u1f(ndc ndcVar, ru9 ru9Var, ikc ikcVar, yqd yqdVar) {
        super(yqdVar);
        this.f = ru9Var;
        this.g = ikcVar;
        x53 x53Var = new x53(this);
        ru9Var.a(x53Var);
        ndcVar.getLifecycle().a(new qs2(ru9Var, x53Var));
        ikcVar.j(ndcVar, new t77((Object) this, (byte) 5));
        xf8.g0(ikcVar, ndcVar, new d8d(this, (byte) 14));
    }

    @Override // defpackage.p1f
    public final boolean a() {
        byte b = this.e;
        Object obj = this.g;
        switch (b) {
            case 0:
                if (((ikc) obj).g() == m18.b) {
                    return !((ru9) this.f).a.getBoolean("rewards.has_opened_ui", false);
                }
                return false;
            default:
                return ((SharedPreferences) ((b59) obj).get()).getBoolean("has_notification", false);
        }
    }
}
