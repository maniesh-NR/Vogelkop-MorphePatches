package org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.uz8;

/* loaded from: classes.dex */
public class IRelroLibInfo implements Parcelable {
    public static final Parcelable.Creator<IRelroLibInfo> CREATOR = new uz8((byte) 24);
    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public ParcelFileDescriptor f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        ParcelFileDescriptor parcelFileDescriptor = this.f;
        if (parcelFileDescriptor == null) {
            return 0;
        }
        return parcelFileDescriptor.describeContents();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        ParcelFileDescriptor parcelFileDescriptor = this.f;
        if (parcelFileDescriptor != null) {
            parcel.writeInt(1);
            parcelFileDescriptor.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
