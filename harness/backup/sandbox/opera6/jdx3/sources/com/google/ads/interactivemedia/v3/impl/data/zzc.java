package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.internal.zzafo;
import com.google.ads.interactivemedia.v3.internal.zzafp;
import com.google.ads.interactivemedia.v3.internal.zzafq;
import com.google.ads.interactivemedia.v3.internal.zzafr;
import defpackage.sko;
import defpackage.vim;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzc {

    @Nullable
    private String adId;

    @Nullable
    private String adSystem;

    @Nullable
    @zzafp
    @zzafr
    private String[] adWrapperCreativeIds;

    @Nullable
    @zzafp
    @zzafr
    private String[] adWrapperIds;

    @Nullable
    @zzafp
    @zzafr
    private String[] adWrapperSystems;

    @Nullable
    private String advertiserName;

    @Nullable
    private String clickThroughUrl;

    @Nullable
    @zzafp
    @zzafr
    private List companions;

    @Nullable
    private String contentType;

    @Nullable
    private String creativeAdId;

    @Nullable
    private String creativeId;

    @Nullable
    private String dealId;

    @Nullable
    private String description;
    private boolean disableUi;
    private double duration;
    private int height;

    @Nullable
    private String surveyUrl;

    @Nullable
    private String title;

    @Nullable
    private String traffickingParameters;

    @Nullable
    @zzafp
    @zzafr
    private Set<vim> uiElements;

    @Nullable
    private String universalAdIdRegistry;

    @Nullable
    private String universalAdIdValue;

    @Nullable
    @zzafp
    @zzafr
    private zzcd[] universalAdIds;
    private int vastMediaBitrate;
    private int vastMediaHeight;
    private int vastMediaWidth;
    private int width;
    private boolean linear = false;
    private boolean skippable = false;
    private double skipTimeOffset = -1.0d;

    @zzafp
    @zzafr
    private zzd adPodInfo = new zzd();

    public final String a() {
        return this.clickThroughUrl;
    }

    public final int b() {
        return this.vastMediaHeight;
    }

    public final int c() {
        return this.vastMediaWidth;
    }

    public final boolean d() {
        return this.skippable;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzafo.b(this, obj, new String[]{"vastMediaBitrate", "vastMediaHeight", "vastMediaWidth"});
    }

    public final int hashCode() {
        return zzafq.a(this, new String[0]);
    }

    public final String toString() {
        String str = this.adId;
        String str2 = this.creativeId;
        String str3 = this.creativeAdId;
        String str4 = this.universalAdIdValue;
        String str5 = this.universalAdIdRegistry;
        String str6 = this.title;
        String str7 = this.description;
        String str8 = this.contentType;
        String string = Arrays.toString(this.adWrapperIds);
        String string2 = Arrays.toString(this.adWrapperSystems);
        String string3 = Arrays.toString(this.adWrapperCreativeIds);
        String str9 = this.adSystem;
        String str10 = this.advertiserName;
        String str11 = this.surveyUrl;
        String str12 = this.dealId;
        boolean z = this.linear;
        boolean z2 = this.skippable;
        int i = this.width;
        int i2 = this.height;
        int i3 = this.vastMediaHeight;
        int i4 = this.vastMediaWidth;
        int i5 = this.vastMediaBitrate;
        String str13 = this.traffickingParameters;
        String str14 = this.clickThroughUrl;
        double d = this.duration;
        String strValueOf = String.valueOf(this.adPodInfo);
        String strValueOf2 = String.valueOf(this.uiElements);
        boolean z3 = this.disableUi;
        double d2 = this.skipTimeOffset;
        StringBuilder sbN = z1m.n("Ad [adId=", str, ", creativeId=", str2, ", creativeAdId=");
        z1m.t(sbN, str3, ", universalAdIdValue=", str4, ", universalAdIdRegistry=");
        z1m.t(sbN, str5, ", title=", str6, ", description=");
        z1m.t(sbN, str7, ", contentType=", str8, ", adWrapperIds=");
        z1m.t(sbN, string, ", adWrapperSystems=", string2, ", adWrapperCreativeIds=");
        z1m.t(sbN, string3, ", adSystem=", str9, ", advertiserName=");
        z1m.t(sbN, str10, ", surveyUrl=", str11, ", dealId=");
        sbN.append(str12);
        sbN.append(", linear=");
        sbN.append(z);
        sbN.append(", skippable=");
        sbN.append(z2);
        sbN.append(", width=");
        sbN.append(i);
        sbN.append(", height=");
        sko.r(i2, i3, ", vastMediaHeight=", ", vastMediaWidth=", sbN);
        sko.r(i4, i5, ", vastMediaBitrate=", ", traffickingParameters=", sbN);
        z1m.t(sbN, str13, ", clickThroughUrl=", str14, ", duration=");
        sbN.append(d);
        sbN.append(", adPodInfo=");
        sbN.append(strValueOf);
        sbN.append(", uiElements=");
        sbN.append(strValueOf2);
        sbN.append(", disableUi=");
        sbN.append(z3);
        sbN.append(", skipTimeOffset=");
        sbN.append(d2);
        sbN.append("]");
        return sbN.toString();
    }
}
