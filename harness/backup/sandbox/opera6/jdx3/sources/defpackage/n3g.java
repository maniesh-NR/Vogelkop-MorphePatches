package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n3g implements r3g {

    @NotNull
    public static final Parcelable.Creator<n3g> CREATOR = new kuf((byte) 9);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public n3g(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // defpackage.r3g
    public final String R0() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3g)) {
            return false;
        }
        n3g n3gVar = (n3g) obj;
        return Intrinsics.a(this.a, n3gVar.a) && Intrinsics.a(this.b, n3gVar.b) && Intrinsics.a(this.c, n3gVar.c) && Intrinsics.a(this.d, n3gVar.d) && Intrinsics.a(this.e, n3gVar.e) && Intrinsics.a(this.f, n3gVar.f);
    }

    @Override // defpackage.r3g
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.r3g
    public final String getPassword() {
        return this.e;
    }

    @Override // defpackage.r3g
    public final String getUrl() {
        return this.f;
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.r3g
    public final String o() {
        return this.c;
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
        parcel.writeString(this.f);
    }
}
