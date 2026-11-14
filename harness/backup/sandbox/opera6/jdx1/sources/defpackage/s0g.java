package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s0g implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ s0g(byte b) {
        this.a = b;
    }

    public static t0g a(Parcel parcel, ClassLoader classLoader) {
        ujp ujpVar;
        if (classLoader == null) {
            classLoader = s0g.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            ujpVar = qs7.g;
        } else if (i == 1) {
            ujpVar = zpa.k;
        } else {
            if (i != 2) {
                qp2.n(p3p.i(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            ujpVar = ujp.n;
        }
        return new t0g(value, ujpVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return g3.b;
                }
                qp2.n("superState must be null");
                return null;
            case 2:
                return new gv4(parcel, (ClassLoader) null);
            case 3:
                return new hk8(parcel, (ClassLoader) null);
            case 4:
                return new edd(parcel, (ClassLoader) null);
            case 5:
                return new flf(parcel, (ClassLoader) null);
            case 6:
                return new qph(parcel, null);
            case 7:
                return new sij(parcel, (ClassLoader) null);
            default:
                return new tsl(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return g3.b;
                }
                qp2.n("superState must be null");
                return null;
            case 2:
                return new gv4(parcel, classLoader);
            case 3:
                return new hk8(parcel, classLoader);
            case 4:
                return new edd(parcel, classLoader);
            case 5:
                return new flf(parcel, classLoader);
            case 6:
                return new qph(parcel, classLoader);
            case 7:
                return new sij(parcel, classLoader);
            default:
                return new tsl(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t0g[i];
            case 1:
                return new g3[i];
            case 2:
                return new gv4[i];
            case 3:
                return new hk8[i];
            case 4:
                return new edd[i];
            case 5:
                return new flf[i];
            case 6:
                return new qph[i];
            case 7:
                return new sij[i];
            default:
                return new tsl[i];
        }
    }
}
