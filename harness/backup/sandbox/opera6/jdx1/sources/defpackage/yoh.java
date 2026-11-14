package defpackage;

/* loaded from: classes.dex */
public final class yoh {
    public final jde a;
    public final v31 b;
    public final ro9 c;
    public final jnl d;
    public final dee e;
    public boolean f;
    public boolean g;
    public boolean h;
    public c4 i;
    public long j;
    public final d8e k;
    public final ree l;

    public yoh(jde jdeVar, v31 v31Var) {
        this.a = jdeVar;
        this.b = v31Var;
        ro9 ro9Var = new ro9((byte) 27);
        ro9Var.c = new long[192];
        ro9Var.d = new long[192];
        this.c = ro9Var;
        this.d = new jnl();
        this.e = new dee();
        this.j = -1L;
        this.k = new d8e(this, (byte) 26);
        this.l = new ree();
    }

    public static boolean c(wye wyeVar) {
        evf evfVar = wyeVar.T;
        return (evfVar == null || p37.S(((s3a) evfVar).b())) ? false : true;
    }

    public static long f(m3c m3cVar) {
        tah tahVar = m3cVar.F;
        wye wyeVar = (wye) tahVar.e;
        long jC = 0;
        for (wye wyeVar2 = (j8b) tahVar.b; wyeVar2 != null && wyeVar2 != wyeVar; wyeVar2 = wyeVar2.w) {
            if (c(wyeVar2)) {
                return 9223372034707292159L;
            }
            jC = ybb.c(jC, wyeVar2.F);
        }
        return jC;
    }

    public static void i(m3c m3cVar) {
        if (!m3cVar.c || c((wye) m3cVar.F.e)) {
            return;
        }
        m3cVar.c = false;
        if (m3cVar.e) {
            m3cVar.d = f(m3cVar);
            m3cVar.e = false;
        }
        if (ybb.a(m3cVar.d, 9223372034707292159L)) {
            return;
        }
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            i((m3c) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoh.a():void");
    }

    public final long b(m3c m3cVar) {
        if (m3cVar.g == -4) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.c)[d(m3cVar)];
        return (((int) (j >> 32)) << 32) | (((int) j) & 4294967295L);
    }

    public final int d(m3c m3cVar) {
        int i = m3cVar.g;
        if (i != -4) {
            int i2 = m3cVar.b;
            ro9 ro9Var = this.c;
            long[] jArr = (long[]) ro9Var.c;
            if (i < 0 || i >= ro9Var.b - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = ro9Var.b;
                i = 0;
                while (i < i4 - 2) {
                    if ((((int) jArr[i + 2]) & 33554431) == i3) {
                        break;
                    }
                    i += 3;
                }
                i = -4;
            }
        } else {
            i = -4;
        }
        if (i == -4) {
            a8b.a("LayoutNode " + m3cVar.b + " not found in RectList");
        }
        m3cVar.g = i;
        return i;
    }

