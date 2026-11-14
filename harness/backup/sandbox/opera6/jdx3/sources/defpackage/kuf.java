package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class kuf implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new luf(Bitmap.CompressFormat.valueOf(parcel.readString()), parcel.readInt(), (Point) parcel.readParcelable(luf.class.getClassLoader()), parcel.readString(), parcel.readString(), qnn.CREATOR.createFromParcel(parcel));
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new p0g(parcel.readFloat());
            case 3:
                return new q0g(parcel.readInt());
            case 4:
                return new r0g(parcel.readLong());
            case 5:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 6:
                return new g2g(parcel.readString());
            case 7:
                return new h2g(parcel.readString(), sq2.valueOf(parcel.readString()));
            case 8:
                return new i2g(parcel.readString(), parcel.readString());
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new n3g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new s3g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.readInt();
                return new s4g();
            case 12:
                parcel.readInt();
                return new o5g();
            case 13:
                return new a6g(oba.CREATOR.createFromParcel(parcel));
            case 14:
                return new c9g(parcel.readString());
            case 15:
                return new fcg(oba.CREATOR.createFromParcel(parcel));
            case 16:
                return new vhg(parcel);
            case 17:
                return new PlaybackStateCompat(parcel);
            case SizeUtil.textSize0_1 /* 18 */:
                return new uhg(parcel);
            case 19:
                return new ltg(parcel.readString(), parcel.readString(), parcel.readString());
            case SizeUtil.textSize0 /* 20 */:
                parcel.readInt();
                return new mtg();
            case 21:
                parcel.readInt();
                return new ntg();
            case SizeUtil.textSize1 /* 22 */:
                parcel.readInt();
                return new otg();
            case 23:
                return new ptg(parcel.readInt(), ltg.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
            case SizeUtil.textSize2 /* 24 */:
                parcel.readInt();
                return new ytg();
            case 25:
                parcel.readInt();
                return new ztg();
            case 26:
                parcel.readInt();
                return new aug();
            case 27:
                parcel.readInt();
                return new bug();
            case 28:
                parcel.readInt();
                return new eug();
            default:
                parcel.readInt();
                return new gug();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new luf[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new p0g[i];
            case 3:
                return new q0g[i];
            case 4:
                return new r0g[i];
            case 5:
                return new ParcelableVolumeInfo[i];
            case 6:
                return new g2g[i];
            case 7:
                return new h2g[i];
            case 8:
                return new i2g[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new n3g[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new s3g[i];
            case 11:
                return new s4g[i];
            case 12:
                return new o5g[i];
            case 13:
                return new a6g[i];
            case 14:
                return new c9g[i];
            case 15:
                return new fcg[i];
            case 16:
                return new vhg[i];
            case 17:
                return new PlaybackStateCompat[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new uhg[i];
            case 19:
                return new ltg[i];
            case SizeUtil.textSize0 /* 20 */:
                return new mtg[i];
            case 21:
                return new ntg[i];
            case SizeUtil.textSize1 /* 22 */:
                return new otg[i];
            case 23:
                return new ptg[i];
            case SizeUtil.textSize2 /* 24 */:
                return new ytg[i];
            case 25:
                return new ztg[i];
            case 26:
                return new aug[i];
            case 27:
                return new bug[i];
            case 28:
                return new eug[i];
            default:
                return new gug[i];
        }
    }
}
