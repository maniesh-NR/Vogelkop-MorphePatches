package defpackage;

import ads_mobile_sdk.if2;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ogb extends kuk implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ byte t;
    public Object u;
    public Object v;
    public byte w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(if2 if2Var, String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 5;
        this.y = if2Var;
        this.z = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(ContentResolver contentResolver, Uri uri, aa aaVar, p04 p04Var, Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        this.x = contentResolver;
        this.A = uri;
        this.B = aaVar;
        this.y = p04Var;
        this.z = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(cdk cdkVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.z = cdkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogb(cdk cdkVar, zrm zrmVar, zck zckVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.B = cdkVar;
        this.y = zrmVar;
        this.z = zckVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogb(gfe gfeVar, Object obj, Function1 function1, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.y = gfeVar;
        this.B = obj;
        this.z = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                ogb ogbVar = new ogb((gfe) this.y, (pgb) this.B, (Function1) obj2, mt5Var, (byte) 0);
                ogbVar.x = obj;
                return ogbVar;
            case 1:
                ogb ogbVar2 = new ogb((gfe) this.y, (mfe) this.B, (Function1) obj2, mt5Var, (byte) 1);
                ogbVar2.x = obj;
                return ogbVar2;
            case 2:
                return new ogb((cdk) this.B, (zrm) this.y, (zck) obj2, mt5Var);
            case 3:
                return new ogb((cdk) obj2, mt5Var);
            case 4:
                ogb ogbVar3 = new ogb((ContentResolver) this.x, (Uri) this.A, (aa) this.B, (p04) this.y, (Context) obj2, mt5Var);
                ogbVar3.v = obj;
                return ogbVar3;
            default:
                return new ogb((if2) this.y, (String) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return new ogb((if2) this.y, (String) this.z, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5 A[Catch: all -> 0x01f6, TRY_LEAVE, TryCatch #9 {all -> 0x01f6, blocks: (B:94:0x01c8, B:96:0x01cf, B:98:0x01d6, B:100:0x01da, B:102:0x01de, B:103:0x01df, B:104:0x01e4, B:105:0x01e5, B:106:0x01ec, B:107:0x01ed, B:108:0x01f4, B:109:0x01f5), top: B:314:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x025c A[Catch: all -> 0x028b, TRY_LEAVE, TryCatch #6 {all -> 0x028b, blocks: (B:122:0x0219, B:130:0x0248, B:132:0x0254, B:134:0x025c, B:126:0x022a, B:129:0x023f), top: B:310:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0322 A[Catch: all -> 0x035c, TryCatch #14 {all -> 0x035c, blocks: (B:150:0x02ba, B:175:0x0347, B:167:0x031a, B:169:0x0322, B:171:0x032c), top: B:322:0x02ba }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: all -> 0x00ff, TryCatch #18 {all -> 0x00ff, blocks: (B:21:0x00a0, B:23:0x00a4, B:26:0x00b3, B:27:0x00bc, B:29:0x00d2, B:30:0x00d7, B:32:0x00e3, B:33:0x00e6), top: B:330:0x00a0, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2 A[Catch: all -> 0x00ff, TryCatch #18 {all -> 0x00ff, blocks: (B:21:0x00a0, B:23:0x00a4, B:26:0x00b3, B:27:0x00bc, B:29:0x00d2, B:30:0x00d7, B:32:0x00e3, B:33:0x00e6), top: B:330:0x00a0, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3 A[Catch: all -> 0x00ff, TryCatch #18 {all -> 0x00ff, blocks: (B:21:0x00a0, B:23:0x00a4, B:26:0x00b3, B:27:0x00bc, B:29:0x00d2, B:30:0x00d7, B:32:0x00e3, B:33:0x00e6), top: B:330:0x00a0, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110 A[Catch: all -> 0x0137, TryCatch #10 {all -> 0x0137, blocks: (B:44:0x0109, B:46:0x0110, B:48:0x0117, B:50:0x011b, B:52:0x011f, B:53:0x0120, B:54:0x0125, B:55:0x0126, B:56:0x012d, B:57:0x012e, B:58:0x0135, B:59:0x0136), top: B:315:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #10 {all -> 0x0137, blocks: (B:44:0x0109, B:46:0x0110, B:48:0x0117, B:50:0x011b, B:52:0x011f, B:53:0x0120, B:54:0x0125, B:55:0x0126, B:56:0x012d, B:57:0x012e, B:58:0x0135, B:59:0x0136), top: B:315:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163 A[Catch: all -> 0x01be, TryCatch #16 {all -> 0x01be, blocks: (B:71:0x015f, B:73:0x0163, B:76:0x0172, B:77:0x017b, B:79:0x0191, B:80:0x0196, B:82:0x01a2, B:83:0x01a5), top: B:326:0x015f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191 A[Catch: all -> 0x01be, TryCatch #16 {all -> 0x01be, blocks: (B:71:0x015f, B:73:0x0163, B:76:0x0172, B:77:0x017b, B:79:0x0191, B:80:0x0196, B:82:0x01a2, B:83:0x01a5), top: B:326:0x015f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2 A[Catch: all -> 0x01be, TryCatch #16 {all -> 0x01be, blocks: (B:71:0x015f, B:73:0x0163, B:76:0x0172, B:77:0x017b, B:79:0x0191, B:80:0x0196, B:82:0x01a2, B:83:0x01a5), top: B:326:0x015f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf A[Catch: all -> 0x01f6, TryCatch #9 {all -> 0x01f6, blocks: (B:94:0x01c8, B:96:0x01cf, B:98:0x01d6, B:100:0x01da, B:102:0x01de, B:103:0x01df, B:104:0x01e4, B:105:0x01e5, B:106:0x01ec, B:107:0x01ed, B:108:0x01f4, B:109:0x01f5), top: B:314:0x01c8 }] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v61, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0281 -> B:130:0x0248). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x0343 -> B:152:0x02c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
