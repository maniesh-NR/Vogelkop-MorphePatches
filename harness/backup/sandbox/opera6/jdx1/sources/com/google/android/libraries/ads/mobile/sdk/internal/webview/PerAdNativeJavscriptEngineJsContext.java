package com.google.android.libraries.ads.mobile.sdk.internal.webview;

import androidx.annotation.Keep;
import defpackage.ato;
import defpackage.zep;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "Lzep;", "", "Lato;", "perAdGmsgHandlers", "Ljava/util/Set;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PerAdNativeJavscriptEngineJsContext implements zep {
    public final zep a;
    public final String b;
    public final pfe c = new pfe();

    @Keep
    @NotNull
    private final Set<ato> perAdGmsgHandlers = new LinkedHashSet();

    public PerAdNativeJavscriptEngineJsContext(zep zepVar, String str) {
        this.a = zepVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        if (r8.a(r9, r10, r0) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.zep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, defpackage.ato r10, mt5 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.kb2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.kb2 r0 = (ads_mobile_sdk.kb2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.kb2 r0 = new ads_mobile_sdk.kb2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r11)
            goto Lc3
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r6
        L35:
            pfe r8 = r0.d
            ato r10 = r0.c
            java.lang.String r9 = r0.b
            com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r2 = r0.a
            defpackage.ybh.y(r11)
            goto L9d
        L41:
            pfe r8 = r0.d
            ato r10 = r0.c
            java.lang.String r9 = r0.b
            com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r2 = r0.a
            defpackage.ybh.y(r11)
            goto L71
        L4d:
            defpackage.ybh.y(r11)
            java.lang.String r11 = r10.d()
            pfe r2 = r8.c
            if (r11 == 0) goto L80
            boolean r11 = kotlin.text.StringsKt.N(r11)
            if (r11 != 0) goto L80
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r2
            r0.g = r5
            java.lang.Object r11 = r2.i(r0)
            if (r11 == r1) goto Lc2
            r7 = r2
            r2 = r8
            r8 = r7
        L71:
            java.util.Set<ato> r11 = r2.perAdGmsgHandlers     // Catch: java.lang.Throwable -> L7b
            r11.add(r10)     // Catch: java.lang.Throwable -> L7b
            r8.l(r6)
        L79:
            r8 = r2
            goto Lb0
        L7b:
            r9 = move-exception
            r8.l(r6)
            throw r9
        L80:
            java.lang.String r11 = r8.b
            if (r11 == 0) goto Lb0
            boolean r11 = kotlin.text.StringsKt.N(r11)
            if (r11 != 0) goto Lb0
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r2
            r0.g = r4
            java.lang.Object r11 = r2.i(r0)
            if (r11 == r1) goto Lc2
            r7 = r2
            r2 = r8
            r8 = r7
        L9d:
            java.lang.String r11 = r2.b     // Catch: java.lang.Throwable -> Lab
            r10.a(r11)     // Catch: java.lang.Throwable -> Lab
            java.util.Set<ato> r11 = r2.perAdGmsgHandlers     // Catch: java.lang.Throwable -> Lab
            r11.add(r10)     // Catch: java.lang.Throwable -> Lab
            r8.l(r6)
            goto L79
        Lab:
            r9 = move-exception
            r8.l(r6)
            throw r9
        Lb0:
            zep r8 = r8.a
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.d = r6
            r0.g = r3
            java.lang.Object r8 = r8.a(r9, r10, r0)
            if (r8 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext.a(java.lang.String, ato, mt5):java.lang.Object");
    }
}
