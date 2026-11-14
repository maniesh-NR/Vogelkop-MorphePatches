package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class luf implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<luf> CREATOR = new kuf((byte) 0);
    public final Bitmap.CompressFormat a;
    public final int b;
    public final Point c;
    public final String d;
    public final String e;
    public final qnn f;

    public luf(Bitmap.CompressFormat compressFormat, int i, Point point, String str, String str2, qnn qnnVar) {
        this.a = compressFormat;
        this.b = i;
        this.c = point;
        this.d = str;
        this.e = str2;
        this.f = qnnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luf)) {
            return false;
        }
        luf lufVar = (luf) obj;
        return this.a == lufVar.a && this.b == lufVar.b && Intrinsics.a(this.c, lufVar.c) && Intrinsics.a(this.d, lufVar.d) && Intrinsics.a(this.e, lufVar.e) && this.f == lufVar.f;
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, this.a.hashCode() * 31, 31);
        Point point = this.c;
        return this.f.hashCode() + z1m.f(z1m.f((iC + (point == null ? 0 : point.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
    }
}
