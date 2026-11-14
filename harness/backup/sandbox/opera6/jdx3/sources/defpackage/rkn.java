package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class rkn implements n37 {

    @NotNull
    public static final Parcelable.Creator<rkn> CREATOR = new l7k((byte) 20);
    public final vln a;
    public final Bundle b;

    public rkn(vln vlnVar, Bundle bundle) {
        this.a = vlnVar;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkn)) {
            return false;
        }
        rkn rknVar = (rkn) obj;
        return this.a == rknVar.a && Intrinsics.a(this.b, rknVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bundle bundle = this.b;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeBundle(this.b);
    }
}
