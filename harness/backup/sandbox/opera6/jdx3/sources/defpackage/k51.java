package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.leanplum.utils.SizeUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class k51 implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ k51(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        byte b = 6;
        boolean z = false;
        switch (this.a) {
            case 0:
                xtb[] xtbVarArr = o0j.a;
                p0j p0jVar = n0j.y;
                Unit unit = Unit.a;
                ((q0j) obj).b(p0jVar, unit);
                return unit;
            case 1:
                ((Long) obj).getClass();
                return Unit.a;
            case 2:
                xtb[] xtbVarArr2 = o0j.a;
                p0j p0jVar2 = n0j.x;
                Unit unit2 = Unit.a;
                ((q0j) obj).b(p0jVar2, unit2);
                return unit2;
            case 3:
                ((Long) obj).getClass();
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                return Long.valueOf(((wa1) obj).execute());
            case 6:
                c6n c6nVar = (c6n) obj;
                c6nVar.getHandler().post(new c4(c6nVar.r, (byte) 24));
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(!(((of1) obj) instanceof yzf));
            case 11:
                return Unit.a;
            case 12:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 13:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 14:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 15:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 16:
                int i = pr1.a;
                t41 t41Var = (t41) obj;
                return new hu1(t41Var.b(0), t41Var.b(1), t41Var.a(2), t41Var.b(3), t41Var.a(4), t41Var.b(5), t41Var.b(6), t41Var.a(7), t41Var.b(8));
            case 17:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 19:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case 21:
                ((Function1) obj).invoke("app_data");
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                Context context = (Context) obj;
                if (Build.VERSION.SDK_INT >= 31) {
                    try {
                        context.startActivity(new Intent("android.settings.MANAGE_ALL_SIM_PROFILES_SETTINGS"));
                    } catch (ActivityNotFoundException unused) {
                    }
                } else {
                    context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                }
                return Unit.a;
            case 23:
                return new vx((e00) obj, b);
            case SizeUtil.textSize2 /* 24 */:
                return Boolean.valueOf(((jx1) obj) instanceof fz1);
            case 25:
                return wqm.m((Uri) obj, "s");
            case 26:
                String str = (String) obj;
                if (c.q(str, "chat/", false) && StringsKt.K(str, '/', 5, 4) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                return Long.valueOf(Long.parseLong(((String) obj).substring(5)));
            case 28:
                return null;
            default:
                return t12.c;
        }
    }
}
