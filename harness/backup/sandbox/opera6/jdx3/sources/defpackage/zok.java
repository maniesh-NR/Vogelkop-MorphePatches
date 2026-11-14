package defpackage;

import com.opera.android.suggested_sites.SuggestedSitesDatabase_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class zok implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ apk b;
    public final /* synthetic */ c3g c;

    public /* synthetic */ zok(apk apkVar, c3g c3gVar, byte b) {
        this.a = b;
        this.b = apkVar;
        this.c = c3gVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c3g c3gVar = this.c;
        apk apkVar = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                apkVar.e.Q(oskVar, c3gVar);
                return null;
            default:
                SuggestedSitesDatabase_Impl suggestedSitesDatabase_Impl = apkVar.a;
                kfo.Y(suggestedSitesDatabase_Impl, false, true, new r4k((byte) 14));
                c3gVar.getClass();
                kfo.Y(suggestedSitesDatabase_Impl, false, true, new zok(apkVar, c3gVar, (byte) 0));
                return Unit.a;
        }
    }
}
