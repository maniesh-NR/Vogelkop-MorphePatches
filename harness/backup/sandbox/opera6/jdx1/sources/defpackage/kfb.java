package defpackage;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class kfb implements tfb {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final LinkedHashMap e;
    public final List f;
    public final lfb g;
    public final mfb h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public kfb(long j, String str, String str2, String str3, LinkedHashMap linkedHashMap, List list, lfb lfbVar, mfb mfbVar, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = linkedHashMap;
        this.f = list;
        this.g = lfbVar;
        this.h = mfbVar;
        this.i = j2;
        this.j = j3;
        this.k = j4;
        this.l = j5;
    }

    public /* synthetic */ kfb(long j, String str, String str2, LinkedHashMap linkedHashMap, l08 l08Var, long j2, long j3, long j4, long j5) {
        this(j, str, "aria-chat-item", str2, linkedHashMap, l08Var, null, mfb.FINISHED, j2, j3, j4, j5);
    }

    public final orb a() throws JSONException {
        String str;
        orb orbVar = new orb();
        orbVar.o(this.a, "userChatItemId");
        orbVar.s(this.b, "messageId");
        orbVar.p(this.c, "type");
        orbVar.p(this.d, "message");
        orb orbVar2 = new orb();
        for (Map.Entry entry : this.e.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            vpb vpbVar = new vpb();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vpbVar.a((String) it.next());
            }
            orbVar2.p(vpbVar, str2);
        }
        orbVar.p(orbVar2, "links");
        vpb vpbVar2 = new vpb();
        for (kij kijVar : this.f) {
            kijVar.getClass();
            orb orbVar3 = new orb();
            orbVar3.p(kijVar.a, "searchTerm");
            orbVar3.p(kijVar.b, "searchUrl");
            vpbVar2.a(orbVar3);
        }
        orbVar.p(vpbVar2, "sia");
        String str3 = null;
        lfb lfbVar = this.g;
        if (lfbVar == null) {
            str = null;
        } else {
            if (lfbVar == lfb.UNDEFINED) {
                o.a("Undefined");
                return null;
            }
            str = lfbVar.a;
        }
        orbVar.s(str, "feedback");
        mfb mfbVar = this.h;
        if (mfbVar != null) {
            if (mfbVar == mfb.UNDEFINED) {
                o.a("Undefined");
                return null;
            }
            str3 = mfbVar.a;
        }
        orbVar.s(str3, NotificationCompat.CATEGORY_STATUS);
        orbVar.o(this.i, "chatItemId");
        orbVar.o(this.j, "chatId");
        orbVar.o(this.k, "created");
        orbVar.o(this.l, "modified");
        return orbVar;
    }

    public final long b() {
        return this.j;
    }

    public final long c() {
        return this.i;
    }
}
