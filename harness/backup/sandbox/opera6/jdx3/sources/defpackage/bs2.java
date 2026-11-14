package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class bs2 extends qkj {

    @NotNull
    public static final Parcelable.Creator<bs2> CREATOR = new n2((byte) 25);

    public bs2() {
        super(null, new wwd(new rxh(2132017755), 2), new rxh(2132018535), new rxh(2132018111), 17);
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
