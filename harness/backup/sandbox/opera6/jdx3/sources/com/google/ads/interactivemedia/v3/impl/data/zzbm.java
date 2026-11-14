package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzafo;
import com.google.ads.interactivemedia.v3.internal.zzafq;
import defpackage.sko;

/* loaded from: classes.dex */
public final class zzbm {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;

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
        String str = this.type;
        int i = this.errorCode;
        return sko.n(sko.p(i, "Log[type=", str, ", errorCode=", ", errorMessage="), this.errorMessage, ", innerError=", this.innerError, "]");
    }
}
