package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class ej8 extends ase {
    public final String w;
    public final ArrayList x;

    public ej8(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar, ua7 ua7Var) {
        super(context, ormVar, skmVar, bundle, s0fVar, ua7Var);
        this.x = new ArrayList();
        String string = bundle.getString("news_header_title");
        if (TextUtils.isEmpty(string)) {
            throw new djb("news_header_title");
        }
        this.w = string;
        String string2 = bundle.getString("news_digest_articles", "");
        if (!TextUtils.isEmpty(string2)) {
            try {
                JSONArray jSONArray = new JSONArray(string2);
                for (int i = 0; i < jSONArray.length() && i < 3; i++) {
                    if (!jSONArray.isNull(i)) {
                        this.x.add(dj8.a(jSONArray.getJSONObject(i)));
                    }
                }
            } catch (JSONException e) {
                throw new djb("news_digest_articles", e);
            }
        }
        if (!TextUtils.isEmpty(this.k) || this.x.isEmpty()) {
            return;
        }
        this.k = ((dj8) this.x.get(0)).a;
    }

    @Override // defpackage.wbh
    public final i16 k() {
        ua7 ua7VarD = d();
        RemoteViews remoteViewsZ = z();
        l1f l1fVar = (l1f) ua7VarD.b;
        l1fVar.C = remoteViewsZ;
        return new i16(l1fVar.b(), (cm) ua7VarD.c, (byte) 27);
    }

    public abstract RemoteViews z();
}
