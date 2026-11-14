package org.chromium.base.process_launcher;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.uz8;
import org.chromium.base.IAndroidInfo;
import org.chromium.base.IApkInfo;
import org.chromium.base.IDeviceInfo;
import org.chromium.base.library_loader.IRelroLibInfo;

/* loaded from: classes.dex */
public class IChildProcessArgs implements Parcelable {
    public static final Parcelable.Creator<IChildProcessArgs> CREATOR = new uz8((byte) 21);
    public IApkInfo a;
    public IAndroidInfo b;
    public String[] e;
    public IDeviceInfo h;
    public IFileDescriptorInfo[] i;
    public IRelroLibInfo j;
    public boolean c = false;
    public int d = 0;
    public int f = 0;
    public long g = 0;
    public int k = 0;

    public static int a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                int iA = 0;
                for (Object obj2 : (Object[]) obj) {
                    iA |= a(obj2);
                }
                return iA;
            }
            if (obj instanceof Parcelable) {
                return ((Parcelable) obj).describeContents();
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return a(this.a) | a(this.b) | a(this.h) | a(this.i) | a(this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        lcp.N(parcel, this.a, i);
        lcp.N(parcel, this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeStringArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        lcp.N(parcel, this.h, i);
        parcel.writeTypedArray(this.i, i);
        lcp.N(parcel, this.j, i);
        parcel.writeInt(this.k);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
