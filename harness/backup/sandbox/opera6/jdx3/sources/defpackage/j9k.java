package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class j9k implements k9k {
    public final Activity a;
    public final umi b;
    public final SettingsManager c;
    public final j4c d;
    public i9k e;
    public boolean f;
    public final jze g = new jze(Boolean.FALSE);

    public j9k(Activity activity, umi umiVar, Lazy lazy, SettingsManager settingsManager) {
        this.a = activity;
        this.b = umiVar;
        this.c = settingsManager;
        this.d = new j4c(new ow3(this, lazy, (byte) 10), (byte) 0);
    }

    @Override // defpackage.k9k
    public final ize a() {
        return this.g;
    }

    @Override // defpackage.k9k
    public final void b(boolean z) {
        if (d()) {
            return;
        }
        Object objF = this.d.f();
        if (objF != null) {
            bk5 bk5Var = (bk5) objF;
            if (z) {
                bk5Var.b(xle.d);
            } else if (bk5Var.a()) {
                lh4 lh4Var = bk5Var.g;
                if (lh4Var != null) {
                    lh4Var.b = null;
                    bk5Var.g = null;
                }
                jk5 jk5Var = bk5Var.a;
                synchronized (jk5Var.d) {
                    jk5Var.e = null;
                }
                bk5Var.h = null;
                bk5Var.d(ak5.a);
            }
        }
        c();
    }

    public final void c() {
        if (d()) {
            return;
        }
        i9k i9kVar = this.e;
        if (i9kVar != null) {
            ((i7f) xw1.b.b).c(i9kVar);
            this.e = null;
        }
        this.g.r(Boolean.TRUE);
    }

    public final boolean d() {
        return ((Boolean) this.g.g()).booleanValue();
    }

    public final void e(String str) {
        if (d()) {
            return;
        }
        j4c j4cVar = this.d;
        if (j4cVar.c()) {
            return;
        }
        bk5 bk5Var = (bk5) j4cVar.get();
        if (!bk5Var.e(str, gk5.a)) {
            c();
            return;
        }
        this.g.l.s(bk5Var.f, new w4i(new n6k(this, (byte) 7), (byte) 14));
    }

    @Override // defpackage.k9k
    public final void start() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.c.J()) {
            String[] strArr = OperaApplication.K;
            if (TextUtils.isEmpty(((OperaApplication) this.a.getApplicationContext()).i().a())) {
                avj avjVar = cak.d;
                avj.g(2, new mni(this, (byte) 23));
                return;
            }
        }
        c();
    }
}
