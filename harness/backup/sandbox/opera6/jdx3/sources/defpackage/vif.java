package defpackage;

import android.content.Intent;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class vif implements ph, av2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

    public /* synthetic */ vif(OperaAutofillIntentDispatcherActivity operaAutofillIntentDispatcherActivity, byte b) {
        this.a = b;
        this.b = operaAutofillIntentDispatcherActivity;
    }

    @Override // defpackage.av2
    public final void f(Integer num) {
        int i = OperaAutofillIntentDispatcherActivity.i;
        this.b.finish();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
    public final void k(Object obj) {
        byte b = this.a;
        ?? r3 = this.b;
        switch (b) {
            case 0:
                oh ohVar = (oh) obj;
                int i = OperaAutofillIntentDispatcherActivity.i;
                if (ohVar.a != -1) {
                    r3.finish();
                    break;
                } else {
                    ((OperaApplication) r3.u()).f().a.S(24);
                    Intent intent = ohVar.b;
                    r3.t(intent != null ? intent.getExtras() : null);
                    break;
                }
            default:
                ArrayList arrayList = r3.h;
                int i2 = OperaAutofillIntentDispatcherActivity.i;
                if (((oh) obj).a != -1) {
                    r3.finish();
                    break;
                } else {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((Runnable) obj2).run();
                    }
                    arrayList.clear();
                    break;
                }
        }
    }
}
