package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class iv1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv1 b;

    public /* synthetic */ iv1(xv1 xv1Var, byte b) {
        this.a = b;
        this.b = xv1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xv1 xv1Var = this.b;
        switch (b) {
            case 0:
                return ((lpe) xv1Var.i0.get()).c;
            case 1:
                return (SettingsManager) xv1Var.P0.get();
            default:
                return uyg.d((SettingsManager) xv1Var.P0.get(), "ga_usage_statistics", new ve5((byte) 28));
        }
    }
}
