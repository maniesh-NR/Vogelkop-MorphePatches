package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import defpackage.hva;
import defpackage.sko;
import java.util.Map;

/* loaded from: classes.dex */
public final class ImaSdkSettingsImpl implements hva {
    private Map<String, String> featureFlags;
    private String playerType;
    private String playerVersion;
    private String ppid;
    private transient boolean restrictToCustomPlayer;
    private String sessionId;
    private TestingConfiguration testingConfig;
    private final boolean supportsMultipleVideoDisplayChannels = true;
    private int numRedirects = 4;
    private boolean autoPlayAdBreaks = true;
    private boolean debugMode = false;
    private transient String language = "en";

    public boolean doesRestrictToCustomPlayer() {
        return this.restrictToCustomPlayer;
    }

    public boolean getAutoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // defpackage.hva
    @NonNull
    public Map<String, String> getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // defpackage.hva
    @NonNull
    public String getLanguage() {
        return this.language;
    }

    public int getMaxRedirects() {
        return this.numRedirects;
    }

    @NonNull
    public String getPlayerType() {
        return this.playerType;
    }

    @NonNull
    public String getPlayerVersion() {
        return this.playerVersion;
    }

    @NonNull
    public String getPpid() {
        return this.ppid;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // defpackage.hva
    @NonNull
    public TestingConfiguration getTestingConfig() {
        return this.testingConfig;
    }

    @Override // defpackage.hva
    public boolean isDebugMode() {
        return this.debugMode;
    }

    @Override // defpackage.hva
    public void setAutoPlayAdBreaks(boolean z) {
        this.autoPlayAdBreaks = z;
    }

    public void setDebugMode(boolean z) {
        this.debugMode = z;
    }

    public void setFeatureFlags(@NonNull Map<String, String> map) {
        this.featureFlags = map;
    }

    public void setLanguage(@NonNull String str) {
        this.language = str;
    }

    @Override // defpackage.hva
    public void setMaxRedirects(int i) {
        this.numRedirects = i;
    }

    public void setPlayerType(@NonNull String str) {
        this.playerType = str;
    }

    public void setPlayerVersion(@NonNull String str) {
        this.playerVersion = str;
    }

    public void setPpid(@NonNull String str) {
        this.ppid = str;
    }

    public void setRestrictToCustomPlayer(boolean z) {
        this.restrictToCustomPlayer = z;
    }

    public void setSessionId(@NonNull String str) {
        this.sessionId = str;
    }

    public void setTestingConfig(@NonNull TestingConfiguration testingConfiguration) {
        this.testingConfig = testingConfiguration;
    }

    @NonNull
    public String toString() {
        String str = this.ppid;
        int i = this.numRedirects;
        String str2 = this.playerType;
        String str3 = this.playerVersion;
        String str4 = this.language;
        boolean z = this.restrictToCustomPlayer;
        boolean z2 = this.autoPlayAdBreaks;
        String str5 = this.sessionId;
        StringBuilder sbP = sko.p(i, "ImaSdkSettings [ppid=", str, ", numRedirects=", ", playerType=");
        z1m.t(sbP, str2, ", playerVersion=", str3, ", language=");
        sbP.append(str4);
        sbP.append(", restrictToCustom=");
        sbP.append(z);
        sbP.append(", autoPlayAdBreaks=");
        sbP.append(z2);
        sbP.append(", sessionId=");
        sbP.append(str5);
        sbP.append("]");
        return sbP.toString();
    }
}
