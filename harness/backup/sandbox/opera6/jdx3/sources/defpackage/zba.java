package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zba implements Parcelable {

    @NotNull
    public static final vba CREATOR = new vba();
    public final ArrayList a;
    public final nrl b;
    public int c;

    public zba() {
        this.b = new nrl();
        this.c = -1;
        this.a = new ArrayList(0);
    }

    public zba(Parcel parcel) {
        this.b = new nrl();
        this.c = -1;
        this.a = parcel.createTypedArrayList(xba.CREATOR);
        this.c = parcel.readInt();
    }

    public final void a(xba xbaVar) {
        nrl nrlVar = this.b;
        if (nrlVar.a) {
            return;
        }
        while (true) {
            int i = this.c;
            ArrayList arrayList = this.a;
            if (i == arrayList.size() - 1) {
                arrayList.add(xbaVar);
                this.c++;
                nrlVar.A();
                return;
            }
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeInt(this.c);
    }
}
