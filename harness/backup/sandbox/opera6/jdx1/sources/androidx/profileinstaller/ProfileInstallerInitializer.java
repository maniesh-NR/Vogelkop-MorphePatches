package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.re1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements v7b {
    public final Object create(Context context) {
        Choreographer.getInstance().postFrameCallback(new re1(this, context.getApplicationContext()));
        return new hr5();
    }

    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
