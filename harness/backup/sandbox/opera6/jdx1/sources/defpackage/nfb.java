package defpackage;

import com.appsflyer.internal.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class nfb implements tfb {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final ofb e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public nfb(long j, String str, String str2, String str3, ofb ofbVar, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = ofbVar;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
    }

    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orbVar.o(this.a, "userChatItemId");
        orbVar.p(this.b, "type");
        orbVar.p(this.c, "error");
        orbVar.s(this.d, "stack");
        String str = null;
        ofb ofbVar = this.e;
        if (ofbVar != null) {
            if (ofbVar == ofb.UNDEFINED) {
                o.a("Undefined");
                return null;
            }
            str = ofbVar.a;
        }
        orbVar.s(str, "code");
        orbVar.o(this.f, "chatItemId");
        orbVar.o(this.g, "chatId");
        orbVar.o(this.h, "created");
        orbVar.o(this.i, "modified");
        return orbVar;
    }

    public final long b() {
        return this.g;
    }

    public final long c() {
        return this.f;
    }
}
