package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fmc extends kuk implements Function2 {
    public Object A;
    public Collection B;
    public smc C;
    public omc D;
    public byte E;
    public final /* synthetic */ gmc F;
    public List t;
    public List u;
    public jmc v;
    public Iterator w;
    public Object x;
    public ArrayList y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(gmc gmcVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.F = gmcVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new fmc(this.F, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x043f, code lost:
    
        if (r3.equals("delayed") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04c1, code lost:
    
        if (r3.equals("not started") != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04c3, code lost:
    
        r1 = new defpackage.wmc(r18, r3);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Path cross not found for [B:126:0x0492, B:121:0x0482], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:129:0x049d, B:119:0x047e], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:132:0x04a8, B:117:0x0476], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:140:0x04d1, B:115:0x0472], limit reached: 199 */
    /* JADX WARN: Path cross not found for [B:45:0x0326, B:98:0x040f], limit reached: 199 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x054c A[LOOP:4: B:150:0x0546->B:152:0x054c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0596 A[LOOP:6: B:160:0x0594->B:161:0x0596, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05d6 A[PHI: r1 r2 r5 r7 r8 r32 r43
      0x05d6: PHI (r1v45 java.util.ArrayList) = (r1v43 java.util.ArrayList), (r1v46 java.util.ArrayList) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r2v27 java.lang.Object) = (r2v25 java.lang.Object), (r2v35 java.lang.Object) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r5v55 java.util.Collection) = (r5v67 java.util.Collection), (r5v68 java.util.Collection) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r7v50 jmc) = (r7v48 jmc), (r7v53 jmc) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r8v21 java.util.List) = (r8v19 java.util.List), (r8v25 java.util.List) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r32v13 gmc) = (r32v11 gmc), (r32v14 gmc) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x05d6: PHI (r43v4 j4c) = (r43v2 j4c), (r43v5 j4c) binds: [B:163:0x05d4, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ed A[LOOP:3: B:165:0x05e7->B:167:0x05ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x062d A[PHI: r1 r2 r3 r5 r6 r7 r8 r32 r43
      0x062d: PHI (r1v47 java.util.ArrayList) = (r1v45 java.util.ArrayList), (r1v48 java.util.ArrayList) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r2v36 java.lang.Object) = (r2v33 java.lang.Object), (r2v45 java.lang.Object) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r3v37 java.util.Collection) = (r3v44 java.util.Collection), (r3v38 java.util.Collection) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r5v58 java.util.Collection) = (r5v66 java.util.Collection), (r5v60 java.util.Collection) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r6v58 int) = (r6v54 int), (r6v69 int) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r7v54 jmc) = (r7v50 jmc), (r7v57 jmc) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r8v26 java.util.List) = (r8v21 java.util.List), (r8v30 java.util.List) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r32v15 gmc) = (r32v13 gmc), (r32v16 gmc) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x062d: PHI (r43v6 j4c) = (r43v4 j4c), (r43v7 j4c) binds: [B:169:0x062b, B:7:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0642 A[LOOP:2: B:171:0x063c->B:173:0x0642, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x069f A[LOOP:0: B:179:0x0699->B:181:0x069f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06d8 A[LOOP:1: B:183:0x06d2->B:185:0x06d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0195 A[PHI: r5 r6
      0x0195: PHI (r5v5 java.util.List) = (r5v4 java.util.List), (r5v8 java.util.List) binds: [B:20:0x0193, B:15:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v8 java.lang.Object) binds: [B:20:0x0193, B:15:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x02ae -> B:43:0x02b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
