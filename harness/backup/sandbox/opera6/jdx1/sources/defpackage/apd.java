package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class apd implements Parcelable {
    public static final Parcelable.Creator<apd> CREATOR = new efc((byte) 18);
    public final MediaSession.Token b;
    public tsa c;
    public final Object a = new Object();
    public g2n d = null;

    public apd(MediaSession.Token token, tsa tsaVar) {
        this.b = token;
        this.c = tsaVar;
    }

    public final tsa a() {
        tsa tsaVar;
        synchronized (this.a) {
            tsaVar = this.c;
        }
        return tsaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof apd) {
            return this.b.equals(((apd) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
