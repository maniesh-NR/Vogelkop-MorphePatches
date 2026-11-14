package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zod implements Parcelable {
    public static final Parcelable.Creator<zod> CREATOR = new efc((byte) 16);
    public final mid a;
    public final long b;
    public MediaSession.QueueItem c;

    public zod(MediaSession.QueueItem queueItem, mid midVar, long j) {
        if (j == -1) {
            qp2.o("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.a = midVar;
        this.b = j;
        this.c = queueItem;
    }

    public zod(Parcel parcel) {
        this.a = mid.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.a);
        sb.append(", Id=");
        return j7c.o(this.b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }
}
