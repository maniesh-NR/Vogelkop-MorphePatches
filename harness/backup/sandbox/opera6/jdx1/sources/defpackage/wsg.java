package defpackage;

import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* loaded from: classes.dex */
public final class wsg implements PrefetchOperationCallbackBoundaryInterface {
    public final /* synthetic */ gtf a;

    public wsg(gtf gtfVar) {
        this.a = gtfVar;
    }

    public final void onFailure(int i, String str, int i2) {
        ftj ftjVar = this.a;
        if (i == 1) {
            new vsg(str);
            ftjVar.getClass();
        } else {
            new lv0(str);
            ftjVar.getClass();
        }
    }

    public final void onSuccess() {
        this.a.getClass();
    }
}
