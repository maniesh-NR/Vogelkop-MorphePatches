package defpackage;

import J.N;
import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q25 extends r25 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q25(byte b) {
        super("BrowsingHistory", new rxh(2132021320), null, 2131232106, a35.k);
        this.f = b;
        switch (b) {
            case 1:
                super("CookiesAndData", new rxh(2132021322), new rxh(2132021323), 2131232048, a35.e);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q25(String str, rxh rxhVar, rxh rxhVar2, int i, a35 a35Var) {
        super(str, rxhVar, rxhVar2, i, a35Var);
        this.f = (byte) 2;
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        switch (this.f) {
            case 0:
                ac8.a(new m35(false, runnable));
                break;
            case 1:
                i7f i7fVar = lx3.a;
                N.MO3$NI3G((Object) null, true, new jx3(null, runnable, (byte) 0));
                break;
            default:
                qln qlnVar = s25Var.i;
                qlnVar.o(false);
                qlnVar.o.u("most_popular", new m2n(qlnVar, (byte) 6));
                vzk vzkVar = qlnVar.j;
                ArrayList arrayList = (ArrayList) vzkVar.d;
                arrayList.clear();
                nv6 nv6VarB = ((ru9) vzkVar.a).b();
                ((SharedPreferences.Editor) nv6VarB.a).remove("wallpaper.favorites.list");
                nv6VarB.w();
                ((kze) vzkVar.c).r(arrayList);
                SettingsManager settingsManager = qlnVar.e;
                y9j y9jVar = settingsManager.a;
                if (y9jVar.contains("wallpaper_current")) {
                    y9jVar.remove("wallpaper_current");
                    settingsManager.Q("wallpaper_current");
                }
                s14 s14Var = (s14) qlnVar.f.d;
                s14Var.getClass();
                s14Var.G(new y1n((Object) s14Var, (byte) 24));
                runnable.run();
                break;
        }
    }

    @Override // defpackage.r25
    public final int b() {
        switch (this.f) {
            case 1:
                return 2132018237;
            default:
                return super.b();
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                p25 p25Var = new p25((iu2) callback, s25Var, (byte) 0);
                i7f i7fVar = lx3.a;
                N.MCljwZu_(p25Var);
                break;
            case 1:
                xj xjVar = new xj((iu2) callback, s25Var, (byte) 29);
                i7f i7fVar2 = lx3.a;
                N.MOJ0_F$K(xjVar, (Object) null, true);
                break;
            default:
                ((iu2) callback).run(s25Var.a.getString(2132021393));
                break;
        }
    }
}
