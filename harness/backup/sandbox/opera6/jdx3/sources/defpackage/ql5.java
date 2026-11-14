package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class ql5 extends nz0 {
    public final String a;
    public final String b;
    public final String c;
    public final qrl d;
    public final SettingsManager e;

    public ql5(String str, String str2, String str3, SettingsManager settingsManager, qrl qrlVar) {
        super(true, false);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = settingsManager;
        this.d = qrlVar;
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132019218);
    }

    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        az0 title = az0Var.setTitle(this.a);
        title.a.f = this.b + "\n\n" + this.c;
        title.setView(phj.I(az0Var.getContext(), 2132019199, this.e.i("show_conflicting_settings_warning") ^ true, new jl4(this, (byte) 17)));
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        this.d.run();
    }
}
