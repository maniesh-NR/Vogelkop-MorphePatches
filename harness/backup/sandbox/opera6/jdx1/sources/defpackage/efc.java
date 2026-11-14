package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import defpackage.efc;

/* loaded from: classes.dex */
public final class efc implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ efc(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        Uri mediaUri = null;
        switch (this.a) {
            case 0:
                ffc ffcVar = new ffc();
                ffcVar.a = parcel.readInt();
                ffcVar.b = parcel.readInt();
                ffcVar.c = parcel.readInt() == 1;
                return ffcVar;
            case 1:
                return new sjc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                parcel.readInt();
                return crc.a;
            case 3:
                return new drc(parcel.readLong());
            case 4:
                return new erc(parcel.readLong(), parcel.readString());
            case 5:
                return new frc(parcel.readLong(), parcel.readInt() != 0);
            case 6:
                return new grc(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 7:
                return new hrc(parcel.readLong());
            case 8:
                return new mrc(parcel.readParcelable(mrc.class.getClassLoader()));
            case 9:
                j2d j2dVar = new j2d(parcel);
                j2dVar.a = parcel.readString();
                j2dVar.c = parcel.readFloat();
                j2dVar.d = parcel.readInt() == 1;
                j2dVar.e = parcel.readString();
                j2dVar.f = parcel.readInt();
                j2dVar.g = parcel.readInt();
                return j2dVar;
            case 10:
                pdd pddVar = new pdd(parcel);
                pddVar.a = ((Integer) parcel.readValue(pdd.class.getClassLoader())).intValue();
                return pddVar;
            case 11:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new efc(11);
                    public final int a;
                    public final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 12:
                MediaDescription mediaDescription = (MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel);
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras == null) {
                    extras = null;
                } else {
                    bpd.v(extras);
                    try {
                        extras.isEmpty();
                    } catch (BadParcelableException unused) {
                        w7d.q("Could not unparcel the data.");
                    }
                }
                if (extras != null) {
                    extras = new Bundle(extras);
                }
                if (extras == null) {
                    bundle = extras;
                } else {
                    Uri uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                    if (uri != null) {
                        if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                            bundle = null;
                            mediaUri = uri;
                        } else {
                            extras.remove("android.support.v4.media.description.MEDIA_URI");
                            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                        }
                    }
                    mediaUri = uri;
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                mid midVar = new mid(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                midVar.j = mediaDescription;
                return midVar;
            case 13:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 14:
                return new xjd(parcel);
            case 15:
                return new MediaMetadataCompat(parcel);
            case 16:
                return new zod(parcel);
            case 17:
                return new MediaSessionCompat$QueueItem(parcel);
            case 18:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new apd(token, null);
            case 19:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 20:
                return new brd((oba) oba.CREATOR.createFromParcel(parcel));
            case 21:
                return i9e.a(parcel.readInt(), parcel.readInt());
            case 22:
                jle jleVar = new jle(parcel);
                jleVar.a = parcel.readInt();
                return jleVar;
            case 23:
                return new qse(parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
            case 24:
                return new xse(parcel.readInt());
            case 25:
                parcel.readInt();
                return new swe();
            case 26:
                return new exe(parcel.readInt() != 0, (oba) oba.CREATOR.createFromParcel(parcel));
            case 27:
                return new x2f((oba) oba.CREATOR.createFromParcel(parcel));
            case 28:
                parcel.readInt();
                return new fhf();
            default:
                int i = parcel.readInt();
                vz8[] vz8VarArr = new vz8[i];
                for (int i2 = 0; i2 != i; i2++) {
                    vz8VarArr[i2] = parcel.readParcelable(etf.class.getClassLoader());
                }
                return new etf(vz8VarArr, parcel.readParcelable(etf.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ffc[i];
            case 1:
                return new sjc[i];
            case 2:
                return new crc[i];
            case 3:
                return new drc[i];
            case 4:
                return new erc[i];
            case 5:
                return new frc[i];
            case 6:
                return new grc[i];
            case 7:
                return new hrc[i];
            case 8:
                return new mrc[i];
            case 9:
                return new j2d[i];
            case 10:
                return new pdd[i];
            case 11:
                return new MediaBrowserCompat$MediaItem[i];
            case 12:
                return new mid[i];
            case 13:
                return new MediaDescriptionCompat[i];
            case 14:
                return new xjd[i];
            case 15:
                return new MediaMetadataCompat[i];
            case 16:
                return new zod[i];
            case 17:
                return new MediaSessionCompat$QueueItem[i];
            case 18:
                return new apd[i];
            case 19:
                return new MediaSessionCompat$Token[i];
            case 20:
                return new brd[i];
            case 21:
                return new i9e[i];
            case 22:
                return new jle[i];
            case 23:
                return new qse[i];
            case 24:
                return new xse[i];
            case 25:
                return new swe[i];
            case 26:
                return new exe[i];
            case 27:
                return new x2f[i];
            case 28:
                return new fhf[i];
            default:
                return new etf[i];
        }
    }
}
