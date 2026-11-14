package defpackage;

import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class zcg extends l7n {
    public final ru9 b;
    public final mdf c;
    public final vbg d;
    public final SettingsManager e;
    public final qln f;
    public final WelcomeActivity g;
    public final ijd h;
    public final shf i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public final List m;
    public final wnm n;
    public final agm o;
    public eef p;

    public zcg(yk6 yk6Var, h0a h0aVar, xnc xncVar, ru9 ru9Var, mdf mdfVar, cq5 cq5Var, vbg vbgVar, SettingsManager settingsManager, qln qlnVar, WelcomeActivity welcomeActivity) {
        this.b = ru9Var;
        this.c = mdfVar;
        this.d = vbgVar;
        this.e = settingsManager;
        this.f = qlnVar;
        this.g = welcomeActivity;
        ijd ijdVar = new ijd();
        ijdVar.d = yk6Var;
        ijdVar.e = h0aVar;
        ijdVar.f = xncVar;
        ijdVar.g = settingsManager;
        ijdVar.h = new wnm(ijdVar.a(), Arrays.asList(yk6Var.i, yk6Var.j, yk6Var.k, h0aVar.d, xncVar.a, uyg.e(settingsManager, "live_scores_enabled", new m3g((byte) 12)), uyg.e(settingsManager, "enable_newsfeed", new m3g((byte) 13))), new fza((byte) 17), new d8e(ijdVar, (byte) 15));
        this.h = ijdVar;
        shf shfVar = new shf();
        shfVar.a = cq5Var;
        shfVar.b = qlnVar;
        shfVar.c = z4c.b(new d8e(shfVar, (byte) 14));
        this.i = shfVar;
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        zyk zykVar = (zyk) shfVar.c;
        this.m = ((ycg) zykVar.getValue()).a;
        this.n = (wnm) ijdVar.h;
        this.o = qlnVar.g;
        this.p = ((ycg) zykVar.getValue()).b;
    }
}
