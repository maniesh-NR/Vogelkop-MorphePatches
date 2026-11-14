package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dia {
    public final long a;
    public final String b;

    public dia(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dia)) {
            return false;
        }
        dia diaVar = (dia) obj;
        return this.a == diaVar.a && Intrinsics.a(this.b, diaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "ActionsV1PauseAudioCommentaryErrorData(code=", ", message=", this.b);
        sbQ.append(")");
        return sbQ.toString();
    }
}
