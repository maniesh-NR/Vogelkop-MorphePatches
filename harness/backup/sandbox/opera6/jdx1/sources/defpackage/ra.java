package defpackage;

import android.content.Context;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class ra implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ra(Function1 function1, byte b) {
        this.a = b;
        this.b = function1;
    }

    public final Object invoke(Object obj) {
        Object q0iVar;
        byte b = this.a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke((WebView) obj);
                return Unit.a;
            case 1:
                return ((wa1) obj).y(function1);
            case 2:
                try {
                    List<String> list = (List) obj;
                    ArrayList arrayList = new ArrayList(k95.o(list, 10));
                    for (String str : list) {
                        arrayList.add(str != null ? p37.x(new orb(str)) : null);
                    }
                    function1.invoke(new sw7(arrayList));
                } catch (JSONException e) {
                    function1.invoke(new rw7(e));
                }
                return Unit.a;
            case 3:
                String str2 = (String) obj;
                if (str2 != null) {
                    try {
                        tfbVarJ = ujp.j(new orb(str2));
                    } catch (JSONException e2) {
                        function1.invoke(new rw7(e2));
                    }
                }
                function1.invoke(new sw7(tfbVarJ));
                return Unit.a;
            case 4:
                try {
                    function1.invoke(new sw7(y1j.g(new m2m(y1j.c(new d82((Set) obj, (byte) 1), new k51((byte) 26)), new k51((byte) 27)))));
                } catch (NumberFormatException e3) {
                    function1.invoke(new rw7(e3));
                }
                return Unit.a;
            case 5:
                String str3 = (String) obj;
                if (str3 != null) {
                    try {
                        tfbVarJ = p37.x(new orb(str3));
                    } catch (JSONException e4) {
                        function1.invoke(new rw7(e4));
                    }
                }
                function1.invoke(new sw7(tfbVarJ));
                return Unit.a;
            case 6:
                function1.invoke(obj);
                return Unit.a;
            case 7:
                function1.invoke(shm.a);
                return Unit.a;
            case 8:
                function1.invoke(new whm((b2h) obj));
                return Unit.a;
            case 9:
                function1.invoke(new mhm((Boolean) obj));
                return Unit.a;
            case 10:
                function1.invoke(new jhm((String) obj));
                return Unit.a;
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    tfbVarJ = Boolean.TRUE;
                } else if (iIntValue == 2) {
                    tfbVarJ = Boolean.FALSE;
                }
                function1.invoke(tfbVarJ);
                return Unit.a;
            case 12:
                function1.invoke(new eim((String) obj));
                return Unit.a;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                return Unit.a;
            case 14:
                u5m u5mVar = (u5m) obj;
                if (!(u5mVar instanceof cw9)) {
                    qp2.n("Node is not a GestureNode instance");
                    return null;
                }
                tfb tfbVar = ((cw9) u5mVar).o;
                tfbVarJ = tfbVar != null ? tfbVar : null;
                return Boolean.valueOf(tfbVarJ != null ? ((Boolean) function1.invoke(tfbVarJ)).booleanValue() : true);
            case 15:
                ttj ttjVar = (ttj) function1.invoke((xtj) obj);
                synchronized (ytj.c) {
                    ytj.d = ytj.d.f(ttjVar.g());
                }
                return ttjVar;
            case 16:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
            case 17:
                try {
                    p0i p0iVar = t0i.b;
                    q0iVar = function1.invoke(obj);
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                return new t0i(q0iVar);
            default:
                return (WebView) function1.invoke(new ywn((Context) obj));
        }
    }
}
