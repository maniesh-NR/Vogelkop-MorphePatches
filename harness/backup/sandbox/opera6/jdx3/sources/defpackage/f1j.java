package defpackage;

import android.net.Uri;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import com.opera.android.browser.b;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f1j {
    public final BrowserActivity a;
    public final umi b;
    public final bf9 c;
    public final SettingsManager d;
    public final x5f e;
    public final ki f;

    public f1j(BrowserActivity browserActivity, umi umiVar, bf9 bf9Var, SettingsManager settingsManager, x5f x5fVar, ki kiVar) {
        this.a = browserActivity;
        this.b = umiVar;
        this.c = bf9Var;
        this.d = settingsManager;
        this.e = x5fVar;
        this.f = kiVar;
        browserActivity.getLifecycle().a(new e1j(this));
    }

    public final boolean a() {
        return this.c.r() >= 2;
    }

    public final boolean b() {
        return this.d.i("my_flow_visible") && this.c.t();
    }

    public final void c(boolean z) {
        if (z) {
            qim qimVar = this.a.o;
            Objects.requireNonNull(qimVar);
            ysj ysjVar = qimVar.e;
            qt qtVar = new qt(this, (byte) 3);
            ysjVar.getClass();
            ysjVar.b(qtVar, ijm.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void d(re7 re7Var) {
        Uri uriG;
        if (!a()) {
            h(new jri(this, re7Var, (byte) 5));
            return;
        }
        if (!re7Var.k() || (uriG = re7Var.g()) == null) {
            g(re7Var.t.getUrl(), re7Var.f());
            return;
        }
        umi umiVar = this.b;
        x5f x5fVar = this.e;
        ?? r3 = this.a;
        fge fgeVar = new fge(r3, umiVar, x5fVar);
        fgeVar.L = uriG;
        fgeVar.M = null;
        zhj.a(fgeVar, 4099).c(r3);
    }

    public final void e(b2l b2lVar) {
        if (!a()) {
            h(new jri(this, b2lVar, (byte) 3));
            return;
        }
        d7l d7lVar = (d7l) b2lVar;
        if (!UrlMangler.isMangled(d7lVar.j.getUrl())) {
            g(d7lVar.k0(), d7lVar.l0());
            return;
        }
        if (z5i.a0(d7lVar.j.getUrl())) {
            x22 x22Var = ((y22) this.f.get()).a;
            if (x22Var != null) {
                x22Var.b(b2lVar, new q3(this.a, this, (byte) 19));
                return;
            }
            return;
        }
        aib.I(this.c, d7lVar.l0(), (String) null, d7lVar.k0(), (String) null, new d1j(this, (byte) 0));
    }

    public final void f(String str) {
        if (!a()) {
            h(new jri(this, str, (byte) 4));
            return;
        }
        d1j d1jVar = new d1j(this, (byte) 0);
        boolean zQ = aib.Q(str);
        bf9 bf9Var = this.c;
        if (!zQ) {
            bf9Var.G(str, d1jVar);
            return;
        }
        new b(this.b, str, p6l.a, new vzk(bf9Var, "", str, d1jVar), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void g(String str, String str2) {
        if (!wqm.r(str)) {
            d1j d1jVar = new d1j(this, (byte) 1);
            new b(this.b, str, p6l.a, new vzk(this.c, str2, str, d1jVar), false);
            return;
        }
        Uri uri = Uri.parse(str);
        umi umiVar = this.b;
        x5f x5fVar = this.e;
        ?? r8 = this.a;
        fge fgeVar = new fge(r8, umiVar, x5fVar);
        fgeVar.L = uri;
        fgeVar.M = str2;
        zhj.a(fgeVar, 4099).c(r8);
    }

    public final void h(Runnable runnable) {
        gge ggeVar = new gge(this.c, this.d);
        ggeVar.v = runnable;
        zhj.a(ggeVar, 4099).c(this.a);
    }
}
