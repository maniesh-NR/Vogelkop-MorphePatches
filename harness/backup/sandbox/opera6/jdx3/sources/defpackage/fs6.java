package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class fs6 implements p5j {
    public final SettingsManager a;
    public final kze b;
    public final kze c;
    public final jze d;
    public final jze e;
    public final jze f;
    public final ode g;
    public final hx5 h;
    public boolean i;

    public fs6(SettingsManager settingsManager, kze kzeVar, kze kzeVar2, ode odeVar, hx5 hx5Var) {
        this.a = settingsManager;
        this.b = kzeVar;
        this.c = kzeVar2;
        this.g = odeVar;
        this.h = hx5Var;
        jze jzeVar = new jze(Boolean.valueOf(a()));
        this.e = jzeVar;
        boolean z = false;
        z = false;
        z = false;
        final byte b = z ? (byte) 1 : (byte) 0;
        jzeVar.s(kzeVar2, new f7f(this) { // from class: es6
            public final /* synthetic */ fs6 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                fs6 fs6Var = this.b;
                switch (b2) {
                    case 0:
                        xf8.G0(fs6Var.e, Boolean.valueOf(fs6Var.a()));
                        fs6Var.c();
                        break;
                    case 1:
                        xf8.G0(fs6Var.d, Boolean.valueOf(fs6Var.b()));
                        break;
                    case 2:
                        fs6Var.c();
                        break;
                    default:
                        fs6Var.c();
                        break;
                }
            }
        });
        jze jzeVar2 = new jze(Boolean.valueOf(b()));
        this.d = jzeVar2;
        final byte b2 = 1;
        jzeVar2.s(kzeVar, new f7f(this) { // from class: es6
            public final /* synthetic */ fs6 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                fs6 fs6Var = this.b;
                switch (b22) {
                    case 0:
                        xf8.G0(fs6Var.e, Boolean.valueOf(fs6Var.a()));
                        fs6Var.c();
                        break;
                    case 1:
                        xf8.G0(fs6Var.d, Boolean.valueOf(fs6Var.b()));
                        break;
                    case 2:
                        fs6Var.c();
                        break;
                    default:
                        fs6Var.c();
                        break;
                }
            }
        });
        if (b() && a() && settingsManager.i("live_scores_odds_enabled")) {
            z = true;
        }
        jze jzeVar3 = new jze(Boolean.valueOf(z));
        this.f = jzeVar3;
        final byte b3 = 2;
        f7f f7fVar = new f7f(this) { // from class: es6
            public final /* synthetic */ fs6 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                fs6 fs6Var = this.b;
                switch (b22) {
                    case 0:
                        xf8.G0(fs6Var.e, Boolean.valueOf(fs6Var.a()));
                        fs6Var.c();
                        break;
                    case 1:
                        xf8.G0(fs6Var.d, Boolean.valueOf(fs6Var.b()));
                        break;
                    case 2:
                        fs6Var.c();
                        break;
                    default:
                        fs6Var.c();
                        break;
                }
            }
        };
        h42 h42Var = jzeVar3.l;
        h42Var.s(kzeVar, f7fVar);
        final byte b4 = 3;
        h42Var.s(kzeVar2, new f7f(this) { // from class: es6
            public final /* synthetic */ fs6 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b4;
                fs6 fs6Var = this.b;
                switch (b22) {
                    case 0:
                        xf8.G0(fs6Var.e, Boolean.valueOf(fs6Var.a()));
                        fs6Var.c();
                        break;
                    case 1:
                        xf8.G0(fs6Var.d, Boolean.valueOf(fs6Var.b()));
                        break;
                    case 2:
                        fs6Var.c();
                        break;
                    default:
                        fs6Var.c();
                        break;
                }
            }
        });
        settingsManager.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("live_scores_enabled")) {
            xf8.G0(this.d, Boolean.valueOf(b()));
            c();
        } else if (str.equals("live_scores_odds_enabled")) {
            c();
        }
    }

    public final boolean a() {
        return ((Boolean) this.c.g()).booleanValue() && this.i;
    }

    public final boolean b() {
        return ((Boolean) this.b.g()).booleanValue() && this.a.i("live_scores_enabled");
    }

    public final void c() {
        xf8.G0(this.f, Boolean.valueOf(b() && a() && this.a.i("live_scores_odds_enabled")));
    }
}
