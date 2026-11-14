package defpackage;

import com.opera.android.suggested_sites.SuggestedSitesDatabase_Impl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class yok implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ apk b;
    public final /* synthetic */ List c;

    public /* synthetic */ yok(apk apkVar, List list, byte b) {
        this.a = b;
        this.b = apkVar;
        this.c = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        List list = this.c;
        apk apkVar = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                apkVar.d.P(oskVar, list);
                return null;
            case 1:
                SuggestedSitesDatabase_Impl suggestedSitesDatabase_Impl = apkVar.a;
                kfo.Y(suggestedSitesDatabase_Impl, false, true, new r4k((byte) 18));
                kfo.Y(suggestedSitesDatabase_Impl, false, true, new yok(apkVar, list, (byte) 3));
                return Unit.a;
            case 2:
                SuggestedSitesDatabase_Impl suggestedSitesDatabase_Impl2 = apkVar.a;
                kfo.Y(suggestedSitesDatabase_Impl2, false, true, new r4k((byte) 15));
                list.getClass();
                kfo.Y(suggestedSitesDatabase_Impl2, false, true, new yok(apkVar, list, b2));
                return Unit.a;
            default:
                apkVar.f.P(oskVar, list);
                return null;
        }
    }
}
