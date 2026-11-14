package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import com.leanplum.utils.SizeUtil;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class n2 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashSet linkedHashSet;
        st[] stVarArr = null;
        int i = 0;
        switch (this.a) {
            case 0:
                return new o2(oba.CREATOR.createFromParcel(parcel));
            case 1:
                return new j9(oba.CREATOR.createFromParcel(parcel));
            case 2:
                return new oh(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 3:
                parcel.readInt();
                return ij.a;
            case 4:
                parcel.readInt();
                return vj.a;
            case 5:
                return new qk(oba.CREATOR.createFromParcel(parcel));
            case 6:
                ts tsVarCreateFromParcel = parcel.readInt() == 0 ? null : ts.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i2 = parcel.readInt();
                    st[] stVarArr2 = new st[i2];
                    while (i != i2) {
                        stVarArr2[i] = st.CREATOR.createFromParcel(parcel);
                        i++;
                    }
                    stVarArr = stVarArr2;
                }
                return new qs(tsVarCreateFromParcel, stVarArr);
            case 7:
                return new ts(kq8.valueOf(parcel.readString()));
            case 8:
                parcel.readInt();
                return new ys();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                pxh pxhVar = (pxh) parcel.readParcelable(st.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ht htVarValueOf = ht.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i3 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                    while (i != i3) {
                        linkedHashSet2.add(kq8.valueOf(parcel.readString()));
                        i++;
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new st(pxhVar, string, string2, numValueOf, htVarValueOf, linkedHashSet, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new ku((j2g) parcel.readParcelable(ku.class.getClassLoader()), parcel.readInt() != 0);
            case 11:
                int i4 = parcel.readInt();
                vz8[] vz8VarArr = new vz8[i4];
                while (i != i4) {
                    vz8VarArr[i] = parcel.readParcelable(rw.class.getClassLoader());
                    i++;
                }
                return new rw(vz8VarArr, (j2g) parcel.readParcelable(rw.class.getClassLoader()));
            case 12:
                return new tw(oba.CREATOR.createFromParcel(parcel));
            case 13:
                parcel.readInt();
                return new d01();
            case 14:
                oq1 oq1Var = new oq1(parcel);
                oq1Var.a = parcel.readByte() != 0;
                return oq1Var;
            case 15:
                parcel.readInt();
                return new fs1();
            case 16:
                parcel.readInt();
                return new ft1();
            case 17:
                return new jt1(parcel.readInt());
            case SizeUtil.textSize0_1 /* 18 */:
                parcel.readInt();
                return new lt1();
            case 19:
                return new ku1(oba.CREATOR.createFromParcel(parcel));
            case SizeUtil.textSize0 /* 20 */:
                return new ic2(oba.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.readInt();
                return new jp2();
            case SizeUtil.textSize1 /* 22 */:
                parcel.readInt();
                return new lp2();
            case 23:
                return new uq2(parcel.readString());
            case SizeUtil.textSize2 /* 24 */:
                parcel.readInt();
                return new sr2();
            case 25:
                parcel.readInt();
                return new bs2();
            case 26:
                parcel.readInt();
                return new bu2();
            case 27:
                return new b(parcel);
            case 28:
                return new uz2(parcel);
            default:
                n93 n93Var = new n93(parcel);
                n93Var.a = parcel.readFloat();
                n93Var.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                n93Var.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                n93Var.d = parcel.readFloat();
                n93Var.e = parcel.createBooleanArray()[0];
                return n93Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new o2[i];
            case 1:
                return new j9[i];
            case 2:
                return new oh[i];
            case 3:
                return new ij[i];
            case 4:
                return new vj[i];
            case 5:
                return new qk[i];
            case 6:
                return new qs[i];
            case 7:
                return new ts[i];
            case 8:
                return new ys[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new st[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new ku[i];
            case 11:
                return new rw[i];
            case 12:
                return new tw[i];
            case 13:
                return new d01[i];
            case 14:
                return new oq1[i];
            case 15:
                return new fs1[i];
            case 16:
                return new ft1[i];
            case 17:
                return new jt1[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new lt1[i];
            case 19:
                return new ku1[i];
            case SizeUtil.textSize0 /* 20 */:
                return new ic2[i];
            case 21:
                return new jp2[i];
            case SizeUtil.textSize1 /* 22 */:
                return new lp2[i];
            case 23:
                return new uq2[i];
            case SizeUtil.textSize2 /* 24 */:
                return new sr2[i];
            case 25:
                return new bs2[i];
            case 26:
                return new bu2[i];
            case 27:
                return new b[i];
            case 28:
                return new uz2[i];
            default:
                return new n93[i];
        }
    }
}
