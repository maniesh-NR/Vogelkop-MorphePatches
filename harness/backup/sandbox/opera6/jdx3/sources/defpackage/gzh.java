package defpackage;

import android.icu.text.TimeZoneFormat;
import com.leanplum.utils.SizeUtil;
import com.opera.android.qr.ScanQrCodeActivity;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class gzh implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ gzh(byte b) {
        this.a = b;
    }

    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.a) {
            case 0:
                hp7 hp7Var = hzh.a;
                return fl6.a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return new k5i(u95.g, (j5i) null);
            case 3:
                return new yqi("com.opera.momi.clientsdk.ui.RootComponent.Config", uqh.a(i7i.class), new itb[]{uqh.a(t6i.class), uqh.a(v6i.class), uqh.a(w6i.class), uqh.a(x6i.class), uqh.a(y6i.class), uqh.a(z6i.class), uqh.a(c7i.class), uqh.a(d7i.class), uqh.a(e7i.class), uqh.a(h7i.class)}, new KSerializer[]{new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.CashOut", t6i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.DevSettings", v6i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.History", w6i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Leaderboard", x6i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Licenses", y6i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Main", z6i.INSTANCE, new Annotation[0]), a7i.a, new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Rewards", d7i.INSTANCE, new Annotation[0]), new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.SpotifyVoucher", e7i.INSTANCE, new Annotation[0]), f7i.a}, new Annotation[0]);
            case 4:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.CashOut", t6i.INSTANCE, new Annotation[0]);
            case 5:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.DevSettings", v6i.INSTANCE, new Annotation[0]);
            case 6:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.History", w6i.INSTANCE, new Annotation[0]);
            case 7:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Leaderboard", x6i.INSTANCE, new Annotation[0]);
            case 8:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Licenses", y6i.INSTANCE, new Annotation[0]);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Main", z6i.INSTANCE, new Annotation[0]);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.Rewards", d7i.INSTANCE, new Annotation[0]);
            case 11:
                return new i58("com.opera.momi.clientsdk.ui.RootComponent.Config.SpotifyVoucher", e7i.INSTANCE, new Annotation[0]);
            case 12:
                return new uji(new LinkedHashMap());
            case 13:
                return null;
            case 14:
                int i = ScanQrCodeActivity.k;
                String[] strArr = lfh.l;
                return new t33();
            case 15:
                return new voi(0);
            case 16:
                return null;
            case 17:
                try {
                    return zi4.c0(y1j.g(v1j.b(Arrays.asList(new hyb()).iterator())));
                } finally {
                }
            case SizeUtil.textSize0_1 /* 18 */:
                try {
                    return zi4.c0(y1j.g(v1j.b(Arrays.asList(new dvk()).iterator())));
                } finally {
                }
            case 19:
                return null;
            case SizeUtil.textSize0 /* 20 */:
                return new acj(xaj.a, xaj.b, xaj.c, xaj.d, xaj.f);
            case 21:
                return null;
            case SizeUtil.textSize1 /* 22 */:
                return dfj.Companion.serializer();
            case 23:
                xhk xhkVar = xhk.a;
                return new t7a(xhkVar, xhkVar, (byte) 1);
            case SizeUtil.textSize2 /* 24 */:
                return jpo.w("com.opera.android.aiassistant.api.ShodanApi.FileUploadStatus", dfj.values(), new String[]{"in_progress", "finished", "error_processing", "error_too_long", "error_not_supported", "error_mime_does_not_match"}, new Annotation[][]{null, null, null, null, null, null});
            case 25:
                return new k72(rej.a, (byte) 0);
            case 26:
                return new k72(ofj.a, (byte) 0);
            case 27:
                return new k72(hfj.a, (byte) 0);
            case 28:
                return TimeZone.getDefault();
            default:
                return TimeZoneFormat.getInstance(Locale.getDefault());
        }
    }
}
