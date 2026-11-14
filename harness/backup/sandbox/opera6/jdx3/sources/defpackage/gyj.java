package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class gyj {
    public final int a;
    public final SettingsManager b;
    public final dg7 c;
    public final ezg d = new ezg(this, (byte) 3);
    public boolean e;

    public gyj(int i, SettingsManager settingsManager, dg7 dg7Var) {
        this.a = i;
        this.b = settingsManager;
        this.c = dg7Var;
        this.e = this.b.i("speed_dial.plus_button");
    }
}
