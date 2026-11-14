package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010\nR\u0016\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lw0g;", "", "", "a", "Ljava/lang/String;", "innerAdUnitId", "b", "adSourceName", "", "c", "Ljava/util/List;", "clickUrls", "d", "impressionUrls", "e", "manualTrackingUrls", "f", "fillUrls", "g", "videoStartUrls", "h", "videoRewardsUrls", "i", "videoCompleteUrls", "", "j", "Z", "isClosableAreaDisabled", "Lprb;", "k", "Lprb;", "recursiveRequestParameters", "l", "isAnalyticsLoggingEnabled", "Landroid/os/Bundle;", "m", "rewardsBundles", "Lwpb;", "n", "Lwpb;", "recursiveSignalCollectionConfig", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class w0g {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    @t2j("initial_ad_unit_id")
    public final String innerAdUnitId;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    @t2j("ad_source_name")
    public final String adSourceName;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    @t2j("click_urls")
    public final List<String> clickUrls;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    @t2j("imp_urls")
    public final List<String> impressionUrls;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    @t2j("manual_tracking_urls")
    public final List<String> manualTrackingUrls;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    @t2j("fill_urls")
    public final List<String> fillUrls;

    /* renamed from: g, reason: from kotlin metadata */
    @NotNull
    @t2j("video_start_urls")
    public final List<String> videoStartUrls;

    /* renamed from: h, reason: from kotlin metadata */
    @NotNull
    @t2j("video_reward_urls")
    public final List<String> videoRewardsUrls;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    @t2j("video_complete_urls")
    public final List<String> videoCompleteUrls;

    /* renamed from: j, reason: from kotlin metadata */
    @t2j("is_closable_area_disabled")
    public final boolean isClosableAreaDisabled;

    /* renamed from: k, reason: from kotlin metadata */
    @NotNull
    @t2j("recursive_request_parameters")
    public final prb recursiveRequestParameters;

    /* renamed from: l, reason: from kotlin metadata */
    @t2j("is_analytics_logging_enabled")
    public final boolean isAnalyticsLoggingEnabled;

    /* renamed from: m, reason: from kotlin metadata */
    @t2j("rewards")
    public List<Bundle> rewardsBundles;

    /* renamed from: n, reason: from kotlin metadata */
    @t2j("recursive_signal_collection")
    public final wpb recursiveSignalCollectionConfig;

    public w0g(String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, boolean z, prb prbVar, boolean z2, l08 l08Var, wpb wpbVar) {
        this.innerAdUnitId = str;
        this.adSourceName = str2;
        this.clickUrls = arrayList;
        this.impressionUrls = arrayList2;
        this.manualTrackingUrls = arrayList3;
        this.fillUrls = arrayList4;
        this.videoStartUrls = arrayList5;
        this.videoRewardsUrls = arrayList6;
        this.videoCompleteUrls = arrayList7;
        this.isClosableAreaDisabled = z;
        this.recursiveRequestParameters = prbVar;
        this.isAnalyticsLoggingEnabled = z2;
        this.rewardsBundles = l08Var;
        this.recursiveSignalCollectionConfig = wpbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0g)) {
            return false;
        }
        w0g w0gVar = (w0g) obj;
        return Intrinsics.a(this.innerAdUnitId, w0gVar.innerAdUnitId) && Intrinsics.a(this.adSourceName, w0gVar.adSourceName) && Intrinsics.a(this.clickUrls, w0gVar.clickUrls) && Intrinsics.a(this.impressionUrls, w0gVar.impressionUrls) && Intrinsics.a(this.manualTrackingUrls, w0gVar.manualTrackingUrls) && Intrinsics.a(this.fillUrls, w0gVar.fillUrls) && Intrinsics.a(this.videoStartUrls, w0gVar.videoStartUrls) && Intrinsics.a(this.videoRewardsUrls, w0gVar.videoRewardsUrls) && Intrinsics.a(this.videoCompleteUrls, w0gVar.videoCompleteUrls) && this.isClosableAreaDisabled == w0gVar.isClosableAreaDisabled && Intrinsics.a(this.recursiveRequestParameters, w0gVar.recursiveRequestParameters) && this.isAnalyticsLoggingEnabled == w0gVar.isAnalyticsLoggingEnabled && Intrinsics.a(this.rewardsBundles, w0gVar.rewardsBundles) && Intrinsics.a(this.recursiveSignalCollectionConfig, w0gVar.recursiveSignalCollectionConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iC = nxg.c(nxg.c(nxg.c(nxg.c(nxg.c(nxg.c(nxg.c(dgh.a(this.adSourceName, this.innerAdUnitId.hashCode() * 31), this.clickUrls), this.impressionUrls), this.manualTrackingUrls), this.fillUrls), this.videoStartUrls), this.videoRewardsUrls), this.videoCompleteUrls);
        boolean z = this.isClosableAreaDisabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode = (this.recursiveRequestParameters.a.hashCode() + ((iC + i) * 31)) * 31;
        boolean z2 = this.isAnalyticsLoggingEnabled;
        int i2 = (iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        List<Bundle> list = this.rewardsBundles;
        int iHashCode2 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        wpb wpbVar = this.recursiveSignalCollectionConfig;
        return iHashCode2 + (wpbVar != null ? wpbVar.a.hashCode() : 0);
    }

    public final String toString() {
        String str = this.innerAdUnitId;
        String str2 = this.adSourceName;
        List<String> list = this.clickUrls;
        List<String> list2 = this.impressionUrls;
        List<String> list3 = this.manualTrackingUrls;
        List<String> list4 = this.fillUrls;
        List<String> list5 = this.videoStartUrls;
        List<String> list6 = this.videoRewardsUrls;
        List<String> list7 = this.videoCompleteUrls;
        boolean z = this.isClosableAreaDisabled;
        prb prbVar = this.recursiveRequestParameters;
        boolean z2 = this.isAnalyticsLoggingEnabled;
        List<Bundle> list8 = this.rewardsBundles;
        wpb wpbVar = this.recursiveSignalCollectionConfig;
        StringBuilder sbN = z1m.n("ParentAdConfig(innerAdUnitId=", str, ", adSourceName=", str2, ", clickUrls=");
        v0g.n(sbN, list, ", impressionUrls=", list2, ", manualTrackingUrls=");
        v0g.n(sbN, list3, ", fillUrls=", list4, ", videoStartUrls=");
        v0g.n(sbN, list5, ", videoRewardsUrls=", list6, ", videoCompleteUrls=");
        sbN.append(list7);
        sbN.append(", isClosableAreaDisabled=");
        sbN.append(z);
        sbN.append(", recursiveRequestParameters=");
        sbN.append(prbVar);
        sbN.append(", isAnalyticsLoggingEnabled=");
        sbN.append(z2);
        sbN.append(", rewardsBundles=");
        sbN.append(list8);
        sbN.append(", recursiveSignalCollectionConfig=");
        sbN.append(wpbVar);
        sbN.append(")");
        return sbN.toString();
    }
}
