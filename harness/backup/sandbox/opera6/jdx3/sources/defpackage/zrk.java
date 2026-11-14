package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zrk extends jlj {

    @NotNull
    public static final Parcelable.Creator<zrk> CREATOR = new l7k((byte) 6);

    public zrk() {
        super(new vql((pxh) new rxh(2132019371), true), new wwd(new sxh(2132022294, new Object[]{new rxh(2132017591)}), 2), new rxh(2132019218), null, new lxh(2131231912), 24);
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
