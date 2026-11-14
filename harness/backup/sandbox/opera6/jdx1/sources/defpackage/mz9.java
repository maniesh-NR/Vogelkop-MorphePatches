package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mz9 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz9(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz9(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz9(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz9(p04 p04Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.w = p04Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz9(qsj qsjVar, String str, ynh ynhVar, jsj jsjVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 25;
        this.v = qsjVar;
        this.w = str;
        this.x = jsjVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new mz9((p04) this.w, mt5Var);
            case 1:
                return new mz9((eka) this.w, (ks3) this.x, mt5Var, (byte) 1);
            case 2:
                return new mz9((eka) this.w, (ks3) this.x, mt5Var, (byte) 2);
            case 3:
                return new mz9((eka) this.w, (ks3) this.x, mt5Var, (byte) 3);
            case 4:
                return new mz9((cka) this.w, (ala) this.x, mt5Var, (byte) 4);
            case 5:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 5);
            case 6:
                return new mz9((ala) this.w, (cka) this.x, mt5Var, (byte) 6);
            case 7:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 7);
            case 8:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 8);
            case 9:
                mz9 mz9Var = new mz9((Function2) this.w, (l94) this.x, mt5Var, (byte) 9);
                mz9Var.v = obj;
                return mz9Var;
            case 10:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 10);
            case 11:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 11);
            case 12:
                mz9 mz9Var2 = new mz9((xo5) this.w, (moe) this.x, mt5Var, (byte) 12);
                mz9Var2.v = obj;
                return mz9Var2;
            case 13:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 13);
            case 14:
                mz9 mz9Var3 = new mz9((xf2) this.w, (lqh) this.x, mt5Var, (byte) 14);
                mz9Var3.v = obj;
                return mz9Var3;
            case 15:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 15);
            case 16:
                mz9 mz9Var4 = new mz9((byte) 16, mt5Var, (x79) this.x);
                mz9Var4.w = obj;
                return mz9Var4;
            case 17:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 17);
            case 18:
                mz9 mz9Var5 = new mz9((ylh) this.w, (bza) this.x, mt5Var, (byte) 18);
                mz9Var5.v = obj;
                return mz9Var5;
            case 19:
                mz9 mz9Var6 = new mz9((goh) this.w, (d9e) this.x, mt5Var, (byte) 19);
                mz9Var6.v = obj;
                return mz9Var6;
            case 20:
                mz9 mz9Var7 = new mz9((cd5) this.w, (Function2) this.x, mt5Var, (byte) 20);
                mz9Var7.v = obj;
                return mz9Var7;
            case 21:
                mz9 mz9Var8 = new mz9((s71) this.w, (spi) this.x, mt5Var, (byte) 21);
                mz9Var8.v = obj;
                return mz9Var8;
            case 22:
                mz9 mz9Var9 = new mz9((spi) this.w, (Function2) this.x, mt5Var, (byte) 22);
                mz9Var9.v = obj;
                return mz9Var9;
            case 23:
                mz9 mz9Var10 = new mz9((iak) this.w, (cd1) this.x, mt5Var, (byte) 23);
                mz9Var10.v = obj;
                return mz9Var10;
            case 24:
                mz9 mz9Var11 = new mz9((ehj) this.w, (kvh) this.x, mt5Var, (byte) 24);
                mz9Var11.v = obj;
                return mz9Var11;
            case 25:
                return new mz9((qsj) this.v, (String) this.w, (ynh) null, (jsj) this.x, mt5Var);
            case 26:
                return new mz9((fum) this.w, (afe) this.x, mt5Var, (byte) 26);
            case 27:
                return new mz9(this.v, this.w, this.x, mt5Var, (byte) 27);
            case 28:
                return new mz9((byte) 28, mt5Var, (cdk) this.x);
            default:
                mz9 mz9Var12 = new mz9((byte) 29, mt5Var, (sdk) this.x);
                mz9Var12.w = obj;
                return mz9Var12;
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
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 20:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((qpi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 22:
                return create((toi) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 24:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 25:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 26:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 27:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 28:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((y1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:188:0x03e8, B:198:0x0431], limit reached: 553 */
    /* JADX WARN: Path cross not found for [B:188:0x03e8, B:200:0x0435], limit reached: 553 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ee A[Catch: CancellationException -> 0x044b, all -> 0x0453, TRY_ENTER, TryCatch #11 {CancellationException -> 0x044b, all -> 0x0453, blocks: (B:184:0x03cc, B:190:0x03ee, B:192:0x040f, B:193:0x041d), top: B:477:0x03cc }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0969 A[Catch: all -> 0x0996, TryCatch #5 {all -> 0x0996, blocks: (B:426:0x093a, B:434:0x0961, B:436:0x0969, B:437:0x0976, B:444:0x0986, B:431:0x0953, B:446:0x0989, B:448:0x098e, B:449:0x098f, B:430:0x094e, B:438:0x0977, B:440:0x097d), top: B:463:0x092e, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:523:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [or4] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p04] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [or4] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x0427 -> B:196:0x042b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:432:0x095d -> B:434:0x0961). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
