package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class sjc implements r3g {

    @NotNull
    public static final Parcelable.Creator<sjc> CREATOR = new efc((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public sjc(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof sjc)) {
            return false;
        }
        sjc sjcVar = (sjc) obj;
        return Intrinsics.a(this.a, sjcVar.a) && Intrinsics.a(this.b, sjcVar.b) && Intrinsics.a(this.c, sjcVar.c) && Intrinsics.a(this.d, sjcVar.d) && Intrinsics.a(this.e, sjcVar.e) && Intrinsics.a(this.f, sjcVar.f);
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
