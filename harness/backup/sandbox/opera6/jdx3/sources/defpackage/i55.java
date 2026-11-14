package defpackage;

import com.opera.android.suggestion.Suggestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i55 {
    public final String a;
    public final Suggestion b;
    public final Suggestion c;
    public final boolean d;

    public i55(String str, Suggestion suggestion, Suggestion suggestion2, boolean z) {
        this.a = str;
        this.b = suggestion;
        this.c = suggestion2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) obj;
        return Intrinsics.a(this.a, i55Var.a) && Intrinsics.a(this.b, i55Var.b) && Intrinsics.a(this.c, i55Var.c) && this.d == i55Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Suggestion suggestion = this.b;
        int iHashCode2 = (iHashCode + (suggestion == null ? 0 : suggestion.hashCode())) * 31;
        Suggestion suggestion2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (suggestion2 != null ? suggestion2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }
}
