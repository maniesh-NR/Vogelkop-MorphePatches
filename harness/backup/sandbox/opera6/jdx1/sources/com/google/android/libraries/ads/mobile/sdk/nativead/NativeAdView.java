package com.google.android.libraries.ads.mobile.sdk.nativead;

import ads_mobile_sdk.bu1;
import ads_mobile_sdk.e7;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.f43;
import defpackage.msd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdView;", "Lf43;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeAdView extends f43 {
    public static final /* synthetic */ int c = 0;

    public NativeAdView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(bu1 bu1Var, msd msdVar) {
        this.a.a(msdVar, "3010");
        if (msdVar != null) {
            e7 e7Var = new e7(this, (byte) 2);
            synchronized (msdVar) {
                msdVar.b = e7Var;
            }
            ImageView.ScaleType scaleType = msdVar.a;
            if (scaleType != null) {
                e7Var.a(scaleType);
            }
        }
        this.a.a(bu1Var.b);
    }
}
