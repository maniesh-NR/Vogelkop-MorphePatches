package com.leanplum;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.leanplum.internal.Log;
import defpackage.h1a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/leanplum/Present;", "", "()V", "unregister", "", "updateRegistrationId", "provider", "Lcom/leanplum/LeanplumCloudMessagingProvider;", "AndroidSDKFcm_release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
final class Present {

    @NotNull
    public static final Present INSTANCE = new Present();

    private Present() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRegistrationId$lambda$0(LeanplumCloudMessagingProvider leanplumCloudMessagingProvider, Task task) {
        if (!task.isSuccessful()) {
            Log.e("getToken failed:\n" + Log.getStackTraceString(task.getException()), new Object[0]);
        } else {
            String strValueOf = String.valueOf(task.getResult());
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            leanplumCloudMessagingProvider.setRegistrationId(strValueOf);
        }
    }

    public final void unregister() {
        FirebaseMessaging firebaseMessaging;
        try {
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(r49.e());
            }
            firebaseMessaging.b();
            Log.i("Application was unregistered from FirebaseMessaging.", new Object[0]);
        } catch (Exception unused) {
            Log.e("Failed to unregister from FirebaseMessaging.", new Object[0]);
        }
    }

    public final void updateRegistrationId(@NotNull LeanplumCloudMessagingProvider provider) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(r49.e());
        }
        firebaseMessaging.f().addOnCompleteListener(new b(provider, (byte) 1));
    }
}
