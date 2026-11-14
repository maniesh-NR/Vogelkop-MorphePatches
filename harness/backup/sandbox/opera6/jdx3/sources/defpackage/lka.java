package defpackage;

import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class lka implements jka {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ lka(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.jka
    public final orb a() throws JSONException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                orb orbVarP = vep.p("status", "processing");
                saf safVar = (saf) obj;
                orb orbVar = new orb();
                orbVar.p(safVar.a, Constants.Params.NAME);
                orbVar.p(safVar.b, "id");
                orbVar.p(safVar.c, "shodanId");
                orbVar.p(safVar.d, "mimeType");
                orbVar.p(safVar.e, "fileUrl");
                orbVarP.p(orbVar, "file");
                return orbVarP;
            default:
                orb orbVar2 = new orb();
                k19 k19Var = (k19) obj;
                orb orbVar3 = new orb();
                orbVar3.p(k19Var.a, "id");
                orbVar3.p(k19Var.b, "shodanId");
                orbVar3.p(k19Var.c, Constants.Params.NAME);
                orbVar3.p(k19Var.d, "mimeType");
                orbVar3.p(k19Var.e, "fileUrl");
                orbVar3.s(k19Var.f, "thumbnailUrl");
                orbVar2.p(orbVar3, "file");
                orbVar2.p("success", "status");
                return orbVar2;
        }
    }
}
