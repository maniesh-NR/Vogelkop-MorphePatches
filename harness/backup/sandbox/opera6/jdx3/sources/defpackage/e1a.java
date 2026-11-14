package defpackage;

import android.text.Html;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e1a extends h6e {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1a(pqk pqkVar, int i, byte b) {
        super(pqkVar, i);
        this.d = b;
    }

    @Override // defpackage.h6e
    public final dri g(vpb vpbVar, int i, boolean z) throws JSONException {
        switch (this.d) {
            case 0:
                JSONArray jSONArray = vpbVar.a.getJSONArray(i);
                JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(2);
                vpb vpbVar2 = jSONArrayOptJSONArray == null ? null : new vpb(jSONArrayOptJSONArray);
                if (vpbVar2 == null) {
                    return null;
                }
                JSONArray jSONArray2 = vpbVar2.a;
                int length = jSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (jSONArray2.optInt(i2, 0) == 494) {
                        try {
                            Object obj = jSONArray.get(0);
                            if (obj != JSONObject.NULL) {
                                String strValueOf = String.valueOf(obj);
                                String strE = new orb(jSONArray.getJSONObject(3)).e("b");
                                String[] strArr = aik.a;
                                return new dri(strValueOf, Html.fromHtml(strE, 0).toString(), "", "", 2, 0, "");
                            }
                            throw new JSONException("0 is null");
                        } catch (JSONException unused) {
                            return null;
                        }
                    }
                }
                return null;
            default:
                return vsi.e(vpbVar, i);
        }
    }
}
