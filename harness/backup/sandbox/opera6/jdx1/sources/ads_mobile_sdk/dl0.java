package ads_mobile_sdk;

import android.os.Build;
import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dl0 {
    public final String a;
    public final long b;
    public final int d;

    public dl0(int i, long j, String str) {
        String str2 = Build.MODEL;
        this.a = str;
        this.b = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl0)) {
            return false;
        }
        dl0 dl0Var = (dl0) obj;
        if (!Intrinsics.a(this.a, dl0Var.a) || this.b != dl0Var.b) {
            return false;
        }
        String str = Build.MODEL;
        return Intrinsics.a(str, str) && this.d == dl0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dgh.a(Build.MODEL, z1m.e(this.a.hashCode() * 31, 31, this.b));
    }

    public final String toString() {
        return "EnvironmentData(packageName=" + this.a + ", versionCode=" + this.b + ", deviceModel=" + Build.MODEL + ", apiVersion=" + this.d + ")";
    }
}
