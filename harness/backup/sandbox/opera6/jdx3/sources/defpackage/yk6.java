package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.opera.android.settings.SettingsManager;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yk6 {
    public static final Set z = e82.E(new String[]{"by", "cn", "ir", "kp", "ru", "ve"});
    public final umi a;
    public final SettingsManager b;
    public final mv0 c;
    public final dj9 d;
    public final xb e;
    public final ru9 f;
    public final x5f g;
    public final wjh h;
    public final kze i;
    public final kze j;
    public final kze k;
    public final kze l;
    public final kze m;
    public final kze n;
    public final kze o;
    public final ode p;
    public final kze q;
    public final kze r;
    public final kze s;
    public final kze t;
    public final kze u;
    public final kze v;
    public final kze w;
    public final k32 x;
    public final k32 y;

    public yk6(Context context, umi umiVar, SettingsManager settingsManager, mv0 mv0Var, dj9 dj9Var, xb xbVar, ru9 ru9Var, x5f x5fVar, x5f x5fVar2) {
        this.a = umiVar;
        this.b = settingsManager;
        this.c = mv0Var;
        this.d = dj9Var;
        this.e = xbVar;
        this.f = ru9Var;
        this.g = x5fVar2;
        this.x = new k32(context, (byte) 4);
        this.y = new k32(context, (byte) 3);
        kv0 kv0Var = (kv0) mv0Var.i();
        kze kzeVar = new kze(Boolean.valueOf(c(kv0Var)));
        this.i = kzeVar;
        final byte b = 0;
        this.j = new kze(Boolean.valueOf(!((Boolean) kzeVar.g()).booleanValue() ? false : settingsManager.i("ai_assistant_menu_shortcut")));
        kze kzeVar2 = new kze(Boolean.valueOf(kv0Var.c));
        this.k = kzeVar2;
        this.l = new kze(kv0Var.b);
        new kze(Boolean.valueOf(((Boolean) kzeVar.g()).booleanValue()));
        this.m = new kze(Boolean.valueOf(!((Boolean) kzeVar.g()).booleanValue() ? false : settingsManager.i("ai_assistant_menu_shortcut")));
        this.n = new kze(b());
        final byte b2 = 1;
        this.o = new kze(Boolean.valueOf(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0));
        wjh wjhVar = new wjh(kzeVar, context.getApplicationContext(), umiVar, x5fVar);
        this.h = wjhVar;
        this.p = new ode();
        f(null);
        Boolean bool = (Boolean) kzeVar.g();
        bool.getClass();
        this.q = new kze(bool);
        this.r = new kze(Boolean.valueOf(((Boolean) kzeVar.g()).booleanValue() && settingsManager.i("ai_assistant_menu_shortcut") && settingsManager.i("ai_assistant_ask_aria")));
        Boolean bool2 = (Boolean) kzeVar.g();
        bool2.getClass();
        new kze(bool2);
        this.s = new kze(Boolean.valueOf(a()));
        this.t = new kze(Boolean.valueOf(kv0Var.j.contains(Locale.getDefault().getLanguage())));
        this.u = new kze(Boolean.valueOf(((Boolean) kzeVar.g()).booleanValue() && kv0Var.g));
        this.v = new kze(Boolean.valueOf(ru9Var.a.getBoolean("ai.tos_accepted", false)));
        this.w = new kze(Boolean.valueOf(kv0Var.h));
        settingsManager.F(new s9(this, (byte) 12));
        dj9Var.F(new mo7(this) { // from class: wk6
            public final /* synthetic */ yk6 b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z2) {
                byte b3 = b;
                yk6 yk6Var = this.b;
                switch (b3) {
                    case 0:
                        if (!z2) {
                            yk6Var.e();
                            break;
                        }
                        break;
                    default:
                        if (!z2) {
                            yk6Var.e();
                            break;
                        }
                        break;
                }
            }
        });
        mv0Var.F(new mo7(this) { // from class: wk6
            public final /* synthetic */ yk6 b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z2) {
                byte b3 = b2;
                yk6 yk6Var = this.b;
                switch (b3) {
                    case 0:
                        if (!z2) {
                            yk6Var.e();
                            break;
                        }
                        break;
                    default:
                        if (!z2) {
                            yk6Var.e();
                            break;
                        }
                        break;
                }
            }
        });
        xf8.h0((ode) wjhVar.f, new k9((Object) this, (byte) 29));
        kzeVar2.k(new cl4(new tb6((byte) 21), (byte) 8));
        d();
    }

    public final boolean a() {
        return ((Boolean) this.i.g()).booleanValue() && ((Boolean) this.j.g()).booleanValue() && this.b.i("ai_assistant_ask_aria");
    }

    public final pv0 b() {
        return (((Boolean) this.i.g()).booleanValue() && ((Boolean) this.j.g()).booleanValue()) ? pv0.a : pv0.b;
    }

    public final boolean c(kv0 kv0Var) {
        if (!kv0Var.a.contains(Locale.getDefault().getLanguage())) {
            return false;
        }
        if (kv0Var.e) {
            return true;
        }
        cj9 cj9Var = (cj9) this.d.i();
        p4j p4jVar = new p4j();
        p4jVar.add(cj9Var.a);
        p4jVar.add(cj9Var.b);
        String str = (String) this.x.get();
        if (str != null) {
            p4jVar.add(str);
        }
        String str2 = (String) this.y.get();
        if (str2 != null) {
            p4jVar.add(str2);
        }
        p4j p4jVarA = z4j.a(p4jVar);
        if (p4jVarA != null && p4jVarA.a.isEmpty()) {
            return true;
        }
        r9d it = p4jVarA.iterator();
        while (((t9d) it).hasNext()) {
            if (CollectionsKt.E(z, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        boolean zBooleanValue = ((Boolean) this.i.g()).booleanValue();
        x5f x5fVar = this.g;
        if (!zBooleanValue) {
            x5fVar.x(b70.b);
        } else if (!((Boolean) this.j.g()).booleanValue()) {
            x5fVar.x(b70.h);
        } else {
            new nsc(this.e.d, new y0a(new iu2(this, (byte) 24), (byte) 17), (byte) 0);
        }
    }

    public final void e() {
        kv0 kv0Var = (kv0) this.c.i();
        Boolean boolValueOf = Boolean.valueOf(c(kv0Var));
        kze kzeVar = this.i;
        kzeVar.r(boolValueOf);
        boolean zBooleanValue = ((Boolean) kzeVar.g()).booleanValue();
        SettingsManager settingsManager = this.b;
        boolean z2 = false;
        this.j.r(Boolean.valueOf(!zBooleanValue ? false : settingsManager.i("ai_assistant_menu_shortcut")));
        this.k.r(Boolean.valueOf(kv0Var.c));
        this.l.r(kv0Var.b);
        this.m.r(Boolean.valueOf(!((Boolean) kzeVar.g()).booleanValue() ? false : settingsManager.i("ai_assistant_menu_shortcut")));
        this.n.r(b());
        f(null);
        Boolean bool = (Boolean) kzeVar.g();
        bool.booleanValue();
        this.q.r(bool);
        this.r.r(Boolean.valueOf(((Boolean) kzeVar.g()).booleanValue() && settingsManager.i("ai_assistant_menu_shortcut") && settingsManager.i("ai_assistant_ask_aria")));
        this.s.r(Boolean.valueOf(a()));
        this.t.r(Boolean.valueOf(kv0Var.j.contains(Locale.getDefault().getLanguage())));
        if (((Boolean) kzeVar.g()).booleanValue() && kv0Var.g) {
            z2 = true;
        }
        this.u.r(Boolean.valueOf(z2));
        this.w.r(Boolean.valueOf(kv0Var.h));
        d();
        x5f x5fVar = this.g;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.O(zpaVar).r(22, 1, true);
        x5fVar.U0(x56VarF);
    }

    public final void f(Boolean bool) {
        wjh wjhVar = this.h;
        boolean zN = wjhVar.n();
        ode odeVar = this.p;
        if (!zN) {
            odeVar.r(Boolean.FALSE);
            return;
        }
        Boolean bool2 = (Boolean) ((ode) wjhVar.f).g();
        boolean zA = Intrinsics.a(bool2, Boolean.TRUE);
        Boolean bool3 = Boolean.FALSE;
        if (zA) {
            odeVar.r(bool3);
            return;
        }
        if (!Intrinsics.a(bool2, bool3)) {
            if (bool2 == null) {
                return;
            }
            h9o.p();
        } else {
            if (bool != null) {
                odeVar.r(bool);
                return;
            }
            final byte b = 0;
            plk plkVarA = new rml(Unit.a, this.a).a(new Function1(this) { // from class: xk6
                public final /* synthetic */ yk6 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b2 = b;
                    yk6 yk6Var = this.b;
                    switch (b2) {
                        case 0:
                            wjh wjhVar2 = yk6Var.h;
                            wjhVar2.getClass();
                            int i = eif.a;
                            return Boolean.valueOf(kfo.e0((Context) wjhVar2.c));
                        default:
                            yk6Var.f((Boolean) obj);
                            return Unit.a;
                    }
                }
            });
            final byte b2 = 1;
            plkVarA.t(new Function1(this) { // from class: xk6
                public final /* synthetic */ yk6 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b22 = b2;
                    yk6 yk6Var = this.b;
                    switch (b22) {
                        case 0:
                            wjh wjhVar2 = yk6Var.h;
                            wjhVar2.getClass();
                            int i = eif.a;
                            return Boolean.valueOf(kfo.e0((Context) wjhVar2.c));
                        default:
                            yk6Var.f((Boolean) obj);
                            return Unit.a;
                    }
                }
            }).l();
        }
    }
}
