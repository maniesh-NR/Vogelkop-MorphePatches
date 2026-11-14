package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d3f extends j93 {
    public final x0f d;
    public final k3i e;
    public final ode f;
    public final s9 g;
    public final h42 h;

    public d3f(SettingsManager settingsManager, d8j d8jVar, x0f x0fVar, k3i k3iVar) {
        super(settingsManager, d8jVar);
        this.d = x0fVar;
        this.e = k3iVar;
        this.f = new ode();
        s9 s9Var = new s9(this, (byte) 26);
        this.g = s9Var;
        h42 h42Var = new h42(null);
        this.h = h42Var;
        g();
        settingsManager.F(s9Var);
        ode odeVar = x0fVar.e;
        final byte b = 0;
        final byte b2 = 1;
        h42Var.s(odeVar, new t7d(new Function1(this) { // from class: c3f
            public final /* synthetic */ d3f b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                d3f d3fVar = this.b;
                switch (b3) {
                    case 0:
                        d3fVar.g();
                        break;
                    default:
                        d3fVar.g();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 1));
        h42Var.s(k3iVar.a(), new t7d(new Function1(this) { // from class: c3f
            public final /* synthetic */ d3f b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                d3f d3fVar = this.b;
                switch (b3) {
                    case 0:
                        d3fVar.g();
                        break;
                    default:
                        d3fVar.g();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 1));
    }

    public final void e() {
        this.b.H(this.g);
    }

    public final void g() {
        SettingsManager settingsManager = this.b;
        xf8.E0(this.f, new b3f(new jwk(true, settingsManager.i("vpn_pro_in_app_notification")), new jwk(true, settingsManager.i("wallpaper_in_app_notification")), new jwk(true, settingsManager.i("feedback_in_app_notification")), new jwk(true, settingsManager.i("product_and_service_in_app_notification")), new jwk(true, settingsManager.i("feature_tips_notification")), new jwk(true, settingsManager.i("esim_notifications")), new jwk(this.e.b(), settingsManager.i("rewards_notifications")), (w0f) this.d.e.g()));
    }
}
