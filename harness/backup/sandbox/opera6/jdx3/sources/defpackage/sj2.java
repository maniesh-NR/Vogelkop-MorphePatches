package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class sj2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public sj2(Context context, int i, int i2, rj2 rj2Var) {
        this.c = context;
        this.e = oi.d(context);
        this.a = i;
        this.b = i2;
        this.d = rj2Var;
    }

    public sj2(String str) {
        this.a = 0;
        this.b = 0;
        this.c = str;
    }

    public static boolean g(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure();
    }

    public abstract void a();

    public abstract boolean b(Object obj);

    public abstract Object c();

    public abstract Object d();

    public final void e() {
        Context context = (Context) this.c;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (!keyguardManager.isKeyguardSecure()) {
            ((rj2) this.d).Y();
            i();
        } else {
            String string = context.getString(this.b);
            int i = this.a;
            ((hjf) ((oi) this.e)).D(keyguardManager.createConfirmDeviceCredentialIntent(i == 0 ? null : context.getString(i), string), new qj2(this, (byte) 0));
        }
    }

    public boolean f() {
        String str = (String) this.c;
        if (this.d != null) {
            return true;
        }
        return (str == null || str.length() == 0 || this.a >= str.length()) ? false : true;
    }

    public abstract void h();

    public void i() {
    }
}
