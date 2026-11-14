package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class bug extends qkj {

    @NotNull
    public static final Parcelable.Creator<bug> CREATOR = new kuf((byte) 27);

    public bug() {
        super(new vql(new rxh(2132019172), 2), new wwd(new rxh(2132019171), 2), new rxh(2132020155), new rxh(2132019231), 16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
