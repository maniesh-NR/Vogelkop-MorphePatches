package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.a2;
import ads_mobile_sdk.cc1;
import ads_mobile_sdk.hg0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.iw1;
import ads_mobile_sdk.jz2;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.ph0;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.qw1;
import ads_mobile_sdk.se2;
import ads_mobile_sdk.ve2;
import ads_mobile_sdk.we1;
import ads_mobile_sdk.xm2;
import ads_mobile_sdk.xv;
import ads_mobile_sdk.z2;
import ads_mobile_sdk.zt1;
import androidx.annotation.Keep;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import defpackage.prb;
import defpackage.r83;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/nativead/InternalNativeAd;", "Lads_mobile_sdk/cc1;", "Ljava/util/Optional;", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "jsEngineContext", "Ljava/util/Optional;", "localJsEngineContext", "Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class InternalNativeAd extends cc1 {
    public final it1 a;
    public final zt1 e;

    @Keep
    @NotNull
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;
    public final iw1 l;

    @Keep
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;
    public final qw1 q;
    public final we1 r;
    public final qr0 s;
    public final hg0 t;

    public InternalNativeAd(String str, a2 a2Var, xv xvVar, kh3 kh3Var, z2 z2Var, ph0 ph0Var, it1 it1Var, zt1 zt1Var, iw1 iw1Var, qw1 qw1Var, we1 we1Var, Optional optional, se2 se2Var, jz2 jz2Var, ve2 ve2Var, qr0 qr0Var, r83 r83Var, hg0 hg0Var) {
        super(str, a2Var, xvVar, kh3Var, z2Var, ph0Var, se2Var, jz2Var, ve2Var, r83Var);
        this.a = it1Var;
        this.e = zt1Var;
        this.l = iw1Var;
        this.q = qw1Var;
        this.r = we1Var;
        this.jsEngineContext = optional;
        this.s = qr0Var;
        this.t = hg0Var;
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) optional.orElse(null);
    }

    @Override // ads_mobile_sdk.cc1, defpackage.rnp
    public final Object a(xm2 xm2Var) {
        this.localJsEngineContext = this.jsEngineContext.orElse(null);
        Object objA = cc1.a(this, xm2Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // ads_mobile_sdk.cc1, defpackage.rnp
    public final void destroy() {
        super.destroy();
        this.e.a();
    }

    @Override // ads_mobile_sdk.cc1, defpackage.rnp
    public final prb g() {
        return this.a.w;
    }
}
