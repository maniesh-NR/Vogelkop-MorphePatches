package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yha {
    public final String a;
    public final ehc b;

    public yha(String str, ehc ehcVar) {
        this.a = str;
        this.b = ehcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yha)) {
            return false;
        }
        yha yhaVar = (yha) obj;
        return Intrinsics.a(this.a, yhaVar.a) && Intrinsics.a(this.b, yhaVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ehc ehcVar = this.b;
        return iHashCode + (ehcVar == null ? 0 : ehcVar.hashCode());
    }

    public final String toString() {
        return "ActionsV1GiveFeedbackData(comment=" + this.a + ", reason=" + this.b + ")";
    }
}
