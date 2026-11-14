package defpackage;

import android.content.Context;
import android.os.Build;
import com.leanplum.internal.Constants;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class ylp extends voo {
    public final boolean A;
    public final zyk B;
    public final zyk C;
    public final zyk D;
    public final eio E;
    public final Integer F;
    public final iio z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ylp(ddp ddpVar, pro proVar, String str, String str2, String str3, String str4, gzo gzoVar, oho ohoVar, String str5, iio iioVar, boolean z, int i) {
        ddp ddpVar2 = (i & 1) != 0 ? null : ddpVar;
        byte b = 0;
        boolean z2 = (i & 1024) != 0 ? false : z;
        super(ddpVar2, ohoVar, proVar, str, str2, str3, str4, gzoVar);
        this.z = iioVar;
        this.A = z2;
        sho shoVar = ohoVar.l;
        eio eioVar = shoVar.l;
        proVar.b.getClass();
        this.B = z4c.b(new rlp(proVar, this, (byte) 1));
        this.C = z4c.b(new rlp(gzoVar, str5, b));
        this.D = z4c.b(new qqo(this, (byte) 17));
        this.E = shoVar.l;
        this.F = shoVar.m;
    }

    public final yjo e() {
        return (yjo) this.B.getValue();
    }

    public final String f(Context context, eq eqVar, int i, int i2, Integer num, String str, boolean z) {
        String q0iVar;
        String str2;
        String str3;
        try {
            p0i p0iVar = t0i.b;
            switch (plp.a[this.b.b.ordinal()]) {
                case 1:
                    str2 = "banner";
                    break;
                case 2:
                    str2 = "interstitial";
                    break;
                case 3:
                    str2 = "rewarded";
                    break;
                case 4:
                    str2 = "rewardedInterstitial";
                    break;
                case 5:
                    str2 = "appOpen";
                    break;
                case 6:
                    str2 = "nativeVideo";
                    break;
                default:
                    throw new oye();
            }
            Locale locale = Locale.getDefault();
            String languageTag = new Locale(locale.getLanguage(), locale.getCountry()).toLanguageTag();
            Boolean bool = this.b.f;
            if (bool == null) {
                str3 = "unset";
            } else if (bool.equals(Boolean.TRUE)) {
                str3 = "yes";
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    throw new oye();
                }
                str3 = "no";
            }
            yz4 yz4Var = new yz4((byte) 2);
            for (Map.Entry entry : this.z.c.a.entrySet()) {
                yz4Var.e((String) entry.getKey(), (b) entry.getValue());
            }
            pro proVar = this.b;
            String str4 = proVar.g;
            if (str4 != null) {
                gyg.N(yz4Var, "abGroup", str4);
            }
            c cVar = proVar.i;
            if (cVar != null) {
                yz4Var.e("ab", cVar);
            }
            gyg.N(yz4Var, "adm", (String) this.C.getValue());
            if (eqVar != null) {
                gyg.M(yz4Var, "width", Integer.valueOf(eqVar.a));
                gyg.M(yz4Var, "height", Integer.valueOf(eqVar.b));
            }
            gyg.N(yz4Var, Constants.Params.SDK_VERSION, "2.14.0");
            gyg.N(yz4Var, Constants.Keys.LOCALE, languageTag);
            gyg.N(yz4Var, "templateType", str2);
            gyg.N(yz4Var, "privacyUrl", this.u);
            String str5 = this.v;
            if (str5 != null) {
                gyg.N(yz4Var, "adChoiceUrl", str5);
            }
            gyg.M(yz4Var, "w", Integer.valueOf(i));
            gyg.M(yz4Var, "h", Integer.valueOf(i2));
            gyg.N(yz4Var, "connectionType", str);
            gyg.L(yz4Var, "vpn", Boolean.valueOf(z));
            zyk zykVar = fap.a;
            gyg.N(yz4Var, "manufacturer", Build.MANUFACTURER);
            gyg.N(yz4Var, "model", Build.MODEL);
            gyg.N(yz4Var, "os", "Android");
            gyg.N(yz4Var, "muted", str3);
            Integer num2 = this.m;
            if (num2 != null) {
                gyg.M(yz4Var, "adWidth", Integer.valueOf(num2.intValue()));
            }
            Integer num3 = this.n;
            if (num3 != null) {
                gyg.M(yz4Var, "adHeight", Integer.valueOf(num3.intValue()));
            }
            if (num != null) {
                gyg.M(yz4Var, "statusBarHeight", Integer.valueOf(num.intValue()));
            }
            gyg.N(yz4Var, "publisherId", ynh.c);
            gyg.N(yz4Var, "mediaId", ynh.e);
            String str6 = yro.a;
            gyg.N(yz4Var, "packageName", context.getPackageName());
            gyg.N(yz4Var, "appTitle", yro.a(context));
            String str7 = yro.c;
            if (str7 == null) {
                str7 = null;
            }
            if (str7 != null) {
                gyg.N(yz4Var, "appIcon", str7);
            }
            gyg.N(yz4Var, "placementId", this.b.a);
            gyg.N(yz4Var, Constants.Keys.COUNTRY, fap.d);
            gyg.N(yz4Var, Constants.Params.USER_ID, uip.a(context));
            mzo mzoVar = this.q;
            if (mzoVar != null) {
                yz4Var.e("omid", uyg.g(mzoVar));
            }
            q0iVar = new c(yz4Var.a).toString();
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        p0i p0iVar3 = t0i.b;
        return q0iVar instanceof q0i ? null : q0iVar;
    }
}
