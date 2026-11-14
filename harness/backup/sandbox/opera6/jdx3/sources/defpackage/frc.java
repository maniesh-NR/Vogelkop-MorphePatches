package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class frc extends irc {

    @NotNull
    public static final Parcelable.Creator<frc> CREATOR = new efc((byte) 5);
    public final long a;
    public final boolean b;

    public frc(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frc)) {
            return false;
        }
        frc frcVar = (frc) obj;
        return this.a == frcVar.a && this.b == frcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
