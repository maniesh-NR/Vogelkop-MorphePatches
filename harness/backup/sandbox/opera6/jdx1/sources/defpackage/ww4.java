package defpackage;

import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ww4 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q0j b;

    public /* synthetic */ ww4(q0j q0jVar, byte b) {
        this.a = b;
        this.b = q0jVar;
    }

    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        byte b = this.a;
        boolean z = false;
        q0j q0jVar = this.b;
        switch (b) {
            case 0:
                b1g b1gVar = (b1g) ((u5m) obj);
                b1gVar.p = true;
                b1gVar.o.invoke(q0jVar);
                aoh.j(b1gVar);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((e61) obj).a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    o0j.j(q0jVar, boolValueOf.booleanValue() ? bsl.a : bsl.b);
                    break;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((e61) obj).a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    o0j.j(q0jVar, boolValueOf.booleanValue() ? bsl.a : bsl.b);
                    break;
                }
                return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
