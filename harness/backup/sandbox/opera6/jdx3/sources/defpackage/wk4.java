package defpackage;

import com.opera.android.autofill.AutofillManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class wk4 extends gv2 {
    @Override // defpackage.gv2
    public final Function1 a(AutofillManager autofillManager) {
        return new r2(1, autofillManager, AutofillManager.class, "getCreditCards", "getCreditCards(Lcom/opera/api/Callback;)V", 0, (byte) 17);
    }

    @Override // defpackage.gv2
    public final Function1 c(AutofillManager autofillManager) {
        return new r2(1, autofillManager, AutofillManager.class, "removeCreditCard", "removeCreditCard(Ljava/lang/String;)V", 0, (byte) 18);
    }
}
