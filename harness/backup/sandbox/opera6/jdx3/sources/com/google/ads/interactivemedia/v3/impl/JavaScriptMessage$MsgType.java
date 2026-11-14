package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.leanplum.internal.RequestBuilder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JavaScriptMessage$MsgType {
    private static final /* synthetic */ JavaScriptMessage$MsgType[] $VALUES;

    @NonNull
    public static final JavaScriptMessage$MsgType activate;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakEnded;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakFetchError;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakReady;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakStarted;

    @NonNull
    public static final JavaScriptMessage$MsgType adBuffering;

    @NonNull
    public static final JavaScriptMessage$MsgType adCanPlay;

    @NonNull
    public static final JavaScriptMessage$MsgType adMetadata;

    @NonNull
    public static final JavaScriptMessage$MsgType adPeriodEnded;

    @NonNull
    public static final JavaScriptMessage$MsgType adPeriodStarted;

    @NonNull
    public static final JavaScriptMessage$MsgType adProgress;

    @NonNull
    public static final JavaScriptMessage$MsgType adsLoaded;

    @NonNull
    public static final JavaScriptMessage$MsgType allAdsCompleted;

    @NonNull
    public static final JavaScriptMessage$MsgType appBackgrounding;

    @NonNull
    public static final JavaScriptMessage$MsgType appForegrounding;

    @NonNull
    public static final JavaScriptMessage$MsgType appStateChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType click;

    @NonNull
    public static final JavaScriptMessage$MsgType companionView;

    @NonNull
    public static final JavaScriptMessage$MsgType complete;

    @NonNull
    public static final JavaScriptMessage$MsgType contentComplete;

    @NonNull
    public static final JavaScriptMessage$MsgType contentPauseRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType contentResumeRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType contentTimeUpdate;

    @NonNull
    public static final JavaScriptMessage$MsgType csi;

    @NonNull
    public static final JavaScriptMessage$MsgType cuepointsChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType destroy;

    @NonNull
    public static final JavaScriptMessage$MsgType discardAdBreak;

    @NonNull
    public static final JavaScriptMessage$MsgType displayCompanions;

    @NonNull
    public static final JavaScriptMessage$MsgType durationChange;

    @NonNull
    public static final JavaScriptMessage$MsgType end;

    @NonNull
    public static final JavaScriptMessage$MsgType error;

    @NonNull
    public static final JavaScriptMessage$MsgType firstquartile;

    @NonNull
    public static final JavaScriptMessage$MsgType focusUiElement;

    @NonNull
    public static final JavaScriptMessage$MsgType forwardCompatibleUnload;

    @NonNull
    public static final JavaScriptMessage$MsgType getViewability;

    @NonNull
    public static final JavaScriptMessage$MsgType hide;

    @NonNull
    public static final JavaScriptMessage$MsgType iconFallbackImageClosed;

    @NonNull
    public static final JavaScriptMessage$MsgType impression;

    @NonNull
    public static final JavaScriptMessage$MsgType init;

    @NonNull
    public static final JavaScriptMessage$MsgType initialized;

    @NonNull
    public static final JavaScriptMessage$MsgType load;

    @NonNull
    public static final JavaScriptMessage$MsgType loadStream;

    @NonNull
    public static final JavaScriptMessage$MsgType loaded;

    @NonNull
    public static final JavaScriptMessage$MsgType log;

    @NonNull
    public static final JavaScriptMessage$MsgType midpoint;

    @NonNull
    public static final JavaScriptMessage$MsgType mute;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeInstrumentation;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeRequest;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeResponse;

    @NonNull
    public static final JavaScriptMessage$MsgType navigationRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType navigationRequestedFailed;

    @NonNull
    public static final JavaScriptMessage$MsgType omidReady;

    @NonNull
    public static final JavaScriptMessage$MsgType omidUnavailable;

    @NonNull
    public static final JavaScriptMessage$MsgType pause;

    @NonNull
    public static final JavaScriptMessage$MsgType play;

    @NonNull
    public static final JavaScriptMessage$MsgType registerFriendlyObstructions;

    @NonNull
    public static final JavaScriptMessage$MsgType replaceAdTagParameters;

    @NonNull
    public static final JavaScriptMessage$MsgType requestAds;

    @NonNull
    public static final JavaScriptMessage$MsgType requestNextAdBreak;

    @NonNull
    public static final JavaScriptMessage$MsgType requestStream;

    @NonNull
    public static final JavaScriptMessage$MsgType resizeAndPositionVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType restoreSizeAndPositionVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType resume;

    @NonNull
    public static final JavaScriptMessage$MsgType showVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType skip;

    @NonNull
    public static final JavaScriptMessage$MsgType skippableStateChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType start;

    @NonNull
    public static final JavaScriptMessage$MsgType startTracking;

    @NonNull
    public static final JavaScriptMessage$MsgType stopTracking;

    @NonNull
    public static final JavaScriptMessage$MsgType streamInitialized;

    @NonNull
    public static final JavaScriptMessage$MsgType thirdquartile;

    @NonNull
    public static final JavaScriptMessage$MsgType timedMetadata;

    @NonNull
    public static final JavaScriptMessage$MsgType timeupdate;

    @NonNull
    public static final JavaScriptMessage$MsgType unload;

    @NonNull
    public static final JavaScriptMessage$MsgType unmute;

    @NonNull
    public static final JavaScriptMessage$MsgType videoClicked;

    @NonNull
    public static final JavaScriptMessage$MsgType videoIconClicked;

    @NonNull
    public static final JavaScriptMessage$MsgType viewability;

    @NonNull
    public static final JavaScriptMessage$MsgType volumeChange;

    @NonNull
    public static final JavaScriptMessage$MsgType waiting;

    static {
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = new JavaScriptMessage$MsgType("activate", 0);
        activate = javaScriptMessage$MsgType;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType2 = new JavaScriptMessage$MsgType("adBreakEnded", 1);
        adBreakEnded = javaScriptMessage$MsgType2;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType3 = new JavaScriptMessage$MsgType("adBreakFetchError", 2);
        adBreakFetchError = javaScriptMessage$MsgType3;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType4 = new JavaScriptMessage$MsgType("adBreakReady", 3);
        adBreakReady = javaScriptMessage$MsgType4;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType5 = new JavaScriptMessage$MsgType("adBreakStarted", 4);
        adBreakStarted = javaScriptMessage$MsgType5;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType6 = new JavaScriptMessage$MsgType("adBuffering", 5);
        adBuffering = javaScriptMessage$MsgType6;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType7 = new JavaScriptMessage$MsgType("adCanPlay", 6);
        adCanPlay = javaScriptMessage$MsgType7;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType8 = new JavaScriptMessage$MsgType("adMetadata", 7);
        adMetadata = javaScriptMessage$MsgType8;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType9 = new JavaScriptMessage$MsgType("adPeriodEnded", 8);
        adPeriodEnded = javaScriptMessage$MsgType9;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType10 = new JavaScriptMessage$MsgType("adPeriodStarted", 9);
        adPeriodStarted = javaScriptMessage$MsgType10;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType11 = new JavaScriptMessage$MsgType("adProgress", 10);
        adProgress = javaScriptMessage$MsgType11;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType12 = new JavaScriptMessage$MsgType("adsLoaded", 11);
        adsLoaded = javaScriptMessage$MsgType12;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType13 = new JavaScriptMessage$MsgType("allAdsCompleted", 12);
        allAdsCompleted = javaScriptMessage$MsgType13;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType14 = new JavaScriptMessage$MsgType("appBackgrounding", 13);
        appBackgrounding = javaScriptMessage$MsgType14;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType15 = new JavaScriptMessage$MsgType("appForegrounding", 14);
        appForegrounding = javaScriptMessage$MsgType15;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType16 = new JavaScriptMessage$MsgType("appStateChanged", 15);
        appStateChanged = javaScriptMessage$MsgType16;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType17 = new JavaScriptMessage$MsgType("click", 16);
        click = javaScriptMessage$MsgType17;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType18 = new JavaScriptMessage$MsgType("companionView", 17);
        companionView = javaScriptMessage$MsgType18;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType19 = new JavaScriptMessage$MsgType("complete", 18);
        complete = javaScriptMessage$MsgType19;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType20 = new JavaScriptMessage$MsgType("contentComplete", 19);
        contentComplete = javaScriptMessage$MsgType20;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType21 = new JavaScriptMessage$MsgType("contentPauseRequested", 20);
        contentPauseRequested = javaScriptMessage$MsgType21;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType22 = new JavaScriptMessage$MsgType("contentResumeRequested", 21);
        contentResumeRequested = javaScriptMessage$MsgType22;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType23 = new JavaScriptMessage$MsgType("contentTimeUpdate", 22);
        contentTimeUpdate = javaScriptMessage$MsgType23;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType24 = new JavaScriptMessage$MsgType("csi", 23);
        csi = javaScriptMessage$MsgType24;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType25 = new JavaScriptMessage$MsgType("nativeInstrumentation", 24);
        nativeInstrumentation = javaScriptMessage$MsgType25;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType26 = new JavaScriptMessage$MsgType("cuepointsChanged", 25);
        cuepointsChanged = javaScriptMessage$MsgType26;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType27 = new JavaScriptMessage$MsgType("destroy", 26);
        destroy = javaScriptMessage$MsgType27;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType28 = new JavaScriptMessage$MsgType("discardAdBreak", 27);
        discardAdBreak = javaScriptMessage$MsgType28;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType29 = new JavaScriptMessage$MsgType("displayCompanions", 28);
        displayCompanions = javaScriptMessage$MsgType29;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType30 = new JavaScriptMessage$MsgType("durationChange", 29);
        durationChange = javaScriptMessage$MsgType30;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType31 = new JavaScriptMessage$MsgType("end", 30);
        end = javaScriptMessage$MsgType31;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType32 = new JavaScriptMessage$MsgType("error", 31);
        error = javaScriptMessage$MsgType32;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType33 = new JavaScriptMessage$MsgType("firstquartile", 32);
        firstquartile = javaScriptMessage$MsgType33;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType34 = new JavaScriptMessage$MsgType("focusUiElement", 33);
        focusUiElement = javaScriptMessage$MsgType34;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType35 = new JavaScriptMessage$MsgType("forwardCompatibleUnload", 34);
        forwardCompatibleUnload = javaScriptMessage$MsgType35;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType36 = new JavaScriptMessage$MsgType("nativeRequest", 35);
        nativeRequest = javaScriptMessage$MsgType36;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType37 = new JavaScriptMessage$MsgType("nativeResponse", 36);
        nativeResponse = javaScriptMessage$MsgType37;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType38 = new JavaScriptMessage$MsgType("getViewability", 37);
        getViewability = javaScriptMessage$MsgType38;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType39 = new JavaScriptMessage$MsgType("hide", 38);
        hide = javaScriptMessage$MsgType39;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType40 = new JavaScriptMessage$MsgType("iconFallbackImageClosed", 39);
        iconFallbackImageClosed = javaScriptMessage$MsgType40;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType41 = new JavaScriptMessage$MsgType("impression", 40);
        impression = javaScriptMessage$MsgType41;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType42 = new JavaScriptMessage$MsgType("init", 41);
        init = javaScriptMessage$MsgType42;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType43 = new JavaScriptMessage$MsgType("initialized", 42);
        initialized = javaScriptMessage$MsgType43;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType44 = new JavaScriptMessage$MsgType("load", 43);
        load = javaScriptMessage$MsgType44;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType45 = new JavaScriptMessage$MsgType("loaded", 44);
        loaded = javaScriptMessage$MsgType45;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType46 = new JavaScriptMessage$MsgType("loadStream", 45);
        loadStream = javaScriptMessage$MsgType46;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType47 = new JavaScriptMessage$MsgType(RequestBuilder.ACTION_LOG, 46);
        log = javaScriptMessage$MsgType47;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType48 = new JavaScriptMessage$MsgType("midpoint", 47);
        midpoint = javaScriptMessage$MsgType48;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType49 = new JavaScriptMessage$MsgType("mute", 48);
        mute = javaScriptMessage$MsgType49;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType50 = new JavaScriptMessage$MsgType("navigationRequested", 49);
        navigationRequested = javaScriptMessage$MsgType50;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType51 = new JavaScriptMessage$MsgType("navigationRequestedFailed", 50);
        navigationRequestedFailed = javaScriptMessage$MsgType51;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType52 = new JavaScriptMessage$MsgType("omidReady", 51);
        omidReady = javaScriptMessage$MsgType52;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType53 = new JavaScriptMessage$MsgType("omidUnavailable", 52);
        omidUnavailable = javaScriptMessage$MsgType53;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType54 = new JavaScriptMessage$MsgType("pause", 53);
        pause = javaScriptMessage$MsgType54;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType55 = new JavaScriptMessage$MsgType("play", 54);
        play = javaScriptMessage$MsgType55;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType56 = new JavaScriptMessage$MsgType("registerFriendlyObstructions", 55);
        registerFriendlyObstructions = javaScriptMessage$MsgType56;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType57 = new JavaScriptMessage$MsgType("replaceAdTagParameters", 56);
        replaceAdTagParameters = javaScriptMessage$MsgType57;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType58 = new JavaScriptMessage$MsgType("requestAds", 57);
        requestAds = javaScriptMessage$MsgType58;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType59 = new JavaScriptMessage$MsgType("requestNextAdBreak", 58);
        requestNextAdBreak = javaScriptMessage$MsgType59;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType60 = new JavaScriptMessage$MsgType("requestStream", 59);
        requestStream = javaScriptMessage$MsgType60;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType61 = new JavaScriptMessage$MsgType("resizeAndPositionVideo", 60);
        resizeAndPositionVideo = javaScriptMessage$MsgType61;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType62 = new JavaScriptMessage$MsgType("restoreSizeAndPositionVideo", 61);
        restoreSizeAndPositionVideo = javaScriptMessage$MsgType62;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType63 = new JavaScriptMessage$MsgType("resume", 62);
        resume = javaScriptMessage$MsgType63;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType64 = new JavaScriptMessage$MsgType("showVideo", 63);
        showVideo = javaScriptMessage$MsgType64;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType65 = new JavaScriptMessage$MsgType("skip", 64);
        skip = javaScriptMessage$MsgType65;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType66 = new JavaScriptMessage$MsgType("skippableStateChanged", 65);
        skippableStateChanged = javaScriptMessage$MsgType66;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType67 = new JavaScriptMessage$MsgType(RequestBuilder.ACTION_START, 66);
        start = javaScriptMessage$MsgType67;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType68 = new JavaScriptMessage$MsgType("startTracking", 67);
        startTracking = javaScriptMessage$MsgType68;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType69 = new JavaScriptMessage$MsgType("stopTracking", 68);
        stopTracking = javaScriptMessage$MsgType69;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType70 = new JavaScriptMessage$MsgType("streamInitialized", 69);
        streamInitialized = javaScriptMessage$MsgType70;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType71 = new JavaScriptMessage$MsgType("thirdquartile", 70);
        thirdquartile = javaScriptMessage$MsgType71;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType72 = new JavaScriptMessage$MsgType("timedMetadata", 71);
        timedMetadata = javaScriptMessage$MsgType72;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType73 = new JavaScriptMessage$MsgType("timeupdate", 72);
        timeupdate = javaScriptMessage$MsgType73;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType74 = new JavaScriptMessage$MsgType("unload", 73);
        unload = javaScriptMessage$MsgType74;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType75 = new JavaScriptMessage$MsgType("unmute", 74);
        unmute = javaScriptMessage$MsgType75;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType76 = new JavaScriptMessage$MsgType("videoClicked", 75);
        videoClicked = javaScriptMessage$MsgType76;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType77 = new JavaScriptMessage$MsgType("videoIconClicked", 76);
        videoIconClicked = javaScriptMessage$MsgType77;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType78 = new JavaScriptMessage$MsgType("viewability", 77);
        viewability = javaScriptMessage$MsgType78;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType79 = new JavaScriptMessage$MsgType("volumeChange", 78);
        volumeChange = javaScriptMessage$MsgType79;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType80 = new JavaScriptMessage$MsgType("waiting", 79);
        waiting = javaScriptMessage$MsgType80;
        $VALUES = new JavaScriptMessage$MsgType[]{javaScriptMessage$MsgType, javaScriptMessage$MsgType2, javaScriptMessage$MsgType3, javaScriptMessage$MsgType4, javaScriptMessage$MsgType5, javaScriptMessage$MsgType6, javaScriptMessage$MsgType7, javaScriptMessage$MsgType8, javaScriptMessage$MsgType9, javaScriptMessage$MsgType10, javaScriptMessage$MsgType11, javaScriptMessage$MsgType12, javaScriptMessage$MsgType13, javaScriptMessage$MsgType14, javaScriptMessage$MsgType15, javaScriptMessage$MsgType16, javaScriptMessage$MsgType17, javaScriptMessage$MsgType18, javaScriptMessage$MsgType19, javaScriptMessage$MsgType20, javaScriptMessage$MsgType21, javaScriptMessage$MsgType22, javaScriptMessage$MsgType23, javaScriptMessage$MsgType24, javaScriptMessage$MsgType25, javaScriptMessage$MsgType26, javaScriptMessage$MsgType27, javaScriptMessage$MsgType28, javaScriptMessage$MsgType29, javaScriptMessage$MsgType30, javaScriptMessage$MsgType31, javaScriptMessage$MsgType32, javaScriptMessage$MsgType33, javaScriptMessage$MsgType34, javaScriptMessage$MsgType35, javaScriptMessage$MsgType36, javaScriptMessage$MsgType37, javaScriptMessage$MsgType38, javaScriptMessage$MsgType39, javaScriptMessage$MsgType40, javaScriptMessage$MsgType41, javaScriptMessage$MsgType42, javaScriptMessage$MsgType43, javaScriptMessage$MsgType44, javaScriptMessage$MsgType45, javaScriptMessage$MsgType46, javaScriptMessage$MsgType47, javaScriptMessage$MsgType48, javaScriptMessage$MsgType49, javaScriptMessage$MsgType50, javaScriptMessage$MsgType51, javaScriptMessage$MsgType52, javaScriptMessage$MsgType53, javaScriptMessage$MsgType54, javaScriptMessage$MsgType55, javaScriptMessage$MsgType56, javaScriptMessage$MsgType57, javaScriptMessage$MsgType58, javaScriptMessage$MsgType59, javaScriptMessage$MsgType60, javaScriptMessage$MsgType61, javaScriptMessage$MsgType62, javaScriptMessage$MsgType63, javaScriptMessage$MsgType64, javaScriptMessage$MsgType65, javaScriptMessage$MsgType66, javaScriptMessage$MsgType67, javaScriptMessage$MsgType68, javaScriptMessage$MsgType69, javaScriptMessage$MsgType70, javaScriptMessage$MsgType71, javaScriptMessage$MsgType72, javaScriptMessage$MsgType73, javaScriptMessage$MsgType74, javaScriptMessage$MsgType75, javaScriptMessage$MsgType76, javaScriptMessage$MsgType77, javaScriptMessage$MsgType78, javaScriptMessage$MsgType79, javaScriptMessage$MsgType80};
    }

    @NonNull
    public static JavaScriptMessage$MsgType[] values() {
        return (JavaScriptMessage$MsgType[]) $VALUES.clone();
    }
}
