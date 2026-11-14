package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class euh extends qkj {

    @NotNull
    public static final Parcelable.Creator<euh> CREATOR = new zug((byte) 10);

    public euh() {
        super(new vql(new rxh(2132021792), 2), new wwd(new rxh(2132021793), 2), new rxh(2132018535), new rxh(2132018111), 16);
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
