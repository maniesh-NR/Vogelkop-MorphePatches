package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class vz8 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<vz8> CREATOR = new uz8(0);
    public final AutofillId a;
    public final x09 b;
    public final nf2 c;
    public final p09 d;
    public final boolean e;

    public vz8(AutofillId autofillId, x09 x09Var, nf2 nf2Var, p09 p09Var, boolean z) {
        this.a = autofillId;
        this.b = x09Var;
        this.c = nf2Var;
        this.d = p09Var;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz8)) {
            return false;
        }
        vz8 vz8Var = (vz8) obj;
        return Intrinsics.a(this.a, vz8Var.a) && Intrinsics.a(this.b, vz8Var.b) && this.c == vz8Var.c && this.d == vz8Var.d && this.e == vz8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
