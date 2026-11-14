package defpackage;

import J.N;
import android.content.SharedPreferences;
import android.os.Build;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.OperaBrowserContext;
import com.opera.android.vpn.quick_settings_tile.VpnProQuickSettingsTileService;
import java.io.File;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final /* synthetic */ class kw3 implements esk {
    public final /* synthetic */ byte a;

    public /* synthetic */ kw3(byte b) {
        this.a = b;
    }

    public /* synthetic */ kw3(Object obj, byte b) {
        this.a = b;
    }

    public final Object get() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator;
        int[] iArr;
        byte[] encoded = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(i0l.g());
            case 1:
            case 16:
                return Boolean.TRUE;
            case 2:
                return new yqa((byte) 21);
            case 3:
                j4c j4cVar = OperaBrowserContext.b;
                return (String) N.MDAibNnc();
            case 4:
                int i = VpnProQuickSettingsTileService.b;
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 33);
            case 5:
                return s9g.h;
            case 6:
                return new File(snf.e);
            case 7:
                int[] iArr2 = o36.a;
                try {
                    keyGenerator = KeyGenerator.getInstance("AES");
                    iArr = o36.a;
                } catch (NoSuchAlgorithmException unused) {
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        keyGenerator.init(iArr[i2]);
                        encoded = keyGenerator.generateKey().getEncoded();
                        return encoded;
                    } catch (InvalidParameterException unused2) {
                    }
                }
                return encoded;
            case 8:
                return s9g.h;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return 0;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Locale.getDefault();
            case 11:
                return Locale.getDefault();
            case 12:
                return cqp.i0();
            case 13:
                return cqp.f0(cqp.m).a;
            case 14:
                try {
                    return cqp.h0(cqp.m).a;
                } catch (InterruptedException e) {
                    rqd.p(e);
                    return null;
                }
            case 15:
                return sfh.d();
            case 17:
                return Boolean.FALSE;
            case SizeUtil.textSize0_1 /* 18 */:
                return null;
            case 19:
                return dgh.h().buildUpon().appendEncodedPath("account/v2/external").build();
            case SizeUtil.textSize0 /* 20 */:
                String[] strArr = OperaApplication.K;
                return new as2();
            case 21:
                j4c j4cVar2 = OperaBrowserContext.b;
                ru9 ru9VarC = ru9.c(t8.a);
                boolean z = ru9VarC.a.getBoolean("discard_session_cookies_at_startup", false);
                nv6 nv6VarB = ru9VarC.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("discard_session_cookies_at_startup", false);
                nv6VarB.w();
                return Boolean.valueOf(z);
            case SizeUtil.textSize1 /* 22 */:
                return Locale.getDefault().getLanguage();
            case 23:
                return null;
            case SizeUtil.textSize2 /* 24 */:
                return "";
            case 25:
                return h1a.c();
            case 26:
                return new Date();
            case 27:
                return ipk.S();
            case 28:
                return Long.valueOf(ipk.S().getTime());
            default:
                return null;
        }
    }
}
