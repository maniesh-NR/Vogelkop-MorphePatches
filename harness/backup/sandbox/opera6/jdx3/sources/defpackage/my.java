package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.utilities.DisplayUtil;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class my implements Runnable {
    public final Uri.Builder a;
    public final dg7 b;
    public final t9f c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ i5o f;

    public my(i5o i5oVar, Uri.Builder builder, dg7 dg7Var, t9f t9fVar, String str, String str2) {
        this.d = str;
        this.e = str2;
        Objects.requireNonNull(i5oVar);
        this.f = i5oVar;
        this.a = builder;
        this.b = dg7Var;
        this.c = t9fVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String string;
        String string2 = this.a.build().toString();
        i5o i5oVar = this.f;
        nz nzVar = (nz) i5oVar.k;
        string = "";
        if (nzVar != null) {
            Context context = (Context) i5oVar.d;
            boolean zM = yi4.m(context);
            vx vxVar = (vx) i5oVar.g;
            esk eskVar = (esk) i5oVar.h;
            orb orbVar = new orb();
            String str = zM ? (String) eskVar.get() : null;
            String[] strArr = aik.a;
            orbVar.p(str != null ? str : "", "advertisingId");
            orbVar.r("personalizationEnabled", zM);
            orbVar.p(nzVar.o, "hashedOperaId");
            orbVar.p(nzVar.n, "channelId");
            vpb vpbVar = new vpb();
            if (nzVar.b) {
                vpbVar.a("GOOGLE_PLAY");
            }
            if (nzVar.c) {
                vpbVar.a("FACEBOOK");
            }
            orbVar.p(vpbVar, "availableServices");
            orbVar.p(null, "androidId");
            String str2 = nzVar.l;
            if (TextUtils.isEmpty(str2)) {
                str2 = (String) vxVar.get();
            }
            orbVar.p(str2, "countryCode");
            orbVar.p(nzVar.d, "languageCode");
            orbVar.p(nzVar.e, "appPackageName");
            orbVar.p(nzVar.f, "appVersion");
            orbVar.p(Build.MANUFACTURER, "deviceVendor");
            orbVar.p(Build.MODEL, Constants.Params.DEVICE_MODEL);
            orbVar.p("ANDROID", "osType");
            orbVar.p(Build.VERSION.RELEASE, "osVersion");
            int iC = sle.c();
            orbVar.p(iC != 2 ? iC != 3 ? iC != 4 ? iC != 5 ? iC != 8 ? "UNKNOWN" : "CELLULAR_5G" : "CELLULAR_4G" : "CELLULAR_3G" : "CELLULAR_2G" : "WIFI", "connectionType");
            orbVar.p(this.d, "placementKey");
            orbVar.p(String.valueOf(DisplayUtil.c(context)), "screenWidth");
            orbVar.p(String.valueOf(DisplayUtil.b(context)), "screenHeight");
            orbVar.p(this.e, "slotId");
            orbVar.p("big".toUpperCase(Locale.ROOT), "slotStyle");
            orbVar.n(1, "adCount");
            orbVar.p(DisplayUtil.a(context) ? "TABLET" : "PHONE", "deviceType");
            orbVar.p(nzVar.k, "operatorCode");
            string = orbVar.a.toString();
        }
        new vff(this.c, string2, this.b, string).g();
    }
}
