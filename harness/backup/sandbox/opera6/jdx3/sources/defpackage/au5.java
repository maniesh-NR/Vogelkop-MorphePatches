package defpackage;

import J.N;
import android.content.SharedPreferences;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class au5 implements w1n {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ au5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static void a(String str, tq8 tq8Var) {
        ArrayList arrayList = tq8Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (hq8Var.j()) {
                a(str, (tq8) hq8Var);
            } else if (Intrinsics.a(hq8Var.i(p6l.a), "ofa://ui/aria?source=sd_plus") && Intrinsics.a(hq8Var.h(), "Aria")) {
                hq8Var.q(str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @Override // defpackage.w1n
    public final void apply(int i) {
        d7j d7jVarE;
        d7j d7jVarE2;
        byte b = this.a;
        h70 h70Var = h70.c;
        d7j d7jVar = d7j.DEFAULT;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i != 0 && i < 1909702000) {
                    ku5 ku5Var = (ku5) ((pv3) obj2).get();
                    if (ku5Var.a.s() == lu5.d || ku5Var.a.s() == lu5.c) {
                        nv6 nv6VarB = ((ru9) ((mt3) obj).invoke()).b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.continue_booking_shown", true);
                        nv6VarB.w();
                        break;
                    }
                }
                break;
            case 1:
                if (i > 0 && i < 1908109000 && ((sl6) ((wv1) obj2).b.get()).b()) {
                    ru9 ru9Var = (ru9) ((tt3) obj).get();
                    if (!ru9Var.a.contains("default_browser.first_set.timestamp")) {
                        nv6 nv6VarB2 = ru9Var.b();
                        ((SharedPreferences.Editor) nv6VarB2.a).putLong("default_browser.first_set.timestamp", 0L);
                        nv6VarB2.w();
                        break;
                    }
                }
                break;
            case 2:
                if (i > 0 && i < 1910400000) {
                    ((umi) obj2).c(new y1n(this, (byte) 0)).a(null);
                    break;
                }
                break;
            case 3:
                if (i >= 1905600000 && i < 1905700000 && ((db) ((wv1) obj).b.get()).f()) {
                    e eVar = (e) ((nr8) ((wv1) obj2).b.get());
                    eVar.getClass();
                    i7f i7fVar = FavoritesBridge.a;
                    if (!N.MYJauVto()) {
                        eVar.f(new yqd(eVar, (byte) 5));
                        break;
                    } else {
                        N.MjFpzBBk();
                        break;
                    }
                }
                break;
            case 4:
                if (i > 0 && i < 1904704000 && ((db) ((wv1) obj2).b.get()).f()) {
                    String[] strArr = OperaApplication.K;
                    SharedPreferences.Editor editorEdit = ((swk) ((OperaApplication) ((BrowserActivity) obj).getApplicationContext()).r.Z0.get()).a().edit();
                    editorEdit.putBoolean("password.promote", true);
                    editorEdit.apply();
                    break;
                }
                break;
            case 5:
                if (i < 1907700000 && ((ru9) ((tt3) obj).get()).a.getBoolean("ai.tos_accepted", false)) {
                    x5f x5fVar = (x5f) ((skm) ((wv1) obj2).b.get());
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.O(zpaVar).r(19, 1, true);
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 6:
                b6h b6hVar = ((wv1) obj2).b;
                if (i > 0 && i < 1908701000 && (d7jVarE = ((SettingsManager) ((tt3) obj).get()).e()) != d7jVar) {
                    ((x5f) ((orm) b6hVar.get())).S(28);
                    if (d7jVarE.d) {
                        h70Var = h70.b;
                    }
                    orm ormVar = (orm) b6hVar.get();
                    String str = d7jVarE.a;
                    x5f x5fVar2 = (x5f) ormVar;
                    if (x5fVar2.h) {
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF2 = zpa.F();
                        g70 g70Var = (g70) am2.g(zpaVar2, x56VarF2).d.getValue();
                        f70 f70Var = g70Var.a;
                        f70Var.getClass();
                        f70Var.q(0, 1, str);
                        f70 f70Var2 = g70Var.a;
                        f70Var2.getClass();
                        f70Var2.q(1, 1, h70Var);
                        x5fVar2.U0(x56VarF2);
                        break;
                    }
                }
                break;
            case 7:
                if (i > 0 && i < 190871000 && (d7jVarE2 = ((SettingsManager) ((tt3) obj).get()).e()) == d7jVar) {
                    orm ormVar2 = (orm) ((wv1) obj2).b.get();
                    String str2 = d7jVarE2.a;
                    x5f x5fVar3 = (x5f) ormVar2;
                    if (x5fVar3.h) {
                        zpa zpaVar3 = x5fVar3.d;
                        x56 x56VarF3 = zpa.F();
                        g70 g70Var2 = (g70) am2.g(zpaVar3, x56VarF3).d.getValue();
                        f70 f70Var3 = g70Var2.a;
                        f70Var3.getClass();
                        f70Var3.q(0, 1, str2);
                        f70 f70Var4 = g70Var2.a;
                        f70Var4.getClass();
                        f70Var4.q(1, 1, h70Var);
                        x5fVar3.U0(x56VarF3);
                        break;
                    }
                }
                break;
            default:
                if (i != 0 && i < 1909400000) {
                    ((nr8) obj).f(new y1n(this, (byte) 1));
                    ?? r6 = (BrowserActivity) obj2;
                    vml.d.e(new fv3(r6, r6.getString(2132017628))).a(Unit.a);
                    break;
                }
                break;
        }
    }
}
