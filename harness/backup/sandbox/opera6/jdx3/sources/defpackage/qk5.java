package defpackage;

import com.leanplum.Leanplum;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.messagetemplates.OperaConfigBundleSheet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qk5 extends VariablesChangedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uk5 b;

    public /* synthetic */ qk5(uk5 uk5Var, byte b) {
        this.a = b;
        this.b = uk5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.leanplum.callbacks.VariablesChangedCallback
    public final void variablesChanged() {
        Object rw7Var;
        byte b = this.a;
        int i = 0;
        Object[] objArr = 0;
        uk5 uk5Var = this.b;
        switch (b) {
            case 0:
                Collection<Object> collectionValues = Leanplum.messageMetadata().values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (obj instanceof Map) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    rw7Var = new rw7(new dzh("Onboarding"));
                } else {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (Intrinsics.a(((Map) obj2).get("action"), OperaConfigBundleSheet.NAME)) {
                            rw7Var = new sw7(Unit.a);
                        }
                    }
                    rw7Var = new rw7(new dzh("Onboarding"));
                }
                uk5Var.run(rw7Var);
                break;
            default:
                Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new qk5(uk5Var, objArr == true ? 1 : 0));
                break;
        }
    }
}
