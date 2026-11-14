package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mia {
    public final long a;
    public final String b;

    public mia(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mia)) {
            return false;
        }
        mia miaVar = (mia) obj;
        return this.a == miaVar.a && Intrinsics.a(this.b, miaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "ActionsV1StopAudioCommentaryErrorData(code=", ", message=", this.b);
        sbQ.append(")");
        return sbQ.toString();
    }
}
