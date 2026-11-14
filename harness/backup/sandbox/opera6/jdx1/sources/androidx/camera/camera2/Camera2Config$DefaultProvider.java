package androidx.camera.camera2;

import defpackage.ed4;
import defpackage.fee;
import defpackage.ua4;
import defpackage.va4;
import defpackage.wrf;
import defpackage.xg4;
import defpackage.yg4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Lxg4;", "<init>", "()V", "Lyg4;", "getCameraXConfig", "()Lyg4;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements xg4 {
    @Override // defpackage.xg4
    @NotNull
    public yg4 getCameraXConfig() {
        ed4 ed4Var = new ed4();
        fee feeVar = (fee) new eme((byte) 22).a;
        feeVar.s(yg4.b, ed4Var);
        feeVar.s(yg4.c, new ua4());
        feeVar.s(yg4.d, new va4());
        feeVar.s(yg4.l, Boolean.TRUE);
        return new yg4(wrf.f(feeVar));
    }
}
