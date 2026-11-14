package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class cya implements Parcelable {

    @NotNull
    public static final bya CREATOR = new bya();
    public final fya a;
    public final int b;
    public final Object c;
    public final Object d;

    public cya(fya fyaVar, int i, Object obj, Object obj2) {
        this.a = fyaVar;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cya)) {
            return false;
        }
        cya cyaVar = (cya) obj;
        return Intrinsics.a(this.a, cyaVar.a) && this.b == cyaVar.b && Intrinsics.a(this.c, cyaVar.c) && Intrinsics.a(this.d, cyaVar.d);
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, this.a.hashCode() * 31, 31);
        Object obj = this.c;
        int iHashCode = (iC + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
    }
}
