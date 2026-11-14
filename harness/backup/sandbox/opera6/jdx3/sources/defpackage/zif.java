package defpackage;

import com.opera.android.autofill.OperaAutofillService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class zif implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaAutofillService b;

    public /* synthetic */ zif(OperaAutofillService operaAutofillService, byte b) {
        this.a = b;
        this.b = operaAutofillService;
    }

    public final Object invoke() {
        byte b = this.a;
        OperaAutofillService operaAutofillService = this.b;
        switch (b) {
            case 0:
                int i = OperaAutofillService.d;
                return (xu2) operaAutofillService.getApplicationContext();
            default:
                int i2 = OperaAutofillService.d;
                return operaAutofillService.getApplicationContext().getPackageManager();
        }
    }
}
