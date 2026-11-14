package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.opera.android.bookmarks.c;

/* loaded from: classes.dex */
public abstract class jkj implements al3, Parcelable {
    public static final Parcelable.Creator<jkj> CREATOR = new zug((byte) 26);
    public final long a;
    public final String b;
    public final boolean c;

    public jkj(long j, boolean z, String str) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public static jkj j(al3 al3Var) {
        if (al3Var.g()) {
            ml3 ml3Var = (ml3) al3Var;
            return kkj.k(ml3Var, ml3Var.getTitle(), ml3Var.b());
        }
        pl3 pl3Var = (pl3) al3Var;
        return new lkj(pl3Var.getId(), pl3Var.getTitle(), pl3Var.getUrl());
    }

    @Override // defpackage.al3
    public final ml3 a(c cVar) {
        if (equals(cVar)) {
            return null;
        }
        return alo.H(this, cVar);
    }

    @Override // defpackage.al3
    public boolean c(zk3 zk3Var) {
        return zk3Var.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.al3
    public final boolean e(ml3 ml3Var) {
        return alo.H(this, ml3Var) != null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof al3) && this.a == ((al3) obj).getId();
        }
        return true;
    }

    @Override // defpackage.ol3
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.al3
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.al3
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return (int) this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
    }
}
