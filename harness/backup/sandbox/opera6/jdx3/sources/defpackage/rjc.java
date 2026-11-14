package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class rjc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tjc b;

    public /* synthetic */ rjc(tjc tjcVar, byte b) {
        this.a = b;
        this.b = tjcVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        int i = 0;
        byte b2 = 1;
        tjc tjcVar = this.b;
        switch (b) {
            case 0:
                File file = new File(new File(tjcVar.c.getDataDir(), "app_opera"), "Login Data");
                if (file.exists()) {
                    tjcVar.h = new g0d(tjcVar.a, new vx(tjcVar, (byte) 22), file.toString());
                    z = true;
                }
                break;
            case 1:
                ArrayList arrayList = tjcVar.e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Function0) obj2).invoke();
                }
                arrayList.clear();
                break;
            default:
                Object obj3 = ((t0i) obj).a;
                Throwable thD = t0i.d(obj3);
                Object obj4 = obj3;
                if (thD != null) {
                    obj4 = Boolean.FALSE;
                }
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                tjcVar.g = zBooleanValue;
                if (zBooleanValue) {
                    new rml(Unit.a, tjcVar.a).a(new rjc(tjcVar, b2)).m(tjcVar.f);
                }
                tjcVar.b.invoke(tjcVar, Boolean.valueOf(tjcVar.g));
                break;
        }
        return Unit.a;
    }
}
