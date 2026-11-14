package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class bya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new cya((fya) kfo.b0(parcel, cya.class.getClassLoader(), fya.class), parcel.readInt(), parcel.readValue(cya.class.getClassLoader()), parcel.readValue(cya.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new cya[i];
    }
}
