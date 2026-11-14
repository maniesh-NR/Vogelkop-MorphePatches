package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class xc9 implements w6f {
    public final h7f a = new h7f();
    public final nrl b = new nrl((byte) 26);
    public final b59 c;
    public wc9 d;

    public xc9(Context context, tcl tclVar) {
        this.c = w1h.l(context, tclVar, "flow", new bg1[]{new b94(tclVar, new dg7(this, (byte) 22), (byte) 0)});
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        s1f s1fVar = (s1f) obj;
        if (this.d == null) {
            this.d = new wc9(this, (byte) 0);
            ((SharedPreferences) this.c.get()).registerOnSharedPreferenceChangeListener(this.d);
        }
        this.a.b(s1fVar);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        h7f h7fVar = this.a;
        h7fVar.c((s1f) obj);
        if (this.d == null || !h7fVar.isEmpty()) {
            return;
        }
        ((SharedPreferences) this.c.get()).unregisterOnSharedPreferenceChangeListener(this.d);
        this.d = null;
    }

    public final void a() {
        j.a((SharedPreferences) this.c.get(), "unread_message");
    }
}
