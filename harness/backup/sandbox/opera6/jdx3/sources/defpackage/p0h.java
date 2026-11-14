package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final class p0h implements p5j, gj, q9g {
    public final SettingsManager a;
    public final s9g b;
    public final h42 c;
    public final h42 d;
    public final kze e;
    public final kze f;
    public final kze g;
    public final h42 h;

    public p0h(SettingsManager settingsManager, s9g s9gVar) {
        h42 h42Var = new h42();
        this.c = h42Var;
        h42 h42Var2 = new h42();
        this.d = h42Var2;
        kze kzeVar = new kze("");
        this.e = kzeVar;
        this.f = new kze(qwi.a());
        kze kzeVar2 = new kze(Boolean.FALSE);
        this.g = kzeVar2;
        h42 h42Var3 = new h42();
        this.h = h42Var3;
        a1b a1bVar = h1b.b;
        h42Var3.r(csh.e);
        final byte b = 0;
        h42Var3.s(kzeVar, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                p0h p0hVar = this.b;
                switch (b2) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        final byte b2 = 1;
        h42Var3.s(kzeVar2, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                p0h p0hVar = this.b;
                switch (b22) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        final byte b3 = 2;
        h42Var.s(kzeVar2, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                p0h p0hVar = this.b;
                switch (b22) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        final byte b4 = 3;
        h42Var.s(kzeVar, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b4;
                p0h p0hVar = this.b;
                switch (b22) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        final byte b5 = 4;
        h42Var2.s(kzeVar2, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b5;
                p0h p0hVar = this.b;
                switch (b22) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        final byte b6 = 5;
        h42Var2.s(kzeVar, new f7f(this) { // from class: m0h
            public final /* synthetic */ p0h b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b6;
                p0h p0hVar = this.b;
                switch (b22) {
                    case 0:
                        p0hVar.f();
                        break;
                    case 1:
                        p0hVar.f();
                        break;
                    case 2:
                        p0hVar.c();
                        break;
                    case 3:
                        p0hVar.c();
                        break;
                    case 4:
                        p0hVar.g();
                        break;
                    default:
                        p0hVar.g();
                        break;
                }
            }
        });
        this.a = settingsManager;
        this.b = s9gVar;
        settingsManager.F(this);
        hj.a.b(this);
        c();
        g();
        s9gVar.F(this);
    }

    @Override // defpackage.q9g
    public final void A() {
        f();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("ad_blocking".equals(str)) {
            c();
        } else if ("tracker_blocker".equals(str)) {
            g();
        }
    }

    @Override // defpackage.gj
    public final void a(int i, int i2, String str) {
        String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback((String) this.e.g());
        i7f i7fVar = hj.a;
        if (TextUtils.equals(wqm.q(externalUrlWithFallback), str)) {
            if ((i2 & 1) != 0) {
                c();
            }
            if ((i2 & 2) != 0) {
                g();
            }
        }
    }

    public final void b(int i, boolean z) {
        boolean zBooleanValue = ((Boolean) this.g.g()).booleanValue();
        String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback((String) this.e.g());
        i7f i7fVar = hj.a;
        String strQ = wqm.q(externalUrlWithFallback);
        if (z != (((strQ == null ? 0 : N.M$NXlYYm(strQ, zBooleanValue)) & i) == i)) {
            return;
        }
        if (z) {
            hj.b(0, i, externalUrlWithFallback, zBooleanValue);
        } else {
            hj.b(i, 0, externalUrlWithFallback, zBooleanValue);
        }
    }

    public final void c() {
        o0h o0hVar = (o0h) this.c.g();
        e(o0hVar == null ? 0L : o0hVar.a);
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        if (list.stream().anyMatch(new n0h(GURLUtils.getOrigin((String) this.e.g()), (byte) 0))) {
            f();
        }
    }

    public final void e(long j) {
        boolean zI = this.a.i("ad_blocking");
        String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback((String) this.e.g());
        boolean zBooleanValue = ((Boolean) this.g.g()).booleanValue();
        i7f i7fVar = hj.a;
        String strQ = wqm.q(externalUrlWithFallback);
        this.c.r(new o0h(j, zI, !(((strQ == null ? 0 : N.M$NXlYYm(strQ, zBooleanValue)) & 1) == 1)));
    }

    public final void f() {
        String origin = GURLUtils.getOrigin((String) this.e.g());
        boolean zIsEmpty = TextUtils.isEmpty(origin);
        h42 h42Var = this.h;
        if (!zIsEmpty && wqm.D(Uri.parse(origin))) {
            h42Var.r(h1b.s(ui6.x(origin, ui6.n, Boolean.TRUE.equals(this.g.g()))));
        } else {
            a1b a1bVar = h1b.b;
            h42Var.r(csh.e);
        }
    }

    public final void g() {
        o0h o0hVar = (o0h) this.d.g();
        h(o0hVar == null ? 0L : o0hVar.a);
    }

    public final void h(long j) {
        boolean zI = this.a.i("tracker_blocker");
        String externalUrlWithFallback = BrowserUtils.getExternalUrlWithFallback((String) this.e.g());
        boolean zBooleanValue = ((Boolean) this.g.g()).booleanValue();
        i7f i7fVar = hj.a;
        String strQ = wqm.q(externalUrlWithFallback);
        this.d.r(new o0h(j, zI, !(((strQ == null ? 0 : N.M$NXlYYm(strQ, zBooleanValue)) & 2) == 2)));
    }
}
