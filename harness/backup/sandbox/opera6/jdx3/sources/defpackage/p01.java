package defpackage;

import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class p01 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ p01(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            case 1:
                ((m1i) obj).c(((Number) function0.invoke()).floatValue());
                break;
            case 2:
                break;
            case 3:
                lmm lmmVar = (lmm) obj;
                int i = AutofillPasswordPickerActivity.o;
                if (lmmVar == lmm.a) {
                    function0.invoke();
                }
                break;
            case 4:
                mk7.z0((mk7) obj, ((u95) function0.invoke()).a, 0L, 0.0f, 126);
                break;
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            case 8:
                function0.invoke();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                function0.invoke();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                function0.invoke();
                break;
            case 11:
                break;
            case 12:
                ((Float) obj).floatValue();
                break;
            case 13:
                function0.invoke();
                break;
            case 14:
                function0.invoke();
                break;
            case 15:
                break;
            case 16:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
