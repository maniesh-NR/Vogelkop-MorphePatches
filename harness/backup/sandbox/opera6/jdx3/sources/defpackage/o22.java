package defpackage;

import com.opera.api.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o22 implements Callback, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x22 b;

    public /* synthetic */ o22(x22 x22Var, byte b) {
        this.a = b;
        this.b = x22Var;
    }

    public final br9 a() {
        switch (this.a) {
        }
        return new nr9(1, this.b, x22.class, "pickCameraOnError", "pickCameraOnError(Lcom/opera/android/webaiassistant/WebAiAssistantViewModel$CameraError;)V", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
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
        x22 x22Var = this.b;
        switch (b) {
            case 0:
                x22Var.i((xrn) obj);
                break;
            default:
                x22Var.i((xrn) obj);
                break;
        }
    }
}
