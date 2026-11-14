package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class tdo implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ tdo(wdo wdoVar, String str, String str2, String str3, String str4, String str5, byte b) {
        this.a = b;
        this.b = wdoVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = this.g;
        String str2 = this.f;
        String str3 = this.e;
        String str4 = this.d;
        String str5 = this.c;
        wdo wdoVar = this.b;
        spa spaVar = (spa) obj;
        switch (b) {
            case 0:
                apa apaVar = apa.b;
                spaVar.b = z4o.i0(RequestBuilder.POST);
                z1m.s(wdoVar.a, "subscribe", spaVar.a);
                if (str5 != null) {
                    ynh.g(spaVar, "product", str5);
                }
                if (str4 != null) {
                    ynh.g(spaVar, Constants.Keys.COUNTRY, str4);
                }
                if (str3 != null) {
                    ynh.g(spaVar, "lang", str3);
                }
                if (str2 != null) {
                    ynh.g(spaVar, "user_id", str2);
                }
                if (str != null) {
                    ynh.g(spaVar, "event_id", str);
                }
                break;
            default:
                apa apaVar2 = apa.b;
                spaVar.b = z4o.i0("DELETE");
                z1m.s(wdoVar.a, "subscribe", spaVar.a);
                if (str5 != null) {
                    ynh.g(spaVar, "product", str5);
                }
                if (str4 != null) {
                    ynh.g(spaVar, Constants.Keys.COUNTRY, str4);
                }
                if (str3 != null) {
                    ynh.g(spaVar, "lang", str3);
                }
                if (str2 != null) {
                    ynh.g(spaVar, "user_id", str2);
                }
                if (str != null) {
                    ynh.g(spaVar, "event_id", str);
                }
                break;
        }
        return Unit.a;
    }
}
