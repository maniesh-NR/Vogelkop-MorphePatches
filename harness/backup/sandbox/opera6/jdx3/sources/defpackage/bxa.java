package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class bxa implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<bxa> CREATOR = new uz8((byte) 25);
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public bxa(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxa)) {
            return false;
        }
        bxa bxaVar = (bxa) obj;
        return this.a == bxaVar.a && this.b == bxaVar.b && this.c == bxaVar.c && this.d == bxaVar.d && this.e == bxaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fki.k(fki.k(fki.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
