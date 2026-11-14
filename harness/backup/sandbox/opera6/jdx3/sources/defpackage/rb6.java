package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class rb6 extends lim implements p5j {
    public final SettingsManager a;
    public boolean b;

    public rb6(SettingsManager settingsManager) {
        this.a = settingsManager;
        this.b = settingsManager.M();
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        SettingsManager settingsManager;
        boolean zM;
        if ((str.equals("personalized_news") || str.equals("process_news_topics")) && (zM = (settingsManager = this.a).M()) != this.b) {
            this.b = zM;
            settingsManager.V(!zM ? 1 : 0, "news_is_blocked_by_personalization_change");
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.a.F(this);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.a.H(this);
    }
}
