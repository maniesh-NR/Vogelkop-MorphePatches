package org.chromium.content.browser;

import org.chromium.content_public.browser.SiteZoomInfo;

/* loaded from: classes.dex */
public final class HostZoomMapImpl {
    public static double a(double d) {
        gq5.m.a();
        return Math.abs(0.0f) < 0.001f ? d : Math.log10(Math.pow(1.2000000476837158d, d) * 1.0d) / 0.0791812633049367d;
    }

    public static SiteZoomInfo buildSiteZoomInfo(String str, double d) {
        return new SiteZoomInfo(str, d);
    }

    public static double getAdjustedZoomLevel(double d) {
        return a(d);
    }
}
