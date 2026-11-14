package defpackage;

import com.opera.android.live_score.data.db.LiveScoreDatabase_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s76 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public s1m u;
    public byte v;
    public /* synthetic */ Object w;
    public final /* synthetic */ LiveScoreDatabase_Impl x;
    public final /* synthetic */ Function1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s76(LiveScoreDatabase_Impl liveScoreDatabase_Impl, mt5 mt5Var, Function1 function1, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = liveScoreDatabase_Impl;
        this.y = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Function1 function1 = this.y;
        LiveScoreDatabase_Impl liveScoreDatabase_Impl = this.x;
        switch (b) {
            case 0:
                s76 s76Var = new s76(liveScoreDatabase_Impl, mt5Var, function1, (byte) 0);
                s76Var.w = obj;
                return s76Var;
            default:
                s76 s76Var2 = new s76(liveScoreDatabase_Impl, mt5Var, function1, (byte) 1);
                s76Var2.w = obj;
                return s76Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        j3g j3gVar = (j3g) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(j3gVar, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[PHI: r1 r13
      0x0097: PHI (r1v18 j3g) = (r1v15 j3g), (r1v22 j3g) binds: [B:31:0x0095, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r13v39 java.lang.Object) = (r13v36 java.lang.Object), (r13v0 java.lang.Object) binds: [B:31:0x0095, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f A[PHI: r1 r13
      0x013f: PHI (r1v7 j3g) = (r1v4 j3g), (r1v11 j3g) binds: [B:71:0x013d, B:54:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r13v16 java.lang.Object) = (r13v13 java.lang.Object), (r13v0 java.lang.Object) binds: [B:71:0x013d, B:54:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s76.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
