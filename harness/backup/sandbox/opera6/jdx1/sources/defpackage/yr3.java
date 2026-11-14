package defpackage;

import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class yr3 {
    public static final byte[] a;

    static {
        String str = tym.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(g1g g1gVar) {
        int i = g1gVar.b;
        g1gVar.O(4);
        if (g1gVar.m() != 1751411826) {
            i += 4;
        }
        g1gVar.N(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x080d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.g1g r50, int r51, int r52, int r53, int r54, java.lang.String r55, boolean r56, defpackage.vl7 r57, vr3 r58, int r59) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 3060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr3.b(g1g, int, int, int, int, java.lang.String, boolean, vl7, vr3, int):void");
    }

    public static tr3 c(int i, g1g g1gVar) {
        g1gVar.N(i + 12);
        g1gVar.O(1);
        d(g1gVar);
        g1gVar.O(2);
        int iA = g1gVar.A();
        if ((iA & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            g1gVar.O(2);
        }
        if ((iA & 64) != 0) {
            g1gVar.O(g1gVar.A());
        }
        if ((iA & 32) != 0) {
            g1gVar.O(2);
        }
        g1gVar.O(1);
        d(g1gVar);
        String strF = dzd.f(g1gVar.A());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new tr3(strF, null, -1L, -1L);
        }
        g1gVar.O(4);
        long jC = g1gVar.C();
        long jC2 = g1gVar.C();
        g1gVar.O(1);
        int iD = d(g1gVar);
        long j = jC2;
        byte[] bArr = new byte[iD];
        g1gVar.k(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new tr3(strF, bArr, j, jC > 0 ? jC : -1L);
    }

    public static int d(g1g g1gVar) {
        int iA = g1gVar.A();
        int i = iA & 127;
        while ((iA & NotificationCompat.FLAG_HIGH_PRIORITY) == 128) {
            iA = g1gVar.A();
            i = (i << 7) | (iA & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static lxd f(xae xaeVar) {
        ofd ofdVar;
        yae yaeVarJ = xaeVar.j(1751411826);
        yae yaeVarJ2 = xaeVar.j(1801812339);
        yae yaeVarJ3 = xaeVar.j(1768715124);
        if (yaeVarJ != null && yaeVarJ2 != null && yaeVarJ3 != null) {
            g1g g1gVar = yaeVarJ.c;
            g1gVar.N(16);
            if (g1gVar.m() == 1835299937) {
                g1g g1gVar2 = yaeVarJ2.c;
                g1gVar2.N(12);
                int iM = g1gVar2.m();
                String[] strArr = new String[iM];
                for (int i = 0; i < iM; i++) {
                    int iM2 = g1gVar2.m();
                    g1gVar2.O(4);
                    strArr[i] = g1gVar2.y(iM2 - 8, StandardCharsets.UTF_8);
                }
                g1g g1gVar3 = yaeVarJ3.c;
                g1gVar3.N(8);
                ArrayList arrayList = new ArrayList();
                while (g1gVar3.a() > 8) {
                    int i2 = g1gVar3.b;
                    int iM3 = g1gVar3.m();
                    int iM4 = g1gVar3.m() - 1;
                    if (iM4 < 0 || iM4 >= iM) {
                        vep.y(iM4, "Skipped metadata with unknown key index: ");
                    } else {
                        String str = strArr[iM4];
                        int i3 = i2 + iM3;
                        while (true) {
                            int i4 = g1gVar3.b;
                            if (i4 >= i3) {
                                ofdVar = null;
                                break;
                            }
                            int iM5 = g1gVar3.m();
                            if (g1gVar3.m() == 1684108385) {
                                int iM6 = g1gVar3.m();
                                int iM7 = g1gVar3.m();
                                int i5 = iM5 - 16;
                                byte[] bArr = new byte[i5];
                                g1gVar3.k(bArr, 0, i5);
                                ofdVar = new ofd(str, bArr, iM7, iM6);
                                break;
                            }
                            g1gVar3.N(i4 + iM5);
                        }
                        if (ofdVar != null) {
                            arrayList.add(ofdVar);
                        }
                    }
                    g1gVar3.N(i2 + iM3);
                }
                if (!arrayList.isEmpty()) {
                    return new lxd(arrayList);
                }
            }
        }
        return null;
    }

    public static dbe g(g1g g1gVar) {
        long jU;
        long jU2;
        g1gVar.N(8);
        if (e(g1gVar.m()) == 0) {
            jU = g1gVar.C();
            jU2 = g1gVar.C();
        } else {
            jU = g1gVar.u();
            jU2 = g1gVar.u();
        }
        return new dbe(jU, jU2, g1gVar.C());
    }

    public static Pair h(g1g g1gVar, int i, int i2) throws s1g {
        Integer num;
        cyl cylVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = g1gVar.b;
        while (i5 - i < i2) {
            g1gVar.N(i5);
            int iM = g1gVar.m();
            p37.s("childAtomSize must be positive", iM > 0);
            if (g1gVar.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i6 - i5 < iM) {
                    g1gVar.N(i6);
                    int iM2 = g1gVar.m();
                    int iM3 = g1gVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(g1gVar.m());
                    } else if (iM3 == 1935894637) {
                        g1gVar.O(4);
                        strY = g1gVar.y(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    p37.s("frma atom is mandatory", numValueOf != null);
                    p37.s("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            cylVar = null;
                            break;
                        }
                        g1gVar.N(i9);
                        int iM4 = g1gVar.m();
                        if (g1gVar.m() == 1952804451) {
                            int iE = e(g1gVar.m());
                            g1gVar.O(1);
                            if (iE == 0) {
                                g1gVar.O(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iA = g1gVar.A();
                                i3 = iA & 15;
                                i4 = (iA & 240) >> 4;
                            }
                            if (g1gVar.A() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iA2 = g1gVar.A();
                            byte[] bArr2 = new byte[16];
                            g1gVar.k(bArr2, 0, 16);
                            if (z && iA2 == 0) {
                                int iA3 = g1gVar.A();
                                byte[] bArr3 = new byte[iA3];
                                g1gVar.k(bArr3, 0, iA3);
                                bArr = bArr3;
                            }
                            num = num2;
                            cylVar = new cyl(z, strY, iA2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iM4;
                        }
                    }
                    p37.s("tenc atom is mandatory", cylVar != null);
                    String str = tym.a;
                    pairCreate = Pair.create(num, cylVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static vr3 i(defpackage.g1g r69, defpackage.xr3 r70, java.lang.String r71, defpackage.vl7 r72, boolean r73) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 3369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr3.i(g1g, xr3, java.lang.String, vl7, boolean):vr3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r25 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList j(defpackage.xae r58, defpackage.cu9 r59, long r60, defpackage.vl7 r62, boolean r63, boolean r64, defpackage.xq9 r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 2724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr3.j(xae, cu9, long, vl7, boolean, boolean, xq9, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ed, code lost:
    
        if (r0 == 7233901) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f2, code lost:
    
        if (r0 == 7631467) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f7, code lost:
    
        if (r0 == 6516589) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fc, code lost:
    
        if (r0 == 7828084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0201, code lost:
    
        if (r0 != 6578553) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0203, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
    
        if (r0 != 4280916) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0210, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021b, code lost:
    
        if (r0 != 7630703) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x021d, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0227, code lost:
    
        if (r0 != 6384738) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0229, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0233, code lost:
    
        if (r0 != 7108978) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0235, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023f, code lost:
    
        if (r0 != 6776174) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0241, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0249, code lost:
    
        if (r0 != 6779504) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x024b, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0255, code lost:
    
        if (r0 != 7173742) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r1.N(r7);
        r7 = r7 + r13;
        r1.O(r0);
        r6 = new java.util.ArrayList();
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0261, code lost:
    
        if (r0 != 7173737) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0263, code lost:
    
        r10 = defpackage.z4o.o0(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026a, code lost:
    
        defpackage.w7d.m("Skipped unknown metadata entry: ".concat(defpackage.e04.c(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0275, code lost:
    
        r1.N(r15);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027a, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0281, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0287, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x028a, code lost:
    
        if (r10 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028c, code lost:
    
        r6.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x028f, code lost:
    
        r8 = 4;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0293, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0294, code lost:
    
        r1.N(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0297, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x029c, code lost:
    
        if (r6.isEmpty() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029e, code lost:
    
        r12 = new defpackage.lxd(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r13 >= r7) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r0 == 169) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r0 == 253) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r13 != 1735291493) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r0 = defpackage.pua.a(defpackage.z4o.n0(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r10 = new defpackage.xil("TCON", r12, h1b.v(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        defpackage.w7d.K("Failed to parse standard genre code");
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r13 != 1684632427) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r10 = defpackage.z4o.m0(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r13 != 1953655662) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        r10 = defpackage.z4o.m0(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r13 != 1953329263) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r10 = defpackage.z4o.o0(r13, "TBPM", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r13 != 1668311404) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        r10 = defpackage.z4o.o0(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r13 != 1668249202) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r10 = defpackage.z4o.k0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r13 != 1631670868) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r13 != 1936682605) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e1, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if (r13 != 1936679276) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        if (r13 != 1936679282) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        if (r13 != 1936679265) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r13 != 1936679791) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        if (r13 != 1920233063) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        r10 = defpackage.z4o.o0(r13, "ITUNESADVISORY", r1, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        if (r13 != 1885823344) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        r10 = defpackage.z4o.o0(r13, "ITUNESGAPLESS", r1, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
    
        if (r13 != 1936683886) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0147, code lost:
    
        if (r13 != 1953919848) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        r10 = defpackage.z4o.p0(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
    
        if (r13 != 757935405) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        r0 = r12;
        r9 = r0;
        r10 = -1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r14 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015c, code lost:
    
        if (r14 >= r15) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
    
        r17 = r1.m();
        r12 = r1.m();
        r1.O(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016c, code lost:
    
        if (r12 != 1835360622) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016e, code lost:
    
        r0 = r1.w(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0178, code lost:
    
        if (r12 != 1851878757) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017a, code lost:
    
        r9 = r1.w(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        if (r12 != 1684108385) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        r10 = r14;
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
    
        r1.O(r17 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0190, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0192, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
    
        if (r10 == (-1)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
    
        r1.N(r10);
        r1.O(16);
        r12 = new defpackage.hgb(r0, r9, r1.w(r13 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01aa, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ad, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b4, code lost:
    
        if (r0 != 6516084) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        r0 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c1, code lost:
    
        if (r1.m() != 1684108385) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c3, code lost:
    
        r1.O(8);
        r0 = r1.w(r0 - 16);
        r10 = new defpackage.xb5("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01da, code lost:
    
        defpackage.w7d.K("Failed to parse comment attribute: ".concat(defpackage.e04.c(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e7, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lxd k(defpackage.yae r18) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr3.k(yae):lxd");
    }
}
