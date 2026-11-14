package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.leanplum.internal.ResourceQualifiers;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class st implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<st> CREATOR = new n2((byte) 9);
    public final pxh a;
    public final String b;
    public final String c;
    public final Integer d;
    public final ht e;
    public final Set f;
    public final String g;
    public final String h;
    public final Long i;
    public final rt j;
    public final boolean k;
    public Bitmap l;

    public /* synthetic */ st(pxh pxhVar, String str, String str2, Integer num, ht htVar, Set set, String str3, String str4, int i) {
        this(pxhVar, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, htVar, (i & 32) != 0 ? null : set, (i & 64) != 0 ? str : str3, (i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? null : str4, (Long) null);
    }

    public st(pxh pxhVar, String str, String str2, Integer num, ht htVar, Set set, String str3, String str4, Long l) {
        this.a = pxhVar;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = htVar;
        this.f = set;
        this.g = str3;
        this.h = str4;
        this.i = l;
        this.j = new rt(str, htVar);
        this.k = l != null;
    }

    public static st a(st stVar, Long l) {
        pxh pxhVar = stVar.a;
        String str = stVar.b;
        String str2 = stVar.c;
        Integer num = stVar.d;
        ht htVar = stVar.e;
        Set set = stVar.f;
        String str3 = stVar.g;
        Bitmap bitmap = stVar.l;
        st stVar2 = new st(pxhVar, str, str2, num, htVar, set, str3, stVar.h, l);
        stVar2.l = bitmap;
        return stVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return Intrinsics.a(this.a, stVar.a) && Intrinsics.a(this.b, stVar.b) && Intrinsics.a(this.c, stVar.c) && Intrinsics.a(this.d, stVar.d) && this.e == stVar.e && Intrinsics.a(this.f, stVar.f) && Intrinsics.a(this.g, stVar.g) && Intrinsics.a(this.h, stVar.h) && Intrinsics.a(this.i, stVar.i);
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Set set = this.f;
        int iF2 = z1m.f((iHashCode2 + (set == null ? 0 : set.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode3 = (iF2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.i;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.e.name());
        Set set = this.f;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(((kq8) it.next()).name());
            }
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        Long l = this.i;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
