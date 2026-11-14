package defpackage;

import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class sfb {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Boolean e;
    public final qu4 f;
    public final String g;
    public final ArrayList h;
    public final long i;
    public final long j;
    public final wfb k;
    public final ArrayList l;
    public final String m;

    public sfb(long j, String str, String str2, boolean z, Boolean bool, qu4 qu4Var, String str3, ArrayList arrayList, long j2, long j3, wfb wfbVar, ArrayList arrayList2, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = bool;
        this.f = qu4Var;
        this.g = str3;
        this.h = arrayList;
        this.i = j2;
        this.j = j3;
        this.k = wfbVar;
        this.l = arrayList2;
        this.m = str4;
    }

    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orbVar.o(this.a, "chatId");
        orbVar.p(this.b, "title");
        orbVar.s(this.c, Constants.Params.USER_ID);
        orbVar.r("hasContent", this.d);
        orbVar.s(this.e, "isPrivate");
        qu4 qu4Var = this.f;
        orbVar.s(qu4Var != null ? qu4Var.a() : null, "modifiers");
        orbVar.s(this.g, "conversationId");
        vpb vpbVar = new vpb();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            vpbVar.a.put(((Number) obj).longValue());
        }
        orbVar.p(vpbVar, "items");
        orbVar.o(this.i, "created");
        orbVar.o(this.j, "modified");
        wfb wfbVar = wfb.UNDEFINED;
        wfb wfbVar2 = this.k;
        if (wfbVar2 == wfbVar) {
            o.a("Undefined");
            return null;
        }
        orbVar.p(wfbVar2.a, Constants.Params.STATE);
        ArrayList arrayList2 = this.l;
        vpb vpbVar2 = arrayList2 != null ? new vpb() : null;
        if (vpbVar2 != null && arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                xfb xfbVar = (xfb) obj2;
                xfbVar.getClass();
                orb orbVar2 = new orb();
                orbVar2.p(xfbVar.a, "id");
                vpbVar2.a(orbVar2);
            }
        }
        orbVar.s(vpbVar2, "webpageContext");
        orbVar.s(this.m, "blob");
        return orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfb)) {
            return false;
        }
        sfb sfbVar = (sfb) obj;
        return this.a == sfbVar.a && Intrinsics.a(this.b, sfbVar.b) && Intrinsics.a(this.c, sfbVar.c) && this.d == sfbVar.d && Intrinsics.a(this.e, sfbVar.e) && Intrinsics.a(this.f, sfbVar.f) && Intrinsics.a(this.g, sfbVar.g) && this.h.equals(sfbVar.h) && this.i == sfbVar.i && this.j == sfbVar.j && this.k == sfbVar.k && Intrinsics.a(this.l, sfbVar.l) && Intrinsics.a(this.m, sfbVar.m);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iK = fki.k((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Boolean bool = this.e;
        int iHashCode = (iK + (bool == null ? 0 : bool.hashCode())) * 31;
        qu4 qu4Var = this.f;
        int iHashCode2 = (iHashCode + (qu4Var == null ? 0 : qu4Var.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (this.k.hashCode() + z1m.e(z1m.e(z1m.g(this.h, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.i), 31, this.j)) * 31;
        ArrayList arrayList = this.l;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.m;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "InternalChat(chatId=", ", title=", this.b);
        sbQ.append(", userId=");
        sbQ.append(this.c);
        sbQ.append(", hasContent=");
        sbQ.append(this.d);
        sbQ.append(", isPrivate=");
        sbQ.append(this.e);
        sbQ.append(", modifiers=");
        sbQ.append(this.f);
        sbQ.append(", conversationId=");
        sbQ.append(this.g);
        sbQ.append(", items=");
        sbQ.append(this.h);
        p3p.u(sbQ, ", created=", this.i, ", modified=");
        sbQ.append(this.j);
        sbQ.append(", state=");
        sbQ.append(this.k);
        sbQ.append(", webpageContext=");
        sbQ.append(this.l);
        sbQ.append(", blob=");
        sbQ.append(this.m);
        sbQ.append(")");
        return sbQ.toString();
    }
}
