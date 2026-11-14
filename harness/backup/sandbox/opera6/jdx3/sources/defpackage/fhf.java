package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class fhf extends qkj {

    @NotNull
    public static final Parcelable.Creator<fhf> CREATOR = new efc((byte) 28);

    public fhf() {
        super(new vql((pxh) new rxh(2132021693), true), new wwd(new rxh(2132021694), 2), new rxh(2132018378), null, 8);
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
