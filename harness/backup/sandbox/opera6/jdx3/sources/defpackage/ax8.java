package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ax8 implements Parcelable {
    public static final Parcelable.Creator<ax8> CREATOR = new hh3((byte) 28);
    public final HashMap a = new HashMap();

    public ax8(Parcel parcel) {
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.a.put(parcel.readString(), parcel.readSparseArray(ax8.class.getClassLoader()));
        }
    }

    public ax8(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zw8 zw8Var = (zw8) obj;
            SparseArray sparseArrayF = zw8Var.c;
            if (sparseArrayF == null) {
                xw8 xw8Var = zw8Var.b;
                sparseArrayF = xw8Var != null ? xw8Var.f() : null;
            }
            if (sparseArrayF != null) {
                this.a.put(zw8Var.a.a(), sparseArrayF);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeSparseArray((SparseArray) entry.getValue());
        }
    }
}
