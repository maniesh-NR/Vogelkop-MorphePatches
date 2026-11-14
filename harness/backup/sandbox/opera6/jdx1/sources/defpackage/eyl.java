package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class eyl {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final oj9[] d;
    public int e;

    static {
        String str = tym.a;
        f = "0";
        g = "1";
    }

    public eyl(String str, oj9... oj9VarArr) {
        z4o.w(oj9VarArr.length > 0);
        this.b = str;
        this.d = oj9VarArr;
        this.a = oj9VarArr.length;
        String str2 = oj9VarArr[0].n;
        this.c = TextUtils.isEmpty(str2) ? dzd.i(oj9VarArr[0].m) : dzd.i(str2);
        String str3 = oj9VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = oj9VarArr[0].f | 16384;
        for (int i2 = 1; i2 < oj9VarArr.length; i2++) {
            String str4 = oj9VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                c(i2, "languages", oj9VarArr[0].d, oj9VarArr[i2].d);
                return;
            } else {
                if (i != (oj9VarArr[i2].f | 16384)) {
                    c(i2, "role flags", Integer.toBinaryString(oj9VarArr[0].f), Integer.toBinaryString(oj9VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static eyl a(Bundle bundle) {
        csh cshVarH;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            a1b a1bVar = h1b.b;
            cshVarH = csh.e;
        } else {
            cshVarH = j14.H(new bql((byte) 1), parcelableArrayList);
        }
        return new eyl(bundle.getString(g, ""), (oj9[]) cshVarH.toArray(new oj9[0]));
    }

    public static void c(int i, String str, String str2, String str3) {
        StringBuilder sbN = z1m.n("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbN.append(str3);
        sbN.append("' (track ");
        sbN.append(i);
        sbN.append(")");
        w7d.r("", new IllegalStateException(sbN.toString()));
    }

    public final int b(oj9 oj9Var) {
        int i = 0;
        while (true) {
            oj9[] oj9VarArr = this.d;
            if (i >= oj9VarArr.length) {
                return -1;
            }
            if (oj9Var == oj9VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        oj9[] oj9VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(oj9VarArr.length);
        int length = oj9VarArr.length;
        int i = 0;
        while (i < length) {
            oj9 oj9Var = oj9VarArr[i];
            List list = oj9Var.q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(oj9.R, oj9Var.a);
            bundle2.putString(oj9.S, oj9Var.b);
            String str = oj9.w0;
            h1b h1bVar = oj9Var.c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(h1bVar.size());
            int size = h1bVar.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = h1bVar.get(i2);
                i2++;
                jzb jzbVar = (jzb) obj;
                jzbVar.getClass();
                Bundle bundle3 = new Bundle();
                oj9[] oj9VarArr2 = oj9VarArr;
                String str2 = jzbVar.a;
                int i3 = length;
                if (str2 != null) {
                    bundle3.putString(jzb.c, str2);
                }
                bundle3.putString(jzb.d, jzbVar.b);
                arrayList2.add(bundle3);
                oj9VarArr = oj9VarArr2;
                length = i3;
            }
            oj9[] oj9VarArr3 = oj9VarArr;
            int i4 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(oj9.T, oj9Var.d);
            bundle2.putInt(oj9.U, oj9Var.e);
            bundle2.putInt(oj9.V, oj9Var.f);
            int i5 = oj9Var.g;
            if (i5 != oj9.Q.g) {
                bundle2.putInt(oj9.x0, i5);
            }
            bundle2.putInt(oj9.W, oj9Var.h);
            bundle2.putInt(oj9.X, oj9Var.i);
            bundle2.putString(oj9.Y, oj9Var.k);
            bundle2.putString(oj9.Z, oj9Var.m);
            bundle2.putString(oj9.a0, oj9Var.n);
            bundle2.putInt(oj9.b0, oj9Var.o);
            for (int i6 = 0; i6 < list.size(); i6++) {
                bundle2.putByteArray(oj9.c0 + "_" + Integer.toString(i6, 36), (byte[]) list.get(i6));
            }
            bundle2.putParcelable(oj9.d0, oj9Var.r);
            bundle2.putLong(oj9.e0, oj9Var.s);
            bundle2.putInt(oj9.f0, oj9Var.u);
            bundle2.putInt(oj9.g0, oj9Var.v);
            bundle2.putInt(oj9.z0, oj9Var.w);
            bundle2.putInt(oj9.A0, oj9Var.x);
            bundle2.putFloat(oj9.h0, oj9Var.y);
            bundle2.putInt(oj9.i0, oj9Var.z);
            bundle2.putFloat(oj9.j0, oj9Var.A);
            bundle2.putByteArray(oj9.k0, oj9Var.B);
            bundle2.putInt(oj9.l0, oj9Var.C);
            ja5 ja5Var = oj9Var.D;
            if (ja5Var != null) {
                String str3 = oj9.m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(ja5.i, ja5Var.a);
                bundle4.putInt(ja5.j, ja5Var.b);
                bundle4.putInt(ja5.k, ja5Var.c);
                bundle4.putByteArray(ja5.l, ja5Var.d);
                bundle4.putInt(ja5.m, ja5Var.e);
                bundle4.putInt(ja5.n, ja5Var.f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(oj9.y0, oj9Var.E);
            bundle2.putInt(oj9.n0, oj9Var.F);
            bundle2.putInt(oj9.o0, oj9Var.G);
            bundle2.putInt(oj9.p0, oj9Var.H);
            bundle2.putInt(oj9.q0, oj9Var.I);
            bundle2.putInt(oj9.r0, oj9Var.J);
            bundle2.putInt(oj9.s0, oj9Var.K);
            bundle2.putInt(oj9.u0, oj9Var.M);
            bundle2.putInt(oj9.v0, oj9Var.N);
            bundle2.putInt(oj9.t0, oj9Var.O);
            arrayList.add(bundle2);
            i++;
            oj9VarArr = oj9VarArr3;
            length = i4;
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eyl.class == obj.getClass()) {
            eyl eylVar = (eyl) obj;
            if (this.b.equals(eylVar.b) && Arrays.equals(this.d, eylVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.d) + z1m.f(527, 31, this.b);
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
