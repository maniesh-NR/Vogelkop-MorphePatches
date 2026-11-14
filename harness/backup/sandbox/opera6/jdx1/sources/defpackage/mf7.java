package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class mf7 implements r1o {
    public final /* synthetic */ dx3 a;
    public final /* synthetic */ Callback b;

    public mf7(dx3 dx3Var, Callback callback) {
        this.a = dx3Var;
        this.b = callback;
    }

    public final void a(int i, Intent intent) {
        Uri data;
        if (i != -1 || intent == null || (data = intent.getData()) == null || (intent.getFlags() & 3) != 3) {
            return;
        }
        this.a.getContentResolver().takePersistableUriPermission(data, 3);
        this.b.run(data);
    }
}
