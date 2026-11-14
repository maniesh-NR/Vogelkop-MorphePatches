package com.leanplum;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class OperaLeanplumHelper {
    public static void setRegistrationId(@Nullable String str) {
        Leanplum.setRegistrationId(PushProviderType.FCM, str);
    }
}
