package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.leanplum.internal.RequestBuilder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JavaScriptMessage$MsgChannel {
    private static final /* synthetic */ JavaScriptMessage$MsgChannel[] $VALUES;

    @NonNull
    public static final JavaScriptMessage$MsgChannel activityMonitor;

    @NonNull
    public static final JavaScriptMessage$MsgChannel adsLoader;

    @NonNull
    public static final JavaScriptMessage$MsgChannel adsManager;

    @NonNull
    public static final JavaScriptMessage$MsgChannel contentTimeUpdate;

    @NonNull
    public static final JavaScriptMessage$MsgChannel displayContainer;

    @NonNull
    public static final JavaScriptMessage$MsgChannel log;

    @NonNull
    public static final JavaScriptMessage$MsgChannel nativeXhr;

    @NonNull
    public static final JavaScriptMessage$MsgChannel omid;

    @NonNull
    public static final JavaScriptMessage$MsgChannel userInteraction;

    @NonNull
    public static final JavaScriptMessage$MsgChannel videoDisplay1;

    @NonNull
    public static final JavaScriptMessage$MsgChannel videoDisplay2;

    @NonNull
    public static final JavaScriptMessage$MsgChannel webViewLoaded;

    static {
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = new JavaScriptMessage$MsgChannel("activityMonitor", 0);
        activityMonitor = javaScriptMessage$MsgChannel;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel2 = new JavaScriptMessage$MsgChannel("adsLoader", 1);
        adsLoader = javaScriptMessage$MsgChannel2;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel3 = new JavaScriptMessage$MsgChannel("adsManager", 2);
        adsManager = javaScriptMessage$MsgChannel3;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel4 = new JavaScriptMessage$MsgChannel("contentTimeUpdate", 3);
        contentTimeUpdate = javaScriptMessage$MsgChannel4;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel5 = new JavaScriptMessage$MsgChannel("displayContainer", 4);
        displayContainer = javaScriptMessage$MsgChannel5;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel6 = new JavaScriptMessage$MsgChannel(RequestBuilder.ACTION_LOG, 5);
        log = javaScriptMessage$MsgChannel6;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel7 = new JavaScriptMessage$MsgChannel("nativeXhr", 6);
        nativeXhr = javaScriptMessage$MsgChannel7;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel8 = new JavaScriptMessage$MsgChannel("omid", 7);
        omid = javaScriptMessage$MsgChannel8;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel9 = new JavaScriptMessage$MsgChannel("userInteraction", 8);
        userInteraction = javaScriptMessage$MsgChannel9;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel10 = new JavaScriptMessage$MsgChannel("videoDisplay1", 9);
        videoDisplay1 = javaScriptMessage$MsgChannel10;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel11 = new JavaScriptMessage$MsgChannel("videoDisplay2", 10);
        videoDisplay2 = javaScriptMessage$MsgChannel11;
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel12 = new JavaScriptMessage$MsgChannel("webViewLoaded", 11);
        webViewLoaded = javaScriptMessage$MsgChannel12;
        $VALUES = new JavaScriptMessage$MsgChannel[]{javaScriptMessage$MsgChannel, javaScriptMessage$MsgChannel2, javaScriptMessage$MsgChannel3, javaScriptMessage$MsgChannel4, javaScriptMessage$MsgChannel5, javaScriptMessage$MsgChannel6, javaScriptMessage$MsgChannel7, javaScriptMessage$MsgChannel8, javaScriptMessage$MsgChannel9, javaScriptMessage$MsgChannel10, javaScriptMessage$MsgChannel11, javaScriptMessage$MsgChannel12};
    }

    @NonNull
    public static JavaScriptMessage$MsgChannel[] values() {
        return (JavaScriptMessage$MsgChannel[]) $VALUES.clone();
    }
}
