package com.leanplum;

import android.app.Notification;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.l1f;

/* loaded from: classes.dex */
public interface LeanplumPushNotificationCustomizer {
    void customize(Notification.Builder builder, Bundle bundle, @Nullable Notification.Style style);

    void customize(l1f l1fVar, Bundle bundle);

    default void customizeGroupingNotification(@NonNull l1f l1fVar) {
    }
}
