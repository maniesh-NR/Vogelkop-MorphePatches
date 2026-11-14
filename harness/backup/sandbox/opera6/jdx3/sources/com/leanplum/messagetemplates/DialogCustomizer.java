package com.leanplum.messagetemplates;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public interface DialogCustomizer {
    default void customizeBanner(Dialog dialog, View view) {
    }

    default void customizeCenterPopup(Dialog dialog, View view) {
    }

    default void customizeInterstitial(Dialog dialog, View view) {
    }

    default void customizeRichInterstitial(Dialog dialog, View view) {
    }

    default void customizeWebInterstitial(Dialog dialog, View view) {
    }
}