    public final void e(m3c m3cVar) {
        int i;
        m3cVar.c = true;
        tah tahVar = m3cVar.F;
        wye wyeVar = (wye) tahVar.e;
        sfd sfdVar = m3cVar.G.p;
        int iY = sfdVar.Y();
        float fX = sfdVar.X();
        ree reeVar = this.l;
        reeVar.b = 0.0f;
        reeVar.c = 0.0f;
        reeVar.d = iY;
        reeVar.e = fX;
        while (true) {
            if (wyeVar == null) {
                break;
            }
            m3c m3cVar2 = wyeVar.u;
            if (wyeVar == ((wye) m3cVar2.F.e) && !m3cVar2.c) {
                if (!ybb.a(b(m3cVar2), 9223372034707292159L)) {
                    reeVar.e((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            evf evfVar = wyeVar.T;
            if (evfVar != null) {
                float[] fArrB = ((s3a) evfVar).b();
                if (!p37.S(fArrB)) {
                    afd.c(fArrB, reeVar);
                }
            }
            long j = wyeVar.F;
            reeVar.e((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
            wyeVar = wyeVar.w;
        }
        int i2 = (int) reeVar.b;
        int i3 = (int) reeVar.c;
        int i4 = (int) reeVar.d;
        int i5 = (int) reeVar.e;
        int i6 = m3cVar.b;
        int i7 = m3cVar.g;
        ro9 ro9Var = this.c;
        int iD = -4;
        if (i7 != -4) {
            int iD2 = d(m3cVar);
            long[] jArr = (long[]) ro9Var.c;
            jArr[iD2] = (i2 << 32) | (i3 & 4294967295L);
            jArr[iD2 + 1] = (i4 << 32) | (i5 & 4294967295L);
            int i8 = iD2 + 2;
            long j2 = jArr[i8];
            jArr[i8] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            m3c m3cVarU = m3cVar.u();
            if (m3cVarU != null) {
                i = m3cVarU.b;
                iD = d(m3cVarU);
            } else {
                i = -1;
            }
            m3cVar.g = ro9Var.w(i6, i2, i3, i4, i5, i, iD, tahVar.w(1024), tahVar.w(16), this.d.a.b(i6));
        }
        m3cVar.f = false;
        this.f = true;
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i9 = dfeVarZ.c;
        for (int i10 = 0; i10 < i9; i10++) {
            m3c m3cVar3 = (m3c) objArr[i10];
            if (m3cVar3.I()) {
                e(m3cVar3);
            }
        }
    }

    public final void g(m3c m3cVar) {
        long j;
        boolean zI = m3cVar.I();
        tah tahVar = m3cVar.F;
        if (zI && m3cVar.f) {
            m3c m3cVarU = m3cVar.u();
            if (m3cVarU == null) {
                j = 0;
            } else if (m3cVarU.c) {
                j = 9223372034707292159L;
            } else {
                if (m3cVarU.e) {
                    m3cVarU.e = false;
                    m3cVarU.d = f(m3cVarU);
                }
                j = m3cVarU.d;
            }
            wye wyeVar = (wye) tahVar.e;
            if (ybb.a(j, 9223372034707292159L) || c(wyeVar)) {
                e(m3cVar);
            } else if (m3cVar.c) {
                e(m3cVar);
                i(m3cVar);
            } else {
                long jC = ybb.c(j, wyeVar.F);
                sfd sfdVar = m3cVar.G.p;
                int iY = sfdVar.Y();
                int iX = sfdVar.X();
                int i = m3cVar.g;
                ro9 ro9Var = this.c;
                if (i != -4) {
                    int iD = d(m3cVar);
                    if (m3cVarU != null) {
                        int iD2 = d(m3cVarU);
                        long[] jArr = (long[]) ro9Var.c;
                        long j2 = jArr[iD2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iD];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iD + 2;
                        long j4 = jArr[i6];
                        jArr[iD] = (i2 << 32) | (i3 & 4294967295L);
                        jArr[iD + 1] = ((iY + i2) << 32) | ((iX + i3) & 4294967295L);
                        jArr[i6] = (((j4 >> 63) & 1) << 60) | j4;
                        if (i4 != 0 || i5 != 0) {
                            ro9Var.c0(iD, i4, i5, j4);
                        }
                    } else {
                        int iD3 = d(m3cVar);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) ro9Var.c;
                        long j5 = jArr2[iD3];
                        jArr2[iD3] = (i7 << 32) | (i8 & 4294967295L);
                        jArr2[iD3 + 1] = ((iY + i7) << 32) | ((iX + i8) & 4294967295L);
                        int i9 = iD3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            ro9Var.c0(iD3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = m3cVar.b;
                    boolean zW = tahVar.w(1024);
                    boolean zW2 = tahVar.w(16);
                    boolean zB = this.d.a.b(i12);
                    if (m3cVarU != null) {
                        int i13 = m3cVarU.b;
                        int iD4 = d(m3cVarU);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) ro9Var.c;
                        if ((((int) jArr3[iD4 + 2]) & 33554431) != (33554431 & i13)) {
                            a8b.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iD4];
                        int i17 = (int) j7;
                        int i18 = ((int) (j7 >> 32)) + i14;
                        int i19 = i17 + i15;
                        m3cVar.g = ro9Var.w(i16, i18, i19, iY + i18, i19 + iX, i13, iD4, zW, zW2, zB);
                    } else {
                        int i20 = (int) (jC >> 32);
                        int i21 = (int) (jC & 4294967295L);
                        m3cVar.g = ro9Var.w(i12, i20, i21, i20 + iY, i21 + iX, -1, -4, zW, zW2, zB);
                    }
                }
            }
            m3cVar.f = false;
            this.f = true;
            j();
        }
    }

    public final void h(m3c m3cVar) {
        if (m3cVar.g != -4) {
            int iD = d(m3cVar);
            long[] jArr = (long[]) this.c.c;
            jArr[iD] = -1;
            jArr[iD + 1] = -1;
            jArr[iD + 2] = xoh.c;
            m3cVar.g = -4;
            m3cVar.f = true;
            this.f = true;
            this.h = true;
        }
    }

    public final void j() {
        c4 c4Var = this.i;
        boolean z = c4Var != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            v31 v31Var = this.b;
            if (c4Var != null) {
                v31Var.removeCallbacks(c4Var);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            c4 c4Var2 = new c4(this.k, (byte) 19);
            v31Var.postDelayed(c4Var2, jMax - jCurrentTimeMillis);
            this.i = c4Var2;
        }
    }
}
