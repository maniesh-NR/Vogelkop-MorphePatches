package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class jya implements bk9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qya b;

    public /* synthetic */ jya(qya qyaVar, qya qyaVar2, byte b) {
        this.a = b;
        this.b = qyaVar2;
    }

    @Override // defpackage.bk9
    public final void a(ck9 ck9Var) throws Exception {
        byte b = this.a;
        qya qyaVar = this.b;
        switch (b) {
            case 0:
                int i = ImageProcessingUtil.a;
                qyaVar.close();
                break;
            default:
                int i2 = ImageProcessingUtil.a;
                qyaVar.close();
                break;
        }
    }
}
