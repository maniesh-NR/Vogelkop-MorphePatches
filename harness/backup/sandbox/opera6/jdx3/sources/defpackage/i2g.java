package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i2g extends j2g {

    @NotNull
    public static final Parcelable.Creator<i2g> CREATOR = new kuf((byte) 8);
    public final String c;
    public final String d;

    public i2g(String str, String str2) {
        super(str, false);
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2g)) {
            return false;
        }
        i2g i2gVar = (i2g) obj;
        return Intrinsics.a(this.c, i2gVar.c) && Intrinsics.a(this.d, i2gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
