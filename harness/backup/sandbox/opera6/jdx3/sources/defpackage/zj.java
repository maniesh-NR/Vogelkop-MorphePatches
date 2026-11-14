package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zj extends c09 {
    public final String W;
    public final pxh X;
    public final pxh Y;
    public final boolean Z;

    public zj(String str, pxh pxhVar, pxh pxhVar2, boolean z) {
        this.W = str;
        this.X = pxhVar;
        this.Y = pxhVar2;
        this.Z = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        return Intrinsics.a(this.W, zjVar.W) && this.X.equals(zjVar.X) && Intrinsics.a(this.Y, zjVar.Y) && this.Z == zjVar.Z;
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + (this.W.hashCode() * 31)) * 31;
        pxh pxhVar = this.Y;
        return Boolean.hashCode(this.Z) + ((iHashCode + (pxhVar == null ? 0 : pxhVar.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
