package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;

/* loaded from: classes.dex */
public final class ja4 implements cd4 {
    public final String a;
    public final int b;
    public final CameraExtensionCharacteristics c;
    public final l4c d;

    public ja4(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics, n08 n08Var) {
        this.a = str;
        this.b = i;
        this.c = cameraExtensionCharacteristics;
        f7c f7cVar = f7c.b;
        z4c.a(f7cVar, new ia4(this, (byte) 0));
        z4c.a(f7cVar, new ia4(this, (byte) 1));
        this.d = z4c.a(f7cVar, new ia4(this, (byte) 2));
        z4c.a(f7cVar, new ia4(this, (byte) 3));
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CameraExtensionCharacteristics.class))) {
            return this.c;
        }
        return null;
    }
}
