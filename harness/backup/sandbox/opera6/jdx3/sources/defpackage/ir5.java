package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.o;
import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.import_data.ImportChromeDataActivity;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ir5 implements kr5, v18, yn8, jr9, w7e, lo7, rr9, f8n, hvh {
    public static volatile ir5 a;
    public static b30 b;

    public static byte[] c(h1b h1bVar, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(h1bVar.size());
        Iterator it = h1bVar.iterator();
        while (it.hasNext()) {
            x36 x36Var = (x36) it.next();
            Bundle bundleC = x36Var.c();
            Bitmap bitmap = x36Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                z4o.H(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(x36.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static void e(Context context, j2b j2bVar, boolean z, long j) {
        Intent intentE0 = FullscreenWebActivity.e0(context, ImportChromeDataActivity.class, j2bVar == j2b.c ? "https://passwords.google.com/options" : "https://takeout.google.com", new rxh(2132019306), true, lqm.d);
        intentE0.putExtra("extra_try_again_partly", z);
        intentE0.putExtra("extra_imported_partly", j);
        context.startActivity(intentE0);
    }

    @Override // defpackage.hvh
    public final void a(k43 k43Var, boolean z) {
    }

    public final Object apply(Object obj) {
        return obj;
    }

    public final void b(lv0 lv0Var) {
    }

    public final Object d(orb orbVar) {
        String str;
        m20 m20Var;
        evj evjVar;
        String str2;
        int i;
        kog kogVar;
        Object obj;
        m20 m20Var2;
        String strM = orbVar.m("id", "");
        JSONObject jSONObject = orbVar.a;
        if (strM.isEmpty()) {
            o.a("id can't be empty for a Post");
            return null;
        }
        evj evjVar2 = jSONObject.has("publisher") ? (evj) evj.d.t(orbVar.i("publisher")) : null;
        if (evjVar2 == null) {
            o.a("author can't be empty for a Post");
            return null;
        }
        String strM2 = orbVar.m("description", "");
        if (jSONObject.has("thumbnail")) {
            orb orbVarI = orbVar.i("thumbnail");
            int iG = orbVarI.g("width");
            int iG2 = orbVarI.g("height");
            if (iG == 0 || iG2 == 0) {
                o.a("width & height can not be null on Thumbnail.");
                return null;
            }
            String strM3 = orbVarI.m(ImagesContract.URL, "");
            orbVarI.m("preview_url", "");
            orbVarI.m("format", "");
            orbVarI.m("id", "");
            str = strM;
            m20Var = new m20(strM3, (byte) 2);
        } else {
            str = strM;
            m20Var = null;
        }
        if (m20Var == null) {
            o.a("thumbnail can't be empty for a Post");
            return null;
        }
        orbVar.j("longitude");
        orbVar.j("latitude");
        orbVar.f("crawler");
        orbVar.g("like_count");
        orbVar.g("dislike_count");
        orbVar.g("comment_count");
        orbVar.g("share_count");
        orbVar.f("liked");
        orbVar.f("disliked");
        orbVar.f("favored");
        if (jSONObject.has("video")) {
            orb orbVarI2 = orbVar.i("video");
            String strM4 = orbVarI2.m("id", "");
            JSONObject jSONObject2 = orbVarI2.a;
            if (strM4.isEmpty()) {
                o.a("id can't be empty for a Video");
                return null;
            }
            int iG3 = orbVarI2.g("width");
            int iG4 = orbVarI2.g("height");
            evjVar = evjVar2;
            str2 = strM2;
            i = 0;
            jSONObject2.optBoolean("has_audio", false);
            if (iG3 == 0 || iG4 == 0) {
                o.a("width & height can not be null on Video.");
                return null;
            }
            orbVarI2.j(Constants.Keys.SIZE);
            int iG5 = orbVarI2.g("duration");
            orbVarI2.m("format", null);
            orbVarI2.m("source_type", "");
            orbVarI2.m("source_video_id", "");
            String strM5 = orbVarI2.m(ImagesContract.URL, "");
            if (jSONObject2.has("thumbnail")) {
                orb orbVarI3 = orbVarI2.i("thumbnail");
                int iG6 = orbVarI3.g("width");
                int iG7 = orbVarI3.g("height");
                if (iG6 == 0 || iG7 == 0) {
                    o.a("width & height can not be null on Thumbnail.");
                    return null;
                }
                String strM6 = orbVarI3.m(ImagesContract.URL, "");
                orbVarI3.m("preview_url", "");
                orbVarI3.m("format", "");
                orbVarI3.m("id", "");
                m20Var2 = new m20(strM6, (byte) 2);
                obj = null;
            } else {
                obj = null;
                m20Var2 = null;
            }
            if (m20Var2 == null) {
                o.a("thumbnail can't be empty for a Post");
                return obj;
            }
            kog kogVar2 = new kog(m20Var2, strM5, iG5);
            kogVar2.b(orbVarI2);
            kogVar = kogVar2;
        } else {
            evjVar = evjVar2;
            str2 = strM2;
            i = 0;
            kogVar = null;
        }
        if (kogVar == null) {
            o.a("video can't be empty for a Post");
            return null;
        }
        tk3 tk3Var = jSONObject.has("board") ? (tk3) tk3.e.m(orbVar.i("board")) : null;
        jSONObject.optInt(Constants.Params.STATE, 100);
        if (tk3Var == null) {
            o.a("board can't be empty for a Post");
            return null;
        }
        orbVar.m("original_type", "");
        orbVar.m("source_url", "");
        orbVar.m("share_url", "");
        long j = orbVar.j("create_time");
        orbVar.j("most_viral_time");
        int i2 = i;
        kog kogVar3 = kogVar;
        ArrayList arrayList = new ArrayList();
        vpb vpbVarH = orbVar.h("tags");
        if (vpbVarH != null) {
            for (int i3 = i2; i3 < vpbVarH.a.length(); i3++) {
                arrayList.add((gbl) gbl.b.t(vpbVarH.c(i3)));
            }
        }
        log logVar = new log(str, evjVar, str2, kogVar3, j, arrayList);
        logVar.b(orbVar);
        return logVar;
    }

    public final void f(Object obj) {
        ((List) obj).clear();
    }

    public final long g(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return 4575657222473777152L;
        }
        float fN = i41.n(j, j2);
        return (Float.floatToRawIntBits(fN) << 32) | (Float.floatToRawIntBits(fN) & 4294967295L);
    }

    @Override // defpackage.hvh
    public final void h(k43 k43Var) {
    }

    public final void m() {
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        jpo.n("In-progress recording shouldn't be null", false);
        throw null;
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    public final void p(yt7 yt7Var) {
    }

    public final void v(q18 q18Var) {
    }

    public final v7e w(d5o d5oVar) {
        return new gra(d5oVar.r(xy9.class, InputStream.class));
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new jbf(context, 17, "score");
    }
}
