package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tea {
    public final rq6 a;
    public final ed6 b;
    public final ed6 c;
    public final z4k d;
    public final Uri[] e;
    public final oj9[] f;
    public final uq6 g;
    public final eyl h;
    public final List i;
    public final fjg k;
    public boolean l;
    public uc3 n;
    public Uri o;
    public Uri p;
    public boolean q;
    public bj8 r;
    public final qq6 j = new qq6((byte) 15);
    public byte[] m = tym.b;
    public long s = -9223372036854775807L;

    public tea(rq6 rq6Var, uq6 uq6Var, Uri[] uriArr, oj9[] oj9VarArr, qq6 qq6Var, pl6 pl6Var, z4k z4kVar, List list, fjg fjgVar) {
        this.a = rq6Var;
        this.g = uq6Var;
        this.e = uriArr;
        this.f = oj9VarArr;
        this.d = z4kVar;
        this.i = list;
        this.k = fjgVar;
        bd6 bd6Var = (bd6) qq6Var.b;
        ed6 ed6VarCreateDataSource = bd6Var.createDataSource();
        this.b = ed6VarCreateDataSource;
        if (pl6Var != null) {
            ed6VarCreateDataSource.c(pl6Var);
        }
        this.c = bd6Var.createDataSource();
        this.h = new eyl("", oj9VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((oj9VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        eyl eylVar = this.h;
        int[] iArrB0 = sgb.b0(arrayList);
        rea reaVar = new rea(eylVar, iArrB0);
        reaVar.g = reaVar.f(eylVar.d[iArrB0[0]]);
        this.r = reaVar;
    }

    public static sea d(efa efaVar, long j, int i) {
        long j2 = efaVar.k;
        h1b h1bVar = efaVar.s;
        int i2 = (int) (j - j2);
        h1b h1bVar2 = efaVar.r;
        if (i2 == h1bVar2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < h1bVar.size()) {
                return new sea((cfa) h1bVar.get(i), j, i);
            }
            return null;
        }
        bfa bfaVar = (bfa) h1bVar2.get(i2);
        if (i == -1) {
            return new sea(bfaVar, j, -1);
        }
        if (i < bfaVar.m.size()) {
            return new sea((cfa) bfaVar.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < h1bVar2.size()) {
            return new sea((cfa) h1bVar2.get(i3), j + 1, -1);
        }
        if (h1bVar.isEmpty()) {
            return null;
        }
        return new sea((cfa) h1bVar.get(0), j + 1, 0);
    }

    public final ggd[] a(uea ueaVar, long j) {
        List listUnmodifiableList;
        tea teaVar = this;
        uea ueaVar2 = ueaVar;
        int iB = ueaVar2 == null ? -1 : teaVar.h.b(ueaVar2.d);
        int length = teaVar.r.length();
        ggd[] ggdVarArr = new ggd[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int indexInTrackGroup = teaVar.r.getIndexInTrackGroup(i);
            Uri uri = teaVar.e[indexInTrackGroup];
            uq6 uq6Var = teaVar.g;
            if (uq6Var.c(uri)) {
                efa efaVarA = uq6Var.a(z, uri);
                efaVarA.getClass();
                long j2 = efaVarA.h - uq6Var.n;
                Pair pairC = teaVar.c(ueaVar2, indexInTrackGroup != iB ? true : z, efaVarA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = efaVarA.k;
                h1b h1bVar = efaVarA.s;
                h1b h1bVar2 = efaVarA.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || h1bVar2.size() < i2) {
                    a1b a1bVar = h1b.b;
                    listUnmodifiableList = csh.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < h1bVar2.size()) {
                        if (iIntValue != -1) {
                            bfa bfaVar = (bfa) h1bVar2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(bfaVar);
                            } else if (iIntValue < bfaVar.m.size()) {
                                h1b h1bVar3 = bfaVar.m;
                                arrayList.addAll(h1bVar3.subList(iIntValue, h1bVar3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(h1bVar2.subList(i2, h1bVar2.size()));
                        iIntValue = 0;
                    }
                    if (efaVarA.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < h1bVar.size()) {
                            arrayList.addAll(h1bVar.subList(iIntValue, h1bVar.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                ggdVarArr[i] = new qea(j2, listUnmodifiableList);
            } else {
                ggdVarArr[i] = ggd.yp;
            }
            i++;
            teaVar = this;
            ueaVar2 = ueaVar;
            z = false;
        }
        return ggdVarArr;
    }

    public final int b(uea ueaVar) {
        int i = ueaVar.o;
        if (i == -1) {
            return 1;
        }
        efa efaVarA = this.g.a(false, this.e[this.h.b(ueaVar.d)]);
        efaVarA.getClass();
        h1b h1bVar = efaVarA.r;
        int i2 = (int) (ueaVar.j - efaVarA.k);
        if (i2 < 0) {
            return 1;
        }
        h1b h1bVar2 = i2 < h1bVar.size() ? ((bfa) h1bVar.get(i2)).m : efaVarA.s;
        if (i >= h1bVar2.size()) {
            return 2;
        }
        zea zeaVar = (zea) h1bVar2.get(i);
        if (zeaVar.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(n6h.o(efaVarA.a, zeaVar.a)), ueaVar.b.a) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair c(defpackage.uea r17, boolean r18, defpackage.efa r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tea.c(uea, boolean, efa, long, long):android.util.Pair");
    }

    public final pea e(Uri uri, int i, boolean z) {
        yp9 yp9Var = (yp9) this.j.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) yp9Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        nd6 nd6Var = new nd6(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        oj9 oj9Var = this.f[i];
        int selectionReason = this.r.getSelectionReason();
        Object selectionData = this.r.getSelectionData();
        byte[] bArr2 = this.m;
        pea peaVar = new pea(this.c, nd6Var, 3, oj9Var, selectionReason, selectionData, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = tym.b;
        }
        peaVar.j = bArr2;
        return peaVar;
    }
}
