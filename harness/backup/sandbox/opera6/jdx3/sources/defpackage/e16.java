package defpackage;

import android.app.PendingIntent;
import android.widget.inline.InlinePresentationSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e16 {
    public final InlinePresentationSpec a;
    public final PendingIntent b;

    public e16(InlinePresentationSpec inlinePresentationSpec, PendingIntent pendingIntent) {
        this.a = inlinePresentationSpec;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e16)) {
            return false;
        }
        e16 e16Var = (e16) obj;
        return Intrinsics.a(this.a, e16Var.a) && Intrinsics.a(this.b, e16Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
