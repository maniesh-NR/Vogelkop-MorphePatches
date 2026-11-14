package defpackage;

import com.leanplum.internal.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class lfo implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sfo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ lfo(sfo sfoVar, String str, String str2, String str3, String str4, String str5, String str6, byte b) {
        this.a = b;
        this.b = sfoVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mfo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [mfo] */
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                final spa spaVar = (spa) obj;
                apa apaVar = apa.b;
                spaVar.b = z4o.i0("PUT");
                final byte b = 0;
                final sfo sfoVar = this.b;
                final String str = this.c;
                final String str2 = this.d;
                final String str3 = this.e;
                final String str4 = this.f;
                final String str5 = this.g;
                final String str6 = this.h;
                ?? r0 = new Function2() { // from class: mfo
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = b;
                        spa spaVar2 = spaVar;
                        String str7 = str6;
                        String str8 = str5;
                        String str9 = str4;
                        String str10 = str3;
                        String str11 = str2;
                        String str12 = str;
                        sfo sfoVar2 = sfoVar;
                        switch (b2) {
                            case 0:
                                z1m.s(sfoVar2.a, "subscribe", (tgm) obj2);
                                if (str12 != null) {
                                    ynh.g(spaVar2, "product", str12);
                                }
                                if (str11 != null) {
                                    ynh.g(spaVar2, Constants.Keys.COUNTRY, str11);
                                }
                                if (str10 != null) {
                                    ynh.g(spaVar2, "lang", str10);
                                }
                                if (str9 != null) {
                                    ynh.g(spaVar2, "user_id", str9);
                                }
                                if (str8 != null) {
                                    ynh.g(spaVar2, "object", str8);
                                }
                                if (str7 != null) {
                                    ynh.g(spaVar2, "oscore_id", str7);
                                }
                                break;
                            default:
                                z1m.s(sfoVar2.a, "subscribe", (tgm) obj2);
                                if (str12 != null) {
                                    ynh.g(spaVar2, "product", str12);
                                }
                                if (str11 != null) {
                                    ynh.g(spaVar2, Constants.Keys.COUNTRY, str11);
                                }
                                if (str10 != null) {
                                    ynh.g(spaVar2, "lang", str10);
                                }
                                if (str9 != null) {
                                    ynh.g(spaVar2, "user_id", str9);
                                }
                                if (str8 != null) {
                                    ynh.g(spaVar2, "object", str8);
                                }
                                if (str7 != null) {
                                    ynh.g(spaVar2, "oscore_id", str7);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                tgm tgmVar = spaVar.a;
                r0.invoke(tgmVar, tgmVar);
                break;
            default:
                final spa spaVar2 = (spa) obj;
                apa apaVar2 = apa.b;
                spaVar2.b = z4o.i0("DELETE");
                final byte b2 = 1;
                final sfo sfoVar2 = this.b;
                final String str7 = this.c;
                final String str8 = this.d;
                final String str9 = this.e;
                final String str10 = this.f;
                final String str11 = this.g;
                final String str12 = this.h;
                ?? r1 = new Function2() { // from class: mfo
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b22 = b2;
                        spa spaVar22 = spaVar2;
                        String str72 = str12;
                        String str82 = str11;
                        String str92 = str10;
                        String str102 = str9;
                        String str112 = str8;
                        String str122 = str7;
                        sfo sfoVar22 = sfoVar2;
                        switch (b22) {
                            case 0:
                                z1m.s(sfoVar22.a, "subscribe", (tgm) obj2);
                                if (str122 != null) {
                                    ynh.g(spaVar22, "product", str122);
                                }
                                if (str112 != null) {
                                    ynh.g(spaVar22, Constants.Keys.COUNTRY, str112);
                                }
                                if (str102 != null) {
                                    ynh.g(spaVar22, "lang", str102);
                                }
                                if (str92 != null) {
                                    ynh.g(spaVar22, "user_id", str92);
                                }
                                if (str82 != null) {
                                    ynh.g(spaVar22, "object", str82);
                                }
                                if (str72 != null) {
                                    ynh.g(spaVar22, "oscore_id", str72);
                                }
                                break;
                            default:
                                z1m.s(sfoVar22.a, "subscribe", (tgm) obj2);
                                if (str122 != null) {
                                    ynh.g(spaVar22, "product", str122);
                                }
                                if (str112 != null) {
                                    ynh.g(spaVar22, Constants.Keys.COUNTRY, str112);
                                }
                                if (str102 != null) {
                                    ynh.g(spaVar22, "lang", str102);
                                }
                                if (str92 != null) {
                                    ynh.g(spaVar22, "user_id", str92);
                                }
                                if (str82 != null) {
                                    ynh.g(spaVar22, "object", str82);
                                }
                                if (str72 != null) {
                                    ynh.g(spaVar22, "oscore_id", str72);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                tgm tgmVar2 = spaVar2.a;
                r1.invoke(tgmVar2, tgmVar2);
                break;
        }
        return Unit.a;
    }
}
