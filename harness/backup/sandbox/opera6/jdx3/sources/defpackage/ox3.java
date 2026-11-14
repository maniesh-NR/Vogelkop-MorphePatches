package defpackage;

import com.opera.android.OperaApplication;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final /* synthetic */ class ox3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ ox3(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final Object get() {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                return operaApplication.L().f;
            case 1:
                return operaApplication.L().h;
            case 2:
                fue fueVarZ = operaApplication.z();
                fueVarZ.d();
                return fueVarZ.a;
            case 3:
                fue fueVarZ2 = operaApplication.z();
                fueVarZ2.d();
                return fueVarZ2.a;
            case 4:
                String[] strArr = OperaApplication.K;
                return ru9.c(operaApplication);
            case 5:
                String[] strArr2 = OperaApplication.K;
                return operaApplication.D();
            case 6:
                String[] strArr3 = OperaApplication.K;
                return operaApplication.L().f;
            case 7:
                String[] strArr4 = OperaApplication.K;
                return (zv9) operaApplication.r.O.get();
            case 8:
                String[] strArr5 = OperaApplication.K;
                long j = u59.C(operaApplication).H().b;
                if (j != 0) {
                    return Long.valueOf(j);
                }
                return null;
            default:
                CommandLine commandLine = operaApplication.n;
                if (commandLine != null) {
                    return commandLine;
                }
                return null;
        }
    }
}
