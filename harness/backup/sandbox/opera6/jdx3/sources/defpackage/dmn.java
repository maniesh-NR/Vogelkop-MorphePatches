package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class dmn implements n37 {

    @NotNull
    public static final Parcelable.Creator<dmn> CREATOR = new l7k((byte) 23);
    public final wln a;
    public final cmn b;

    public dmn(wln wlnVar, cmn cmnVar) {
        this.a = wlnVar;
        this.b = cmnVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmn)) {
            return false;
        }
        dmn dmnVar = (dmn) obj;
        return this.a == dmnVar.a && Intrinsics.a(this.b, dmnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
    }
}
