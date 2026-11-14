package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class fyk implements w1n {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ fyk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public fyk(wv1 wv1Var, tt3 tt3Var, wv1 wv1Var2) {
        this.a = (byte) 0;
        this.b = wv1Var;
        this.d = tt3Var;
        this.c = wv1Var2;
    }

    @Override // defpackage.w1n
    public final void apply(int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                if (i != 0 && i < 1908518000) {
                    if (!((db) ((wv1) obj2).b.get()).f() || !((SettingsManager) ((tt3) obj).get()).i("enable_sync")) {
                        ((nr8) ((wv1) obj3).b.get()).f(new qlk(this, (byte) 17));
                        break;
                    }
                }
                break;
            case 1:
                if (i < 1909206000) {
                    SettingsManager settingsManager = (SettingsManager) ((tt3) obj).get();
                    hlm hlmVar = (hlm) jlm.a.d(new Pair((BrowserActivity) obj2, (umi) obj3));
                    if (!settingsManager.i("ga_usage_statistics")) {
                        hlmVar.a(null);
                        break;
                    } else {
                        ilm ilmVar = new ilm(hlmVar, (byte) 0);
                        avj avjVar = cak.d;
                        avj.g(1, new n32(ilmVar, (byte) 6));
                        break;
                    }
                }
                break;
            case 2:
                if (i > 0 && i < 1907803000) {
                    zwk zwkVar = (zwk) ((wv1) obj2).b.get();
                    db dbVar = (db) ((wv1) obj3).b.get();
                    SettingsManager settingsManager2 = (SettingsManager) ((tt3) obj).get();
                    zwkVar.getClass();
                    jbd jbdVar = new jbd(zwkVar, settingsManager2, dbVar, (byte) 21);
                    avj avjVar2 = cak.d;
                    avj.g(1, jbdVar);
                    break;
                }
                break;
            default:
                tt3 tt3Var = (tt3) obj3;
                if (i > 0 && i < 1910300000) {
                    nv6 nv6VarB = ((ru9) tt3Var.get()).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("webapp_shortcut_migration_pending", true);
                    nv6VarB.w();
                    syn.a((BrowserActivity) obj2, (ru9) tt3Var.get(), (umi) obj);
                    break;
                }
                break;
        }
    }
}
