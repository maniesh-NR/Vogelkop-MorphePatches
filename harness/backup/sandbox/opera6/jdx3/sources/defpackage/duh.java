package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class duh extends qkj {

    @NotNull
    public static final Parcelable.Creator<duh> CREATOR = new zug((byte) 9);
    public final String g;

    public duh(String str) {
        super(new vql(new rxh(2132021792), 2), new wwd(new sxh(2132021791, new Object[]{str}), 2), new rxh(2132018535), new rxh(2132018111), 16);
        this.g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
    }
}
