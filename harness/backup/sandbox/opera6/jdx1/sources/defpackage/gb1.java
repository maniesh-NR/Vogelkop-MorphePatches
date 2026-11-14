package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class gb1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ afe b;

    public /* synthetic */ gb1(afe afeVar, byte b) {
        this.a = b;
        this.b = afeVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        afe afeVar = this.b;
        switch (b) {
            case 0:
                afeVar.setValue((b2c) obj);
                break;
            case 1:
                afeVar.setValue((b2c) obj);
                break;
            case 2:
                uel uelVar = (uel) obj;
                afeVar.setValue(uelVar.c ? uelVar.b : uelVar.a);
                break;
            case 3:
                List list = (List) obj;
                if (afeVar != null) {
                    afeVar.setValue(list);
                }
                break;
            case 4:
                afeVar.setValue((njl) obj);
                break;
            case 5:
                if (((qg9) obj).g()) {
                    afeVar.setValue(Boolean.TRUE);
                }
                break;
            case 6:
                afeVar.setValue(Integer.valueOf((int) (((b2c) obj).h() >> 32)));
                break;
            case 7:
                afeVar.setValue((String) obj);
                break;
            case 8:
                afeVar.setValue((String) obj);
                break;
            case 9:
                if (((qej) obj) == qej.a && ((Boolean) afeVar.getValue()).booleanValue()) {
                    z = false;
                }
                break;
            case 10:
                Integer num = (Integer) obj;
                num.getClass();
                afeVar.setValue(num);
                break;
            case 11:
                ((Boolean) obj).getClass();
                afeVar.setValue(Boolean.valueOf(!((Boolean) afeVar.getValue()).booleanValue()));
                break;
            case 12:
                Float f = (Float) obj;
                f.getClass();
                ((Function1) afeVar.getValue()).invoke(f);
                break;
            case 13:
                afeVar.setValue((b2c) obj);
                break;
            case 14:
                b2c b2cVar = (b2c) obj;
                afeVar.setValue(rm5.v(b2cVar).y(b2cVar, true));
                break;
            case 15:
                afeVar.setValue((b2c) obj);
                break;
            case 16:
                Float f2 = (Float) obj;
                f2.getClass();
                break;
            case 17:
                afeVar.setValue(obj);
                break;
            case 18:
                ((Function1) afeVar.getValue()).invoke((y8f) obj);
                break;
            default:
                afeVar.setValue((b2c) obj);
                break;
        }
        return Unit.a;
    }
}
