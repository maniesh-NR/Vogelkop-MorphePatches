package com.leanplum;

import com.leanplum.internal.Log;
import defpackage.h1a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"unregister", "", "updateRegistrationId", "provider", "Lcom/leanplum/LeanplumCloudMessagingProvider;", "AndroidSDKFcm_release"}, k = 2, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseUtilKt {
    public static final void unregister() {
        try {
            Present.INSTANCE.unregister();
        } catch (NoSuchMethodError unused) {
            Log.d("Using legacy firebase methods.", new Object[0]);
            Legacy.INSTANCE.unregister();
        }
    }

    public static final void updateRegistrationId(@NotNull LeanplumCloudMessagingProvider leanplumCloudMessagingProvider) {
        try {
            Present.INSTANCE.updateRegistrationId(leanplumCloudMessagingProvider);
        } catch (NoSuchMethodError unused) {
            Log.d("Using legacy firebase methods.", new Object[0]);
            Legacy.INSTANCE.updateRegistrationId(leanplumCloudMessagingProvider);
        }
    }
}
