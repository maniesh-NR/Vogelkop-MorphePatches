package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hxo extends qno {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxo(iuh iuhVar, HashSet hashSet, JSONObject jSONObject, long j, byte b) {
        super(iuhVar);
        this.f = b;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.qno
    /* renamed from: a */
    public final void onPostExecute(String str) {
        xqo xqoVar;
        byte b = this.f;
        long j = this.e;
        HashSet hashSet = this.c;
        switch (b) {
            case 0:
                xqo xqoVar2 = xqo.c;
                if (xqoVar2 != null) {
                    for (uio uioVar : Collections.unmodifiableCollection(xqoVar2.a)) {
                        if (hashSet.contains(uioVar.h)) {
                            yp ypVar = uioVar.e;
                            if (j >= ypVar.f && ypVar.e != 3) {
                                ypVar.e = 3;
                                qii.p.m(ypVar.g(), "setNativeViewHierarchy", str, ypVar.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (xqoVar = xqo.c) != null) {
                    for (uio uioVar2 : Collections.unmodifiableCollection(xqoVar.a)) {
                        if (hashSet.contains(uioVar2.h)) {
                            yp ypVar2 = uioVar2.e;
                            if (j >= ypVar2.f) {
                                ypVar2.e = 2;
                                qii.p.m(ypVar2.g(), "setNativeViewHierarchy", str, ypVar2.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.f;
        JSONObject jSONObject = this.d;
        switch (b) {
            case 0:
                break;
            default:
                iuh iuhVar = this.b;
                if (!yqo.f(jSONObject, (JSONObject) iuhVar.b)) {
                    iuhVar.b = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    @Override // defpackage.qno, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
