package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class ig7 implements ue7 {
    public final /* synthetic */ jg7 a;

    public /* synthetic */ ig7(jg7 jg7Var) {
        this.a = jg7Var;
    }

    @Override // defpackage.ue7
    public final void a(Uri uri, String str) {
        this.a.f(uri, str);
    }

    public final void b(vvj vvjVar) {
        wg7 wg7Var = this.a.a;
        wg7Var.M = vvjVar;
        ((SharedPreferences) wg7Var.x.get()).edit().putInt("downloads_sort_order", vvjVar.a).apply();
        ze7 ze7Var = wg7Var.z;
        if (ze7Var != null) {
            ze7Var.J(new ArrayList(ze7Var.a), vvjVar);
        }
    }
}
