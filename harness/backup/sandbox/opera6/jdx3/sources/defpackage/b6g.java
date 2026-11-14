package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class b6g implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f6g b;

    public /* synthetic */ b6g(f6g f6gVar, byte b) {
        this.a = b;
        this.b = f6gVar;
    }

    public final Object invoke() {
        byte b = this.a;
        f6g f6gVar = this.b;
        switch (b) {
            case 0:
                nv6 nv6VarB = f6gVar.J0().l.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("no_lock_screen_password_manager_dialog", false);
                nv6VarB.w();
                break;
            case 1:
                f6gVar.g0();
                break;
            default:
                f6gVar.H0();
                break;
        }
        return Unit.a;
    }
}
