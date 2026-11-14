package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.opera.android.BrowserActivity;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class vhj extends dij {
    public final String f;
    public final String g;
    public final URL h;
    public URL i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final Context n;
    public final String o;
    public final URL p;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vhj(android.content.Context r13, defpackage.umi r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhj.<init>(android.content.Context, umi, android.os.Bundle):void");
    }

    @Override // defpackage.s0f
    public Intent a(Context context) {
        return b(context, "com.opera.android.action.SHOW_NEWS_ARTICLE");
    }

    @Override // defpackage.s0f
    public Bundle c() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("show_news_request_id", this.c);
        bundle.putString("show_news_backend", "newsfeed");
        bundle.putBoolean("show_news_reusable", this.e);
        bundle.putString("show_article_article_id", this.g);
        bundle.putString("show_article_final_url", this.h.toString());
        URL url = this.i;
        if (url != null) {
            bundle.putString("show_article_reader_mode_url", url.toString());
        }
        bundle.putString("show_article_hint_text", this.k);
        bundle.putInt("show_article_hint_scroll_pos", this.l);
        bundle.putString("show_article_back_dest", this.m);
        int i = this.j;
        if (i == 1) {
            str = "original";
        } else if (i == 2) {
            str = "transcoded";
        } else if (i == 3) {
            str = "auto";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "";
        }
        bundle.putString("show_article_open_type", str);
        bundle.putString("show_article_title", this.o);
        URL url2 = this.p;
        if (url2 != null) {
            bundle.putString("show_article_share_url", url2.toString());
        }
        return bundle;
    }

    @Override // defpackage.s0f
    public boolean e(BrowserActivity browserActivity) {
        URL url = this.i;
        if (url == null) {
            return false;
        }
        String string = url.toString();
        String string2 = this.h.toString();
        URL url2 = this.p;
        g82 g82Var = new g82(this.j, this.g, this.o, string, string2, url2 != null ? url2.toString() : null, null, false);
        rgh rghVar = new rgh();
        rghVar.a = lqm.e;
        rghVar.a = lqm.i;
        String str = this.m;
        boolean zEquals = "sd".equals(str);
        Context context = this.n;
        if (zEquals) {
            rghVar.q(context, cue.None, null);
        } else {
            boolean zEquals2 = "top_news".equals(str);
            cue cueVar = this.d;
            if (zEquals2) {
                rghVar.q(context, cueVar, "topnews");
            } else {
                rghVar.q(context, cueVar, str);
            }
        }
        whj whjVar = new whj(g82Var, 1, (lqm) rghVar.a, (ArrayList) rghVar.b);
        ac8.a(new xxh());
        ac8.a(whjVar);
        return true;
    }
}
