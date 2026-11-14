package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class jt1 extends jlj {

    @NotNull
    public static final Parcelable.Creator<jt1> CREATOR = new n2((byte) 17);
    public final int h;

    public jt1(int i) {
        super(new vql((pxh) new rxh(2132017588), true), new wwd(new sxh(2132017587, new Object[]{new rxh(2132017591)}), 2), new rxh(2132017589), null, new lxh(i), 24);
        this.h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
    }
}
