package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class s66 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t66 b;

    public s66(t66 t66Var, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.a = (byte) 7;
        this.b = t66Var;
    }

    public s66(t66 t66Var, int i, int i2, Bundle bundle) {
        this.a = (byte) 5;
        this.b = t66Var;
    }

    public s66(t66 t66Var, int i, Uri uri, boolean z, Bundle bundle) {
        this.a = (byte) 4;
        this.b = t66Var;
    }

    public /* synthetic */ s66(t66 t66Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = t66Var;
    }

    public /* synthetic */ s66(t66 t66Var, String str, Bundle bundle, byte b) {
        this.a = b;
        this.b = t66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t66 t66Var = this.b;
        switch (b) {
            case 0:
                t66Var.b.getClass();
                break;
            case 1:
                t66Var.b.getClass();
                break;
            case 2:
                t66Var.b.getClass();
                break;
            case 3:
                t66Var.b.getClass();
                break;
            case 4:
                t66Var.b.getClass();
                break;
            case 5:
                t66Var.b.getClass();
                break;
            case 6:
                t66Var.b.getClass();
                break;
            case 7:
                t66Var.b.getClass();
                break;
            default:
                t66Var.b.getClass();
                break;
        }
    }
}
