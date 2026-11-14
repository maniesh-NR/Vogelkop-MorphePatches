package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f2n;
import defpackage.g2n;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new kuf((byte) 1);
    public final g2n a;

    public ParcelImpl(Parcel parcel) {
        this.a = new f2n(parcel).h();
    }

    public ParcelImpl(g2n g2nVar) {
        this.a = g2nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new f2n(parcel).l(this.a);
    }
}
