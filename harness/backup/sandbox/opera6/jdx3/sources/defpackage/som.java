package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.autofill.PasswordDataMonitor;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.bookmarks.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class som extends lim {
    public final db a;
    public final i53 c;
    public final b59 f;
    public Runnable g;
    public PasswordManager h;
    public PasswordDataMonitor i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final nj2 b = new nj2(this, 8);
    public final dl3 d = new dl3(this, 5);
    public final rom e = new rom(this, 0);

    public som(Context context, db dbVar, i53 i53Var) {
        this.a = dbVar;
        this.c = i53Var;
        this.f = w1h.l(context, vml.d, "sync_upgrade_promo", new bg1[0]);
    }

    public final boolean R(int i) {
        if (!this.j && (i == 0 ? this.k || this.l : i != 1 || this.k)) {
            db dbVar = this.a;
            if (dbVar.f() && dbVar.d()) {
                b59 b59Var = this.f;
                long j = ((SharedPreferences) b59Var.get()).getLong("last_signin", 0L);
                if (j == 0) {
                    am2.x(((SharedPreferences) b59Var.get()).edit(), "last_signin");
                    return false;
                }
                if (System.currentTimeMillis() - j >= 72000000) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.a(this.b);
        this.g = ((h) this.c).a.d(new rom(this, (byte) 1));
        avj avjVar = cak.d;
        avj.g(1, this.e);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.h(this.b);
        Runnable runnable = this.g;
        i53 i53Var = this.c;
        if (runnable != null) {
            ArrayList arrayList = (ArrayList) ((vl9) ((h) i53Var).a.b).b;
            if (arrayList != null) {
                arrayList.remove(runnable);
            }
            this.g = null;
        } else if (!this.k) {
            i53Var.f(this.d);
        }
        PasswordDataMonitor passwordDataMonitor = this.i;
        if (passwordDataMonitor != null) {
            passwordDataMonitor.a();
            this.i = null;
        }
        if (this.h == null) {
            avj avjVar = cak.d;
            avj.f(this.e);
        } else {
            this.h = null;
        }
        this.k = false;
        this.l = false;
    }
}
