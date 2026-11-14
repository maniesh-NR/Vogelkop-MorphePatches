package org.chromium.components.autofill_public;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import defpackage.l7k;

/* loaded from: classes.dex */
public class ViewType implements Parcelable {
    public static final Parcelable.Creator<ViewType> CREATOR = new l7k((byte) 15);
    public final AutofillId a;
    public final String b;
    public final String c;
    public final String[] d;

    public ViewType(Parcel parcel) {
        this.a = (AutofillId) AutofillId.CREATOR.createFromParcel(parcel);
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createStringArray();
    }

    public ViewType(AutofillId autofillId, String str, String str2, String[] strArr) {
        this.a = autofillId;
        this.b = str;
        this.c = str2;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringArray(this.d);
    }
}
