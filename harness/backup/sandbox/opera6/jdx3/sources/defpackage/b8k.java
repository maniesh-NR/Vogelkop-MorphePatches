package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b8k implements ed, u9j, p5j {
    public final Context a;
    public final SettingsManager b;
    public final qln c;
    public final xnh d;
    public final kze e;
    public final fue f;
    public final ode g;
    public final mgh h;
    public final hx5 i;
    public final ikc j;
    public final fd k;
    public final ikc l;
    public final v9j m;
    public final h42 n;
    public List o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final Set t;

    public b8k(Context context, SettingsManager settingsManager, qln qlnVar, xnh xnhVar, kze kzeVar, fue fueVar, ode odeVar, mgh mghVar, hx5 hx5Var, ikc ikcVar, fd fdVar, ikc ikcVar2) {
        this.a = context;
        this.b = settingsManager;
        this.c = qlnVar;
        this.d = xnhVar;
        this.e = kzeVar;
        this.f = fueVar;
        this.g = odeVar;
        this.h = mghVar;
        this.i = hx5Var;
        this.j = ikcVar;
        this.k = fdVar;
        this.l = ikcVar2;
        v9j v9jVar = new v9j(this);
        this.m = v9jVar;
        this.n = b8h.d(v9jVar);
        this.o = l08.a;
        this.t = e82.E(new String[]{"wallpaper_current", "speed_dial.enabled", "enable_suggested_speed_dials_on_start_page", "live_scores_enabled", "enable_newsfeed", "enable_start_page_customize_button", "enable_start_page_opera_logo", "enable_search_shortcuts", "enable_search_shortcuts_tablet", "enable_weather", "app_layout"});
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (this.t.contains(str)) {
            b();
        }
    }

    @Override // defpackage.ed
    public final void a() {
        b();
    }

    public final void b() {
        boolean z;
        List list = this.o;
        SettingsManager settingsManager = this.b;
        knn knnVar = new knn(list, settingsManager.z("wallpaper_current"));
        boolean z2 = this.q;
        boolean z3 = this.r;
        mgh mghVar = this.h;
        ru9 ru9Var = (ru9) mghVar.c;
        Boolean boolValueOf = ru9Var.a.contains("startpage.logo_fits") ? Boolean.valueOf(ru9Var.a.getBoolean("startpage.logo_fits", true)) : null;
        yt8 yt8Var = new yt8(z2, mghVar.k(boolValueOf != null ? boolValueOf.booleanValue() : true, z3));
        yt8 yt8Var2 = new yt8(this.s, settingsManager.i("enable_weather"));
        yt8 yt8Var3 = new yt8(true, settingsManager.i("speed_dial.enabled"));
        yt8 yt8Var4 = new yt8(((wnh) this.d.i()).a(134217728), settingsManager.i("enable_suggested_speed_dials_on_start_page"));
        yt8 yt8Var5 = new yt8(false, false);
        yt8 yt8Var6 = new yt8(this.p, settingsManager.i("live_scores_enabled"));
        yt8 yt8Var7 = (yt8) this.j.g();
        fue fueVar = this.f;
        fueVar.d();
        yt8 yt8Var8 = new yt8(fueVar.a != cue.None, settingsManager.i("enable_newsfeed"));
        yt8 yt8Var9 = new yt8(true, settingsManager.i("enable_start_page_customize_button"));
        pc pcVar = pc.z;
        fd fdVar = this.k;
        boolean zB = fdVar.b(pcVar);
        boolean z4 = zB || fdVar.b(pc.m);
        t8k t8kVar = (t8k) this.g.g();
        boolean z5 = (t8kVar != null ? t8kVar.d : null) == r8k.b;
        e7j e7jVarF = settingsManager.f();
        e7j e7jVar = e7j.d;
        boolean z6 = e7jVarF == e7jVar;
        boolean zI = settingsManager.i("enable_search_shortcuts");
        rsi rsiVar = new rsi(z5 && z4 && !z6, zI, zB ? new rxh(2132021516) : new rxh(2132021517), new lxh(zI ? 2131231979 : 2131231978));
        boolean z7 = settingsManager.f() == e7jVar;
        int iOrdinal = ddh.t(((kl5) this.l.g()).b.width(), this.a).ordinal();
        if (iOrdinal == 0) {
            z = false;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
                return;
            }
            z = true;
        }
        this.m.r(new z7k(knnVar, yt8Var, yt8Var2, yt8Var9, rsiVar, new rsi(z7 && z, settingsManager.i("enable_search_shortcuts_tablet"), new rxh(2132021518), new lxh(2131231978)), yt8Var5, yt8Var6, yt8Var7, yt8Var8, yt8Var3, yt8Var4));
    }

    @Override // defpackage.u9j
    public final void j() {
        b();
        this.b.F(this);
        qln qlnVar = this.c;
        final byte b = 4;
        qlnVar.f.r(new rl((byte) 4));
        ize izeVar = (ize) qlnVar.n.get();
        final byte b2 = 0;
        t7d t7dVar = new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                b8k b8kVar = this.b;
                switch (b3) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18);
        v9j v9jVar = this.m;
        v9jVar.s(izeVar, t7dVar);
        final byte b3 = 1;
        v9jVar.s(this.e, new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b3;
                b8k b8kVar = this.b;
                switch (b32) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        final byte b4 = 2;
        v9jVar.s(this.g, new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b4;
                b8k b8kVar = this.b;
                switch (b32) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        final byte b5 = 3;
        v9jVar.s(this.i, new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b5;
                b8k b8kVar = this.b;
                switch (b32) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        v9jVar.s(this.j, new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b;
                b8k b8kVar = this.b;
                switch (b32) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        final byte b6 = 5;
        v9jVar.s(this.l, new t7d(new Function1(this) { // from class: a8k
            public final /* synthetic */ b8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b32 = b6;
                b8k b8kVar = this.b;
                switch (b32) {
                    case 0:
                        b8kVar.o = (List) obj;
                        b8kVar.b();
                        break;
                    case 1:
                        b8kVar.p = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 2:
                        t8k t8kVar = (t8k) obj;
                        t8kVar.getClass();
                        b8kVar.q = true;
                        b8kVar.r = t8kVar.b;
                        b8kVar.b();
                        break;
                    case 3:
                        b8kVar.s = ((Boolean) obj).booleanValue();
                        b8kVar.b();
                        break;
                    case 4:
                        b8kVar.b();
                        break;
                    default:
                        b8kVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        this.k.d.b(this);
        a();
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        ize izeVar = (ize) this.c.n.get();
        v9j v9jVar = this.m;
        v9jVar.t(izeVar);
        v9jVar.t(this.e);
        v9jVar.t(this.g);
        v9jVar.t(this.i);
        v9jVar.t(this.j);
        v9jVar.t(this.l);
        this.k.d.c(this);
        this.b.H(this);
    }
}
