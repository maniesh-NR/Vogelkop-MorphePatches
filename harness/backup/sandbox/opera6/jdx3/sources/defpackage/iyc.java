package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.leanplum.internal.Clock;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iyc implements Application.ActivityLifecycleCallbacks {
    public final umi a;
    public final ox3 b;
    public final ox3 c;
    public final SettingsManager d;
    public final b59 e;
    public oml f;
    public final s9 g = new s9(this, (byte) 21);
    public int h;

    public iyc(OperaApplication operaApplication, umi umiVar, ox3 ox3Var, ox3 ox3Var2, SettingsManager settingsManager) {
        this.a = umiVar;
        this.b = ox3Var;
        this.c = ox3Var2;
        this.d = settingsManager;
        this.e = w1h.l(operaApplication, umiVar, "location_tracker", new bg1[0]);
    }

    public final void a() {
        if (this.h == 0) {
            return;
        }
        SettingsManager settingsManager = this.d;
        if (settingsManager.i("process_location") && settingsManager.i("eula_accepted.gdpr")) {
            long j = ((SharedPreferences) this.e.get()).getLong("behavior_last_report", 0L);
            if (j == 0) {
                b();
                return;
            }
            long jAbs = Math.abs(System.currentTimeMillis() - j);
            if (jAbs >= Clock.DAY_MILLIS) {
                b();
                return;
            }
            long j2 = Clock.DAY_MILLIS - jAbs;
            oml omlVar = new oml(this.a.d(new hyc(this, (byte) 1)));
            this.f = omlVar;
            omlVar.b(null, j2, TimeUnit.MILLISECONDS, null);
        }
    }

    public final void b() {
        this.f = null;
        SettingsManager settingsManager = this.d;
        if (settingsManager.i("process_location") && settingsManager.i("eula_accepted.gdpr")) {
            yv9 yv9VarA = ((zv9) this.c.get()).a();
            long j = yv9VarA.c;
            ox3 ox3Var = this.b;
            if (j <= 0 || System.currentTimeMillis() - j >= Clock.DAY_MILLIS) {
                ((osf) ox3Var.get()).a(new w5f((byte) 10));
            } else {
                osf osfVar = (osf) ox3Var.get();
                final double d = yv9VarA.a;
                final double d2 = yv9VarA.b;
                osfVar.a(new Function1() { // from class: nsf
                    public final Object invoke(Object obj) {
                        hh0 hh0Var = (hh0) ((yj0) obj).e.getValue();
                        Locale locale = Locale.ROOT;
                        hh0Var.a.q(0, 1, String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(d * 10.0d) / 10.0d)}, 1)));
                        hh0Var.a.q(1, 1, String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor(d2 * 10.0d) / 10.0d)}, 1)));
                        return Unit.a;
                    }
                });
            }
            am2.x(((SharedPreferences) this.e.get()).edit(), "behavior_last_report");
            oml omlVar = new oml(this.a.d(new hyc(this, (byte) 1)));
            this.f = omlVar;
            omlVar.b(null, Clock.DAY_MILLIS, TimeUnit.MILLISECONDS, null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.h - 1;
        this.h = i;
        if (i == 0) {
            oml omlVar = this.f;
            if (omlVar != null) {
                omlVar.cancel(false);
                this.f = null;
            }
            this.d.H(this.g);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.h + 1;
        this.h = i;
        if (i == 1) {
            this.d.F(this.g);
            this.e.a(new a00(this, (byte) 5));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
