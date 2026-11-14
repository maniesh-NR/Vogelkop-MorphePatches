package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.leanplum.internal.Constants;
import com.opera.android.continue_on_booking.NativeContinueOnBookingStorage;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ku5 implements w6f {
    public final c5o a;
    public final NativeContinueOnBookingStorage b;
    public final qb7 c;
    public final x5f d;
    public final h7f e;
    public List f;
    public boolean g;
    public final eu5 h;

    public ku5(Context context, x5f x5fVar) {
        c5o c5oVar = new c5o(context, (byte) 11);
        NativeContinueOnBookingStorage nativeContinueOnBookingStorage = new NativeContinueOnBookingStorage();
        qb7 qb7Var = new qb7(context, (byte) 27);
        this.e = new h7f();
        this.h = new eu5(this);
        this.a = c5oVar;
        this.b = nativeContinueOnBookingStorage;
        this.c = qb7Var;
        this.d = x5fVar;
        fu5 fu5Var = new fu5(this, (byte) 0);
        Boolean bool = (Boolean) qb7Var.c;
        if (bool == null) {
            ((ArrayList) qb7Var.a).add(fu5Var);
        } else {
            fu5Var.run(bool);
        }
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        ju5 ju5Var = (ju5) obj;
        this.e.b(ju5Var);
        ju5Var.e(this.g);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.e.c((ju5) obj);
    }

    public final boolean a() {
        c5o c5oVar = this.a;
        int iOrdinal = c5oVar.s().ordinal();
        if (iOrdinal != 0) {
            return iOrdinal == 2 && System.currentTimeMillis() > ((SharedPreferences) ((b59) c5oVar.a).get()).getLong("postponed_remind_timestamp", -1L);
        }
        return true;
    }

    public final void b() {
        if (this.f == null || e()) {
            return;
        }
        if (this.f.size() >= 2) {
            ((SharedPreferences) ((b59) this.a.a).get()).edit().putString(Constants.Params.STATE, "visible").apply();
            g();
        } else if (this.f.isEmpty()) {
            c();
        }
    }

    public final void c() {
        this.a.A();
        g();
    }

    public final boolean e() {
        c5o c5oVar = this.a;
        int iOrdinal = c5oVar.s().ordinal();
        return iOrdinal != 2 ? iOrdinal == 3 : System.currentTimeMillis() <= ((SharedPreferences) ((b59) c5oVar.a).get()).getLong("postponed_remind_timestamp", -1L);
    }

    public final void f(Runnable runnable) {
        hu5 hu5Var = new hu5((Object) this, (Object) runnable, (byte) 0);
        this.b.getClass();
        NativeContinueOnBookingStorage.Request request = new NativeContinueOnBookingStorage.Request(hu5Var);
        avj avjVar = cak.d;
        avj.g(1, request);
    }

    public final void g() {
        boolean zA = a();
        if (zA != this.g) {
            this.g = zA;
            c5o c5oVar = this.a;
            if (zA) {
                SharedPreferences sharedPreferences = (SharedPreferences) ((b59) c5oVar.a).get();
                if (!sharedPreferences.getBoolean("reported_available", false)) {
                    j.d(sharedPreferences, "reported_available", true);
                    x5f x5fVar = this.d;
                    if (x5fVar.h) {
                        x5fVar.k(1);
                    }
                }
            } else {
                j.a((SharedPreferences) ((b59) c5oVar.a).get(), "reported_available");
            }
            h7f h7fVar = this.e;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((ju5) g7fVarH.next()).e(zA);
            }
        }
    }
}
