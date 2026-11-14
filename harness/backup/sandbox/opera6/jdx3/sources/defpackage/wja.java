package defpackage;

import com.appsflyer.internal.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class wja implements zja {
    public final xja a;

    public wja(xja xjaVar) {
        this.a = xjaVar;
    }

    @Override // defpackage.zja
    public final orb a() throws JSONException {
        orb orbVar = new orb();
        xja xjaVar = xja.UNDEFINED;
        xja xjaVar2 = this.a;
        if (xjaVar2 != xjaVar) {
            orbVar.p(xjaVar2.a, "error");
            return orbVar;
        }
        o.a("Undefined");
        return null;
    }
}
