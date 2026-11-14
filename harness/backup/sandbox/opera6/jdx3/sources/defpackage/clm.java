package defpackage;

/* loaded from: classes.dex */
public enum clm {
    NOT_WORKING(false),
    NOT_WORKING_VITALS(false),
    NOT_WORKING_PAGE_LOADS(false),
    NOT_WORKING_SLOW_APP(false),
    NOT_WORKING_BATTERY_USAGE(false),
    NOT_WORKING_DEVICE_HEAT(false),
    NOT_WORKING_UI(false),
    NOT_WORKING_OTHER(true),
    AD_ISSUES(false),
    AD_ISSUES_NEWS_FEED(false),
    AD_ISSUES_UNWANTED_SHORTCUTS(false),
    AD_ISSUES_AD_BLOCKER(false),
    AD_ISSUES_POPUPS(false),
    AD_ISSUES_QUALITY(false),
    AD_ISSUES_OTHER(true),
    UPDATE_ISSUES(false),
    UPDATE_ISSUES_VITALS(false),
    UPDATE_ISSUES_NEW_UI(false),
    UPDATE_ISSUES_STARTUP(false),
    UPDATE_ISSUES_SLOW_APP(false),
    UPDATE_ISSUES_OTHER(true),
    MISSING_FEATURES(false),
    MISSING_FEATURES_PERSONALIZATION(false),
    MISSING_FEATURES_DATA_IMPORT(false),
    MISSING_FEATURES_AI_EXPERIENCE(false),
    MISSING_FEATURES_EXTENSION_SUPPORT(false),
    MISSING_FEATURES_OTHER(true),
    OTHER(true);

    public final boolean a;

    clm(boolean z) {
        this.a = z;
    }
}
