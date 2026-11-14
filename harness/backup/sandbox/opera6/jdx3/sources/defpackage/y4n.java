package defpackage;

import android.app.PendingIntent;
import android.widget.inline.InlinePresentationSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y4n {
    public final InlinePresentationSpec a;
    public final PendingIntent b;

    public y4n(InlinePresentationSpec inlinePresentationSpec, PendingIntent pendingIntent) {
        this.a = inlinePresentationSpec;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4n)) {
            return false;
        }
        y4n y4nVar = (y4n) obj;
        return Intrinsics.a(this.a, y4nVar.a) && Intrinsics.a(this.b, y4nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
