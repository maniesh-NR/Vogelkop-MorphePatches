package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ztg extends qkj {

    @NotNull
    public static final Parcelable.Creator<ztg> CREATOR = new kuf((byte) 25);

    public ztg() {
        super(new vql(new rxh(2132019180), 2), new wwd(new rxh(2132019179), 2), new rxh(2132019218), null, 24);
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
