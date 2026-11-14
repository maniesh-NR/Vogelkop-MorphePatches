package com.opera.android.browser.chromium;

import J.N;
import androidx.annotation.Nullable;
import com.opera.android.settings.SettingsManager;
import defpackage.p5j;
import defpackage.si5;
import defpackage.t59;
import defpackage.x56;
import defpackage.x5f;
import defpackage.xi5;
import defpackage.zpa;

/* loaded from: classes.dex */
public final class ChromiumAdDelegate implements p5j {
    public final SettingsManager a;

    public ChromiumAdDelegate(SettingsManager settingsManager) {
        this.a = settingsManager;
        a();
        settingsManager.F(this);
    }

    public static void onAdBlocked(@Nullable ChromiumContent chromiumContent, long j) {
        xi5 xi5VarA = xi5.a(t8.a);
        if (j > 0) {
            si5 si5Var = xi5VarA.g;
            synchronized (si5Var.c) {
                si5Var.b = j;
                si5Var.d.e.g();
            }
            xi5VarA.f(xi5VarA.b() + j);
            x5f x5fVar = xi5VarA.j;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(37, 1, j);
                x5fVar.U0(x56VarF);
            }
        }
        if (chromiumContent == null) {
            return;
        }
        t59 t59Var = chromiumContent.M;
        t59Var.b += j;
        t59Var.g();
    }

    public static void onTrackerBlocked(@Nullable ChromiumContent chromiumContent, long j) {
        xi5 xi5VarA = xi5.a(t8.a);
        if (j > 0) {
            si5 si5Var = xi5VarA.h;
            synchronized (si5Var.c) {
                si5Var.b = j;
                si5Var.d.f.g();
            }
            xi5VarA.g(xi5VarA.e() + j);
            x5f x5fVar = xi5VarA.j;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                am2.f(zpaVar, x56VarF).b.p(38, 1, j);
                x5fVar.U0(x56VarF);
            }
        }
        if (chromiumContent != null) {
            t59 t59Var = chromiumContent.M;
            t59Var.a += j;
            t59Var.h();
        }
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("ad_blocking".equals(str) || "tracker_blocker".equals(str) || "banner_blocker".equals(str)) {
            a();
        }
    }

    public final void a() {
        SettingsManager settingsManager = this.a;
        N.MoCP7$WI(settingsManager.i("ad_blocking"), settingsManager.i("tracker_blocker"), settingsManager.h());
    }
}
