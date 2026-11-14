package defpackage;

import J.N;
import com.opera.android.autofill.PasswordDataMonitor;
import com.opera.android.autofill.PasswordManager;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x5g implements w6f {
    public final PasswordManager a;
    public final i7f b = new i7f();
    public PasswordDataMonitor c;
    public final w4g d;
    public a4g e;
    public a4g f;

    public x5g(PasswordManager passwordManager, vnj vnjVar) {
        this.a = passwordManager;
        this.d = new w4g(vnjVar);
        c();
    }

    public static void b(x5g x5gVar, Callback callback) {
        a4g a4gVar = x5gVar.e;
        if (a4gVar != null) {
            callback.run(a4gVar);
        } else {
            x5gVar.a(callback);
        }
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        c();
        this.b.b((w5g) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.b.c((w5g) obj);
    }

    public final void a(Callback callback) {
        c();
        eof eofVar = new eof((Object) this, (Object) callback, (byte) 6);
        this.a.getClass();
        PasswordManager.a(eofVar);
    }

    public final void c() {
        if (this.c == null) {
            vdf vdfVar = new vdf(this, (byte) 16);
            PasswordManager passwordManager = this.a;
            passwordManager.getClass();
            PasswordDataMonitor passwordDataMonitor = new PasswordDataMonitor();
            passwordDataMonitor.a = vdfVar;
            passwordDataMonitor.b = N.MtK05rRq(passwordDataMonitor);
            this.c = passwordDataMonitor;
            a(null);
            c();
            o8f o8fVar = new o8f(this, (byte) 13);
            passwordManager.getClass();
            N.MwwLnzkg(o8fVar, new ArrayList());
        }
    }
}
