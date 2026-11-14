package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ox0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ afe b;

    public /* synthetic */ ox0(afe afeVar, byte b) {
        this.a = b;
        this.b = afeVar;
    }

    public final Object invoke() throws pxb {
        byte b = this.a;
        afe afeVar = this.b;
        switch (b) {
            case 0:
                afeVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                afeVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 2:
                afeVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 3:
                b2c b2cVar = (b2c) afeVar.getValue();
                if (b2cVar != null) {
                    return b2cVar;
                }
                d8b.d("Required value was null.");
                t3p.v();
                return null;
            case 4:
                b2c b2cVar2 = (b2c) afeVar.getValue();
                if (b2cVar2 != null) {
                    return b2cVar2;
                }
                d8b.d("Required value was null.");
                t3p.v();
                return null;
            case 5:
                if (afeVar != null) {
                    return (List) afeVar.getValue();
                }
                return null;
            case 6:
                Boolean bool = (Boolean) afeVar.getValue();
                bool.booleanValue();
                return bool;
            case 7:
                afeVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 8:
                afeVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 9:
                afeVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 10:
                Unit unit = Unit.a;
                afeVar.setValue(unit);
                return unit;
            case 11:
                ((tj8) afeVar.getValue()).getClass();
                afeVar.setValue(new tj8());
                return Unit.a;
            case 12:
                return (b2c) afeVar.getValue();
            case 13:
                return (k5c) ((Function0) afeVar.getValue()).invoke();
            case 14:
                return new h6c((Function1) afeVar.getValue());
            case 15:
                b2c b2cVar3 = (b2c) afeVar.getValue();
                if (b2cVar3 != null) {
                    return b2cVar3;
                }
                d8b.d("Required value was null.");
                t3p.v();
                return null;
            default:
                return (b2c) afeVar.getValue();
        }
    }
}
