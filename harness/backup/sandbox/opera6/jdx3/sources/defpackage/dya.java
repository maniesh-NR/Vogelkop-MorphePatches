package defpackage;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class dya implements Parcelable, Iterable, ptb {

    @NotNull
    public static final aya CREATOR = new aya();
    public final Uri a;
    public final PointF b;
    public final ArrayList c;
    public final ArrayList d;

    public /* synthetic */ dya(Uri uri) {
        this(uri, new PointF());
    }

    public dya(Uri uri, PointF pointF) {
        this.a = uri;
        this.b = pointF;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dya(Parcel parcel) {
        Uri uri = (Uri) kfo.b0(parcel, dya.class.getClassLoader(), Uri.class);
        uri = uri == null ? Uri.EMPTY : uri;
        PointF pointF = (PointF) kfo.b0(parcel, dya.class.getClassLoader(), PointF.class);
        this(uri, pointF == null ? new PointF() : pointF);
        parcel.readTypedList(this.d, fya.CREATOR);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fya) obj).d(new ci7(1, this, dya.class, "notifyChange", "notifyChange(Lcom/opera/hype/image/editor/ImageModel$Change;)V", 0, (byte) 12));
        }
    }

    public final void b(fya fyaVar) {
        ArrayList arrayList = this.d;
        if (arrayList.add(fyaVar)) {
            fyaVar.d(new ci7(1, this, dya.class, "notifyChange", "notifyChange(Lcom/opera/hype/image/editor/ImageModel$Change;)V", 0, (byte) 13));
            int i = 0;
            n95.r(new vd3(new Function1[]{new q9a((byte) 23), new q9a((byte) 24)}, (byte) 1), arrayList);
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((it7) obj).a(fyaVar);
            }
        }
    }

    public final void c(fya fyaVar) {
        if (this.d.remove(fyaVar)) {
            fyaVar.d(null);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((it7) obj).c(fyaVar);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.d.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeTypedList(this.d);
    }
}
