package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ytg extends qkj {

    @NotNull
    public static final Parcelable.Creator<ytg> CREATOR = new kuf((byte) 24);

    public ytg() {
        super(new vql(new rxh(2132019203), 2), new wwd(new rxh(2132019175), 2), new rxh(2132019218), null, 24);
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
