package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class vw1 implements zt8, swl, yjj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vw1(au8 au8Var, BrowserActivity browserActivity, nue nueVar, xw8 xw8Var, jue jueVar, x5f x5fVar, x5f x5fVar2, umi umiVar, qq6 qq6Var) {
        this.a = (byte) 1;
        this.b = au8Var;
        this.c = browserActivity;
        this.d = xw8Var;
        this.e = x5fVar;
        this.f = umiVar;
        this.g = qq6Var;
    }

    public /* synthetic */ vw1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public final void a(AdvertisingIdClient.Info info) {
        hjf hjfVar = (hjf) this.b;
        Context context = (Context) this.c;
        r65 r65Var = (r65) this.d;
        SettingsManager settingsManager = (SettingsManager) this.e;
        Lazy lazy = (Lazy) this.f;
        l45 l45Var = (l45) this.g;
        String id = info.getId();
        if (!info.isLimitAdTrackingEnabled() && !TextUtils.isEmpty(id)) {
            AppsFlyerLib.getInstance().setOaidData(id);
        }
        xw1.a(hjfVar, context, r65Var, settingsManager, lazy, l45Var);
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        b0e b0eVar = (b0e) this.b;
        return new d0e(sf2.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), b0eVar.e, (u4l) this.c, b0eVar.g, (v8a) this.d, (yhe) this.e, (pde) this.f, (s9i) this.g, new s2(2, b0eVar.j, i0e.class, "handleTabGroupItemClick", "handleTabGroupItemClick(Lcom/opera/android/tabui2/MiniTabAdapter$TabGroupItem;Lcom/opera/android/tabui2/MiniTabViewHolder;)V", 0, (byte) 15));
    }

    @Override // defpackage.zt8
    public final Object i(cue cueVar, boolean z) {
        au8 au8Var = (au8) this.b;
        BrowserActivity browserActivity = (BrowserActivity) this.c;
        xw8 xw8Var = (xw8) this.d;
        x5f x5fVar = (x5f) this.e;
        umi umiVar = (umi) this.f;
        qq6 qq6Var = (qq6) this.g;
        if (cueVar == cue.None) {
            au8Var.getClass();
            return null;
        }
        xue xueVar = (xue) au8Var.b.get(cueVar);
        if (xueVar == null) {
            bxl.l(cueVar, "Unsupported news source: ");
            return null;
        }
        uqe uqeVarC = xueVar.a.c();
        hu8 hu8Var = new hu8(xw8Var);
        qim qimVar = browserActivity.o;
        Objects.requireNonNull(qimVar);
        ysj ysjVar = qimVar.e;
        Objects.requireNonNull(ysjVar);
        return new vue(browserActivity, xw8Var, uqeVarC, hu8Var, x5fVar, umiVar, new rl3(ysjVar, (byte) 1), qq6Var);
    }

    @Override // defpackage.swl
    public final qwl run() {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 2:
                le9 le9Var = (le9) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                se9 se9Var = (se9) obj2;
                se9 se9Var2 = (se9) obj;
                String strR = le9Var.d.r();
                if (strR != null) {
                    return new ae9(le9Var, strR, str, str2, str3, se9Var, se9Var2);
                }
                return null;
            default:
                le9 le9Var2 = (le9) obj6;
                String str4 = (String) obj5;
                String str5 = (String) obj4;
                x1b x1bVar = (x1b) obj3;
                qn qnVar = (qn) obj2;
                axl axlVar = (axl) obj;
                oji ojiVar = le9Var2.d;
                String strU = ojiVar.u();
                String strR2 = ojiVar.r();
                if (strU == null || strR2 == null) {
                    return null;
                }
                return new ae9(le9Var2, strU, strR2, str4, str5, x1bVar, qnVar, axlVar);
        }
    }
}
