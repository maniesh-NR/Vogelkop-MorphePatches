package ads_mobile_sdk;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions$Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import defpackage.g0f;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class nz1 implements NativeMediationAdRequest {
    public final HashSet a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final NativeAdOptions g;

    public nz1(HashSet hashSet, boolean z, int i, int i2, String str, NativeAdOptions nativeAdOptions) {
        this.a = hashSet;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.g = nativeAdOptions;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        throw new g0f("An operation is not implemented: b/304323160 Not yet implemented");
    }

    public final Date getBirthday() {
        return null;
    }

    public final int getGender() {
        return 0;
    }

    public final Set getKeywords() {
        return this.a;
    }

    public final Location getLocation() {
        return null;
    }

    public final String getMaxAdContentRating() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.formats.NativeAdOptions$Builder] */
    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions() {
        ?? r0 = new Object() { // from class: com.google.android.gms.ads.formats.NativeAdOptions$Builder
            private boolean a;
            private int b;
            private boolean d;
            private VideoOptions e;
            private boolean g;
            private int c = -1;
            private int f = 1;

            @NotNull
            public final NativeAdOptions build() {
                return new NativeAdOptions(this.a, this.b, this.c, this.d, this.f, this.e, this.g, 0);
            }

            @NotNull
            public final NativeAdOptions$Builder setAdChoicesPlacement(@NativeAdOptions.AdChoicesPlacement int adChoicesPlacement) {
                this.f = adChoicesPlacement;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setImageOrientation(int orientation) {
                this.c = orientation;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setMediaAspectRatio(@NativeAdOptions.NativeMediaAspectRatio int aspectRatio) {
                this.b = aspectRatio;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setRequestCustomMuteThisAd(boolean requestCustomMuteThisAd) {
                this.g = requestCustomMuteThisAd;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setRequestMultipleImages(boolean shouldRequestMultipleImages) {
                this.d = shouldRequestMultipleImages;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean shouldReturnUrls) {
                this.a = shouldReturnUrls;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setVideoOptions(VideoOptions videoOptions) {
                this.e = videoOptions;
                return this;
            }
        };
        com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions = this.g;
        NativeAdOptions$Builder mediaAspectRatio = r0.setAdChoicesPlacement(nativeAdOptions.getAdChoicesPlacement()).setMediaAspectRatio(nativeAdOptions.getMediaAspectRatio());
        int mediaAspectRatio2 = nativeAdOptions.getMediaAspectRatio();
        return mediaAspectRatio.setImageOrientation(mediaAspectRatio2 != 2 ? mediaAspectRatio2 != 3 ? 0 : 1 : 2).setVideoOptions(nativeAdOptions.getVideoOptions()).setReturnUrlsForImageAssets(nativeAdOptions.shouldReturnUrlsForImageAssets()).setRequestMultipleImages(nativeAdOptions.shouldRequestMultipleImages()).build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        throw new g0f("An operation is not implemented: b/304323160 Not yet implemented");
    }

    public final boolean isDesignedForFamilies() {
        return false;
    }

    public final boolean isTesting() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return true;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.c;
    }

    public final int taggedForUnderAgeTreatment() {
        return this.d;
    }
}
