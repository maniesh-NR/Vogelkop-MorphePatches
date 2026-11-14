package defpackage;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.opera.android.browser.Referrer$Policy;

/* loaded from: classes.dex */
public final class sqh implements Parcelable {
    public static final Parcelable.Creator<sqh> CREATOR = new zug(7);
    public final String a;
    public final Referrer$Policy b;

    public sqh(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (Referrer$Policy) (Build.VERSION.SDK_INT >= 33 ? t8.O(parcel) : parcel.readSerializable());
    }

    public sqh(String str, Referrer$Policy referrer$Policy) {
        this.a = str;
        this.b = referrer$Policy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
    }
}
