package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.opera.api.Callback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class qjn {
    public final xkn a;
    public final agm b;
    public final o2c c;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final pjn f = new pjn(this, 0);
    public Bitmap g;
    public dnn h;
    public boolean i;
    public boolean j;
    public boolean k;

    public qjn(agm agmVar, xkn xknVar, Callback callback, o2c o2cVar) {
        this.a = xknVar;
        this.b = agmVar;
        this.c = o2cVar;
        c(callback);
    }

    public final lkn a(int i, Context context) {
        lkn lknVarD = this.a.b.d().d(context, this.a, this.c, this.g, i, new y1n((Object) this, (byte) 20));
        this.d.add(new WeakReference(lknVarD));
        return lknVarD;
    }

    public final boolean b() {
        return this.a.c == null || this.g != null;
    }

    public final void c(Callback callback) {
        Object obj = this.h;
        if (obj instanceof cnn) {
            callback.run(obj);
            return;
        }
        xkn xknVar = this.a;
        if (xknVar.c == null) {
            cnn cnnVar = new cnn(this);
            this.h = cnnVar;
            callback.run(cnnVar);
            return;
        }
        ArrayList arrayList = this.e;
        arrayList.add(callback);
        if (arrayList.size() > 1) {
            return;
        }
        String str = xknVar.c;
        agm agmVar = this.b;
        agmVar.getClass();
        String[] strArr = wqm.a;
        Uri uriFromFile = (N.Mhbidx2d(str) == 3 || str.startsWith("android.resource")) ? Uri.parse(str) : Uri.fromFile(new File((File) agmVar.b, str));
        o2c o2cVar = this.c;
        boolean z = o2cVar.c;
        int i = o2cVar.b;
        int i2 = o2cVar.a;
        pjn pjnVar = this.f;
        if (!z) {
            int iMax = Math.max(i2, i);
            deg degVar = yne.b;
            tt2 tt2Var = new tt2((Object) agmVar, iMax, (byte) 6);
            fnn fnnVar = new fnn(pjnVar);
            Set set = fsc.a;
            new csc(degVar, uriFromFile, tt2Var, fnnVar);
            return;
        }
        dwh dwhVarG = yne.b.g(uriFromFile);
        gvh gvhVar = dwhVarG.b;
        dwhVarG.c(jkn.b);
        gvhVar.b(i2, i);
        dwhVarG.a();
        dwhVarG.j();
        gvhVar.c((nb9) agmVar.d);
        dwhVarG.f(new fnn(pjnVar));
    }

    public final void d() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            WeakReference weakReference = (WeakReference) obj;
            lkn lknVar = (lkn) weakReference.get();
            if (lknVar == null) {
                arrayList.remove(weakReference);
            } else {
                Bitmap bitmap = this.g;
                if (bitmap != lknVar.d) {
                    lknVar.d = bitmap;
                    lknVar.g = null;
                    lknVar.b.setShader(null);
                    lknVar.invalidateSelf();
                }
            }
        }
    }
}
