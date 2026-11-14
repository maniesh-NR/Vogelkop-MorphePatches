package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gxd {
    public final Context a;
    public final b59 b;

    public gxd(Context context, umi umiVar) {
        this.a = context.getApplicationContext();
        this.b = w1h.l(context, umiVar, "meta_install_referrer", new bg1[0]);
    }

    public static ProviderInfo b(Context context, String str) {
        return Build.VERSION.SDK_INT >= 33 ? t8.S(context, str) : context.getPackageManager().resolveContentProvider(str, 0);
    }

    public final fxd a(long j, String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str3;
        try {
            orb orbVar = new orb(new JSONObject(str).getJSONObject("source"));
            String strE = orbVar.e(Constants.Params.DATA);
            String strE2 = orbVar.e("nonce");
            if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strE2)) {
                return fxd.h;
            }
            byte[] bArrC = nb6.C(strE);
            byte[] bArrC2 = nb6.C(str2);
            byte[] bArrC3 = nb6.C(strE2);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, new SecretKeySpec(bArrC2, "AES"), new IvParameterSpec(bArrC3));
                str3 = new String(cipher.doFinal(bArrC));
            } catch (Exception unused) {
                str3 = null;
            }
            if (TextUtils.isEmpty(str3)) {
                return fxd.h;
            }
            orb orbVar2 = new orb(str3);
            String strE3 = orbVar2.e("campaign_group_name");
            String strE4 = orbVar2.e("campaign_name");
            String strE5 = orbVar2.e("adgroup_name");
            if (TextUtils.isEmpty(strE3) && TextUtils.isEmpty(strE4) && TextUtils.isEmpty(strE5)) {
                return fxd.h;
            }
            ((SharedPreferences) this.b.get()).edit().putString("media_source", "Facebook Ads").putString("campaign_group_name", strE3).putString("campaign_name", strE4).putString("adgroup_name", strE5).putLong("actual_timestamp", j).apply();
            return new fxd("Facebook Ads", strE3, strE4, strE5, ei0.f);
        } catch (JSONException unused2) {
            return fxd.h;
        }
    }
}
