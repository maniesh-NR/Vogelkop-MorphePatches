package defpackage;

import android.graphics.Rect;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dkn extends ldk {
    public final File j;
    public final int k;
    public final /* synthetic */ ekn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkn(ekn eknVar, File file, umi umiVar) {
        super(umiVar, false);
        this.l = eknVar;
        r16 r16Var = ngh.a;
        this.j = file;
        this.k = 2;
    }

    public static LinkedHashMap j(orb orbVar) throws JSONException {
        if (orbVar.g("version") != 1) {
            return null;
        }
        vpb vpbVarB = orbVar.b("entries");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = vpbVarB.a.length();
        for (int i = 0; i < length; i++) {
            orb orbVarC = vpbVarB.c(i);
            String strE = orbVarC.e("image");
            JSONObject jSONObject = orbVarC.a;
            linkedHashMap.put(new ckn(strE, new Rect(jSONObject.getInt("left"), jSONObject.getInt("top"), jSONObject.getInt("right"), jSONObject.getInt("bottom")), (float) jSONObject.getDouble("topRatio"), (float) jSONObject.getDouble("bottomRatio"), (float) jSONObject.getDouble("scaleX"), (float) jSONObject.getDouble("pivotX"), (float) jSONObject.getDouble("pivotY")), new gkn(xgh.z(orbVarC.b("cTop")), xgh.z(orbVarC.b("cLogo")), xgh.z(orbVarC.b("cOverall")), xgh.z(orbVarC.b("cBottom"))));
        }
        return linkedHashMap;
    }

    public static orb k(Object obj) throws JSONException {
        Map map = (Map) obj;
        vpb vpbVar = new vpb();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                orb orbVar = new orb();
                orbVar.p(((ckn) entry.getKey()).a, "image");
                orbVar.n(((ckn) entry.getKey()).b.left, "left");
                orbVar.n(((ckn) entry.getKey()).b.top, "top");
                orbVar.n(((ckn) entry.getKey()).b.right, "right");
                orbVar.n(((ckn) entry.getKey()).b.bottom, "bottom");
                orbVar.q("topRatio", ((ckn) entry.getKey()).c);
                orbVar.q("bottomRatio", ((ckn) entry.getKey()).d);
                orbVar.q("scaleX", ((ckn) entry.getKey()).e);
                orbVar.q("pivotX", ((ckn) entry.getKey()).f);
                orbVar.q("pivotY", ((ckn) entry.getKey()).g);
                orbVar.p(xgh.y(((gkn) entry.getValue()).a), "cTop");
                orbVar.p(xgh.y(((gkn) entry.getValue()).b), "cLogo");
                orbVar.p(xgh.y(((gkn) entry.getValue()).c), "cOverall");
                orbVar.p(xgh.y(((gkn) entry.getValue()).d), "cBottom");
                vpbVar.a(orbVar);
            }
        }
        orb orbVar2 = new orb();
        orbVar2.n(1, "version");
        orbVar2.p(vpbVar, "entries");
        return orbVar2;
    }

    @Override // defpackage.ldk
    public final Object a() {
        try {
            return j(new orb(new String(s29.h(this.j), Charsets.UTF_8)));
        } catch (FileNotFoundException | IOException | JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.ldk
    public final void b(Object obj) {
        try {
            s29.j(this.j, String.valueOf(k(obj)).getBytes(StandardCharsets.UTF_8));
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        return this.k;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                this.l.a.put((ckn) entry.getKey(), (gkn) entry.getValue());
            }
        }
    }
}
