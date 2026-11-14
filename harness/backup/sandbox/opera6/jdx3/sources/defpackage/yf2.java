package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yf2 {
    public final String a;
    public final fla b;

    public yf2(String str, fla flaVar) {
        this.a = str;
        this.b = flaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2)) {
            return false;
        }
        yf2 yf2Var = (yf2) obj;
        return Intrinsics.a(this.a, yf2Var.a) && this.b == yf2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioCommentaryState(matchId=" + this.a + ", status=" + this.b + ")";
    }
}
