package ads_mobile_sdk;

import defpackage.bfp;
import defpackage.tso;

/* loaded from: classes.dex */
public abstract class kn extends f2 implements bfp {
    public final tso l;
    public final q70 m;
    public final oo3 n;
    public final nx5 o;
    public final y01 p;
    public final yi q;

    public /* synthetic */ kn(tso tsoVar, q70 q70Var, oo3 oo3Var, nx5 nx5Var, y01 y01Var, yi yiVar, kh3 kh3Var, defpackage.r83 r83Var, av2 av2Var, long j, int i, a2 a2Var, xv xvVar, n13 n13Var, String str, ve2 ve2Var) {
        this(tsoVar, q70Var, oo3Var, nx5Var, y01Var, yiVar, kh3Var, r83Var, av2Var, j, i, a2Var, xvVar, n13Var, str, ve2Var, new v31());
    }

    public kn(tso tsoVar, q70 q70Var, oo3 oo3Var, nx5 nx5Var, y01 y01Var, yi yiVar, kh3 kh3Var, defpackage.r83 r83Var, av2 av2Var, long j, int i, a2 a2Var, xv xvVar, n13 n13Var, String str, ve2 ve2Var, v31 v31Var) {
        super(kh3Var, r83Var, av2Var, j, i, a2Var, xvVar, n13Var, str, ve2Var, v31Var);
        this.l = tsoVar;
        this.m = q70Var;
        this.n = oo3Var;
        this.o = nx5Var;
        this.p = y01Var;
        this.q = yiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1 A[Catch: all -> 0x02b2, TRY_LEAVE, TryCatch #2 {all -> 0x02b2, blocks: (B:96:0x0284, B:98:0x028b, B:100:0x0292, B:102:0x0296, B:104:0x029a, B:105:0x029b, B:106:0x02a0, B:107:0x02a1, B:108:0x02a8, B:109:0x02a9, B:110:0x02b0, B:111:0x02b1), top: B:148:0x0284 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c6 A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:122:0x02bf, B:124:0x02c6, B:126:0x02cd, B:128:0x02d1, B:130:0x02d5, B:131:0x02d6, B:132:0x02db, B:133:0x02dc, B:134:0x02e3, B:135:0x02e4, B:136:0x02eb, B:137:0x02ec), top: B:155:0x02bf }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ec A[Catch: all -> 0x02ed, TRY_LEAVE, TryCatch #6 {all -> 0x02ed, blocks: (B:122:0x02bf, B:124:0x02c6, B:126:0x02cd, B:128:0x02d1, B:130:0x02d5, B:131:0x02d6, B:132:0x02db, B:133:0x02dc, B:134:0x02e3, B:135:0x02e4, B:136:0x02eb, B:137:0x02ec), top: B:155:0x02bf }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0234 A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #7 {all -> 0x027f, blocks: (B:15:0x0051, B:80:0x022e, B:82:0x0234), top: B:156:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028b A[Catch: all -> 0x02b2, TryCatch #2 {all -> 0x02b2, blocks: (B:96:0x0284, B:98:0x028b, B:100:0x0292, B:102:0x0296, B:104:0x029a, B:105:0x029b, B:106:0x02a0, B:107:0x02a1, B:108:0x02a8, B:109:0x02a9, B:110:0x02b0, B:111:0x02b1), top: B:148:0x0284 }] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v28, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.kn r22, nt5 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kn.a(ads_mobile_sdk.kn, nt5):java.lang.Object");
    }

    @Override // defpackage.bfp
    public final yi a() {
        return this.q;
    }

    @Override // ads_mobile_sdk.f2
    public final Object a(boolean z, mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }

    @Override // defpackage.yno
    public final boolean b() {
        s61 s61Var = this.f.I;
        if ((s61Var != null ? s61Var.a : null) == null) {
            return (s61Var != null ? s61Var.b : null) != null;
        }
        return true;
    }
}
