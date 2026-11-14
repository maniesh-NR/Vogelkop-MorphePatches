package defpackage;

/* loaded from: classes.dex */
public abstract class swj {
    public static final long a = rih.p(14);
    public static final long b = rih.p(0);
    public static final long c = u95.f;
    public static final pil d;

    static {
        long j = u95.b;
        d = j != 16 ? new za5(j) : oil.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rwj a(defpackage.rwj r24, long r25, defpackage.dz3 r27, float r28, long r29, defpackage.ki9 r31, defpackage.gi9 r32, defpackage.hi9 r33, defpackage.lh9 r34, java.lang.String r35, long r36, defpackage.ua3 r38, defpackage.vil r39, defpackage.awc r40, long r41, defpackage.bgl r43, defpackage.jaj r44, defpackage.ygg r45, defpackage.nk7 r46) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swj.a(rwj, long, dz3, float, long, ki9, gi9, hi9, lh9, java.lang.String, long, ua3, vil, awc, long, bgl, jaj, ygg, nk7):rwj");
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        skl[] sklVarArr = rkl.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    c8b.a("Cannot perform operation for Unspecified type.");
                }
                if (!skl.a(rkl.b(j), rkl.b(j2))) {
                    c8b.a("Cannot perform operation for " + skl.b(rkl.b(j)) + " and " + skl.b(rkl.b(j2)));
                }
                return rih.s(j3, yi4.G(rkl.c(j), rkl.c(j2), f));
            }
        }
        return ((rkl) b(f, new rkl(j), new rkl(j2))).a;
    }
}
