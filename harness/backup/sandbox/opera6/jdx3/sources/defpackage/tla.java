package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tla {
    public final String a;

    public tla(String str) {
        ula ulaVar = ula.a;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tla) || !Intrinsics.a(this.a, ((tla) obj).a)) {
            return false;
        }
        ula ulaVar = ula.a;
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return ula.a.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "HostStateSpeechStateActiveStreamData(streamId=" + this.a + ", status=" + ula.a + ")";
    }
}
