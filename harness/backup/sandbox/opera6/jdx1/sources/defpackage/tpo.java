package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class tpo {
    public static Bundle a(r83 r83Var, MediationExtrasReceiver mediationExtrasReceiver) {
        Bundle bundle = (Bundle) r83Var.g.get(mediationExtrasReceiver.getClass().getName());
        return bundle == null ? new Bundle() : bundle;
    }

    public static Bundle b(prb prbVar) {
        Bundle bundle = new Bundle();
        egc it = prbVar.a.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.a().f;
            try {
                bundle.putString(str, prbVar.u(str).n());
            } catch (IllegalStateException unused) {
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.nativead.NativeAdOptions$Builder] */
    public static NativeAdOptions c(uie uieVar) {
        int i;
        int i2;
        ?? r0 = new Object() { // from class: com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            private boolean a;
            private int b;
            private boolean c;
            private VideoOptions d;
            private int e = 1;
            private boolean f;
            private boolean g;
            private int h;

            @NotNull
            public final NativeAdOptions build() {
                return new NativeAdOptions(this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h, 0);
            }

            @NotNull
            public final NativeAdOptions$Builder enableCustomClickGestureDirection(@NativeAdOptions.SwipeGestureDirection int swipeGestureDirection, boolean tapsAllowed) {
                this.g = tapsAllowed;
                this.h = swipeGestureDirection;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setAdChoicesPlacement(@NativeAdOptions.AdChoicesPlacement int adChoicesPlacement) {
                this.e = adChoicesPlacement;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setMediaAspectRatio(@NativeAdOptions.NativeMediaAspectRatio int aspectRatio) {
                this.b = aspectRatio;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setRequestCustomMuteThisAd(boolean requestCustomMuteThisAd) {
                this.f = requestCustomMuteThisAd;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setRequestMultipleImages(boolean shouldRequestMultipleImages) {
                this.c = shouldRequestMultipleImages;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setReturnUrlsForImageAssets(boolean shouldReturnUrls) {
                this.a = shouldReturnUrls;
                return this;
            }

            @NotNull
            public final NativeAdOptions$Builder setVideoOptions(VideoOptions videoOptions) {
                this.d = videoOptions;
                return this;
            }
        };
        int i3 = hdp.c[uieVar.j().ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 2) {
            i = 1;
        } else if (i3 == 3) {
            i = 2;
        } else if (i3 == 4) {
            i = 3;
        } else {
            if (i3 != 5) {
                h9o.p();
                return null;
            }
            i = 4;
        }
        r0.setMediaAspectRatio(i);
        int i5 = hdp.b[uieVar.e().ordinal()];
        if (i5 == 1) {
            i2 = 0;
        } else if (i5 == 2) {
            i2 = 1;
        } else if (i5 == 3) {
            i2 = 2;
        } else {
            if (i5 != 4) {
                h9o.p();
                return null;
            }
            i2 = 3;
        }
        r0.setAdChoicesPlacement(i2);
        the theVarB = uieVar.b();
        int i6 = theVarB == null ? -1 : hdp.a[theVarB.ordinal()];
        if (i6 == 1) {
            i4 = 1;
        } else if (i6 == 2) {
            i4 = 2;
        } else if (i6 == 3) {
            i4 = 4;
        } else if (i6 == 4) {
            i4 = 8;
        }
        r0.enableCustomClickGestureDirection(i4, uieVar.f());
        r0.setRequestCustomMuteThisAd(uieVar.k());
        ukh ukhVarC = uieVar.c();
        VideoOptions videoOptionsBuild = ukhVarC != null ? new VideoOptions.Builder().setStartMuted(ukhVarC.b).setClickToExpandRequested(ukhVarC.d).setCustomControlsRequested(ukhVarC.c).build() : null;
        if (videoOptionsBuild != null) {
            r0.setVideoOptions(videoOptionsBuild);
        }
        return r0.build();
    }

    public static String d(prb prbVar, cwh cwhVar) {
        return prbVar.a.containsKey("max_ad_content_rating") ? prbVar.u("max_ad_content_rating").n() : cwhVar.a.a;
    }
}
