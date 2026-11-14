package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class cmn implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<cmn> CREATOR = new l7k((byte) 22);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public cmn(String str, int i, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public /* synthetic */ cmn(String str, String str2, int i, int i2, boolean z) {
        this((i2 & 1) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str2, (i2 & 8) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmn)) {
            return false;
        }
        cmn cmnVar = (cmn) obj;
        return Intrinsics.a(this.a, cmnVar.a) && Intrinsics.a(this.b, cmnVar.b) && this.c == cmnVar.c && this.d == cmnVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + rfp.c(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
