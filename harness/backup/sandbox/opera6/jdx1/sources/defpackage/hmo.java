package defpackage;

import ads_mobile_sdk.b90;
import ads_mobile_sdk.t70;
import ads_mobile_sdk.xa2;
import ads_mobile_sdk.xi;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hmo extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hmo(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return new hmo((byte) 0, mt5Var, (wjh) obj2);
            case 1:
                return new hmo((byte) 1, mt5Var, (xa2) obj2);
            case 2:
                return new hmo((byte) 2, mt5Var, (t70) obj2);
            case 3:
                return new hmo((byte) 3, mt5Var, (b90) obj2);
            case 4:
                return new hmo((byte) 4, mt5Var, (xi) obj2);
            case 5:
                return new hmo((byte) 5, mt5Var, (qb7) obj2);
            case 6:
                return new hmo((byte) 6, mt5Var, (File) obj2);
            case 7:
                return new hmo((byte) 7, mt5Var, (t5p) obj2);
            default:
                return new hmo((byte) 8, mt5Var, (String) obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.u;
        switch (b) {
            case 1:
                break;
            case 2:
                t70 t70Var = (t70) obj3;
                new hmo((byte) 2, (mt5) obj2, t70Var);
                Unit unit = Unit.a;
                px5 px5Var = px5.a;
                ybh.y(unit);
                break;
            case 3:
                break;
            case 4:
                xi xiVar = (xi) obj3;
                new hmo((byte) 4, (mt5) obj2, xiVar);
                Unit unit2 = Unit.a;
                px5 px5Var2 = px5.a;
                ybh.y(unit2);
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        String strI;
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                wjh wjhVar = (wjh) obj2;
                z29.h((File) ((zyk) wjhVar.f).getValue());
                return Boolean.valueOf(z29.h((File) wjhVar.d));
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ArrayList arrayList = ((xa2) obj2).g;
                ArrayList arrayList2 = arrayList != null ? arrayList : null;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    ((unb) obj3).k(new CancellationException("Best possible ad config has been rendered, cancelling inflight renderers."));
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                return (t70) obj2;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                b90 b90Var = (b90) obj2;
                Context context = b90Var.a;
                if (b90Var.e == null && (strI = l45.I(context)) != null && !strI.equals(context.getPackageName())) {
                    l45.g(context, strI, b90Var);
                }
                return Unit.a;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                return (xi) obj2;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                return x29.c(((yjo) ((qb7) obj2).a).a());
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                z29.h((File) obj2);
                return Unit.a;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                t5p t5pVar = (t5p) obj2;
                Iterator it = CollectionsKt.k0(d1p.d).iterator();
                while (it.hasNext()) {
                    ((n1p) it.next()).invoke(t5pVar);
                }
                return Unit.a;
            default:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                dap dapVar = dap.a;
                return dap.d((String) obj2, k0l.K, (Function1) null, cdp.Jq).b;
        }
    }
}
