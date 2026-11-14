package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eke extends jpo {
    public final wje j;

    public eke(wje wjeVar) {
        this.j = wjeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && eke.class == obj.getClass() && Intrinsics.a(this.j, ((eke) obj).j);
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.j + ", direction=-1)";
    }
}
