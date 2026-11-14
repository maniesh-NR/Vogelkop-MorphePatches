package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p4i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<p4i> CREATOR = new zug((byte) 19);
    public final o3i a;
    public final String b;
    public final boolean c;

    public p4i(o3i o3iVar, String str, boolean z) {
        this.a = o3iVar;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4i)) {
            return false;
        }
        p4i p4iVar = (p4i) obj;
        return this.a == p4iVar.a && Intrinsics.a(this.b, p4iVar.b) && this.c == p4iVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
