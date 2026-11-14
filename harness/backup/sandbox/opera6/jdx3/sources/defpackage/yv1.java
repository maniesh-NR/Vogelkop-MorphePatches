package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* loaded from: classes.dex */
public final class yv1 implements gw1 {
    public final void onWindowFocusChanged(Activity activity, boolean z) {
        int iB;
        if (!z || activity == ApplicationStatus.d || (iB = ApplicationStatus.b(activity)) == 6 || iB == 5) {
            return;
        }
        ApplicationStatus.d = activity;
    }
}
