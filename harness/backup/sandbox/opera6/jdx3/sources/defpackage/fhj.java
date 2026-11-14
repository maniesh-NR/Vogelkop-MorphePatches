package defpackage;

import com.opera.android.oauth2.OperaAccessToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fhj {
    public final OperaAccessToken a;
    public final boolean b;

    public fhj(OperaAccessToken operaAccessToken, boolean z) {
        this.a = operaAccessToken;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhj)) {
            return false;
        }
        fhj fhjVar = (fhj) obj;
        return Intrinsics.a(this.a, fhjVar.a) && this.b == fhjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
