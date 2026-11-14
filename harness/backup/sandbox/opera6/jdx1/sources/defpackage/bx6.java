package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bx6 extends nyl {
    public static final bx6 G0 = new bx6(new ax6());
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public static final String Z0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final boolean D0;
    public final SparseArray E0;
    public final SparseBooleanArray F0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = tym.a;
        H0 = "rs";
        I0 = "rt";
        J0 = "ru";
        K0 = "rv";
        L0 = "rw";
        M0 = "rx";
        N0 = "ry";
        O0 = "rz";
        P0 = "s0";
        Q0 = "s1";
        R0 = "s2";
        S0 = "s3";
        T0 = "s4";
        U0 = "s5";
        V0 = "s6";
        W0 = "s7";
        X0 = "s8";
        Y0 = "s9";
        Z0 = "sa";
    }

    public bx6(ax6 ax6Var) {
        super(ax6Var);
        this.x0 = ax6Var.J;
        this.y0 = ax6Var.K;
        this.z0 = ax6Var.L;
        this.A0 = ax6Var.M;
        this.B0 = ax6Var.N;
        this.C0 = ax6Var.O;
        this.D0 = ax6Var.P;
        this.E0 = ax6Var.Q;
        this.F0 = ax6Var.R;
    }

    @Override // defpackage.nyl
    public final myl a() {
        return new ax6(this);
    }

    @Override // defpackage.nyl
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(H0, this.x0);
        bundleC.putBoolean(I0, false);
        bundleC.putBoolean(J0, this.y0);
        bundleC.putBoolean(V0, false);
        bundleC.putBoolean(K0, this.z0);
        bundleC.putBoolean(L0, false);
        bundleC.putBoolean(M0, false);
        bundleC.putBoolean(N0, false);
        bundleC.putBoolean(W0, false);
        bundleC.putBoolean(Z0, this.A0);
        bundleC.putBoolean(X0, this.B0);
        bundleC.putBoolean(O0, this.C0);
        bundleC.putBoolean(P0, false);
        bundleC.putBoolean(Q0, this.D0);
        bundleC.putBoolean(Y0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.E0;
            if (i >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                cx6 cx6Var = (cx6) entry.getValue();
                if (cx6Var != null) {
                    sparseArray.put(arrayList2.size(), cx6Var);
                }
                arrayList2.add((fyl) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(R0, sgb.b0(arrayList));
            bundleC.putParcelableArrayList(S0, j14.q0(arrayList2, new b10((byte) 10)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                cx6 cx6Var2 = (cx6) sparseArray.valueAt(i2);
                cx6Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt(cx6.c, cx6Var2.a);
                bundle.putIntArray(cx6.d, cx6Var2.b);
                bundle.putInt(cx6.e, 0);
                sparseArray3.put(iKeyAt2, bundle);
            }
            bundleC.putSparseParcelableArray(T0, sparseArray3);
            i++;
        }
        SparseBooleanArray sparseBooleanArray = this.F0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            iArr[i3] = sparseBooleanArray.keyAt(i3);
        }
        bundleC.putIntArray(U0, iArr);
        return bundleC;
    }

    public final boolean d(int i, fyl fylVar) {
        Map map = (Map) this.E0.get(i);
        return map != null && map.containsKey(fylVar);
    }

    @Override // defpackage.nyl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bx6.class == obj.getClass()) {
            bx6 bx6Var = (bx6) obj;
            if (super.equals(bx6Var) && this.x0 == bx6Var.x0 && this.y0 == bx6Var.y0 && this.z0 == bx6Var.z0 && this.A0 == bx6Var.A0 && this.B0 == bx6Var.B0 && this.C0 == bx6Var.C0 && this.D0 == bx6Var.D0) {
                SparseBooleanArray sparseBooleanArray = bx6Var.F0;
                SparseBooleanArray sparseBooleanArray2 = this.F0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = bx6Var.E0;
                            SparseArray sparseArray2 = this.E0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                fyl fylVar = (fyl) entry.getKey();
                                                if (!map2.containsKey(fylVar) || !Objects.equals(entry.getValue(), map2.get(fylVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.nyl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 961) + (this.z0 ? 1 : 0)) * 28629151) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 961) + (this.D0 ? 1 : 0)) * 31;
    }
}
