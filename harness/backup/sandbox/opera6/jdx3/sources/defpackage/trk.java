package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class trk extends b63 {

    @NotNull
    public static final Parcelable.Creator<trk> CREATOR = new l7k((byte) 4);

    public trk() {
        super(new vql((rxh) null, 3), new wwd(null, 3), new qxh(""), new qxh(""), 2132083343);
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
