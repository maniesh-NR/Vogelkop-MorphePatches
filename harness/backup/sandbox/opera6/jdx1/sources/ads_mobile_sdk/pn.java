package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pn extends kuk implements Function2 {
    public Object a;
    public byte b;
    public final /* synthetic */ eo c;
    public final /* synthetic */ nx5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(eo eoVar, nx5 nx5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.c = eoVar;
        this.d = nx5Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new pn(this.c, this.d, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new pn(this.c, this.d, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:99)|(1:(1:(1:(1:(1:(4:9|91|92|93)(2:11|12))(6:13|14|15|82|92|93))(8:16|17|77|(1:79)|81|82|92|93))(3:18|92|93))(3:20|21|22))(2:24|(2:26|27)(6:28|(1:32)|33|34|(1:36)|90))|23|37|(1:42)(1:41)|43|103|44|45|105|46|(3:57|58|59)(7:60|101|61|62|(3:75|(4:77|(0)|81|82)|90)(4:64|(6:66|107|67|68|(0)(0)|90)|72|(2:74|90))|92|93)|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        r16 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r8 = ads_mobile_sdk.hh3.a();
        r8.a(r0);
        r8 = r8.e().s;
        r15 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r15 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0100, code lost:
    
        r15 = r0.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r8.add(r15);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        if (ads_mobile_sdk.a80.a(r4, r0, r18) != r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01df, code lost:
    
        if (r0.b(r18) == r2) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #3 {all -> 0x01b6, blocks: (B:82:0x019d, B:77:0x0189, B:79:0x018d, B:46:0x00df, B:57:0x010e, B:60:0x0125, B:61:0x0131, B:62:0x013d, B:64:0x014d, B:66:0x0151, B:67:0x0155, B:68:0x0161, B:70:0x0167, B:72:0x016d, B:75:0x0178, B:52:0x00ed, B:54:0x0100, B:55:0x0108), top: B:99:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[Catch: all -> 0x01b6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01b6, blocks: (B:82:0x019d, B:77:0x0189, B:79:0x018d, B:46:0x00df, B:57:0x010e, B:60:0x0125, B:61:0x0131, B:62:0x013d, B:64:0x014d, B:66:0x0151, B:67:0x0155, B:68:0x0161, B:70:0x0167, B:72:0x016d, B:75:0x0178, B:52:0x00ed, B:54:0x0100, B:55:0x0108), top: B:99:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178 A[Catch: all -> 0x01b6, TryCatch #3 {all -> 0x01b6, blocks: (B:82:0x019d, B:77:0x0189, B:79:0x018d, B:46:0x00df, B:57:0x010e, B:60:0x0125, B:61:0x0131, B:62:0x013d, B:64:0x014d, B:66:0x0151, B:67:0x0155, B:68:0x0161, B:70:0x0167, B:72:0x016d, B:75:0x0178, B:52:0x00ed, B:54:0x0100, B:55:0x0108), top: B:99:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d A[Catch: all -> 0x01b6, TryCatch #3 {all -> 0x01b6, blocks: (B:82:0x019d, B:77:0x0189, B:79:0x018d, B:46:0x00df, B:57:0x010e, B:60:0x0125, B:61:0x0131, B:62:0x013d, B:64:0x014d, B:66:0x0151, B:67:0x0155, B:68:0x0161, B:70:0x0167, B:72:0x016d, B:75:0x0178, B:52:0x00ed, B:54:0x0100, B:55:0x0108), top: B:99:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
