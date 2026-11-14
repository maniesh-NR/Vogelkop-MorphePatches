package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fia {
    public final long a;
    public final String b;

    public fia(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fia)) {
            return false;
        }
        fia fiaVar = (fia) obj;
        return this.a == fiaVar.a && Intrinsics.a(this.b, fiaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "ActionsV1PlayAudioCommentaryErrorData(code=", ", message=", this.b);
        sbQ.append(")");
        return sbQ.toString();
    }
}
