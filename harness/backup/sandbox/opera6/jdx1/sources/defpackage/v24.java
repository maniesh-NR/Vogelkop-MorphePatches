package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class v24 implements v7e {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ v24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new u7e(new o6f(bArr), new asd(bArr, (u24) obj2, (byte) 1));
            case 1:
                return new u7e(new o6f(obj), new asd(obj.toString(), (j06) obj2));
            default:
                File file = (File) obj;
                return new u7e(new o6f(file), new m19((byte) 0, file, (n19) obj2));
        }
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
