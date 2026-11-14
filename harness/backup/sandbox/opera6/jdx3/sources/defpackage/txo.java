package defpackage;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class txo {

    @NotNull
    public static final awo Companion = new awo();
    public static final omj c = new omj((byte) 25);
    public final String a;
    public final long b;

    public txo(int i, long j, String str) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, pvo.b);
            throw null;
        }
        this.a = str;
        this.b = j;
        if (str.length() <= 0 || TextUtils.getTrimmedLength(str) != str.length() || j <= 0) {
            qp2.n("Check failed.");
            throw null;
        }
    }

    public txo(String str, long j) {
        this.a = str;
        this.b = j;
        if (str.length() <= 0 || TextUtils.getTrimmedLength(str) != str.length() || j <= 0) {
            qp2.n("Check failed.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txo)) {
            return false;
        }
        txo txoVar = (txo) obj;
        return Intrinsics.a(this.a, txoVar.a) && this.b == txoVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockedAd(creativeId=" + this.a + ", timestamp=" + this.b + ')';
    }
}
