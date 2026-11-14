package defpackage;

import com.opera.api.Callback;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hy extends g3k {
    public final /* synthetic */ byte f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(t9f t9fVar, String str, Object obj, byte b) {
        super(str, t9fVar, 5);
        this.f = b;
        this.g = obj;
    }

    @Override // defpackage.g3k
    public final void c(String str) {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((Callback) obj).run(null);
                break;
            case 1:
                ez ezVar = (ez) obj;
                if (ezVar != null) {
                    ezVar.run(Boolean.FALSE);
                    break;
                }
                break;
            default:
                h(0);
                break;
        }
    }

    @Override // defpackage.g3k
    public final void d(pzh pzhVar, byte[] bArr) throws JSONException {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case 0:
                Callback callback = (Callback) obj;
                int i = pzhVar.d;
                if (i == 200) {
                    callback.run(new String(bArr));
                    return;
                } else if (i == 204) {
                    callback.run("");
                    return;
                } else {
                    c("Bad response");
                    return;
                }
            case 1:
                if (pzhVar.d != 200) {
                    c("Bad response");
                    return;
                }
                try {
                    Object objU = orb.u(new JSONObject(new String(bArr)).get("ret"));
                    if (objU == null) {
                        throw new JSONException("ret is null");
                    }
                    boolean zEquals = "ok".equals(String.valueOf(objU));
                    ez ezVar = (ez) obj;
                    if (ezVar != null) {
                        ezVar.run(Boolean.valueOf(zEquals));
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    c(e.getMessage());
                    return;
                }
            default:
                h(pzhVar.d);
                return;
        }
    }

    @Override // defpackage.g3k
    public void e(fvh fvhVar) {
        switch (this.f) {
            case 0:
                fvhVar.d("accept", "application/json");
                break;
            case 1:
                fvhVar.d("accept", "application/json");
                break;
            default:
                fvhVar.d("accept", "*/*");
                break;
        }
    }

    public final void h(int i) {
        ly lyVar = (ly) this.g;
        if (lyVar != null) {
            if (i / 100 != 2) {
                lyVar.d = true;
            }
            int i2 = lyVar.c + 1;
            lyVar.c = i2;
            if (i2 != lyVar.b || lyVar.d) {
                return;
            }
            i5o i5oVar = (i5o) lyVar.f;
            ((iy) i5oVar.a).d(new wr9(i5oVar, (r9i) lyVar.e));
        }
    }
}
