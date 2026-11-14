package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.efc;
import defpackage.g2n;
import defpackage.usa;

@SuppressLint({"BanParcelableUsage"})
@Deprecated
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new efc((byte) 19);
    public final Parcelable b;
    public usa c;
    public final Object a = new Object();
    public g2n d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, b bVar) {
        this.b = parcelable;
        this.c = bVar;
    }

    public final usa a() {
        usa usaVar;
        synchronized (this.a) {
            usaVar = this.c;
        }
        return usaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Parcelable parcelable = ((MediaSessionCompat$Token) obj).b;
        Parcelable parcelable2 = this.b;
        if (parcelable2 == null) {
            return parcelable == null;
        }
        if (parcelable == null) {
            return false;
        }
        return parcelable2.equals(parcelable);
    }

    public final int hashCode() {
        Parcelable parcelable = this.b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
