package defpackage;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fno extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Application v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fno(Application application, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = application;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Application application = this.v;
        switch (b) {
            case 0:
                return new fno(application, mt5Var, (byte) 0);
            case 1:
                return new fno(application, mt5Var, (byte) 1);
            case 2:
                return new fno(application, mt5Var, (byte) 2);
            case 3:
                return new fno(application, mt5Var, (byte) 3);
            case 4:
                return new fno(application, mt5Var, (byte) 4);
            case 5:
                return new fno(application, mt5Var, (byte) 5);
            case 6:
                return new fno(application, mt5Var, (byte) 6);
            case 7:
                return new fno(application, mt5Var, (byte) 7);
            case 8:
                return new fno(application, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new fno(application, mt5Var, (byte) 9);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new fno(application, mt5Var, (byte) 10);
            case 11:
                return new fno(application, mt5Var, (byte) 11);
            case 12:
                return new fno(application, mt5Var, (byte) 12);
            default:
                return new fno(application, mt5Var, (byte) 13);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fno.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
