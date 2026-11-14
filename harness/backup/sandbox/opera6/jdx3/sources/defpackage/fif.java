package defpackage;

import com.opera.android.OperaApplication;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class fif implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ fif(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                return operaApplication.L().c;
            default:
                String[] strArr2 = OperaApplication.K;
                return operaApplication.L().d;
        }
    }
}
