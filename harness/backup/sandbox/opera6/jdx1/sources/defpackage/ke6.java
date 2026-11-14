package defpackage;

import android.content.Context;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ke6 {
    public final String a;
    public final yhe b;
    public final a64 c;
    public final Object d = new Object();
    public volatile ie6 e;

    public ke6(String str, yhe yheVar, tb6 tb6Var, a64 a64Var) {
        this.a = str;
        this.b = yheVar;
        this.c = a64Var;
    }

    public final Object a(Object obj) {
        ie6 ie6Var;
        Context context = (Context) obj;
        ie6 ie6Var2 = this.e;
        if (ie6Var2 != null) {
            return ie6Var2;
        }
        synchronized (this.d) {
            if (this.e == null) {
                haf hafVar = new haf(g29.SYSTEM, this.b, new gb3(this, context.getApplicationContext(), (byte) 19));
                l08 l08Var = l08.a;
                a64 a64Var = this.c;
                this.e = new ie6(hafVar, Collections.singletonList(new r3((byte) 25, (mt5) null, (Object) l08Var)), new a36(), a64Var);
            }
            ie6Var = this.e;
        }
        return ie6Var;
    }
}
