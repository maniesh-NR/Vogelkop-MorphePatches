package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class f0c implements s3m {
    public final /* synthetic */ v3m a;

    public /* synthetic */ f0c(v3m v3mVar) {
        this.a = v3mVar;
    }

    @Override // defpackage.s3m
    public final void a(szb szbVar) {
        v3m v3mVar = this.a;
        SettingsManager settingsManager = v3mVar.b;
        settingsManager.getClass();
        settingsManager.Y("translate_web_pages_to_language", szbVar.toString());
        v3mVar.i(szbVar);
    }
}
