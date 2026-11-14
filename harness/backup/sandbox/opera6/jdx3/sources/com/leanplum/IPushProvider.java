package com.leanplum;

/* loaded from: classes.dex */
interface IPushProvider {
    String getRegistrationId();

    PushProviderType getType();

    void setRegistrationId(String str);

    void unregister();

    void updateRegistrationId();
}
