package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ak extends c09 {
    public final String W;
    public final pxh X;
    public final pxh Y;
    public final Uri Z;
    public final boolean a0;

    public ak(String str, pxh pxhVar, pxh pxhVar2, Uri uri, boolean z) {
        this.W = str;
        this.X = pxhVar;
        this.Y = pxhVar2;
        this.Z = uri;
        this.a0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        return Intrinsics.a(this.W, akVar.W) && this.X.equals(akVar.X) && Intrinsics.a(this.Y, akVar.Y) && Intrinsics.a(this.Z, akVar.Z) && this.a0 == akVar.a0;
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + (this.W.hashCode() * 31)) * 31;
        pxh pxhVar = this.Y;
        return Boolean.hashCode(this.a0) + ((this.Z.hashCode() + ((iHashCode + (pxhVar == null ? 0 : pxhVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
