package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a27 extends qkj {

    @NotNull
    public static final Parcelable.Creator<a27> CREATOR = new hh3((byte) 15);
    public final String g;

    public a27(String str) {
        super(null, new wwd(new sxh(2132020312, new Object[]{str}), 2), new rxh(2132018535), new rxh(2132018111), 17);
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
