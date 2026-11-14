package defpackage;

import android.app.PendingIntent;
import android.widget.inline.InlinePresentationSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yff {
    public final InlinePresentationSpec a;
    public final PendingIntent b;

    public yff(InlinePresentationSpec inlinePresentationSpec, PendingIntent pendingIntent) {
        this.a = inlinePresentationSpec;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yff)) {
            return false;
        }
        yff yffVar = (yff) obj;
        return Intrinsics.a(this.a, yffVar.a) && Intrinsics.a(this.b, yffVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
