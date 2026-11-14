package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ovf {
    public final PackageInfo a;
    public final Signature[] b;

    public ovf(PackageInfo packageInfo, Signature[] signatureArr) {
        this.a = packageInfo;
        this.b = signatureArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovf)) {
            return false;
        }
        ovf ovfVar = (ovf) obj;
        return this.a.equals(ovfVar.a) && Intrinsics.a(this.b, ovfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
