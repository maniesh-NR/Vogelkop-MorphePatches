package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class dlh implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glh b;

    public /* synthetic */ dlh(glh glhVar, byte b) {
        this.a = b;
        this.b = glhVar;
    }

    public final Object get() throws Throwable {
        byte b = this.a;
        glh glhVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayListM = glhVar.a.m();
                HashSet hashSet = new HashSet(arrayListM.size());
                int size = arrayListM.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListM.get(i);
                    i++;
                    ilh ilhVar = (ilh) obj;
                    if (ilhVar.g || ilhVar.h) {
                        String path = ilhVar.f;
                        Uri uri = Uri.parse(path);
                        if (!"content".equals(uri.getScheme())) {
                            if ("file".equals(uri.getScheme())) {
                                path = uri.getPath();
                            }
                            File file = new File(path);
                            if (file.exists() && !file.canRead()) {
                                hashSet.add(Long.valueOf(ilhVar.a));
                            }
                        }
                    }
                }
                return hashSet;
            default:
                ArrayList arrayListM2 = glhVar.a.m();
                glhVar.i(arrayListM2);
                return arrayListM2;
        }
    }
}
