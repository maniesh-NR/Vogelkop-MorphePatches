package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s4g extends jlj {

    @NotNull
    public static final Parcelable.Creator<s4g> CREATOR = new kuf((byte) 11);

    public s4g() {
        super(new vql((pxh) new rxh(2132020316), true), new wwd(new rxh(2132020315), 2), new rxh(2132020202), new rxh(2132020043), new lxh(2131232311), 16);
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
