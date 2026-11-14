package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class zug implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zug(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        Bundle bundleCreateBundle = null;
        eta etaVar = null;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return new avg();
            case 1:
                return new xyg(oba.CREATOR.createFromParcel(parcel));
            case 2:
                n8g n8gVarValueOf = n8g.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new s5h(n8gVarValueOf, z2, parcel.readInt(), nil.valueOf(parcel.readString()), parcel.readInt() == 0 ? z : true, parcel.readInt() != 0 ? n8g.valueOf(parcel.readString()) : null);
            case 3:
                return new zih(parcel);
            case 4:
                return new yjh(parcel.readInt(), parcel.readFloat());
            case 5:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 6:
                parcel.readInt();
                return new jnh();
            case 7:
                return new sqh(parcel);
            case 8:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new rth(bundleCreateBundle);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new duh(parcel.readString());
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                parcel.readInt();
                return new euh();
            case 11:
                return new tvh(parcel);
            case 12:
                return new qxh((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            case 13:
                return new rxh(parcel.readInt());
            case 14:
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 != i2; i3++) {
                    objArr[i3] = parcel.readValue(sxh.class.getClassLoader());
                }
                return new sxh(i, objArr);
            case 15:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Object[] objArr2 = new Object[i6];
                for (int i7 = 0; i7 != i6; i7++) {
                    objArr2[i7] = parcel.readValue(txh.class.getClassLoader());
                }
                return new txh(objArr2, i4, i5);
            case 16:
                w0i w0iVar = new w0i();
                IBinder strongBinder = parcel.readStrongBinder();
                int i8 = v0i.b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(eta.fp);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eta)) {
                        dta dtaVar = new dta();
                        dtaVar.a = strongBinder;
                        etaVar = dtaVar;
                    } else {
                        etaVar = (eta) iInterfaceQueryLocalInterface;
                    }
                }
                w0iVar.a = etaVar;
                return w0iVar;
            case 17:
                return new n3i((p4i) parcel.readParcelable(n3i.class.getClassLoader()));
            case SizeUtil.textSize0_1 /* 18 */:
                return new g4i(o3i.valueOf(parcel.readString()));
            case 19:
                return new p4i(o3i.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case SizeUtil.textSize0 /* 20 */:
                return new t4i((k15) parcel.readParcelable(t4i.class.getClassLoader()), q4i.valueOf(parcel.readString()));
            case 21:
                parcel.readInt();
                return new u7i();
            case SizeUtil.textSize1 /* 22 */:
                return new hsi(oba.CREATOR.createFromParcel(parcel));
            case 23:
                return new xvi(oba.CREATOR.createFromParcel(parcel));
            case SizeUtil.textSize2 /* 24 */:
                parcel.readInt();
                return new e6j();
            case 25:
                parcel.readInt();
                return new t8j();
            case 26:
                boolean z3 = parcel.readInt() == 1;
                long j = parcel.readLong();
                String string = parcel.readString();
                if (z3) {
                    return new kkj(j, string, null, parcel.readInt() == 1);
                }
                return new lkj(j, string, new shf(parcel.readString(), (byte) 13));
            case 27:
                parcel.readInt();
                return new moj();
            case 28:
                z2k z2kVar = new z2k();
                z2kVar.a = parcel.readInt();
                z2kVar.b = parcel.readInt();
                z2kVar.d = parcel.readInt() == 1;
                int i9 = parcel.readInt();
                if (i9 > 0) {
                    int[] iArr = new int[i9];
                    z2kVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return z2kVar;
            default:
                a3k a3kVar = new a3k();
                a3kVar.a = parcel.readInt();
                a3kVar.b = parcel.readInt();
                int i10 = parcel.readInt();
                a3kVar.c = i10;
                if (i10 > 0) {
                    int[] iArr2 = new int[i10];
                    a3kVar.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i11 = parcel.readInt();
                a3kVar.e = i11;
                if (i11 > 0) {
                    int[] iArr3 = new int[i11];
                    a3kVar.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                a3kVar.h = parcel.readInt() == 1;
                a3kVar.i = parcel.readInt() == 1;
                a3kVar.j = parcel.readInt() == 1;
                a3kVar.g = parcel.readArrayList(z2k.class.getClassLoader());
                return a3kVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new avg[i];
            case 1:
                return new xyg[i];
            case 2:
                return new s5h[i];
            case 3:
                return new zih[i];
            case 4:
                return new yjh[i];
            case 5:
                return new RatingCompat[i];
            case 6:
                return new jnh[i];
            case 7:
                return new sqh[i];
            case 8:
                return new rth[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new duh[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new euh[i];
            case 11:
                return new tvh[i];
            case 12:
                return new qxh[i];
            case 13:
                return new rxh[i];
            case 14:
                return new sxh[i];
            case 15:
                return new txh[i];
            case 16:
                return new w0i[i];
            case 17:
                return new n3i[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new g4i[i];
            case 19:
                return new p4i[i];
            case SizeUtil.textSize0 /* 20 */:
                return new t4i[i];
            case 21:
                return new u7i[i];
            case SizeUtil.textSize1 /* 22 */:
                return new hsi[i];
            case 23:
                return new xvi[i];
            case SizeUtil.textSize2 /* 24 */:
                return new e6j[i];
            case 25:
                return new t8j[i];
            case 26:
                return new jkj[i];
            case 27:
                return new moj[i];
            case 28:
                return new z2k[i];
            default:
                return new a3k[i];
        }
    }
}
