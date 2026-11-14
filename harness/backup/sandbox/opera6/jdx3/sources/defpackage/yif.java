package defpackage;

import android.widget.inline.InlinePresentationSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yif {
    public final k2g a;
    public final r3g b;
    public final InlinePresentationSpec c;
    public final s3g d;

    public yif(k2g k2gVar, r3g r3gVar, InlinePresentationSpec inlinePresentationSpec, s3g s3gVar) {
        this.a = k2gVar;
        this.b = r3gVar;
        this.c = inlinePresentationSpec;
        this.d = s3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yif)) {
            return false;
        }
        yif yifVar = (yif) obj;
        return Intrinsics.a(this.a, yifVar.a) && Intrinsics.a(this.b, yifVar.b) && Intrinsics.a(this.c, yifVar.c) && Intrinsics.a(this.d, yifVar.d);
    }

    public final int hashCode() {
        k2g k2gVar = this.a;
        int iHashCode = (k2gVar == null ? 0 : k2gVar.hashCode()) * 31;
        r3g r3gVar = this.b;
        int iHashCode2 = (iHashCode + (r3gVar == null ? 0 : r3gVar.hashCode())) * 31;
        InlinePresentationSpec inlinePresentationSpec = this.c;
        int iHashCode3 = (iHashCode2 + (inlinePresentationSpec == null ? 0 : inlinePresentationSpec.hashCode())) * 31;
        s3g s3gVar = this.d;
        return iHashCode3 + (s3gVar != null ? s3gVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
