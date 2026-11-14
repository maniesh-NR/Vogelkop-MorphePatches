package defpackage;

import android.app.Activity;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class wz5 extends Activity {
    public final String a;
    public final int b;
    public final String c;

    public wz5(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public int a() {
        return this.b;
    }

    public CharSequence b() {
        return getTitle();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!Intrinsics.a(getIntent().getAction(), "android.intent.action.CREATE_SHORTCUT")) {
            finish();
            return;
        }
        vml.d.e(new so4((Object) this, a(), (Object) b(), (byte) 2)).c(new jl4((Object) this, (byte) 22)).a(Unit.a, null);
    }
}
