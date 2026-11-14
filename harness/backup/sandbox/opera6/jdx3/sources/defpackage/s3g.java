package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s3g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<s3g> CREATOR = new kuf((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public s3g(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3g)) {
            return false;
        }
        s3g s3gVar = (s3g) obj;
        return Intrinsics.a(this.a, s3gVar.a) && Intrinsics.a(this.b, s3gVar.b) && Intrinsics.a(this.c, s3gVar.c) && Intrinsics.a(this.d, s3gVar.d) && Intrinsics.a(this.e, s3gVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = z1m.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
