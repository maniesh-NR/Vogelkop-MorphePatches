package defpackage;

import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import com.opera.android.startup.WelcomeActivity;

/* loaded from: classes.dex */
public final class wzn extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ WelcomeActivity f;

    public /* synthetic */ wzn(WelcomeActivity welcomeActivity, byte b) {
        this.e = b;
        this.f = welcomeActivity;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Activity, com.opera.android.startup.WelcomeActivity] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        switch (this.e) {
            case 0:
                umi umiVar = vml.d;
                ?? r2 = this.f;
                j4c j4cVar = (j4c) ((xbf) r2.v.b).e;
                SettingsManager settingsManagerM = r2.M();
                String[] strArr = OperaApplication.K;
                return new m9k(r2, umiVar, j4cVar, settingsManagerM, ((OperaApplication) r2.getApplication()).u());
            default:
                return new u9k(this.f);
        }
    }
}
