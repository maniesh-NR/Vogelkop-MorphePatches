package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class hu4 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<hu4> CREATOR = new hh3((byte) 6);
    public final long a;
    public final boolean b;
    public final String c;
    public final long d;
    public final String e;
    public final boolean f;

    public hu4(long j, boolean z, String str, long j2, String str2, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu4)) {
            return false;
        }
        hu4 hu4Var = (hu4) obj;
        return this.a == hu4Var.a && this.b == hu4Var.b && Intrinsics.a(this.c, hu4Var.c) && this.d == hu4Var.d && Intrinsics.a(this.e, hu4Var.e) && this.f == hu4Var.f;
    }

    public final int hashCode() {
        int iK = fki.k(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iE = z1m.e((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iE + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
