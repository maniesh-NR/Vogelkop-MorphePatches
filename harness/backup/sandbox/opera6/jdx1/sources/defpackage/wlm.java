package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class wlm implements v7e {
    public static final wlm b = new wlm(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ wlm(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        switch (this.a) {
            case 0:
                return new u7e(new o6f(obj), new d34(obj, (byte) 1));
            case 1:
                File file = (File) obj;
                return new u7e(new o6f(file), new d34(file, (byte) 0));
            default:
                return null;
        }
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
