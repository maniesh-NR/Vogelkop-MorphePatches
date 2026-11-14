package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ptg implements n37 {

    @NotNull
    public static final Parcelable.Creator<ptg> CREATOR = new kuf((byte) 23);
    public final int a;
    public final ltg b;
    public final String c;
    public final int d;

    public ptg(int i, ltg ltgVar, String str, int i2) {
        this.a = i;
        this.b = ltgVar;
        this.c = str;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptg)) {
            return false;
        }
        ptg ptgVar = (ptg) obj;
        return this.a == ptgVar.a && Intrinsics.a(this.b, ptgVar.b) && Intrinsics.a(this.c, ptgVar.c) && this.d == ptgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + z1m.f((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }
}
