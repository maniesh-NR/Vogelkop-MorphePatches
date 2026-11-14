package defpackage;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.appsflyer.internal.j;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class v1f {
    public final b59 a;
    public final SparseArray b;
    public final r1f c;

    /* JADX WARN: Multi-variable type inference failed */
    public v1f(BrowserActivity browserActivity, umi umiVar, xc9 xc9Var, jnm jnmVar, ojn ojnVar, ru9 ru9Var, ikc ikcVar) {
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        r1f r1fVar = new r1f(this, new rl((byte) 4));
        this.c = r1fVar;
        this.a = w1h.l(browserActivity, umiVar, "main_menu_notification_controller", new bg1[0]);
        yqd yqdVar = new yqd(r1fVar, (byte) 20);
        sparseArray.put(1, new r1f((ndc) browserActivity, xc9Var, yqdVar));
        sparseArray.put(2, new u1f(browserActivity, umiVar, yqdVar));
        sparseArray.put(4, new r1f(ojnVar));
        sparseArray.put(8, new r1f((ndc) browserActivity, jnmVar, yqdVar));
        sparseArray.put(16, new u1f(browserActivity, ru9Var, ikcVar, yqdVar));
        tcc lifecycle = browserActivity.getLifecycle();
        for (int i = 0; i < sparseArray.size(); i++) {
            p1f p1fVar = (p1f) sparseArray.valueAt(i);
            final int iKeyAt = sparseArray.keyAt(i);
            p1fVar.b.d(new d50(this, iKeyAt, p1fVar, (byte) 7));
            t1f t1fVar = new t1f() { // from class: o1f
                @Override // defpackage.t1f
                public final void a(boolean z) {
                    this.a.d(iKeyAt, z);
                }
            };
            if (p1fVar.a.b(t1fVar)) {
                p1fVar.c.run();
            }
            lifecycle.a(new d62(p1fVar, t1fVar));
        }
    }

    public final p1f a(int i) {
        return (p1f) this.b.get(i);
    }

    public final int b() {
        return ((SharedPreferences) this.a.get()).getInt("unseen_notifications", 0);
    }

    public final void c(int i) {
        if (i == b()) {
            return;
        }
        j.b((SharedPreferences) this.a.get(), "unseen_notifications", i);
        this.c.b();
    }

    public final void d(int i, boolean z) {
        b59 b59Var = this.a;
        int i2 = ((SharedPreferences) b59Var.get()).getInt("active_notifications", 0);
        if (z == ((i2 & i) != 0)) {
            return;
        }
        int i3 = z ? i2 | i : i2 & (~i);
        ((SharedPreferences) b59Var.get()).edit().putInt("active_notifications", i3).apply();
        c((b() | (i & i3)) & (~(i & (~i3))));
    }
}
