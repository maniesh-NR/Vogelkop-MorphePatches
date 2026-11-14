package defpackage;

import android.app.PendingIntent;
import android.widget.inline.InlinePresentationSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ynk {
    public final InlinePresentationSpec a;
    public final PendingIntent b;

    public ynk(InlinePresentationSpec inlinePresentationSpec, PendingIntent pendingIntent) {
        this.a = inlinePresentationSpec;
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynk)) {
            return false;
        }
        ynk ynkVar = (ynk) obj;
        return this.a.equals(ynkVar.a) && Intrinsics.a(this.b, ynkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
