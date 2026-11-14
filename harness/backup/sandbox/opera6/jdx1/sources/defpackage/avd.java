package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class avd implements nkd, mkd {
    public final nkd[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public mkd f;
    public fyl g;
    public nkd[] h;
    public vh5 i;

    public avd(ir5 ir5Var, long[] jArr, nkd... nkdVarArr) {
        this.a = nkdVarArr;
        a1b a1bVar = h1b.b;
        csh cshVar = csh.e;
        this.i = new vh5(cshVar, cshVar);
        this.c = new IdentityHashMap();
        this.h = new nkd[0];
        this.b = new boolean[nkdVarArr.length];
        for (int i = 0; i < nkdVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new ppl(nkdVarArr[i], j);
            }
        }
    }

    @Override // defpackage.nkd
    public final long a(bj8[] bj8VarArr, boolean[] zArr, vhi[] vhiVarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[bj8VarArr.length];
        int[] iArr3 = new int[bj8VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = bj8VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            vhi vhiVar = vhiVarArr[i2];
            Integer num = vhiVar == null ? null : (Integer) identityHashMap.get(vhiVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            bj8 bj8Var = bj8VarArr[i2];
            if (bj8Var != null) {
                String str = bj8Var.getTrackGroup().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = bj8VarArr.length;
        vhi[] vhiVarArr2 = new vhi[length2];
        vhi[] vhiVarArr3 = new vhi[bj8VarArr.length];
        bj8[] bj8VarArr2 = new bj8[bj8VarArr.length];
        nkd[] nkdVarArr = this.a;
        ArrayList arrayList = new ArrayList(nkdVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < nkdVarArr.length) {
            int i4 = i;
            while (i4 < bj8VarArr.length) {
                vhiVarArr3[i4] = iArr2[i4] == i3 ? vhiVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    bj8 bj8Var2 = bj8VarArr[i4];
                    bj8Var2.getClass();
                    iArr = iArr2;
                    eyl eylVar = (eyl) this.e.get(bj8Var2.getTrackGroup());
                    eylVar.getClass();
                    bj8VarArr2[i4] = new zud(bj8Var2, eylVar);
                } else {
                    iArr = iArr2;
                    bj8VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            nkd[] nkdVarArr2 = nkdVarArr;
            int i5 = i3;
            long jA = nkdVarArr2[i3].a(bj8VarArr2, zArr, vhiVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jA;
            } else if (jA != j2) {
                qp2.n("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < bj8VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    vhi vhiVar2 = vhiVarArr3[i6];
                    vhiVar2.getClass();
                    vhiVarArr2[i6] = vhiVarArr3[i6];
                    identityHashMap.put(vhiVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    z4o.H(vhiVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(nkdVarArr2[i5]);
            }
            i3 = i5 + 1;
            nkdVarArr = nkdVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(vhiVarArr2, i7, vhiVarArr, i7, length2);
        this.h = (nkd[]) arrayList.toArray(new nkd[i7]);
        this.i = new vh5(arrayList, nb6.W(new b10((byte) 23), arrayList));
        return j2;
    }

    @Override // defpackage.nkd
    public final long b(long j, uwi uwiVar) {
        nkd[] nkdVarArr = this.h;
        return (nkdVarArr.length > 0 ? nkdVarArr[0] : this.a[0]).b(j, uwiVar);
    }

    @Override // defpackage.nkd
    public final void e(long j) {
        for (nkd nkdVar : this.h) {
            nkdVar.e(j);
        }
    }

    @Override // defpackage.nkd
    public final void f(mkd mkdVar, long j) {
        this.f = mkdVar;
        ArrayList arrayList = this.d;
        nkd[] nkdVarArr = this.a;
        Collections.addAll(arrayList, nkdVarArr);
        for (nkd nkdVar : nkdVarArr) {
            nkdVar.f(this, j);
        }
    }

    @Override // defpackage.n1j
    public final boolean g(gtc gtcVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.g(gtcVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nkd) arrayList.get(i)).g(gtcVar);
        }
        return false;
    }

    @Override // defpackage.n1j
    public final long getBufferedPositionUs() {
        return this.i.getBufferedPositionUs();
    }

    @Override // defpackage.n1j
    public final long getNextLoadPositionUs() {
        return this.i.getNextLoadPositionUs();
    }

    @Override // defpackage.nkd
    public final fyl getTrackGroups() {
        fyl fylVar = this.g;
        fylVar.getClass();
        return fylVar;
    }

    @Override // defpackage.n1j
    public final boolean isLoading() {
        return this.i.isLoading();
    }

    @Override // defpackage.m1j
    public final void j(n1j n1jVar) {
        mkd mkdVar = this.f;
        mkdVar.getClass();
        mkdVar.j(this);
    }

    @Override // defpackage.nkd
    public final void maybeThrowPrepareError() {
        for (nkd nkdVar : this.a) {
            nkdVar.maybeThrowPrepareError();
        }
    }

    @Override // defpackage.mkd
    public final void p(nkd nkdVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(nkdVar);
        if (arrayList.isEmpty()) {
            nkd[] nkdVarArr = this.a;
            int i = 0;
            for (nkd nkdVar2 : nkdVarArr) {
                i += nkdVar2.getTrackGroups().a;
            }
            eyl[] eylVarArr = new eyl[i];
            int i2 = 0;
            for (int i3 = 0; i3 < nkdVarArr.length; i3++) {
                fyl trackGroups = nkdVarArr[i3].getTrackGroups();
                int i4 = trackGroups.a;
                int i5 = 0;
                while (i5 < i4) {
                    eyl eylVarA = trackGroups.a(i5);
                    int i6 = eylVarA.a;
                    oj9[] oj9VarArr = new oj9[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        oj9 oj9Var = eylVarA.d[i7];
                        nj9 nj9VarA = oj9Var.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = oj9Var.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        nj9VarA.a = sb.toString();
                        oj9VarArr[i7] = new oj9(nj9VarA);
                    }
                    eyl eylVar = new eyl(i3 + ":" + eylVarA.b, oj9VarArr);
                    this.e.put(eylVar, eylVarA);
                    eylVarArr[i2] = eylVar;
                    i5++;
                    i2++;
                }
            }
            this.g = new fyl(eylVarArr);
            mkd mkdVar = this.f;
            mkdVar.getClass();
            mkdVar.p(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        r7 = r10;
     */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long readDiscontinuity() {
        /*
            r18 = this;
            r0 = r18
            nkd[] r1 = r0.h
            int r2 = r1.length
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = r3
            r6 = r5
        Ld:
            if (r6 >= r2) goto L63
            r9 = r1[r6]
            long r10 = r9.readDiscontinuity()
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r13 = 0
            java.lang.String r15 = "Unexpected child seekToUs result."
            if (r12 == 0) goto L4c
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 != 0) goto L40
            nkd[] r7 = r0.h
            int r8 = r7.length
            r12 = r5
        L25:
            r16 = r3
            if (r12 >= r8) goto L3e
            r3 = r7[r12]
            if (r3 == r9) goto L3e
            long r3 = r3.seekToUs(r10)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L3a
            int r12 = r12 + 1
            r3 = r16
            goto L25
        L3a:
            qp2.n(r15)
            return r13
        L3e:
            r7 = r10
            goto L5e
        L40:
            r16 = r3
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 == 0) goto L5e
            java.lang.String r0 = "Conflicting discontinuities."
            qp2.n(r0)
            return r13
        L4c:
            r16 = r3
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 == 0) goto L5e
            long r3 = r9.seekToUs(r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L5e
            qp2.n(r15)
            return r13
        L5e:
            int r6 = r6 + 1
            r3 = r16
            goto Ld
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avd.readDiscontinuity():long");
    }

    @Override // defpackage.n1j
    public final void reevaluateBuffer(long j) {
        this.i.reevaluateBuffer(j);
    }

    @Override // defpackage.nkd
    public final long seekToUs(long j) {
        long jSeekToUs = this.h[0].seekToUs(j);
        int i = 1;
        while (true) {
            nkd[] nkdVarArr = this.h;
            if (i >= nkdVarArr.length) {
                return jSeekToUs;
            }
            if (nkdVarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                qp2.n("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }
}
