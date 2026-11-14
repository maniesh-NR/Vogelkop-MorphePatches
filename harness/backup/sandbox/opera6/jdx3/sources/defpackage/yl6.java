package defpackage;

import android.app.role.RoleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import java.util.List;

/* loaded from: classes.dex */
public final class yl6 {
    public final Context a;
    public final umi b;
    public final b59 c;

    public yl6(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
        this.c = w1h.l(context, umiVar, "default_browser", new bg1[0]);
    }

    public final boolean a() {
        Context context = this.a;
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()) != null;
    }

    public final boolean b() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return this.a.getPackageManager().resolveActivity(new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"), 65536) != null;
    }

    public final boolean c() {
        RoleManager roleManager = (RoleManager) this.a.getSystemService("role");
        return (roleManager == null || !roleManager.isRoleAvailable("android.app.role.BROWSER") || ((SharedPreferences) this.c.get()).getBoolean("role_auto_denied", false)) ? false : true;
    }

    public final sl6 d() {
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) this.a.getApplicationContext()).k();
    }

    public final void e(final oi oiVar, final Runnable runnable) {
        boolean zC = c();
        Context context = this.a;
        if (zC) {
            final long jUptimeMillis = SystemClock.uptimeMillis();
            ((hjf) oiVar).D(((RoleManager) context.getSystemService("role")).createRequestRoleIntent("android.app.role.BROWSER"), new ni() { // from class: wl6
                @Override // defpackage.ni
                public final void a(int i, Intent intent) {
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    if (i == -1 || jUptimeMillis2 >= 500) {
                        return;
                    }
                    yl6 yl6Var = this.a;
                    j.d((SharedPreferences) yl6Var.c.get(), "role_auto_denied", true);
                    Runnable runnable2 = runnable;
                    if (runnable2 == null) {
                        yl6Var.e(oiVar, null);
                    } else {
                        runnable2.run();
                    }
                }
            });
            return;
        }
        if (!b()) {
            Intent intentA = sl6.a();
            intentA.putExtra("com.opera.android.extra.DO_NOT_OPEN_TAB", true);
            intentA.putExtra("com.opera.android.extra.DO_NOT_INTERCEPT", true);
            context.startActivity(intentA);
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
        intent.addFlags(1342177280);
        intent.putExtra(":settings:fragment_args_key", "default_browser");
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "default_browser");
        intent.putExtra(":settings:show_fragment_args", bundle);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final boolean f() {
        return g() && d().b();
    }

    public final boolean g() {
        if (tl6.a() && a()) {
            return c() || b();
        }
        return false;
    }

    public final void h(x5f x5fVar) {
        uk6 uk6Var = new uk6((Object) this, (byte) 3);
        umi umiVar = this.b;
        nml nmlVarE = umiVar.e(uk6Var);
        nmlVarE.b(umiVar.f(new xl6(x5fVar, (byte) 0)));
        nmlVarE.a(null);
    }

    public final void i(orm ormVar, vb0 vb0Var, ac0 ac0Var, boolean z, String str) {
        kb0 kb0Var;
        b59 b59Var = this.c;
        if (!z && ac0Var != ac0.c && ac0Var != ac0.f) {
            SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
            sharedPreferences.edit().putLong("non_manual_shown_count", sharedPreferences.getLong("non_manual_shown_count", 0L) + 1).apply();
        }
        if (tl6.a()) {
            sl6 sl6VarD = d();
            kb0Var = sl6VarD.b() ? kb0.b : sl6VarD.c() ? kb0.d : kb0.c;
        } else {
            kb0Var = null;
        }
        if (kb0Var != null) {
            jb0 jb0Var = c() ? jb0.d : b() ? jb0.c : jb0.b;
            long j = ((SharedPreferences) b59Var.get()).getLong("non_manual_shown_count", 0L);
            x5f x5fVar = (x5f) ormVar;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                p56 p56Var = new p56(2443, -1, 6);
                if (vb0Var != null) {
                    p56Var.q(0, 1, vb0Var);
                }
                p56Var.q(1, 1, kb0Var);
                p56Var.q(2, 1, ac0Var);
                p56Var.q(3, 1, jb0Var);
                p56Var.p(4, 1, j);
                if (str != null) {
                    p56Var.q(5, 1, str);
                }
                x56 x56VarF = zpa.F();
                xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                List list = (List) xb0VarX.n(10);
                ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 10, am2.q(xb0VarX, 10, 1)) : new hf0(xb0VarX, 10, list)).add(p56Var);
                x5fVar.U0(x56VarF);
            }
        }
    }

    public final void j() {
        ((SharedPreferences) this.c.get()).edit().putBoolean("has_been_default_browser_previously", true).remove("default_browser_removal_time").apply();
    }

    public final boolean k() {
        sl6 sl6VarD = d();
        if (sl6VarD.b() || !a()) {
            return false;
        }
        return !sl6VarD.c() || c() || b();
    }
}
