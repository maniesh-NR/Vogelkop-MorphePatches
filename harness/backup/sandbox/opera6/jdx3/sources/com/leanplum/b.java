package com.leanplum;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LeanplumCloudMessagingProvider b;

    public /* synthetic */ b(LeanplumCloudMessagingProvider leanplumCloudMessagingProvider, byte b) {
        this.a = b;
        this.b = leanplumCloudMessagingProvider;
    }

    public final void onComplete(Task task) {
        byte b = this.a;
        LeanplumCloudMessagingProvider leanplumCloudMessagingProvider = this.b;
        switch (b) {
            case 0:
                Legacy.updateRegistrationId$lambda$0(leanplumCloudMessagingProvider, task);
                break;
            default:
                Present.updateRegistrationId$lambda$0(leanplumCloudMessagingProvider, task);
                break;
        }
    }
}
