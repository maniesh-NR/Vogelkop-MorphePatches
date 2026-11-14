package defpackage;

import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import com.opera.android.utilities.DisplayUtil;
import com.opera.api.Callback;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class vy implements mo7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                wy wyVar = (wy) obj;
                if (!z) {
                    wyVar.U();
                    break;
                }
                break;
            case 1:
                ((bn7) obj).run();
                break;
            case 2:
                pu3 pu3Var = (pu3) obj;
                pu3Var.f = ((wnh) pu3Var.d.i()).a(16777216);
                break;
            case 3:
                ((ny3) obj).c();
                break;
            case 4:
                qb7 qb7Var = (qb7) obj;
                qb7Var.c = Boolean.valueOf(!((wnh) ((xnh) qb7Var.b).i()).a(4194304));
                ArrayList arrayList = (ArrayList) qb7Var.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Callback) obj2).run((Boolean) qb7Var.c);
                }
                arrayList.clear();
                break;
            case 5:
                x79 x79Var = (x79) obj;
                SettingsManager settingsManager = (SettingsManager) x79Var.a;
                if (settingsManager.i("ongoing_installation_location_reset")) {
                    cj9 cj9Var = (cj9) ((dj9) x79Var.b).i();
                    if (Intrinsics.a(cj9Var.b, cj9Var.a)) {
                        settingsManager.V(0, "ongoing_installation_location_reset");
                        mdh mdhVar = (mdh) ((j4c) x79Var.d).get();
                        mdhVar.getClass();
                        mdh.b(mdhVar, true, iqi.EXPIRED, null, 4);
                    }
                }
                if (z) {
                    settingsManager.F(new s9(x79Var, (byte) 17));
                    x79Var.P(false);
                    break;
                }
                break;
            case 6:
                ((vpc) obj).b();
                break;
            case 7:
                q6e q6eVar = (q6e) obj;
                if (!z && q6eVar.g(((ibf) q6eVar.i.i()).a(512))) {
                    q6eVar.l();
                    break;
                }
                break;
            case 8:
                x77 x77Var = (x77) obj;
                wnh wnhVar = (wnh) ((xnh) x77Var.d).i();
                DisplayUtil.a((BrowserActivity) x77Var.b);
                boolean zB = wnhVar.b(4);
                SettingsManager settingsManager2 = (SettingsManager) x77Var.c;
                if (!zB) {
                    settingsManager2.R(1, "enable_newsfeed");
                    break;
                } else {
                    settingsManager2.R(0, "enable_newsfeed");
                    break;
                }
            default:
                ydn ydnVar = (ydn) obj;
                ydnVar.J(new wdn(ydnVar));
                break;
        }
    }
}
