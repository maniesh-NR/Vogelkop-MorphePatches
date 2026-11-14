package defpackage;

import androidx.recyclerview.widget.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j87 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final k1g d;
    public final int e;
    public final int f;
    public final boolean g;

    public j87(k1g k1gVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        i87 i87Var;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = k1gVar;
        int iD = k1gVar.D();
        this.e = iD;
        int iC = k1gVar.C();
        this.f = iC;
        this.g = z;
        i87 i87Var2 = arrayList.isEmpty() ? null : (i87) arrayList.get(0);
        if (i87Var2 == null || i87Var2.a != 0 || i87Var2.b != 0) {
            arrayList.add(0, new i87(0, 0, 0));
        }
        arrayList.add(new i87(iD, iC, 0));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i87 i87Var3 = (i87) obj;
            for (int i4 = 0; i4 < i87Var3.c; i4++) {
                int i5 = i87Var3.a + i4;
                int i6 = i87Var3.b + i4;
                int i7 = k1gVar.h(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.g) {
            int size2 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                i87 i87Var4 = (i87) obj2;
                while (true) {
                    i = i87Var4.a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size3 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size3) {
                                    i87Var = (i87) arrayList.get(i10);
                                    while (true) {
                                        i2 = i87Var.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && k1gVar.i(i8, i11)) {
                                                int i12 = k1gVar.h(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = (i8 << 4) | i12;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = i87Var.c + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = i87Var4.c + i;
            }
        }
    }

    public static k87 c(ArrayDeque arrayDeque, int i, boolean z) {
        k87 k87Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                k87Var = null;
                break;
            }
            k87Var = (k87) it.next();
            if (k87Var.a == i && k87Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            k87 k87Var2 = (k87) it.next();
            if (z) {
                k87Var2.b--;
            } else {
                k87Var2.b++;
            }
        }
        return k87Var;
    }

    public final void a(sic sicVar) {
        int[] iArr;
        k1g k1gVar;
        int i;
        int i2;
        ArrayList arrayList;
        j87 j87Var = this;
        dc3 dc3Var = sicVar instanceof dc3 ? (dc3) sicVar : new dc3(sicVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = j87Var.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = j87Var.e;
        int i4 = j87Var.f;
        int i5 = i3;
        while (size >= 0) {
            i87 i87Var = (i87) arrayList2.get(size);
            int i6 = i87Var.a;
            int i7 = i87Var.c;
            int i8 = i6 + i7;
            int i9 = i87Var.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = j87Var.b;
                k1gVar = j87Var.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    k87 k87VarC = c(arrayDeque, i12, false);
                    if (k87VarC != null) {
                        int i13 = (i3 - k87VarC.b) - 1;
                        dc3Var.S(i5, i13);
                        if ((i11 & 4) != 0) {
                            dc3Var.I(i13, z2 ? 1 : 0, k1gVar.u(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new k87(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    dc3Var.f(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = j87Var.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    k87 k87VarC2 = c(arrayDeque, i15, true);
                    if (k87VarC2 == null) {
                        arrayDeque.add(new k87(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        dc3Var.S((i3 - k87VarC2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            dc3Var.I(i5, 1, k1gVar.u(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    dc3Var.t(i5, 1);
                    i3++;
                }
                j87Var = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    dc3Var.I(i17, 1, k1gVar.u(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            j87Var = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        dc3Var.a();
    }

    public final void b(d dVar) {
        a(new eme(dVar));
    }
}
