package defpackage;

import com.leanplum.internal.Constants;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ks4 extends n1f {
    public final zyk e;
    public final /* synthetic */ ls4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks4(ls4 ls4Var, jg8 jg8Var, jg8 jg8Var2) {
        super(jg8Var, jg8Var2);
        r16 r16Var = ngh.a;
        this.f = ls4Var;
        this.e = z4c.b(new r94(ls4Var, (byte) 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0201  */
    @Override // defpackage.n1f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks4.f(mt5):java.lang.Object");
    }

    @Override // defpackage.n1f
    public final void n(Object obj) throws JSONException {
        DataOutputStream dataOutputStream;
        hs4 hs4Var = (hs4) obj;
        orb orbVar = new orb();
        long length = 0;
        for (Map.Entry entry : hs4Var.a.entrySet()) {
            cs4 cs4Var = (cs4) entry.getKey();
            fs4 fs4Var = (fs4) entry.getValue();
            orb orbVar2 = new orb();
            String str = fs4Var.a;
            byte[] bArr = fs4Var.c;
            orbVar2.p(str, "version");
            orbVar2.o(fs4Var.b.i(), "last_updated");
            orbVar2.o(length, "offset");
            orbVar2.n(bArr.length, Constants.Keys.SIZE);
            orbVar.p(orbVar2, cs4Var.a);
            length += bArr.length;
        }
        vpb vpbVar = new vpb();
        Iterator it = hs4Var.b.iterator();
        while (it.hasNext()) {
            vpbVar.a((String) it.next());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_updated", hs4Var.c.i());
            try {
                jSONObject.put("channels", orb.t(orbVar));
                try {
                    jSONObject.put("groups", orb.t(vpbVar));
                    zyk zykVar = this.e;
                    ((File) zykVar.getValue()).mkdirs();
                    File file = new File((File) zykVar.getValue(), ".data");
                    try {
                        try {
                            fs4 fs4Var2 = ls4.h;
                            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
                        } catch (IOException e) {
                            ks3.D(e);
                        }
                        try {
                            byte[] bytes = jSONObject.toString().getBytes(Charsets.UTF_8);
                            dataOutputStream.writeInt(bytes.length);
                            dataOutputStream.write(bytes);
                            Iterator it2 = hs4Var.a.values().iterator();
                            while (it2.hasNext()) {
                                dataOutputStream.write(((fs4) it2.next()).c);
                            }
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            file.renameTo(new File((File) zykVar.getValue(), Constants.Params.DATA));
                        } finally {
                        }
                    } finally {
                        file.delete();
                    }
                } catch (JSONException e2) {
                    t3p.n(e2);
                }
            } catch (JSONException e3) {
                t3p.n(e3);
            }
        } catch (JSONException e4) {
            t3p.n(e4);
        }
    }
}
