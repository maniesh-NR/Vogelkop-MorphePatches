package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public final class hh3 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hh3(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return new ih3();
            case 1:
                return new xl3(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 2:
                return new dy3(oba.CREATOR.createFromParcel(parcel));
            case 3:
                return new n54(parcel.createByteArray());
            case 4:
                return new t84(parcel.readParcelable(i9e.class.getClassLoader()), parcel.readParcelable(i9e.class.getClassLoader()), parcel.readParcelable(gi6.class.getClassLoader()), parcel.readParcelable(i9e.class.getClassLoader()), parcel.readInt());
            case 5:
                return new xk4(oba.CREATOR.createFromParcel(parcel));
            case 6:
                return new hu4(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new k15(parcel.readString(), parcel.readLong(), l15.valueOf(parcel.readString()));
            case 8:
                parcel.readInt();
                return new n35();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i = parcel.readInt();
                vz8[] vz8VarArr = new vz8[i];
                for (int i2 = 0; i2 != i; i2++) {
                    vz8VarArr[i2] = parcel.readParcelable(sp5.class.getClassLoader());
                }
                return new sp5(vz8VarArr, (j2g) parcel.readParcelable(sp5.class.getClassLoader()));
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i3 = parcel.readInt();
                vz8[] vz8VarArr2 = new vz8[i3];
                for (int i4 = 0; i4 != i3; i4++) {
                    vz8VarArr2[i4] = parcel.readParcelable(d16.class.getClassLoader());
                }
                return new d16(vz8VarArr2, (j2g) parcel.readParcelable(d16.class.getClassLoader()));
            case 11:
                int i5 = parcel.readInt();
                vz8[] vz8VarArr3 = new vz8[i5];
                for (int i6 = 0; i6 != i5; i6++) {
                    vz8VarArr3[i6] = parcel.readParcelable(m16.class.getClassLoader());
                }
                return new m16(vz8VarArr3, (j2g) parcel.readParcelable(m16.class.getClassLoader()));
            case 12:
                return new pb6(parcel.readInt() != 0, oba.CREATOR.createFromParcel(parcel));
            case 13:
                return new gi6(parcel.readLong());
            case 14:
                return new yr6(parcel.readInt());
            case 15:
                return new a27(parcel.readString());
            case 16:
                return new vl7(parcel);
            case 17:
                return new ul7(parcel);
            case SizeUtil.textSize0_1 /* 18 */:
                return new zv7(parcel.readInt());
            case 19:
                parcel.readInt();
                return new px7();
            case SizeUtil.textSize0 /* 20 */:
                return new l88(parcel.readString());
            case 21:
                parcel.readInt();
                return m88.a;
            case SizeUtil.textSize1 /* 22 */:
                parcel.readInt();
                return n88.a;
            case 23:
                parcel.readInt();
                return o88.a;
            case SizeUtil.textSize2 /* 24 */:
                parcel.readInt();
                return p88.a;
            case 25:
                parcel.readInt();
                return q88.a;
            case 26:
                parcel.readInt();
                return r88.a;
            case 27:
                parcel.readInt();
                return new zl8();
            case 28:
                return new ax8(parcel);
            default:
                ex8 ex8Var = new ex8(parcel);
                ex8Var.a = parcel.readInt();
                return ex8Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ih3[i];
            case 1:
                return new xl3[i];
            case 2:
                return new dy3[i];
            case 3:
                return new n54[i];
            case 4:
                return new t84[i];
            case 5:
                return new xk4[i];
            case 6:
                return new hu4[i];
            case 7:
                return new k15[i];
            case 8:
                return new n35[i];
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new sp5[i];
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new d16[i];
            case 11:
                return new m16[i];
            case 12:
                return new pb6[i];
            case 13:
                return new gi6[i];
            case 14:
                return new yr6[i];
            case 15:
                return new a27[i];
            case 16:
                return new vl7[i];
            case 17:
                return new ul7[i];
            case SizeUtil.textSize0_1 /* 18 */:
                return new zv7[i];
            case 19:
                return new px7[i];
            case SizeUtil.textSize0 /* 20 */:
                return new l88[i];
            case 21:
                return new m88[i];
            case SizeUtil.textSize1 /* 22 */:
                return new n88[i];
            case 23:
                return new o88[i];
            case SizeUtil.textSize2 /* 24 */:
                return new p88[i];
            case 25:
                return new q88[i];
            case 26:
                return new r88[i];
            case 27:
                return new zl8[i];
            case 28:
                return new ax8[i];
            default:
                return new ex8[i];
        }
    }
}
