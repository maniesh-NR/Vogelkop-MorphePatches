package defpackage;

import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class dxe extends lim implements p5j, w6f {
    public final dx3 a;
    public final SettingsManager b;
    public final nw3 c;
    public final x5f d;
    public final b59 e;
    public boolean f;
    public final yqd g = new yqd(this, 19);
    public final h7f h = new h7f();
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public long m;
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public dxe(dx3 dx3Var, SettingsManager settingsManager, nw3 nw3Var, x5f x5fVar) {
        this.a = dx3Var;
        this.b = settingsManager;
        this.c = nw3Var;
        this.d = x5fVar;
        this.e = w1h.l(dx3Var, vml.d, "night_mode_scheduler", new bg1[0]);
        settingsManager.F(this);
        U();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.h.b((cxe) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.h.c((cxe) obj);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("night_mode") || str.equals("night_mode_schedule") || str.equals("night_mode_schedule_start") || str.equals("night_mode_schedule_end")) {
            U();
        }
    }

    public final String R(int i, int i2, int i3, int i4) {
        long jQ;
        long jQ2;
        SettingsManager settingsManager = this.b;
        int iA = vep.A(settingsManager.s());
        fp1 fp1Var = this.a;
        if (iA == 0) {
            return fp1Var.getString(i);
        }
        if (iA == 1) {
            return fp1Var.getString(i2);
        }
        if (iA == 2) {
            jQ = settingsManager.q("night_mode_schedule_start");
            jQ2 = settingsManager.q("night_mode_schedule_end");
        } else if (iA != 3) {
            jQ = 0;
            jQ2 = 0;
        } else {
            S();
            jQ = this.j;
            jQ2 = this.k;
        }
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(fp1Var);
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return this.i ? fp1Var.getString(i3, timeFormat.format(new Date(jQ2))) : fp1Var.getString(i4, timeFormat.format(new Date(jQ)));
    }

    public final void S() {
        if (this.j == 0 && this.k == 0) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.e.get();
            this.j = sharedPreferences.getLong("sunset", 79200000L);
            this.k = sharedPreferences.getLong("sunrise", 28800000L);
            long j = sharedPreferences.getLong("last_sun_update", 0L);
            this.m = j;
            this.n = j == 0;
        }
    }

    public final void T(boolean z, boolean z2) {
        SettingsManager settingsManager = this.b;
        int iA = vep.A(settingsManager.s());
        if (iA == 0 || iA == 1) {
            settingsManager.X(z ? 1 : 2);
            U();
        } else if (iA == 2 || iA == 3) {
            ((SharedPreferences) this.e.get()).edit().putInt("force_value", z ? 1 : -1).putLong("force_timestamp", System.currentTimeMillis()).apply();
            U();
        }
        if (z2) {
            x5f x5fVar = this.d;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(5, 1, 1L);
                x5fVar.U0(x56VarF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxe.U():void");
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b.H(this);
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.f = false;
        U();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.f = true;
        U();
    }
}
