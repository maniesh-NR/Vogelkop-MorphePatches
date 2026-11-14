package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzafo;
import com.google.ads.interactivemedia.v3.internal.zzafq;
import defpackage.sko;

/* loaded from: classes.dex */
public final class zzd {
    public int podIndex;
    public double timeOffset;
    public int totalAds = 1;
    public int adPosition = 1;
    public boolean isBumper = false;
    public double maxDuration = -1.0d;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzafo.b(this, obj, new String[0]);
    }

    public final int hashCode() {
        return zzafq.a(this, new String[0]);
    }

    public final String toString() {
        int i = this.totalAds;
        int i2 = this.adPosition;
        boolean z = this.isBumper;
        double d = this.maxDuration;
        int i3 = this.podIndex;
        double d2 = this.timeOffset;
        StringBuilder sbO = sko.o(i, i2, "AdPodInfo [totalAds=", ", adPosition=", ", isBumper=");
        sbO.append(z);
        sbO.append(", maxDuration=");
        sbO.append(d);
        sbO.append(", podIndex=");
        sbO.append(i3);
        sbO.append(", timeOffset=");
        sbO.append(d2);
        sbO.append("]");
        return sbO.toString();
    }
}
