package com.leanplum;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.leanplum.internal.Log;
import defpackage.h1a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/leanplum/Legacy;", "", "()V", "unregister", "", "updateRegistrationId", "provider", "Lcom/leanplum/LeanplumCloudMessagingProvider;", "AndroidSDKFcm_release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
final class Legacy {

    @NotNull
    public static final Legacy INSTANCE = new Legacy();

    private Legacy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRegistrationId$lambda$0(LeanplumCloudMessagingProvider leanplumCloudMessagingProvider, Task task) {
        if (!task.isSuccessful()) {
            Log.e("getInstanceId failed:\n" + Log.getStackTraceString(task.getException()), new Object[0]);
        } else {
            InstanceIdResult instanceIdResult = (InstanceIdResult) task.getResult();
            String token = instanceIdResult != null ? instanceIdResult.getToken() : null;
            if (TextUtils.isEmpty(token)) {
                return;
            }
            leanplumCloudMessagingProvider.setRegistrationId(token);
        }
    }

    public final void unregister() {
        try {
            FirebaseInstanceId.getInstance().deleteInstanceId();
            Log.i("Application was unregistered from FCM.", new Object[0]);
        } catch (Exception unused) {
            Log.e("Failed to unregister from FCM.", new Object[0]);
        }
    }

    public final void updateRegistrationId(@NotNull LeanplumCloudMessagingProvider provider) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new b(provider, (byte) 0));
    }
}
