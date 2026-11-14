package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.leanplum.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class py8 extends AsyncTask {
    public final /* synthetic */ byte a;
    public final int b;
    public final Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ py8(View view, int i, Context context, byte b) {
        this.a = b;
        this.d = view;
        this.b = i;
        this.c = context;
    }

    public py8(uy8 uy8Var, int i) throws JSONException {
        int i2 = 0;
        this.a = (byte) 0;
        this.d = uy8Var;
        this.b = i;
        orb orbVar = new orb();
        this.c = orbVar;
        orbVar.n(7, "version");
        orbVar.p(b(uy8Var.d), "events");
        orbVar.p(b(uy8Var.e), "video_events");
        orbVar.p(b(uy8Var.f), "clip_events");
        orbVar.p(a(uy8Var.q), "report_click");
        orbVar.p(a(uy8Var.x), "report_imp");
        orbVar.p(a(uy8Var.y), "ack_imp");
        orbVar.p(a(uy8Var.s), "report_stay");
        orbVar.p(a(uy8Var.r), "report_share");
        Map map = uy8Var.m;
        orb orbVar2 = new orb();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                t3p.q("key == null");
                throw null;
            }
            orbVar2.p(entry.getValue(), str);
        }
        orbVar.p(orbVar2, "experiments");
        ((orb) this.c).p(a(uy8Var.z), "report_dislike");
        ((orb) this.c).p(a(uy8Var.A), "report_feedback");
        orb orbVar3 = (orb) this.c;
        k5o k5oVar = uy8Var.H;
        orb orbVar4 = new orb();
        orb orbVar5 = new orb();
        for (Map.Entry entry2 : ((HashMap) k5oVar.b).entrySet()) {
            h92 h92Var = (h92) entry2.getValue();
            if (h92Var.d.get()) {
                orb orbVar6 = new orb();
                orbVar6.p(h92Var.a, Constants.Params.TYPE);
                orbVar6.p(h92Var.b, "request_id");
                orbVar5.p(orbVar6, (String) entry2.getKey());
                i2++;
                if (i2 >= 400) {
                    break;
                }
            }
        }
        orbVar4.p(orbVar5, "articles");
        orbVar3.p(orbVar4, "request_data");
    }

    public static vpb a(Set set) throws JSONException {
        vpb vpbVar = new vpb();
        int size = set.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            size--;
            try {
                vpbVar.a.put(size, orb.t((String) it.next()));
            } catch (JSONException e) {
                t3p.n(e);
                return null;
            }
        }
        return vpbVar;
    }

    public static vpb b(jec jecVar) {
        vpb vpbVar = new vpb();
        Iterator<E> it = jecVar.iterator();
        while (it.hasNext()) {
            dy8 dy8Var = (dy8) it.next();
            orb orbVar = new orb();
            dy8Var.a(orbVar);
            vpbVar.a(orbVar);
        }
        return vpbVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                uy8 uy8Var = (uy8) this.d;
                File file = new File(uy8Var.J.getFilesDir(), "newsfeedback~");
                File file2 = new File(uy8Var.J.getFilesDir(), "newsfeedback");
                try {
                    String string = ((orb) obj).a.toString();
                    Charset charsetForName = Charset.forName("UTF-8");
                    HashSet hashSet = s29.a;
                    try {
                        s29.j(file, string.toString().getBytes(charsetForName));
                        if (!file.renameTo(file2)) {
                            file.delete();
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                } catch (OutOfMemoryError e) {
                    ks3.D(e);
                    file.delete();
                    return null;
                }
            case 1:
                if (((Drawable.ConstantState) MediaRouteButton.p.get(i)) == null) {
                    break;
                }
                break;
            default:
                if (((Drawable.ConstantState) OperaMediaRouteButton.q.get(i)) == null) {
                    break;
                }
                break;
        }
        return sgb.F(i, (Context) obj);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        int i = this.b;
        switch (b) {
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    MediaRouteButton.p.put(i, drawable.getConstantState());
                }
                ((MediaRouteButton) obj2).g = null;
                break;
            case 2:
                Drawable drawable2 = (Drawable) obj;
                if (drawable2 != null) {
                    OperaMediaRouteButton.q.put(i, drawable2.getConstantState());
                }
                ((OperaMediaRouteButton) obj2).h = null;
                break;
            default:
                super.onCancelled(obj);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        int i = this.b;
        switch (b) {
            case 0:
                uy8 uy8Var = (uy8) obj2;
                boolean z = uy8Var.l > i;
                uy8Var.l = 0;
                if (z) {
                    uy8Var.n();
                    break;
                }
                break;
            case 1:
                Drawable drawableNewDrawable = (Drawable) obj;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) obj2;
                if (drawableNewDrawable != null) {
                    MediaRouteButton.p.put(i, drawableNewDrawable.getConstantState());
                    mediaRouteButton.g = null;
                } else {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.p.get(i);
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable();
                    }
                    mediaRouteButton.g = null;
                }
                mediaRouteButton.c(drawableNewDrawable);
                break;
            default:
                Drawable drawableNewDrawable2 = (Drawable) obj;
                OperaMediaRouteButton operaMediaRouteButton = (OperaMediaRouteButton) obj2;
                if (drawableNewDrawable2 != null) {
                    OperaMediaRouteButton.q.put(i, drawableNewDrawable2.getConstantState());
                    operaMediaRouteButton.h = null;
                } else {
                    Drawable.ConstantState constantState2 = (Drawable.ConstantState) OperaMediaRouteButton.q.get(i);
                    if (constantState2 != null) {
                        drawableNewDrawable2 = constantState2.newDrawable();
                    }
                    operaMediaRouteButton.h = null;
                }
                operaMediaRouteButton.d(drawableNewDrawable2);
                break;
        }
    }
}
