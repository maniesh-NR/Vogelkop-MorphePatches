package ads_mobile_sdk;

import android.app.AlertDialog;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lf0 extends kuk implements Function2 {
    public final /* synthetic */ AlertDialog.Builder a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf0(AlertDialog.Builder builder, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = builder;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                return new lf0(builder, mt5Var, (byte) 0);
            case 1:
                return new lf0(builder, mt5Var, (byte) 1);
            case 2:
                return new lf0(builder, mt5Var, (byte) 2);
            default:
                return new lf0(builder, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                return new lf0(builder, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new lf0(builder, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new lf0(builder, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            default:
                return new lf0(builder, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        AlertDialog.Builder builder = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                builder.create().show();
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                builder.create().show();
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                builder.create().show();
                break;
            default:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                builder.create().show();
                break;
        }
        return Unit.a;
    }
}
