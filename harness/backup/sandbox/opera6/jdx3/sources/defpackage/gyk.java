package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class gyk {
    public static final hk6 e = hk6.g;
    public final xd5 a;
    public final nr8 b;
    public final SettingsManager c;
    public final db d;

    public gyk(xd5 xd5Var, nr8 nr8Var, SettingsManager settingsManager, db dbVar) {
        this.a = xd5Var;
        this.b = nr8Var;
        this.c = settingsManager;
        this.d = dbVar;
        byte b = 6;
        xd5Var.getLifecycle().a(new eyk(this, new nj2(this, b), new j25(this, b)));
    }

    public final void a() {
        if (this.d.f() && this.c.i("enable_sync")) {
            this.b.f(new qlk(this, (byte) 16));
        }
    }
}
