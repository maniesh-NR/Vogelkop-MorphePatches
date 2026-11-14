package com.google.android.play.core.install;

import defpackage.p3p;
import defpackage.t3p;

/* loaded from: classes.dex */
public final class zza {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public zza(String str, long j, int i, int i2, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        if (str != null) {
            this.e = str;
        } else {
            t3p.q("Null packageName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.a == zzaVar.a && this.b == zzaVar.b && this.c == zzaVar.c && this.d == zzaVar.d && this.e.equals(zzaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.c;
        return (((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallState{installStatus=");
        sb.append(this.a);
        sb.append(", bytesDownloaded=");
        sb.append(this.b);
        p3p.u(sb, ", totalBytesToDownload=", this.c, ", installErrorCode=");
        sb.append(this.d);
        sb.append(", packageName=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
