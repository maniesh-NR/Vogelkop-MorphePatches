package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class mb3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sjl b;

    public /* synthetic */ mb3(sjl sjlVar, byte b) {
        this.a = b;
        this.b = sjlVar;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean zBooleanValue = false;
        byte b2 = 2;
        sjl sjlVar = this.b;
        switch (b) {
            case 0:
                if (sjlVar != null) {
                    zBooleanValue = ((Boolean) new mb3(sjlVar, b2).invoke()).booleanValue();
                    break;
                }
                break;
            case 1:
                if (sjlVar != null) {
                    zBooleanValue = ((Boolean) new mb3(sjlVar, b2).invoke()).booleanValue();
                    break;
                }
                break;
            default:
                sf1 sf1Var = sjlVar.b;
                njl njlVar = (njl) sjlVar.a.getValue();
                return Boolean.valueOf(sf1Var.equals(njlVar != null ? njlVar.a.a : null));
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
