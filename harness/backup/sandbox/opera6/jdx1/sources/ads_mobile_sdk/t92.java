package ads_mobile_sdk;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import defpackage.msd;
import defpackage.p8n;

/* loaded from: classes.dex */
public final class t92 extends p8n {
    public final /* synthetic */ Context a;
    public final /* synthetic */ u92 b;
    public final /* synthetic */ InternalNativeAd c;
    public final /* synthetic */ ImageView.ScaleType d;

    public t92(Context context, u92 u92Var, InternalNativeAd internalNativeAd, ImageView.ScaleType scaleType) {
        this.a = context;
        this.b = u92Var;
        this.c = internalNativeAd;
        this.d = scaleType;
    }

    @Override // defpackage.p8n
    public final void a(AdActivity adActivity, LinearLayout linearLayout) throws Resources.NotFoundException {
        e7 e7Var;
        NativeAdView nativeAdView = new NativeAdView(adActivity);
        nativeAdView.setTag("ad_view_tag");
        nativeAdView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(nativeAdView);
        LinearLayout linearLayout2 = new LinearLayout(adActivity);
        linearLayout2.setTag("layout_tag");
        linearLayout2.setOrientation(1);
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        nativeAdView.addView(linearLayout2);
        Resources resources = this.a.getResources();
        if (resources == null) {
            return;
        }
        linearLayout2.addView(u92.a(this.b, adActivity, resources.getString(2132019970), "headline_header_tag"));
        String str = (String) this.c.a.d.get("headline");
        if (str == null) {
            str = "";
        }
        TextView textViewB = u92.b(this.b, adActivity, str, "headline_tag");
        nativeAdView.a.a(textViewB, "3001");
        linearLayout2.addView(textViewB);
        linearLayout2.addView(u92.a(this.b, adActivity, resources.getString(2132019969), "body_header_tag"));
        String str2 = (String) this.c.a.d.get("body");
        if (str2 == null) {
            str2 = "";
        }
        TextView textViewB2 = u92.b(this.b, adActivity, str2, "body_tag");
        nativeAdView.a.a(textViewB2, "3004");
        linearLayout2.addView(textViewB2);
        linearLayout2.addView(u92.a(this.b, adActivity, resources.getString(2132019971), "media_view_header_tag"));
        msd msdVar = new msd(adActivity);
        msdVar.setTag("media_view_tag");
        ImageView.ScaleType scaleType = this.d;
        msdVar.a = scaleType;
        if (scaleType != null) {
            synchronized (msdVar) {
                e7Var = msdVar.b;
            }
            if (e7Var != null) {
                e7Var.a(scaleType);
            }
        }
        linearLayout2.addView(msdVar);
        nativeAdView.a(new bu1(this.c), msdVar);
    }

    @Override // defpackage.o5p
    public final void onDestroy() {
        this.c.destroy();
    }
}
