package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xqe {
    public static final String[] i = {"article_id", "secondary_id", "title", Constants.Params.TYPE, "summary", "original_img_url", "insta_url", "page_url", "source_url", "source_name", "date_time", "request_id", "more_id", "hot_topic_id", "category", "recommend_type", "infra_feedback", "related_original_news_entry_id", "category_name", "share_count", "secondary_img_url", "tertiary_img_url", "category_id", "opentype", "news_id", "video_view_count", "video_upload_timestamp", "video_duration", "video_width", "video_height", "video_auto_play_flag", "like_count", "dislike_count", "logo_url", "video_card_style", "feedback_reason_map", "emotions", "publisher_id", "publisher_name", "publisher_logo", "publisher_description", "publisher_reason", "publisher_last_update_time", "publisher_subscribers", "publisher_posts", "publisher_infra_feedback", "bg_image", "share_url", "downloaded_date_time", "local_news_city_name", "is_headlines_carousel_article", "podcast", "banner", "event_carousel"};
    public static final String[] j = {"article_id", "image_url", "video_url", "thumbnail_url", "description", "width", "height"};
    public final i32 a;
    public uy8 c;
    public final Context d;
    public final qre e;
    public final String[] f;
    public List g;
    public final h7f b = new h7f();
    public final ArrayList h = new ArrayList();

    public xqe(Context context, umi umiVar, qre qreVar, kqd kqdVar) {
        i32 i32Var = new i32(this, umiVar, kqdVar);
        this.a = i32Var;
        this.d = context;
        this.e = qreVar;
        this.f = new String[]{qreVar.a};
        i32Var.h();
    }

    public static msh c(Context context, String str, qre qreVar, wqe wqeVar) {
        Cursor cursorQuery = context.getContentResolver().query(are.d(context), i, "article_id=? AND stream_id=?", new String[]{str, qreVar.a}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                do {
                    if (j7c.c(cursorQuery.getString(3)) == 1) {
                        oqe oqeVarM = m(context, qreVar, cursorQuery, wqeVar);
                        if (oqeVarM instanceof msh) {
                            return (msh) oqeVarM;
                        }
                    }
                } while (cursorQuery.moveToNext());
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    public static void d(String str, ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oqe oqeVar = (oqe) it.next();
            if (oqeVar instanceof ere) {
                d(str, arrayList, ((ere) oqeVar).f);
            } else if ((oqeVar instanceof msh) && str.equals(((msh) oqeVar).b())) {
                arrayList.add(oqeVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r9, defpackage.qre r10, java.lang.String r11, java.util.ArrayList r12, java.util.ArrayList r13) {
        /*
            java.lang.String r10 = r10.a
            java.lang.String[] r4 = new java.lang.String[]{r11, r10}
            android.content.ContentResolver r0 = r9.getContentResolver()
            android.net.Uri r1 = defpackage.are.c(r9)
            java.lang.String r3 = "article_id=? AND stream_id=?"
            r5 = 0
            java.lang.String[] r2 = defpackage.xqe.j
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L70
            boolean r10 = r9.moveToFirst()
            if (r10 == 0) goto L6d
        L1f:
            r10 = 3
            java.lang.String r10 = j(r9, r10)     // Catch: java.lang.IllegalArgumentException -> L67
            r11 = 1
            java.lang.String r11 = i(r9, r11)     // Catch: java.lang.IllegalArgumentException -> L67
            r0 = 2
            java.lang.String r0 = i(r9, r0)     // Catch: java.lang.IllegalArgumentException -> L67
            if (r11 != 0) goto L3a
            if (r0 != 0) goto L40
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.IllegalArgumentException -> L67
            r12.add(r10)     // Catch: java.lang.IllegalArgumentException -> L67
            goto L67
        L3a:
            boolean r1 = r11.equals(r0)     // Catch: java.lang.IllegalArgumentException -> L67
            if (r1 != 0) goto L67
        L40:
            if (r13 == 0) goto L67
            r1 = 4
            java.lang.String r6 = i(r9, r1)     // Catch: java.lang.IllegalArgumentException -> L67
            r1 = 5
            int r7 = f(r9, r1)     // Catch: java.lang.IllegalArgumentException -> L67
            r1 = 6
            int r8 = f(r9, r1)     // Catch: java.lang.IllegalArgumentException -> L67
            hre r2 = new hre     // Catch: java.lang.IllegalArgumentException -> L67
            java.lang.String[] r1 = defpackage.wqm.a     // Catch: java.lang.IllegalArgumentException -> L67
            android.net.Uri r3 = a26.d0(r11)     // Catch: java.lang.IllegalArgumentException -> L67
            android.net.Uri r4 = a26.d0(r0)     // Catch: java.lang.IllegalArgumentException -> L67
            android.net.Uri r5 = android.net.Uri.parse(r10)     // Catch: java.lang.IllegalArgumentException -> L67
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L67
            r13.add(r2)     // Catch: java.lang.IllegalArgumentException -> L67
        L67:
            boolean r10 = r9.moveToNext()
            if (r10 != 0) goto L1f
        L6d:
            r9.close()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqe.e(android.content.Context, qre, java.lang.String, java.util.ArrayList, java.util.ArrayList):void");
    }

    public static int f(Cursor cursor, int i2) {
        if (!cursor.isNull(i2)) {
            return cursor.getInt(i2);
        }
        qp2.o("Value cannot be NULL");
        return 0;
    }

    public static long g(Cursor cursor, int i2) {
        if (!cursor.isNull(i2)) {
            return cursor.getInt(i2);
        }
        qp2.o("Value cannot be NULL");
        return 0L;
    }

    public static Integer h(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i2));
    }

    public static String i(Cursor cursor, int i2) {
        if (cursor.isNull(i2)) {
            return null;
        }
        return cursor.getString(i2);
    }

    public static String j(Cursor cursor, int i2) {
        if (!cursor.isNull(i2)) {
            return cursor.getString(i2);
        }
        qp2.o("Value cannot be NULL");
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static defpackage.oqe m(android.content.Context r56, defpackage.qre r57, android.database.Cursor r58, defpackage.wqe r59) {
        /*
            Method dump skipped, instructions count: 1713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqe.m(android.content.Context, qre, android.database.Cursor, wqe):oqe");
    }

    public static ContentValues p(qre qreVar, msh mshVar, String str, ArrayList arrayList) throws JSONException {
        ContentValues contentValues = new ContentValues();
        String str2 = mshVar.b;
        List list = mshVar.x;
        contentValues.put("title", str2);
        contentValues.put("news_id", mshVar.s);
        p12 p12Var = mshVar.v;
        contentValues.put("article_id", (String) p12Var.b);
        contentValues.put(Constants.Params.TYPE, mshVar.c);
        contentValues.put("summary", "");
        contentValues.put("original_img_url", mshVar.i.toString());
        contentValues.put("request_id", (String) p12Var.a);
        contentValues.put("date_time", Long.valueOf(mshVar.o));
        contentValues.put("downloaded_date_time", Long.valueOf(mshVar.p));
        contentValues.put("share_count", Integer.valueOf(mshVar.t));
        String str3 = qreVar.a;
        String str4 = qreVar.a;
        contentValues.put("stream_id", str3);
        contentValues.put("opentype", Integer.valueOf(vep.g(mshVar.j)));
        contentValues.put("insta_url", mshVar.k.toString());
        contentValues.put("page_url", mshVar.l.toString());
        contentValues.put("like_count", Integer.valueOf(mshVar.f.get()));
        contentValues.put("dislike_count", Integer.valueOf(mshVar.g.get()));
        List list2 = mshVar.u;
        if (list2 != null) {
            contentValues.put("emotions", TextUtils.join(",", list2));
        }
        Uri uri = mshVar.m;
        if (uri != null) {
            contentValues.put("source_url", uri.toString());
        }
        Uri uri2 = mshVar.n;
        if (uri2 != null) {
            contentValues.put("share_url", uri2.toString());
        }
        String str5 = mshVar.h;
        if (str5 != null) {
            contentValues.put("source_name", str5);
        }
        String str6 = mshVar.q;
        if (str6 != null) {
            contentValues.put("category_name", str6);
        }
        String str7 = mshVar.r;
        if (str7 != null) {
            contentValues.put("category_id", str7);
        }
        if (mshVar instanceof jre) {
            jre jreVar = (jre) mshVar;
            contentValues.put("secondary_img_url", jreVar.D.toString());
            contentValues.put("tertiary_img_url", jreVar.E.toString());
        } else if (mshVar instanceof ire) {
            ire ireVar = (ire) mshVar;
            String str8 = (String) ireVar.v.b;
            for (Uri uri3 : ireVar.D) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("article_id", str8);
                contentValues2.put("stream_id", str4);
                contentValues2.put("thumbnail_url", uri3.toString());
                arrayList.add(contentValues2);
            }
            for (hre hreVar : ireVar.E) {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("article_id", str8);
                contentValues3.put("stream_id", str4);
                Uri uri4 = hreVar.a;
                if (uri4 != null) {
                    contentValues3.put("image_url", uri4.toString());
                }
                Uri uri5 = hreVar.b;
                if (uri5 != null) {
                    contentValues3.put("video_url", uri5.toString());
                }
                contentValues3.put("thumbnail_url", hreVar.c.toString());
                contentValues3.put("description", hreVar.d);
                contentValues3.put("width", Integer.valueOf(hreVar.e));
                contentValues3.put("height", Integer.valueOf(hreVar.f));
                arrayList.add(contentValues3);
            }
        } else if (mshVar instanceof ure) {
            ure ureVar = (ure) mshVar;
            contentValues.put("video_view_count", Long.valueOf(ureVar.E));
            contentValues.put("video_upload_timestamp", Long.valueOf(ureVar.F));
            contentValues.put("video_duration", Integer.valueOf(ureVar.G));
            contentValues.put("video_width", Integer.valueOf(ureVar.H));
            contentValues.put("video_height", Integer.valueOf(ureVar.I));
            contentValues.put("video_auto_play_flag", Integer.valueOf(ureVar.J));
            Uri uri6 = ureVar.K;
            if (uri6 != null) {
                contentValues.put("logo_url", uri6.toString());
            }
            contentValues.put("video_card_style", Integer.valueOf(ureVar.L));
            w9h w9hVar = ureVar.M;
            if (w9hVar != null) {
                contentValues.put("publisher_id", w9hVar.a);
                contentValues.put("publisher_name", w9hVar.b);
                contentValues.put("publisher_logo", w9hVar.c);
                String str9 = w9hVar.d;
                if (str9 != null) {
                    contentValues.put("publisher_description", str9);
                }
                String str10 = w9hVar.e;
                if (str10 != null) {
                    contentValues.put("publisher_reason", str10);
                }
                contentValues.put("publisher_last_update_time", Long.valueOf(w9hVar.f));
                contentValues.put("publisher_subscribers", Integer.valueOf(w9hVar.g));
                contentValues.put("publisher_posts", Integer.valueOf(w9hVar.h));
                String str11 = w9hVar.i;
                if (str11 != null) {
                    contentValues.put("publisher_infra_feedback", str11);
                }
            }
            for (Uri uri7 : ureVar.D) {
                String str12 = (String) ureVar.v.b;
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("article_id", str12);
                contentValues4.put("stream_id", str4);
                contentValues4.put("thumbnail_url", uri7.toString());
                arrayList.add(contentValues4);
            }
        } else if (mshVar instanceof rre) {
            rre rreVar = (rre) mshVar;
            contentValues.put("logo_url", rreVar.D.toString());
            contentValues.put("is_headlines_carousel_article", Integer.valueOf(rreVar.E ? 1 : 0));
        } else if (mshVar instanceof fre) {
            jb8 jb8Var = ((fre) mshVar).D;
            jb8Var.getClass();
            qpb qpbVar = rpb.d;
            qpbVar.getClass();
            contentValues.put("banner", qpbVar.b(jb8Var, jb8.Companion.serializer()));
        }
        nb8 nb8Var = mshVar.B;
        if (nb8Var != null) {
            qpb qpbVar2 = rpb.d;
            qpbVar2.getClass();
            contentValues.put("event_carousel", qpbVar2.b(nb8Var, nb8.Companion.serializer()));
        }
        String str13 = (String) p12Var.c;
        if (str13 != null) {
            contentValues.put("more_id", str13);
        }
        String str14 = (String) p12Var.d;
        if (str14 != null) {
            contentValues.put("hot_topic_id", str14);
        }
        String str15 = (String) p12Var.e;
        if (str15 != null) {
            contentValues.put("category", str15);
        }
        String str16 = (String) p12Var.f;
        if (str16 != null) {
            contentValues.put("recommend_type", str16);
        }
        String str17 = (String) p12Var.g;
        if (str17 != null) {
            contentValues.put("infra_feedback", str17);
        }
        String str18 = (String) p12Var.h;
        if (str18 != null) {
            contentValues.put("related_original_news_entry_id", str18);
        }
        if (str != null) {
            contentValues.put("secondary_id", str);
        }
        List list3 = mshVar.w;
        if (list3 != null || list != null) {
            JSONObject jSONObject = new JSONObject();
            if (list3 != null) {
                try {
                    jSONObject.put("not_interested", orb.t(o0g.M0(list3)));
                } catch (JSONException e) {
                    t3p.n(e);
                    return null;
                }
            }
            if (list != null) {
                try {
                    jSONObject.put("report", orb.t(o0g.M0(list)));
                } catch (JSONException e2) {
                    t3p.n(e2);
                    return null;
                }
            }
            contentValues.put("feedback_reason_map", jSONObject.toString());
        }
        String str19 = mshVar.y;
        if (str19 != null) {
            contentValues.put("local_news_city_name", str19);
        }
        xlg xlgVar = mshVar.z;
        if (xlgVar != null) {
            qpb qpbVar3 = rpb.d;
            qpbVar3.getClass();
            contentValues.put("podcast", qpbVar3.b(xlgVar, xlg.Companion.serializer()));
        }
        return contentValues;
    }

    public final List a() {
        List list = this.g;
        if (list == null) {
            list = this.h;
        }
        return Collections.unmodifiableList(list);
    }

    public final void b(List list, boolean z) {
        if (this.g == null) {
            this.a.i();
        }
        List list2 = this.g;
        ArrayList arrayList = new ArrayList(list2);
        arrayList.removeAll(list);
        list2.size();
        list2.clear();
        list2.addAll(list);
        o(list2);
        l(arrayList);
        list2.size();
        k(z);
    }

    public final void k(boolean z) {
        h7f h7fVar = this.b;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            wue wueVar = ((a53) g7fVarH.next()).a;
            List listA = ((xqe) wueVar.b.b).a();
            g7f g7fVar = new g7f(wueVar.a);
            while (g7fVar.hasNext()) {
                rw8 rw8Var = (rw8) g7fVar.next();
                xw8 xw8Var = (xw8) rw8Var.d.a;
                if (listA.isEmpty() && z) {
                    xw8Var.j.e(xw8Var.l, null, xw8Var.k);
                }
                g95 g95VarB = rw8Var.b(listA);
                ww8 ww8Var = xw8Var.x;
                ww8Var.b.c = g95VarB;
                ww8Var.a(false);
            }
        }
    }

    public final void l(List list) {
        uy8 uy8Var = this.c;
        if (uy8Var == null || !uy8Var.j) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oqe oqeVar = (oqe) it.next();
            if (oqeVar instanceof msh) {
                uy8Var.g((msh) oqeVar);
            } else if (oqeVar instanceof ere) {
                ere ereVar = (ere) oqeVar;
                ((HashMap) uy8Var.H.c).remove(ereVar.e);
                boolean zEquals = "carousel".equals(ereVar.c);
                nb8 nb8Var = ereVar.i;
                if (zEquals && nb8Var != null) {
                    String str = nb8Var.i;
                    uy8Var.F.remove(str);
                    uy8Var.G.remove(str);
                }
                Iterator it2 = ereVar.f.iterator();
                while (it2.hasNext()) {
                    uy8Var.g((msh) it2.next());
                }
            }
        }
        uy8Var.n();
    }

    public final void n(Runnable runnable) {
        this.a.f(runnable);
    }

    public final void o(List list) {
        this.a.g(new ArrayList(list));
    }
}
