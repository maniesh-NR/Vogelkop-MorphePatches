package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.opera.android.Lazy;
import com.opera.android.redirect_store.RedirectStoreDatabase;
import com.opera.android.suggested_sites.SuggestedSitesDatabase;
import com.opera.android.translate_web_pages.TranslateWebPagesDatabase;
import com.opera.android.wallet.WalletDatabase;
import java.io.File;
import java.security.SecureRandom;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k32 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Context f;

    public /* synthetic */ k32(Context context, byte b) {
        this.e = b;
        this.f = context;
    }

    public /* synthetic */ k32(Object obj, Context context, byte b) {
        this.e = b;
        this.f = context;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        Context context = this.f;
        switch (b) {
            case 0:
                return new File(context.getFilesDir(), "aisq");
            case 1:
                u5i u5iVarF = xih.f(context.getApplicationContext(), WalletDatabase.class, "wallet");
                u5iVarF.a(new ryd[]{WalletDatabase.l, WalletDatabase.m, WalletDatabase.n, WalletDatabase.o, WalletDatabase.p, WalletDatabase.q, WalletDatabase.r, WalletDatabase.s, WalletDatabase.t, WalletDatabase.u, WalletDatabase.v, WalletDatabase.w, WalletDatabase.x, WalletDatabase.y, WalletDatabase.z, WalletDatabase.A, WalletDatabase.B, WalletDatabase.C, WalletDatabase.D, WalletDatabase.E, WalletDatabase.F, WalletDatabase.G, WalletDatabase.H});
                return ((WalletDatabase) u5iVarF.b()).x();
            case 2:
                SharedPreferences sharedPreferences = context.getSharedPreferences("compression_stats", 0);
                if (sharedPreferences.getInt("version", 0) != 1) {
                    sharedPreferences.edit().remove("data_savings_history").putInt("version", 1).apply();
                }
                return sharedPreferences;
            case 3:
                return i0l.b(context);
            case 4:
                return i0l.c(context);
            case 5:
                ru9 ru9VarC = ru9.c(context);
                String string = ru9VarC.a.getString("downloadprovider.secret.key", null);
                if (string == null) {
                    byte[] bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                    string = Base64.encodeToString(bArr, 2);
                    nv6 nv6VarB = ru9VarC.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putString("downloadprovider.secret.key", string);
                    nv6VarB.w();
                }
                return Base64.decode(string, 0);
            case 6:
                return ((RedirectStoreDatabase) xih.f(context.getApplicationContext(), RedirectStoreDatabase.class, "redirect_store").b()).x();
            case 7:
                return new File(context.getFilesDir(), "bsi");
            case 8:
                u5i u5iVarF2 = xih.f(context.getApplicationContext(), SuggestedSitesDatabase.class, "suggested_sites");
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.l});
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.m});
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.n});
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.o});
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.p});
                u5iVarF2.a(new ryd[]{SuggestedSitesDatabase.q});
                return ((SuggestedSitesDatabase) u5iVarF2.b()).x();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String strA = ((bu6) i0l.b.d(context)).a(context, false);
                if (TextUtils.isEmpty(strA)) {
                    strA = ((cj9) dj9.t(context).i()).b;
                }
                String[] strArr = aik.a;
                if (strA == null) {
                    strA = "";
                }
                return strA.toUpperCase(Locale.US);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return ((TranslateWebPagesDatabase) xih.f(context.getApplicationContext(), TranslateWebPagesDatabase.class, "translate_web_pages").b()).x();
            default:
                return Boolean.valueOf((((tfn) ufn.t(context).i()).a & 4) != 0);
        }
    }
}
