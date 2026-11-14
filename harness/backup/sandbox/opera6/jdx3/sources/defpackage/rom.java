package defpackage;

import J.N;
import com.opera.android.autofill.PasswordManager;

/* loaded from: classes.dex */
public final /* synthetic */ class rom implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ som b;

    public /* synthetic */ rom(som somVar, byte b) {
        this.a = b;
        this.b = somVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 2;
        som somVar = this.b;
        switch (b) {
            case 0:
                somVar.h = new PasswordManager();
                N.MNdH5xQ5(new ilm(somVar, b2));
                break;
            case 1:
                somVar.g = null;
                i53 i53Var = somVar.c;
                if (!i53Var.d()) {
                    somVar.k = true;
                    break;
                } else {
                    i53Var.a(somVar.d);
                    break;
                }
            default:
                PasswordManager passwordManager = somVar.h;
                ilm ilmVar = new ilm(somVar, b2);
                passwordManager.getClass();
                N.MNdH5xQ5(ilmVar);
                break;
        }
    }
}
