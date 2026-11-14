package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public final class tvh implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<tvh> CREATOR = new zug((byte) 11);
    public String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public tvh() {
    }

    public tvh(Parcel parcel) {
        if (parcel.readByte() == 1) {
            this.a = parcel.readString();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(new lyf(parcel.readString(), parcel.readString()));
        }
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.c.add(new lyf(parcel.readString(), parcel.readString()));
        }
    }

    public final lj9 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            lyf lyfVar = (lyf) obj;
            String str = (String) lyfVar.a;
            String str2 = (String) lyfVar.b;
            arrayList.add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, null, 91, null));
            arrayList2.add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, null, 91, null));
        }
        return new lj9(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        if (this.a != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.a);
        } else {
            parcel.writeByte((byte) 0);
        }
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            lyf lyfVar = (lyf) obj;
            parcel.writeString((String) lyfVar.a);
            parcel.writeString((String) lyfVar.b);
        }
        ArrayList arrayList2 = this.c;
        parcel.writeInt(arrayList2.size());
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            lyf lyfVar2 = (lyf) obj2;
            parcel.writeString((String) lyfVar2.a);
            parcel.writeString((String) lyfVar2.b);
        }
    }
}
