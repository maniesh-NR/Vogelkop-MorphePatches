package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wr extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Context u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 11;
        dap dapVar = dap.a;
        this.u = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr(Context context, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = context;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Context context = this.u;
        switch (b) {
            case 0:
                return new wr(context, mt5Var, (byte) 0);
            case 1:
                return new wr(context, mt5Var, (byte) 1);
            case 2:
                return new wr(context, mt5Var, (byte) 2);
            case 3:
                return new wr(context, mt5Var, (byte) 3);
            case 4:
                return new wr(context, mt5Var, (byte) 4);
            case 5:
                return new wr(context, mt5Var, (byte) 5);
            case 6:
                return new wr(context, mt5Var, (byte) 6);
            case 7:
                return new wr(context, mt5Var, (byte) 7);
            case 8:
                return new wr(context, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new wr(context, mt5Var, (byte) 9);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new wr(context, mt5Var, (byte) 10);
            case 11:
                dap dapVar = dap.a;
                return new wr(context, mt5Var);
            default:
                return new wr(context, mt5Var, (byte) 12);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0234 A[Catch: all -> 0x024c, TRY_LEAVE, TryCatch #8 {all -> 0x024c, blocks: (B:94:0x01b9, B:95:0x01ed, B:97:0x01f3, B:101:0x0210, B:103:0x0221, B:105:0x0226, B:100:0x020c, B:107:0x022f, B:109:0x0234), top: B:157:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
