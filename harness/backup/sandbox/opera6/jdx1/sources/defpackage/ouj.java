package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ouj implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static puj a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ouj.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new puj();
        }
        zbg zbgVarM = sqj.c.m();
        for (int i2 = 0; i2 < i; i2++) {
            zbgVarM.add(parcel.readValue(classLoader));
        }
        return new puj(zbgVarM.h());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new nq3(parcel, (ClassLoader) null);
            case 2:
                return new sv5(parcel, (ClassLoader) null);
            case 3:
                return new uk9(parcel, null);
            case 4:
                return new kjf(parcel, (ClassLoader) null);
            case 5:
                return new u0g(parcel, (ClassLoader) null);
            case 6:
                return new jti(parcel, null);
            default:
                return new zil(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new nq3(parcel, classLoader);
            case 2:
                return new sv5(parcel, classLoader);
            case 3:
                return new uk9(parcel, classLoader);
            case 4:
                return new kjf(parcel, classLoader);
            case 5:
                return new u0g(parcel, classLoader);
            case 6:
                return new jti(parcel, classLoader);
            default:
                return new zil(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new puj[i];
            case 1:
                return new nq3[i];
            case 2:
                return new sv5[i];
            case 3:
                return new uk9[i];
            case 4:
                return new kjf[i];
            case 5:
                return new u0g[i];
            case 6:
                return new jti[i];
            default:
                return new zil[i];
        }
    }
}
