package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class eug extends qkj {

    @NotNull
    public static final Parcelable.Creator<eug> CREATOR = new kuf((byte) 28);

    public eug() {
        super(new vql(new rxh(2132019182), 2), new wwd(new rxh(2132019181), 2), new rxh(2132019218), null, 24);
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
