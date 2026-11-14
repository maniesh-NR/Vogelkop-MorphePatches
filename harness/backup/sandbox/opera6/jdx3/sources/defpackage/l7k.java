package defpackage;

import J.N;
import ads_mobile_sdk.cu0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.view.Surface;
import android.view.SurfaceControl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import org.chromium.base.UnguessableToken;
import org.chromium.components.autofill_public.ViewType;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content.common.SurfaceWrapper;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class l7k implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ l7k(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ParcelUuid parcelUuid;
        int i = 0;
        String strCreateString = null;
        switch (this.a) {
            case 0:
                return new m7k(c8j.valueOf(parcel.readString()), oba.CREATOR.createFromParcel(parcel));
            case 1:
                parcel.readInt();
                return new aak();
            case 2:
                return new zfk(parcel);
            case 3:
                return new ork(parcel.readString());
            case 4:
                parcel.readInt();
                return new trk();
            case 5:
                parcel.readInt();
                return new wrk();
            case 6:
                parcel.readInt();
                return new zrk();
            case 7:
                if (parcel.readInt() != 1) {
                    return new SurfaceWrapper((SurfaceControl) SurfaceControl.CREATOR.createFromParcel(parcel));
                }
                boolean z = parcel.readInt() == 1;
                Surface surface = (Surface) Surface.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() == 1;
                return z ? new SurfaceWrapper(surface, z2, SurfaceWrapper.a(parcel)) : new SurfaceWrapper(surface, z2);
            case 8:
                return new awk(parcel);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                parcel.readInt();
                return new oyk();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String string = parcel.readString();
                if (string == null) {
                    return null;
                }
                int iIndexOf = string.indexOf(58);
                if (iIndexOf < 0) {
                    qp2.n("All ids should have prefix");
                    return null;
                }
                String strSubstring = string.substring(0, iIndexOf);
                String strSubstring2 = string.substring(iIndexOf + 1);
                if (strSubstring.equals("address")) {
                    return yv.a(strSubstring2);
                }
                if (strSubstring.equals(Constants.Kinds.STRING)) {
                    return new hhk(strSubstring2);
                }
                qp2.o("Unsupported prefix: ".concat(strSubstring));
                return null;
            case 11:
                return nsl.valueOf(parcel.readString());
            case 12:
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                if (j == 0 || j2 == 0) {
                    return null;
                }
                return new UnguessableToken(j, j2);
            case 13:
                parcel.readInt();
                return new mmm();
            case 14:
                return new j8n(parcel.readInt());
            case 15:
                return new ViewType(parcel);
            case 16:
                parcel.readInt();
                return new odn();
            case 17:
                return new vfn(parcel.readInt(), oba.CREATOR.createFromParcel(parcel));
            case SizeUtil.textSize0_1 /* 18 */:
                min minVar = new min();
                minVar.a = parcel.readLong();
                minVar.b = parcel.createByteArray();
                minVar.c = parcel.readByte() != 0;
                minVar.d = parcel.readByte() != 0;
                return minVar;
            case 19:
                parcel.readInt();
                return new mkn();
            case SizeUtil.textSize0 /* 20 */:
                return new rkn(vln.valueOf(parcel.readString()), parcel.readBundle(rkn.class.getClassLoader()));
            case 21:
                parcel.readInt();
                return new sln();
            case SizeUtil.textSize1 /* 22 */:
                return new cmn(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            case 23:
                return new dmn(wln.valueOf(parcel.readString()), cmn.CREATOR.createFromParcel(parcel));
            case SizeUtil.textSize2 /* 24 */:
                return qnn.valueOf(parcel.readString());
            case 25:
                parcel.readInt();
                return new mon();
            case 26:
                parcel.readInt();
                return new spn();
            case 27:
                Bundle bundle = parcel.readBundle();
                if (bundle == null || bundle.getLong("version", -1L) != 0 || (parcelUuid = (ParcelUuid) bundle.getParcelable("processguard")) == null || WebContentsImpl.n.compareTo(parcelUuid.getUuid()) != 0) {
                    return null;
                }
                return (WebContents) N.M$eaBDjM(bundle.getLong("webcontents"));
            case 28:
                parcel.readInt();
                return new ido();
            default:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header);
                    if (fieldId == 1) {
                        i = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId == 2) {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    } else if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new cu0(i, strCreateString, strCreateString2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m7k[i];
            case 1:
                return new aak[i];
            case 2:
                return new zfk[i];
            case 3:
                return new ork[i];
            case 4:
                return new trk[i];
            case 5:
                return new wrk[i];
            case 6:
                return new zrk[i];
            case 7:
                return new SurfaceWrapper[i];
            case 8:
                return new awk[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new oyk[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new csl[i];
            case 11:
                return new nsl[i];
            case 12:
                return new UnguessableToken[i];
            case 13:
                return new mmm[i];
            case 14:
                return new j8n[i];
            case 15:
                return new ViewType[i];
            case 16:
                return new odn[i];
            case 17:
                return new vfn[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new min[i];
            case 19:
                return new mkn[i];
            case SizeUtil.textSize0 /* 20 */:
                return new rkn[i];
            case 21:
                return new sln[i];
            case SizeUtil.textSize1 /* 22 */:
                return new cmn[i];
            case 23:
                return new dmn[i];
            case SizeUtil.textSize2 /* 24 */:
                return new qnn[i];
            case 25:
                return new mon[i];
            case 26:
                return new spn[i];
            case 27:
                return new WebContents[i];
            case 28:
                return new ido[i];
            default:
                return new cu0[i];
        }
    }
}
