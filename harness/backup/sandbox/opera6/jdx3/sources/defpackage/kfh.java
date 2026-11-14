package defpackage;

import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* loaded from: classes.dex */
public final class kfh implements InstallStatusListener {
    public final /* synthetic */ lfh a;
    public final /* synthetic */ ModuleInstallClient b;

    public kfh(lfh lfhVar, ModuleInstallClient moduleInstallClient) {
        this.a = lfhVar;
        this.b = moduleInstallClient;
    }

    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        int installState = moduleInstallStatusUpdate.getInstallState();
        if (installState == 3 || installState == 4 || installState == 5) {
            this.b.unregisterListener(this);
            int installState2 = moduleInstallStatusUpdate.getInstallState();
            lfh lfhVar = this.a;
            if (installState2 == 4) {
                lfhVar.b();
            } else {
                lfhVar.j.r(new cfh(yeh.a));
            }
        }
    }
}
