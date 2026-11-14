package defpackage;

import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class qgb implements tfb {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public qgb(String str, String str2, long j, long j2, long j3, long j4) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    @Override // defpackage.tfb
    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orbVar.p(this.a, Constants.Params.TYPE);
        orbVar.p(this.b, Constants.Params.MESSAGE);
        orbVar.o(this.c, "chatItemId");
        orbVar.o(this.d, "chatId");
        orbVar.o(this.e, "created");
        orbVar.o(this.f, "modified");
        return orbVar;
    }

    @Override // defpackage.tfb
    public final long b() {
        return this.d;
    }

    @Override // defpackage.tfb
    public final long c() {
        return this.c;
    }
}
