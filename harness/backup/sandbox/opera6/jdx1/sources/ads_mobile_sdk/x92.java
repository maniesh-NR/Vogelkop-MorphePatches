package ads_mobile_sdk;

import android.content.Context;
import defpackage.ato;
import defpackage.wpb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x92 implements ato {
    public final u92 a;
    public final ah3 b;
    public final qr0 c;
    public final m5a d;
    public final zv1 e;
    public final Context f;

    public x92(u92 u92Var, ah3 ah3Var, qr0 qr0Var, m5a m5aVar, zv1 zv1Var, Context context) {
        this.a = u92Var;
        this.b = ah3Var;
        this.c = qr0Var;
        this.d = m5aVar;
        this.e = zv1Var;
        this.f = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026a, code lost:
    
        if (r15.equals("ANCHORED_ADAPTIVE_LANDSCAPE") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c1, code lost:
    
        if (r15.equals("INLINE_ADAPTIVE_LANDSCAPE") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c8, code lost:
    
        if (r15.equals("ANCHORED_ADAPTIVE_PORTRAIT") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ca, code lost:
    
        r13 = r32;
        r12 = "INLINE_ADAPTIVE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0228, code lost:
    
        if (r15.equals("INLINE_ADAPTIVE_PORTRAIT") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0232, code lost:
    
        if (r15.equals("LARGE_ANCHORED_ADAPTIVE_LANDSCAPE") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023a, code lost:
    
        if (r15.equals("ANCHORED_ADAPTIVE") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0242, code lost:
    
        if (r15.equals("LARGE_ANCHORED_ADAPTIVE_PORTRAIT") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024a, code lost:
    
        if (r15.equals("LARGE_ANCHORED_ADAPTIVE") == false) goto L126;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:131:0x0332. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x021f. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f4  */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [int] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r4v30, types: [ads_mobile_sdk.be0, rkp] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r44, java.util.Map r45, mt5 r46) throws m2 {
        /*
            Method dump skipped, instructions count: 2810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x92.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    public final List a(String str, String str2) {
        try {
            wpb wpbVar = (wpb) this.d.b(wpb.class, str);
            ArrayList arrayList = new ArrayList();
            if (wpbVar != null) {
                ArrayList arrayList2 = wpbVar.a;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        j95.n();
                        throw null;
                    }
                    String strN = ((pqb) obj).n();
                    if (strN != null) {
                        arrayList.add(strN);
                    }
                    i = i3;
                }
            }
            return arrayList;
        } catch (ksb e) {
            this.b.a("Failed to parse OOCT string array: " + str2 + ".", e);
            return l08.a;
        }
    }

    @Override // defpackage.ato
    public final int b() {
        return 44;
    }
}
