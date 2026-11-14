package defpackage;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gg9 {
    public final v31 a;
    public final v31 b;
    public final bg9 d;
    public tde f;
    public vg9 h;
    public final vg9 c = new vg9(2, null, 14);
    public final fg9 e = new fg9(this);
    public final dee g = new dee(1);

    public gg9(v31 v31Var, v31 v31Var2) {
        this.a = v31Var;
        this.b = v31Var2;
        this.d = new bg9(this, v31Var2);
    }

    public final boolean a(boolean z) throws pxb {
        tah tahVar;
        if (f() != null) {
            vg9 vg9VarF = f();
            i(null);
            if (vg9VarF != null) {
                vg9VarF.U0(qg9.a, qg9.c);
                if (!vg9VarF.a.n) {
                    a8b.b("visitAncestors called on an unattached node");
                }
                b8e b8eVar = vg9VarF.a.e;
                m3c m3cVarE0 = ui6.e0(vg9VarF);
                while (m3cVarE0 != null) {
                    if ((((b8e) m3cVarE0.F.g).d & 1024) != 0) {
                        while (b8eVar != null) {
                            if ((b8eVar.c & 1024) != 0) {
                                b8e b8eVarU = b8eVar;
                                dfe dfeVar = null;
                                while (b8eVarU != null) {
                                    if (b8eVarU instanceof vg9) {
                                        ((vg9) b8eVarU).U0(qg9.b, qg9.c);
                                    } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                        int i = 0;
                                        for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                            if ((b8eVar2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    b8eVarU = b8eVar2;
                                                } else {
                                                    if (dfeVar == null) {
                                                        dfeVar = new dfe(new b8e[16]);
                                                    }
                                                    if (b8eVarU != null) {
                                                        dfeVar.c(b8eVarU);
                                                        b8eVarU = null;
                                                    }
                                                    dfeVar.c(b8eVar2);
                                                }
                                            }
                                        }
                                        if (i != 1) {
                                        }
                                    }
                                    b8eVarU = ui6.U(dfeVar);
                                }
                            }
                            b8eVar = b8eVar.e;
                        }
                    }
                    m3cVarE0 = m3cVarE0.u();
                    b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = k1g.T(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                h9o.p();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        v31 v31Var = this.a;
        if (v31Var.isFocused() || v31Var.hasFocus()) {
            v31Var.clearFocus();
        } else if (v31Var.hasFocus()) {
            View viewFindFocus = v31Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            v31Var.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x0162, B:119:0x0168, B:120:0x016b, B:122:0x0176, B:125:0x0184, B:129:0x018e, B:132:0x0194, B:133:0x0199, B:136:0x01a1, B:138:0x01a7, B:140:0x01ab, B:142:0x01b3, B:144:0x01b9, B:148:0x01c1, B:150:0x01ca, B:151:0x01ce, B:152:0x01d1, B:154:0x01d6, B:155:0x01db, B:156:0x01de, B:158:0x01e4, B:160:0x01e8, B:163:0x01f1, B:165:0x01f9, B:169:0x020b, B:171:0x0210, B:173:0x0214, B:194:0x0253, B:176:0x021e, B:178:0x0224, B:180:0x0228, B:182:0x0230, B:184:0x0236, B:188:0x023e, B:190:0x0247, B:191:0x024b, B:192:0x024e, B:195:0x0258, B:197:0x0264, B:199:0x0269, B:201:0x026d, B:222:0x02ab, B:204:0x0276, B:206:0x027c, B:208:0x0280, B:210:0x0288, B:212:0x028e, B:216:0x0296, B:218:0x029f, B:219:0x02a3, B:220:0x02a6, B:224:0x02b2, B:226:0x02b9, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x0071, B:39:0x007b, B:41:0x007f, B:43:0x0085, B:45:0x0089, B:47:0x0091, B:49:0x0097, B:53:0x009f, B:55:0x00a8, B:56:0x00ac, B:57:0x00af, B:59:0x00b4, B:68:0x00ce, B:70:0x00d2, B:60:0x00b9, B:61:0x00bc, B:63:0x00c2, B:65:0x00c6, B:71:0x00d8, B:73:0x00de, B:74:0x00e1, B:76:0x00eb, B:79:0x00f9, B:83:0x0103, B:85:0x0107, B:87:0x010d, B:89:0x0111, B:91:0x0119, B:93:0x011f, B:97:0x0127, B:99:0x0130, B:100:0x0134, B:101:0x0137, B:103:0x013c, B:112:0x0156, B:114:0x015a, B:104:0x0141, B:105:0x0144, B:107:0x014a, B:109:0x014e), top: B:236:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:3:0x0007, B:5:0x000e, B:6:0x0017, B:8:0x001d, B:11:0x0029, B:13:0x002f, B:14:0x0034, B:17:0x003d, B:19:0x0041, B:21:0x0047, B:117:0x0162, B:119:0x0168, B:120:0x016b, B:122:0x0176, B:125:0x0184, B:129:0x018e, B:132:0x0194, B:133:0x0199, B:136:0x01a1, B:138:0x01a7, B:140:0x01ab, B:142:0x01b3, B:144:0x01b9, B:148:0x01c1, B:150:0x01ca, B:151:0x01ce, B:152:0x01d1, B:154:0x01d6, B:155:0x01db, B:156:0x01de, B:158:0x01e4, B:160:0x01e8, B:163:0x01f1, B:165:0x01f9, B:169:0x020b, B:171:0x0210, B:173:0x0214, B:194:0x0253, B:176:0x021e, B:178:0x0224, B:180:0x0228, B:182:0x0230, B:184:0x0236, B:188:0x023e, B:190:0x0247, B:191:0x024b, B:192:0x024e, B:195:0x0258, B:197:0x0264, B:199:0x0269, B:201:0x026d, B:222:0x02ab, B:204:0x0276, B:206:0x027c, B:208:0x0280, B:210:0x0288, B:212:0x028e, B:216:0x0296, B:218:0x029f, B:219:0x02a3, B:220:0x02a6, B:224:0x02b2, B:226:0x02b9, B:27:0x0052, B:29:0x0058, B:30:0x005b, B:32:0x0063, B:35:0x0071, B:39:0x007b, B:41:0x007f, B:43:0x0085, B:45:0x0089, B:47:0x0091, B:49:0x0097, B:53:0x009f, B:55:0x00a8, B:56:0x00ac, B:57:0x00af, B:59:0x00b4, B:68:0x00ce, B:70:0x00d2, B:60:0x00b9, B:61:0x00bc, B:63:0x00c2, B:65:0x00c6, B:71:0x00d8, B:73:0x00de, B:74:0x00e1, B:76:0x00eb, B:79:0x00f9, B:83:0x0103, B:85:0x0107, B:87:0x010d, B:89:0x0111, B:91:0x0119, B:93:0x011f, B:97:0x0127, B:99:0x0130, B:100:0x0134, B:101:0x0137, B:103:0x013c, B:112:0x0156, B:114:0x015a, B:104:0x0141, B:105:0x0144, B:107:0x014a, B:109:0x014e), top: B:236:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [dfe] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [dfe] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v25, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v29, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v30, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [b8e] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [dfe] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [dfe] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [b8e] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v5, types: [dfe] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r13, kotlin.jvm.functions.Function0 r14) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.d(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0119, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r20, defpackage.voh r21, kotlin.jvm.functions.Function1 r22) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.e(int, voh, kotlin.jvm.functions.Function1):java.lang.Boolean");
    }

    public final vg9 f() {
        vg9 vg9Var = this.h;
        if (vg9Var == null || !vg9Var.n) {
            return null;
        }
        return vg9Var;
    }

    public final boolean g(int i, boolean z) {
        vg9 vg9VarF = f();
        v31 v31Var = this.a;
        if (vg9VarF == null || !vg9VarF.o || !v31Var.A(i)) {
            pqh pqhVar = new pqh();
            pqhVar.a = Boolean.FALSE;
            vg9 vg9VarF2 = f();
            byte b = 3;
            Boolean boolE = e(i, v31Var.i(), new z91(pqhVar, i, (byte) 3));
            if (!Intrinsics.a(boolE, Boolean.TRUE) || vg9VarF2 == f()) {
                if (boolE != null && pqhVar.a != null) {
                    if (!boolE.booleanValue() || !((Boolean) pqhVar.a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean boolE2 = e(i, null, new m31(b, i));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new m31((byte) 2, i));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(vg9 vg9Var) {
        vg9 vg9Var2 = this.h;
        this.h = vg9Var;
        dee deeVar = this.g;
        Object[] objArr = deeVar.a;
        int i = deeVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((cg9) objArr[i2]).a(vg9Var2, vg9Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r3 = r0.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r0.e != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (((r0.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) == 254) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r3 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        if (r3 <= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        r12 = r0.d;
        r7 = jgm.b;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        if (java.lang.Long.compareUnsigned(r12 << 5, r3 * 25) > 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        r3 = r0.a;
        r7 = r0.c;
        r8 = r0.b;
        r9 = (r7 + 7) >> 3;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
    
        if (r12 >= r9) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        r32 = r14;
        r14 = r3[r12] & (-9187201950435737472L);
        r3[r12] = ((~r14) + (r14 >>> 7)) & (-72340172838076674L);
        r12 = r12 + 1;
        r4 = r4;
        r14 = r32;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
    
        r13 = r4;
        r36 = r5;
        r32 = r14;
        r4 = r3.length;
        r5 = r4 - 1;
        r4 = r4 - 2;
        r3[r4] = (r3[r4] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r4 == r7) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        r5 = r4 >> 3;
        r9 = (r4 & 7) << 3;
        r14 = (r3[r5] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012d, code lost:
    
        if (r14 == 128) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0131, code lost:
    
        if (r14 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0133, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        r12 = java.lang.Long.hashCode(r8[r4]) * r31;
        r14 = (r12 ^ (r12 << 16)) >>> 7;
        r15 = r0.b(r14);
        r14 = r14 & r7;
        r37 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0157, code lost:
    
        if ((((r15 - r14) & r7) / 8) != (((r4 - r14) & r7) / 8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0159, code lost:
    
        r38 = r6;
        r23 = r7;
        r3[r5] = (r3[r5] & (~(255 << r9))) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0175, code lost:
    
        r4 = r4 + 1;
        r7 = r23;
        r13 = r37;
        r6 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017e, code lost:
    
        r38 = r6;
        r23 = r7;
        r6 = r15 >> 3;
        r13 = r3[r6];
        r7 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0190, code lost:
    
        if (((r13 >> r7) & 255) != 128) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0192, code lost:
    
        r26 = r4;
        r3[r6] = (r13 & (~(255 << r7))) | ((r12 & 127) << r7);
        r3[r5] = (r3[r5] & (~(255 << r9))) | (128 << r9);
        r8[r15] = r8[r26];
        r8[r26] = r32;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
    
        r26 = r4;
        r3[r6] = (r13 & (~(255 << r7))) | ((r12 & 127) << r7);
        r4 = r8[r15];
        r8[r15] = r8[r26];
        r8[r26] = r4;
        r4 = r26 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d2, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01de, code lost:
    
        r38 = r6;
        r0.e = defpackage.imi.a(r0.c) - r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ef, code lost:
    
        r36 = r5;
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f4, code lost:
    
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f7, code lost:
    
        r3 = defpackage.imi.b(r0.c);
        r4 = r0.a;
        r5 = r0.b;
        r6 = r0.c;
        r0.c(r3);
        r3 = r0.a;
        r7 = r0.b;
        r8 = r0.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020e, code lost:
    
        if (r9 >= r6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x021d, code lost:
    
        if (((r4[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= r39) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021f, code lost:
    
        r12 = r5[r9];
        r14 = java.lang.Long.hashCode(r12) * r31;
        r14 = r14 ^ (r14 << 16);
        r15 = r0.b(r14 >>> 7);
        r17 = r3;
        r16 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r21 = (r17[r14] & (~(255 << r18))) | (r3 << r18);
        r17[r14] = r21;
        r17[(((r15 - 7) & r8) + (r8 & 7)) >> 3] = r21;
        r7[r15] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0259, code lost:
    
        r17 = r3;
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x025d, code lost:
    
        r9 = r9 + 1;
        r4 = r16;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0264, code lost:
    
        r3 = r0.b(r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0268, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x026a, code lost:
    
        r38 = true;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026f, code lost:
    
        r0.d++;
        r3 = r0.e;
        r4 = r0.a;
        r5 = r12 >> 3;
        r6 = r4[r5];
        r8 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0287, code lost:
    
        if (((r6 >> r8) & 255) != r39) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0289, code lost:
    
        r20 = r38 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028b, code lost:
    
        r0.e = r3 - r20;
        r3 = r0.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r12 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x032c, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x032e, code lost:
    
        r6 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r40) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg9.j(android.view.KeyEvent):boolean");
    }
}
