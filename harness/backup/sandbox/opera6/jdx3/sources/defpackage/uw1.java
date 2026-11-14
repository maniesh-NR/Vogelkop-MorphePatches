package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes.dex */
public final class uw1 extends c59 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw1(Context context, umi umiVar, j59 j59Var, byte b) {
        super(context, umiVar, j59Var);
        this.n = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw1(Context context, umi umiVar, j59 j59Var, String str) {
        super(context, umiVar, j59Var, str);
        this.n = (byte) 1;
    }

    @Override // defpackage.c59
    public final void e(String str, String str2, boolean z) {
        byte b = this.n;
        Context context = this.a;
        switch (b) {
            case 0:
                super.e(str, str2, z);
                if (!xw1.a) {
                    xw1.c = str2;
                    break;
                } else {
                    AppsFlyerLib.getInstance().updateServerUninstallToken(context, str2);
                    break;
                }
            case 1:
                super.e(str, str2, z);
                hd hdVarO = hd.o(context);
                Context context2 = (Context) hdVarO.f;
                if (!TextUtils.isEmpty(str2)) {
                    hd.j(context2).edit().putString("npt_unsent_fcm_token", str2).apply();
                    String string = hd.j(context2).getString("npt_unsent_fcm_token", null);
                    if (!hdVarO.b && !TextUtils.isEmpty(string)) {
                        hdVarO.b = true;
                        new kse(hdVarO, context2, string);
                        break;
                    }
                }
                break;
            default:
                super.e(str, str2, z);
                break;
        }
    }
}
