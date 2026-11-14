package com.leanplum;

import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
class LeanplumFcmProvider extends LeanplumCloudMessagingProvider {
    @Override // com.leanplum.LeanplumCloudMessagingProvider
    public String getSharedPrefsPropertyName() {
        return Constants.Defaults.PROPERTY_FCM_TOKEN_ID;
    }

    @Override // com.leanplum.IPushProvider
    public PushProviderType getType() {
        return PushProviderType.FCM;
    }

    @Override // com.leanplum.IPushProvider
    public void unregister() {
        if (Constants.disableFcmTokenAutoRefresh) {
            return;
        }
        FirebaseUtilKt.unregister();
    }

    @Override // com.leanplum.IPushProvider
    public void updateRegistrationId() {
        if (Constants.disableFcmTokenAutoRefresh) {
            return;
        }
        FirebaseUtilKt.updateRegistrationId(this);
    }
}
