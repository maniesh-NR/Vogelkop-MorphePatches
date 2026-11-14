package defpackage;

import com.leanplum.messagetemplates.OperaSubscriptionDialogRequest;
import com.leanplum.messagetemplates.OperaSubscriptionDialogRequestKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class jof implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaSubscriptionDialogRequest.Model b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ jof(OperaSubscriptionDialogRequest.Model model, Function0 function0, byte b) {
        this.a = b;
        this.b = model;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        Function0 function0 = this.c;
        OperaSubscriptionDialogRequest.Model model = this.b;
        switch (b) {
            case 0:
                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$3$0(model, function0);
            case 1:
                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$1$0$0$0(model, function0);
            default:
                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$0$0$0$0(model, function0);
        }
    }
}
