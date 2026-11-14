package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class aug extends qkj {

    @NotNull
    public static final Parcelable.Creator<aug> CREATOR = new kuf((byte) 26);

    public aug() {
        super(new vql(new rxh(2132019165), 2), new wwd(new rxh(2132019164), 2), new rxh(2132020924), new rxh(2132018111), 16);
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
