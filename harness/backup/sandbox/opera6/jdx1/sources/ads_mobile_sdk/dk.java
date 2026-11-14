package ads_mobile_sdk;

import defpackage.cs5;
import defpackage.mip;
import defpackage.prb;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class dk {
    public final CoroutineContext a;
    public final aj b;
    public final mip c;
    public final qr0 d;
    public final pfe f = new pfe();
    public xi g = xi.x();
    public prb h = new prb();

    public dk(CoroutineContext coroutineContext, aj ajVar, mip mipVar, qr0 qr0Var) {
        this.a = coroutineContext;
        this.b = ajVar;
        this.c = mipVar;
        this.d = qr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dk r9, mt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.lj
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.lj r0 = (ads_mobile_sdk.lj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.lj r0 = new ads_mobile_sdk.lj
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            pfe r9 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r10)
            goto L92
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r6
        L38:
            ads_mobile_sdk.dk r9 = r0.a
            defpackage.ybh.y(r10)
            goto L81
        L3e:
            pfe r9 = r0.b
            ads_mobile_sdk.dk r2 = r0.a
            defpackage.ybh.y(r10)
            r10 = r9
            r9 = r2
            goto L59
        L48:
            defpackage.ybh.y(r10)
            pfe r10 = r9.f
            r0.a = r9
            r0.b = r10
            r0.e = r5
            java.lang.Object r2 = r10.i(r0)
            if (r2 == r1) goto L8f
        L59:
            ads_mobile_sdk.xi r2 = r9.g     // Catch: java.lang.Throwable -> L9d
            r10.l(r6)
            ads_mobile_sdk.qr0 r10 = r9.d
            r10.getClass()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a
            java.lang.String r8 = "gads:app_settings_expiry_check_in_getter:enabled"
            java.lang.Object r10 = r10.a(r8, r5, r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L81
            r0.a = r9
            r0.b = r6
            r0.e = r4
            java.lang.Object r10 = r9.a(r2, r0)
            if (r10 == r1) goto L8f
        L81:
            pfe r10 = r9.f
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L90
        L8f:
            return r1
        L90:
            r0 = r9
            r9 = r10
        L92:
            ads_mobile_sdk.xi r10 = r0.g     // Catch: java.lang.Throwable -> L98
            r9.l(r6)
            return r10
        L98:
            r10 = move-exception
            r9.l(r6)
            throw r10
        L9d:
            r9 = move-exception
            r10.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(ads_mobile_sdk.dk, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dk r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ck
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ck r0 = (ads_mobile_sdk.ck) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.ck r0 = new ads_mobile_sdk.ck
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.f
            r0.a = r5
            r0.b = r6
            r0.f = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5.getClass()     // Catch: java.lang.Throwable -> L4f
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L4f
            r6.l(r4)
            return r5
        L4f:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(ads_mobile_sdk.dk, nt5):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.Pair */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x056a, code lost:
    
        if (defpackage.na2.Z(r2, r5, r3) == r4) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0268 A[Catch: Exception -> 0x0527, TRY_LEAVE, TryCatch #4 {Exception -> 0x0527, blocks: (B:67:0x018a, B:70:0x0196, B:75:0x01a7, B:77:0x01b4, B:79:0x01c1, B:81:0x01d5, B:83:0x01e3, B:85:0x01ee, B:87:0x01fb, B:89:0x020f, B:91:0x021d, B:93:0x022a, B:95:0x0239, B:97:0x024d, B:100:0x025d, B:102:0x0268), top: B:198:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a8 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e1 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fb A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031a A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b8 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ce A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0401 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042d A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0459 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0485 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b1 A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04df A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x050b A[Catch: Exception -> 0x0525, TryCatch #6 {Exception -> 0x0525, blocks: (B:105:0x0277, B:107:0x028f, B:110:0x029d, B:112:0x02a8, B:114:0x02b5, B:116:0x02cd, B:118:0x02d9, B:120:0x02e1, B:123:0x02ea, B:125:0x02f2, B:128:0x02fb, B:129:0x0300, B:130:0x0311, B:132:0x031a, B:134:0x033b, B:137:0x0345, B:139:0x034f, B:141:0x03b8, B:142:0x03c5, B:144:0x03ce, B:148:0x03d9, B:150:0x0401, B:151:0x0408, B:153:0x042d, B:154:0x0434, B:156:0x0459, B:157:0x0460, B:159:0x0485, B:160:0x048c, B:162:0x04b1, B:163:0x04b8, B:165:0x04df, B:166:0x04e6, B:168:0x050b, B:169:0x0512), top: B:202:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[Catch: Exception -> 0x052d, TryCatch #2 {Exception -> 0x052d, blocks: (B:17:0x004f, B:19:0x0057, B:20:0x0070, B:22:0x0079, B:24:0x008f, B:26:0x009b, B:28:0x00b8, B:30:0x00c0, B:33:0x00c8, B:34:0x00dd, B:41:0x00f9, B:43:0x0101, B:45:0x0109), top: B:196:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[Catch: Exception -> 0x052a, TryCatch #3 {Exception -> 0x052a, blocks: (B:53:0x012c, B:54:0x0138, B:55:0x013d, B:59:0x0147, B:61:0x0156, B:62:0x0162), top: B:197:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4 A[Catch: Exception -> 0x0527, TryCatch #4 {Exception -> 0x0527, blocks: (B:67:0x018a, B:70:0x0196, B:75:0x01a7, B:77:0x01b4, B:79:0x01c1, B:81:0x01d5, B:83:0x01e3, B:85:0x01ee, B:87:0x01fb, B:89:0x020f, B:91:0x021d, B:93:0x022a, B:95:0x0239, B:97:0x024d, B:100:0x025d, B:102:0x0268), top: B:198:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee A[Catch: Exception -> 0x0527, TryCatch #4 {Exception -> 0x0527, blocks: (B:67:0x018a, B:70:0x0196, B:75:0x01a7, B:77:0x01b4, B:79:0x01c1, B:81:0x01d5, B:83:0x01e3, B:85:0x01ee, B:87:0x01fb, B:89:0x020f, B:91:0x021d, B:93:0x022a, B:95:0x0239, B:97:0x024d, B:100:0x025d, B:102:0x0268), top: B:198:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a A[Catch: Exception -> 0x0527, TryCatch #4 {Exception -> 0x0527, blocks: (B:67:0x018a, B:70:0x0196, B:75:0x01a7, B:77:0x01b4, B:79:0x01c1, B:81:0x01d5, B:83:0x01e3, B:85:0x01ee, B:87:0x01fb, B:89:0x020f, B:91:0x021d, B:93:0x022a, B:95:0x0239, B:97:0x024d, B:100:0x025d, B:102:0x0268), top: B:198:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dk r21, defpackage.prb r22, long r23, nt5 r25) throws kotlin.Pair {
        /*
            Method dump skipped, instructions count: 1392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(ads_mobile_sdk.dk, prb, long, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.dk r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.mj
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.mj r0 = (ads_mobile_sdk.mj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.mj r0 = new ads_mobile_sdk.mj
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            pfe r9 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r10)
            goto L92
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r6
        L38:
            ads_mobile_sdk.dk r9 = r0.a
            defpackage.ybh.y(r10)
            goto L81
        L3e:
            pfe r9 = r0.b
            ads_mobile_sdk.dk r2 = r0.a
            defpackage.ybh.y(r10)
            r10 = r9
            r9 = r2
            goto L59
        L48:
            defpackage.ybh.y(r10)
            pfe r10 = r9.f
            r0.a = r9
            r0.b = r10
            r0.e = r5
            java.lang.Object r2 = r10.i(r0)
            if (r2 == r1) goto L8f
        L59:
            ads_mobile_sdk.xi r2 = r9.g     // Catch: java.lang.Throwable -> L9d
            r10.l(r6)
            ads_mobile_sdk.qr0 r10 = r9.d
            r10.getClass()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a
            java.lang.String r8 = "gads:app_settings_expiry_check_in_getter:enabled"
            java.lang.Object r10 = r10.a(r8, r5, r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L81
            r0.a = r9
            r0.b = r6
            r0.e = r4
            java.lang.Object r10 = r9.a(r2, r0)
            if (r10 == r1) goto L8f
        L81:
            pfe r10 = r9.f
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L90
        L8f:
            return r1
        L90:
            r0 = r9
            r9 = r10
        L92:
            prb r10 = r0.h     // Catch: java.lang.Throwable -> L98
            r9.l(r6)
            return r10
        L98:
            r10 = move-exception
            r9.l(r6)
            throw r10
        L9d:
            r9 = move-exception
            r10.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.b(ads_mobile_sdk.dk, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.dk r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.wj
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.wj r0 = (ads_mobile_sdk.wj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.wj r0 = new ads_mobile_sdk.wj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.f
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.qr0 r5 = r5.d     // Catch: java.lang.Throwable -> L54
            r5.L()     // Catch: java.lang.Throwable -> L54
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L54
            r6.l(r4)
            return r5
        L54:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.c(ads_mobile_sdk.dk, nt5):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r13, java.lang.String r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(java.lang.String, java.lang.String, nt5):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.xi r7, mt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.xj
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xj r0 = (ads_mobile_sdk.xj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xj r0 = new ads_mobile_sdk.xj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            pfe r6 = r0.b
            ads_mobile_sdk.dk r7 = r0.a
            defpackage.ybh.y(r8)
            goto L4d
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L32:
            defpackage.ybh.y(r8)
            boolean r7 = r6.a(r7)
            if (r7 != 0) goto L63
            r0.a = r6
            pfe r7 = r6.f
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r7.i(r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r5 = r7
            r7 = r6
            r6 = r5
        L4d:
            ads_mobile_sdk.xi r8 = ads_mobile_sdk.xi.x()     // Catch: java.lang.Throwable -> L5e
            r7.g = r8     // Catch: java.lang.Throwable -> L5e
            prb r8 = new prb     // Catch: java.lang.Throwable -> L5e
            r8.<init>()     // Catch: java.lang.Throwable -> L5e
            r7.h = r8     // Catch: java.lang.Throwable -> L5e
            r6.l(r4)
            goto L63
        L5e:
            r7 = move-exception
            r6.l(r4)
            throw r7
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(ads_mobile_sdk.xi, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.xi r6, defpackage.prb r7, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ak
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ak r0 = (ads_mobile_sdk.ak) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.ak r0 = new ads_mobile_sdk.ak
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r5 = r0.d
            prb r7 = r0.c
            ads_mobile_sdk.xi r6 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r5
            r5 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r8)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            pfe r8 = r5.f
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r5.g = r6     // Catch: java.lang.Throwable -> L58
            r5.h = r7     // Catch: java.lang.Throwable -> L58
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L58
            r8.l(r4)
            return r5
        L58:
            r5 = move-exception
            r8.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(ads_mobile_sdk.xi, prb, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.nj
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.nj r0 = (ads_mobile_sdk.nj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.nj r0 = new ads_mobile_sdk.nj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            r0.a = r5
            pfe r6 = r5.f
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.xi r5 = r5.g     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = r5.w()     // Catch: java.lang.Throwable -> L57
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L53
            r5 = r4
        L53:
            r6.l(r4)
            return r5
        L57:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a(nt5):java.lang.Object");
    }

    public final boolean a(xi xiVar) {
        long jY0;
        fo foVar = fo.a$21;
        if (xiVar.u().length() == 0) {
            return true;
        }
        qr0 qr0Var = this.d;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:use_server_defined_cld_ttl:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            on7 on7Var = pn7.b;
            long jZ = xiVar.z();
            un7 un7Var = un7.e;
            jY0 = cs5.y0(jZ, un7Var);
            on7Var.getClass();
            if (pn7.e(jY0, 0L)) {
                jY0 = ((pn7) qr0Var.a("gads:sdk_defined_cld_ttl_secs", new pn7(cs5.x0(-1, un7Var)), foVar)).a;
            }
        } else {
            on7 on7Var2 = pn7.b;
            jY0 = ((pn7) qr0Var.a("gads:sdk_defined_cld_ttl_secs", u0h.b(-1, un7.e), foVar)).a;
        }
        pn7.b.getClass();
        if (pn7.c(jY0, 0L) <= 0) {
            return true;
        }
        this.c.getClass();
        return pn7.c(cs5.y0(System.currentTimeMillis() - xiVar.y(), un7.d), jY0) <= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a$1(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.pj
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.pj r0 = (ads_mobile_sdk.pj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.pj r0 = new ads_mobile_sdk.pj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            r0.e = r3
            java.lang.Object r5 = a(r4, r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            ads_mobile_sdk.xi r5 = (ads_mobile_sdk.xi) r5
            java.util.Map r4 = r5.s()
            java.util.Set r4 = r4.keySet()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.a$1(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.rj
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.rj r0 = (ads_mobile_sdk.rj) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.rj r0 = new ads_mobile_sdk.rj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r5 = r0.d
            java.lang.String r6 = r0.c
            java.lang.String r7 = r0.b
            ads_mobile_sdk.dk r0 = r0.a
            defpackage.ybh.y(r8)
            goto L5b
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r8)
            if (r6 != 0) goto L3c
            return r4
        L3c:
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r6 = r6.toLowerCase(r8)
            r0.a = r5
            r0.b = r7
            r0.c = r6
            pfe r8 = r5.f
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r0 = r5
            r5 = r8
        L5b:
            ads_mobile_sdk.xi r8 = r0.g     // Catch: java.lang.Throwable -> La0
            r5.l(r4)
            java.util.Map r5 = r8.q()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = ","
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L81
            return r5
        L81:
            java.lang.String r5 = defpackage.joh.c(r8, r6, r7)
            java.util.Map r6 = r8.q()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r1)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            java.lang.Object r5 = r6.get(r5)
            return r5
        La0:
            r6 = move-exception
            r5.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.b(java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.lang.String r6, java.lang.String r7, nt5 r8) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dk.c(java.lang.String, java.lang.String, nt5):java.io.Serializable");
    }
}
