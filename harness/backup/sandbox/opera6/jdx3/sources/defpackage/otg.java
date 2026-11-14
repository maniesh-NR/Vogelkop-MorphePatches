package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class otg extends qkj {

    @NotNull
    public static final Parcelable.Creator<otg> CREATOR = new kuf((byte) 22);

    public otg() {
        super(new vql(new rxh(2132019178), 2), new wwd(new rxh(2132019177), 2), new rxh(2132019334), new rxh(2132018111), 16);
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
