package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u09 extends x09 {
    public static final u09 a = new u09();

    @NotNull
    public static final Parcelable.Creator<u09> CREATOR = new uz8((byte) 4);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u09);
    }

    public final int hashCode() {
        return 1461521448;
    }

    public final String toString() {
        return "";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
