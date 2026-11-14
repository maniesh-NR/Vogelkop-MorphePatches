package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.internal.zzafo;
import com.google.ads.interactivemedia.v3.internal.zzafq;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class zzbn {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public zzc adData;
    public double adPeriodDuration;
    public zzd adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public long appSetIdTimeoutMs;
    public double bufferedTime;
    public Map<String, zzaz> companions;
    public zzbl consentSettingsConfig;
    public List<zzba> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public boolean enableTrustlessGksBc;
    public boolean enableTrustlessGksDai;
    public int errorCode;
    public String errorMessage;

    @Nullable
    public Integer espAdapterTimeoutMs;

    @Nullable
    public List<String> espAdapters;
    public String eventId;
    public List<String> gksFirstPartyAdServers;
    public int gksTimeoutMs;
    public List<zzbf> iconClickFallbackImages;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public Set<String> jsConsentCheckRequiredParameters;
    public String ln;
    public zzbm logData;
    public String m;
    public boolean monitorAppLifecycle;
    public String n;
    public zzbr networkRequest;

    @Nullable
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public zzbx resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public boolean useAndroidAdshieldV2;
    public String vastEvent;
    public String videoUrl;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzafo.b(this, obj, new String[0]);
    }

    public final int hashCode() {
        return zzafq.a(this, new String[0]);
    }

    public final String toString() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("JavaScriptMsgData[");
        for (Field field : zzbn.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
