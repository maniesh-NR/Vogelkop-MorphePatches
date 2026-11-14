package defpackage;

import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class kif implements Callback, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaApplication b;

    public /* synthetic */ kif(OperaApplication operaApplication, byte b) {
        this.a = b;
        this.b = operaApplication;
    }

    public final br9 a() {
        switch (this.a) {
        }
        return new nr9(1, this.b, OperaApplication.class, "onOspPingBack", "onOspPingBack(Lcom/opera/android/osp/Subject;)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Callback) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        OperaApplication operaApplication = this.b;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                vml.c(new hpd(operaApplication, (lkk) obj, (byte) 27));
                break;
            case 1:
                String[] strArr2 = OperaApplication.K;
                vml.c(new hpd(operaApplication, (lkk) obj, (byte) 27));
                break;
            case 2:
                String[] strArr3 = OperaApplication.K;
                vml.c(new hpd(operaApplication, (lkk) obj, (byte) 27));
                break;
            case 3:
                String[] strArr4 = OperaApplication.K;
                vml.c(new hpd(operaApplication, (lkk) obj, (byte) 27));
                break;
            default:
                String[] strArr5 = OperaApplication.K;
                vml.c(new hpd(operaApplication, (lkk) obj, (byte) 27));
                break;
        }
    }
}
