package defpackage;

import android.app.ActivityOptions;
import android.os.Build;

/* loaded from: classes.dex */
public final class nh extends ui6 {
    public final ActivityOptions s;

    public nh(ActivityOptions activityOptions) {
        this.s = activityOptions;
    }

    public final nh t0(int i) {
        int i2 = Build.VERSION.SDK_INT;
        ActivityOptions activityOptions = this.s;
        if (i2 >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(i);
            return this;
        }
        if (i2 >= 33) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
        }
        return this;
    }
}
