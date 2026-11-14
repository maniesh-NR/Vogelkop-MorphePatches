package defpackage;

import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class wif implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

    public /* synthetic */ wif(OperaAutofillIntentDispatcherActivity operaAutofillIntentDispatcherActivity, byte b) {
        this.a = b;
        this.b = operaAutofillIntentDispatcherActivity;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
    public final Object invoke(Object obj) {
        byte b = this.a;
        ?? r2 = this.b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                int i = OperaAutofillIntentDispatcherActivity.i;
                if (zBooleanValue) {
                    r2.B(true);
                } else {
                    r2.finish();
                }
                break;
            case 1:
                int i2 = OperaAutofillIntentDispatcherActivity.i;
                if (zBooleanValue) {
                    r2.z(true);
                } else {
                    r2.finish();
                }
                break;
            case 2:
                int i3 = OperaAutofillIntentDispatcherActivity.i;
                if (zBooleanValue) {
                    r2.A(true);
                } else {
                    r2.finish();
                }
                break;
            default:
                int i4 = OperaAutofillIntentDispatcherActivity.i;
                if (zBooleanValue) {
                    r2.y(true);
                } else {
                    r2.finish();
                }
                break;
        }
        return Unit.a;
    }
}
